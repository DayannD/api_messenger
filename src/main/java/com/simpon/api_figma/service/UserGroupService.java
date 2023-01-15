package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.UserGroup;
import com.simpon.api_figma.service.interf.IUserGroupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupService implements IUserGroupService {
    @Override
    public UserGroup createGroup(UserGroup group) {
        return null;
    }

    @Override
    public UserGroup updateGroup(Long id, UserGroup group) {
        return null;
    }

    @Override
    public void deleteGroup(Long id) {

    }

    @Override
    public UserGroup getGroup(Long id) {
        return null;
    }

    @Override
    public List<Chat> getAllGroups() {
        return null;
    }

    @Override
    public List<UserGroup> getUserGroupsByUserId(Long userId) {
        return null;
    }
}
