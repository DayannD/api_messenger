package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.User;
import com.simpon.api_figma.repository.UserRepository;
import com.simpon.api_figma.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<Chat> getGroupsByUserId(Long id) {
        return null;
    }

    public User updateUser(Long id, User user) {
        User userToUpdate = userRepository.findById(id).orElse(null);
        if (userToUpdate != null) {
            userToUpdate.setUsername(user.getUsername());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setChats(user.getChats());
/*            userToUpdate.setUserProfile(user.getUserProfile());*/
            return userRepository.save(userToUpdate);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
