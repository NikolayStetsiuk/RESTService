package web.restful.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.restful.deserialization.UserDeserialisation;
import web.restful.domain.Users;
import web.restful.repository.UserRepositiry;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepositiry userRepositiry;
    UserDeserialisation userDeserialisation;

    @Autowired
    public UserServiceImpl(UserRepositiry userRepositiry, UserDeserialisation userDeserialisation) {
        this.userRepositiry = userRepositiry;
        this.userDeserialisation = userDeserialisation;
    }

    @Override
    public List<Users> ListAll(Users user) {

        List<Users> users = new ArrayList<>();
        userRepositiry.findAll().forEach(users::add);
        return users;
    }

    @Override
    public Users createUser(Users users) {
        return userRepositiry.save(users); 
    }

    @Override
    public void deleteUser(Long id) {
        userRepositiry.deleteById(id);
    }

    @Override
    public Users saveAll(List<Users> listUsers) {

        if (listUsers != null) {
            for (Users users : userDeserialisation.readUser()) {
                userRepositiry.save(users);
                return users;
            }
        }
        return null;
    }

    @Override
    public Users updateUser() {
        return null;
    }

    @Override
    public List<Users> readUser() {
        return userDeserialisation.readUser();
    }
}
