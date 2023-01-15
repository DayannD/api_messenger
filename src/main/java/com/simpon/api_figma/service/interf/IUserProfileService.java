package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.UserProfile;

public interface IUserProfileService {
    public UserProfile createUserProfile(UserProfile userProfile);
    public UserProfile updateUserProfile(Long id, UserProfile userProfile);
    public void deleteUserProfile(Long id);
    public UserProfile getUserProfile(Long id);
    public UserProfile getUserProfileByUserId(Long userId);

}
