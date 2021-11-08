package web.restful.services;

import org.springframework.beans.factory.annotation.Autowired;
import web.restful.deserialization.UserDeserialisation;
import web.restful.domain.User;
import web.restful.repository.UserRepositiry;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{

    UserRepositiry userRepositiry;
    UserDeserialisation userDeserialisation;

    @Autowired
    public UserServiceImpl(UserRepositiry userRepositiry, UserDeserialisation userDeserialisation) {
        this.userRepositiry = userRepositiry;
        this.userDeserialisation = userDeserialisation;
    }

    @Override
    public List<User> ListAll(User user) {

        List<User> users = new ArrayList<>();
        userRepositiry.findAll().forEach(users :: add);
        return users;
    }

    @Override
    public User createUser() {
        return null;
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public User updateUser() {
        return null;
    }

    @Override
    public List<User> readUser() {
        return userDeserialisation.readUser();
    }
}
