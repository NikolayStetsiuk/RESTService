package web.restful.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import web.restful.domain.Users;
import web.restful.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController("UserController")
@RequestMapping("/users")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class UserController extends BaseController<Users> {

    @Autowired
    public UserController(@Qualifier("userService") UserService userService) {
        super(userService);
    }

  /*  @GetMapping
    public List<Users> readUser() {
        return userService.read();
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
    }*/
}
