package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.Chat;

import java.util.List;

public interface IChatService {
    public Chat createChat(Chat chat);
    public Chat updateChat(Long id, Chat chat);
    public void deleteChat(Long id);
    public Chat getChat(Long id);
    public List<Chat> getAllChats();
    public List<Chat> getChatsByUserId(Long userId);
}
