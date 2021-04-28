package contact.contactservice.service;

import contact.contactservice.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactOfUsers(Long userId);
}
