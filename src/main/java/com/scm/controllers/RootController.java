package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.scm.entities.User;
import com.scm.helper.Helper;
import com.scm.services.UserServices;

@ControllerAdvice
public class RootController {

    @Autowired
    private UserServices userServices;

    @ModelAttribute
    public void addLoggedInUserInformation(Model model, Authentication authentication) {

        if (authentication == null) {
            return;
        }

        System.out.println("Adding logged in user information to the model");
        String userName = Helper.getEmailOfLoggedInUser(authentication);
        User user = userServices.getUserByEmail(userName);
        model.addAttribute("loggedInUser", user);

    }
}
