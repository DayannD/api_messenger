package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.User;

import java.util.List;

public interface IUserService {
    public User createUser(User user);
    public User updateUser(Long id, User user);
    public void deleteUser(Long id);
    public User getUser(Long id);
    public List<User> getAllUsers();
    public User getUserByUsername(String username);
    public List<Chat> getGroupsByUserId(Long id);

}
