package web.restful.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.restful.deserialization.UserDeserialisation;
import web.restful.domain.Users;
import web.restful.repository.UserRepositiry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
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
    public Users create(Users users) {
        return userRepositiry.save(users);
    }

    @Override
    public Users update() {
        return null;
    }

    @Override
    public List<Users> read() {
        return userDeserialisation.read_JSON_User();
    }

    @Override
    public Iterable<Users> save() {

        return userRepositiry.saveAll(userDeserialisation.read_JSON_User());
    }

    @Override
    public Optional<Users> getById(Long id) {
        return userRepositiry.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        userRepositiry.deleteById(id);
    }
}
