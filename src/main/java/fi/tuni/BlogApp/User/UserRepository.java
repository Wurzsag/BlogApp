package fi.tuni.BlogApp.User;

import fi.tuni.BlogApp.BlogPost.BlogPost;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

}
