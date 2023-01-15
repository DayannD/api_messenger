package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Friend;
import com.simpon.api_figma.service.interf.IFriendService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService implements IFriendService {
    @Override
    public Friend createFriend(Friend friend) {
        return null;
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
