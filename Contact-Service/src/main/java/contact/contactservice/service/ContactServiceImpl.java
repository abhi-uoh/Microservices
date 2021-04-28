package contact.contactservice.service;

import contact.contactservice.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //dummy contact list
    List<Contact>list =List.of(
            new Contact(1L,"abhinavgautam@gmail.com","987412345", 123L),
            new Contact(2L,"gautam@123.com","987412346",123L),
            new Contact(3L,"abhinav@jocata.com","987412347",125L),
            new Contact(4L,"rishav@techsophhy.com","987412348",126L)
    );

    @Override
    public List<Contact> getContactOfUsers(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
