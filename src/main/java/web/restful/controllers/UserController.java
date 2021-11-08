package web.restful.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.restful.deserialization.UserDeserialisation;
import web.restful.domain.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    UserDeserialisation userDeserialisation;

    public UserController(UserDeserialisation userDeserialisation) {
        this.userDeserialisation = userDeserialisation;
    }


    @GetMapping
    public List<User> readUser(){
        return userDeserialisation.readUser();
    }
}
