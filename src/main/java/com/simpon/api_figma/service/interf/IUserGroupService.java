package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.UserGroup;

import java.util.List;

public interface IUserGroupService {
    public UserGroup createGroup(UserGroup group);
    public UserGroup updateGroup(Long id, UserGroup group);
    public void deleteGroup(Long id);
    public UserGroup getGroup(Long id);
    public List<Chat> getAllGroups();
    public List<UserGroup> getUserGroupsByUserId(Long userId);
}
