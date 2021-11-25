package web.restful.services;

import web.restful.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<Users> ListAll(Users users);

    public Users createUser(Users users);

    public void deleteUser(Long id);

    public Users updateUser();

    public List<Users> readUser();

    public Iterable<Users> save();

    public Users getById(Long id);
}
