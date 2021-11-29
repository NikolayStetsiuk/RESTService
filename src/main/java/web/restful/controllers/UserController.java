package web.restful.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.restful.domain.Users;
import web.restful.services.UserService;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/get/{id}")
    public Optional<Users> getUserById(@PathVariable("id") String id){
        return userService.getById(Long.valueOf(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByID(@PathVariable("id") String id){
        userService.deleteByID(Long.valueOf(id));
    }
}
