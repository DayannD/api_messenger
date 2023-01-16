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
    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUser(Long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<Chat> getGroupsByUserId(Long id) {
        return null;
    }
}
