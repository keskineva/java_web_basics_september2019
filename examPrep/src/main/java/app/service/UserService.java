
package app.service;

import app.domain.models.service.UserServiceModel;

import java.util.List;

public interface UserService {

    void register(UserServiceModel user);

    void addUser(UserServiceModel userServiceModel);

    void remove(String userId, String heroId);

    UserServiceModel getById(String id);

    UserServiceModel getByUsernameAndPassword(String username, String password);

    List<UserServiceModel> getAll();
}