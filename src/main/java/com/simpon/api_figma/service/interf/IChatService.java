package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.User;

import java.util.List;

public interface IChatService {
    public Chat createChat(Long id1, Long id2);
    public Chat updateChat(Long id, Chat chat);
    public void deleteChat(Long id);
    public Chat getChat(Long id);
    public List<Chat> getAllChats();
    public Chat getChatsByUserId(Long userId);

    public Chat findChat(Long idCurrentUser,Long idUser);
}
