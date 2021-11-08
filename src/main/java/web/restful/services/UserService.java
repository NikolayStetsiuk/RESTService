package web.restful.services;

import web.restful.domain.User;

import java.util.List;

public interface UserService {

    public List<User> ListAll(User user);

    public User createUser();

    public void deleteUser();

    public User updateUser();

    public List<User> readUser();

}
