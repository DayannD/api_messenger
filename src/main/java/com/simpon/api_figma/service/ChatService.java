package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.service.interf.IChatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService implements IChatService {
    @Override
    public Chat createChat(Chat chat) {
        return null;
    }

    @Override
    public Chat updateChat(Long id, Chat chat) {
        return null;
    }

    @Override
    public void deleteChat(Long id) {

    }

    @Override
    public Chat getChat(Long id) {
        return null;
    }

    @Override
    public List<Chat> getAllChats() {
        return null;
    }

    @Override
    public List<Chat> getChatsByUserId(Long userId) {
        return null;
    }
}
