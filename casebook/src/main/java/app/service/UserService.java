package app.service;

import app.domain.models.service.UserServiceModel;

import java.util.List;

public interface UserService {

    void register(UserServiceModel user);

    void addFriend(UserServiceModel userServiceModel);

    void remove(String userId, String friendId);

    UserServiceModel getById(String id);

    //this is needed for the login
    UserServiceModel getByUsernameAndPassword(String username, String password);

    List<UserServiceModel> getAll();
}
