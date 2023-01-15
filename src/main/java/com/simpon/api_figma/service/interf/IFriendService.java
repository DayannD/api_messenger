package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.Friend;

import java.util.List;

public interface IFriendService {
    public Friend createFriend(Friend friend);
    public void deleteFriend(Long id);
    public List<Friend> getAllFriendsByUserId(Long userId);
    public Friend getFriendByUsername(String username);
}
