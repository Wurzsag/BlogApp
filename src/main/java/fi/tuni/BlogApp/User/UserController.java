package fi.tuni.BlogApp.User;

import fi.tuni.BlogApp.BlogPost.BlogPost;
import fi.tuni.BlogApp.BlogPost.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "blog/add")
    public void addUser(@RequestBody User user) {

    }

}
