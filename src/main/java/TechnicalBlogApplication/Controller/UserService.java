package TechnicalBlogApplication.Controller;

import org.springframework.stereotype.service;
import TechnicalBlogApplication.model.User;

@Service
public class UserService {

    public boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }

}