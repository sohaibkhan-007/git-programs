package com.scm.config;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.scm.entities.Providers;
import com.scm.entities.User;
import com.scm.helper.AppConstents;
import com.scm.repositories.UserRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class OAuthAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    Logger logger = LoggerFactory.getLogger(OAuthAuthenticationSuccessHandler.class);

    @Autowired
    private UserRepo userRepo;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        logger.info("OAuthAuthenticationSuccessHandler");

        // identify the provider

        var oAuth2AuthenticationToken = (OAuth2AuthenticationToken) authentication;
        String autherizedCLientRegistraionId = oAuth2AuthenticationToken.getAuthorizedClientRegistrationId();

        logger.info(autherizedCLientRegistraionId);

        var oauthUser = (DefaultOAuth2User) authentication.getPrincipal();

        oauthUser.getAttributes().forEach((key, value) -> {

            logger.info(key + ":" + value);
        });
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setRoleList(List.of(AppConstents.ROLE_USER));
        user.setEmailVerified(true);
        user.setEnabled(true);
        user.setPassword("dummy");

        if (autherizedCLientRegistraionId.equalsIgnoreCase("google")) {
            // Google
            // Google attributes

            user.setEmail(oauthUser.getAttribute("email").toString());
            user.setProfilePic(oauthUser.getAttribute("picture").toString());
            user.setName(oauthUser.getAttribute("name").toString());
            user.setProviderId(oauthUser.getName());
            user.setProvider(Providers.Google);
            user.setAbout("This account is created using Google.");

        } else if (autherizedCLientRegistraionId.equalsIgnoreCase("github")) {
            // Github
            // Githuib attributes

            String email = oauthUser.getAttribute("email") != null
                    ? oauthUser.getAttribute("email").toString()
                    : oauthUser.getAttribute("login").toString() + "@gmail.com";
            String picture = oauthUser.getAttribute("avatar_url").toString();
            String name = oauthUser.getAttribute("login").toString();
            String providerUserId = oauthUser.getName();

            user.setEmail(email);
            user.setProfilePic(picture);
            user.setName(name);
            user.setProviderId(providerUserId);
            user.setProvider(Providers.GITHUB);
            user.setAbout("This account is created using Github.");
        } else if (autherizedCLientRegistraionId.equalsIgnoreCase("linkedin")) {

        } else {
            logger.info("OAuth2AuthenticationSuccessHandler: Unkown provider");
        }

        // DefaultOAuth2User user = (DefaultOAuth2User) authentication.getPrincipal();

        // String email = user.getAttribute("email").toString();
        // String name = user.getAttribute("name").toString();
        // String picture = user.getAttribute("picture").toString();

        // // create user and save to database

        // User user1 = new User();
        // user1.setName(name);
        // user1.setEmail(email);
        // user1.setProfilePic(picture);
        // user1.setPassword("password");
        // user1.setUserId(UUID.randomUUID().toString());
        // user1.setProvider(Providers.Google);
        // user1.setEnabled(true);

        // user1.setEmailVerified(true);
        // user1.setProviderId(user.getName());
        // user1.setRoleList(List.of(AppConstents.ROLE_USER));
        // user1.setAbout("This account is created using Google");

        // User user2 = userRepo.findByEmail(email).orElse(null);

        // if (user2 == null) {
        // userRepo.save(user1);
        // logger.info("user saved: " + email);
        // }

        User user2 = userRepo.findByEmail(user.getEmail()).orElse(null);
        if (user2 == null) {
            userRepo.save(user);
        }
        new DefaultRedirectStrategy().sendRedirect(request, response, "/user/profile");

    }

}
