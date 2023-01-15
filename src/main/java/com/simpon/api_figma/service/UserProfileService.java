package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.UserProfile;
import com.simpon.api_figma.service.interf.IUserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService implements IUserProfileService {
    @Override
    public UserProfile createUserProfile(UserProfile userProfile) {
        return null;
    }

    @Override
    public UserProfile updateUserProfile(Long id, UserProfile userProfile) {
        return null;
    }

    @Override
    public void deleteUserProfile(Long id) {

    }

    @Override
    public UserProfile getUserProfile(Long id) {
        return null;
    }

    @Override
    public UserProfile getUserProfileByUserId(Long userId) {
        return null;
    }
}
