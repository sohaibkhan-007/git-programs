package com.scm.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.scm.entities.Contact;
import com.scm.entities.User;

public interface ContectService {

    // save contact
    Contact save(Contact contact);

    // update contact
    Contact update(Contact contact);

    // get all contacts
    List<Contact> getAll();

    // get contact by id
    Contact getById(String id);

    // delete contect by id
    void delete(String id);

    // search contect
    Page<Contact> searchByName(String nameKeyword, int size, int page, String sortBy, String order, User user);

    Page<Contact> searchByEmail(String emailKeyword, int size, int page, String sortBy, String order, User user);

    Page<Contact> searchByPhoneNumber(String phoneNumberKeyword, int size, int page, String sortBy, String order,
            User user);

    // get contacts by user-Id
    List<Contact> getByUserId(String userId);

    // get contacts by userName
    Page<Contact> getByUser(User user, int page, int size, String sortField, String sortDirection);

}
