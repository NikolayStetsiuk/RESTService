package web.restful.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.restful.domain.Users;
import web.restful.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> readUser() {
        return userService.readUser();
    }

    @PostMapping("/save")
    public Iterable<Users> save(){
        return userService.save();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id){
        return userService.getById(id);
    }


}
