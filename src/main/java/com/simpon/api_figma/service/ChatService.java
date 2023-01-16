package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.User;
import com.simpon.api_figma.repository.ChatRepository;
import com.simpon.api_figma.service.interf.IChatService;
import com.simpon.api_figma.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService implements IChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private IUserService userService;
    @Override
    public Chat createChat(Long id1, Long id2) {
        Chat chat = new Chat();
        chatRepository.save(chat);
        User user1 = this.userService.getUser(id1);
        User user2 =this.userService.getUser(id2);
        chat.getUsers().add(user1);
        chat.getUsers().add(user2);

        return chatRepository.save(chat);
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
    public Chat getChatsByUserId(Long userId) {

        return this.chatRepository.findById(userId).get();
    }

    @Override
    public Chat findChat(Long idCurrentUser, Long idUser) {
        return null;
    }
}
