package com.scm.forms;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactForm {

    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email format [email@gmail.com]")
    private String email;
    @NotBlank(message = "Message can not be blank")
    @Pattern(regexp = "^[0-9]{10}$", message = "incvalid phone number")
    private String phoneNumber;
    @NotBlank(message = "address is required")
    private String address;
    private String description;
    private Boolean favorite;
    private String websiteLink;
    private String linkedInLink;

    // we will create annotaion to validate file size and resolution.
    private MultipartFile contactImage;
}
