package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Friend;
import com.simpon.api_figma.entity.User;
import com.simpon.api_figma.repository.FriendRepository;
import com.simpon.api_figma.repository.UserRepository;
import com.simpon.api_figma.service.interf.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendService implements IFriendService {

    @Autowired
    private FriendRepository friendRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void newFriend(User currentUser, User friend) {
        Friend friend1 = new Friend();
        friend1.setUsername(currentUser.getUsername());
        friend1.getUsers().add(currentUser);
        Friend friend2 = new Friend();
        friend2.setUsername(friend.getUsername());
        friend2.getUsers().add(friend);
        if (currentUser.getFriends() == null){
            currentUser.setFriends(new ArrayList<>());
        }
        if (friend.getFriends() == null){
            friend.setFriends(new ArrayList<>());
        }
        currentUser.getFriends().add(friend1);
        friend.getFriends().add(friend2);
        this.friendRepository.save(friend1);
        this.friendRepository.save(friend2);
        this.userRepository.save(currentUser);
        this.userRepository.save(friend);
    }

    @Override
    public void deleteFriend(Long id) {

    }

    @Override
    public List<Friend> getAllFriendsByUserId(Long userId) {
        return null;
    }

    @Override
    public Friend getFriendByUsername(String username) {
        return null;
    }
}
