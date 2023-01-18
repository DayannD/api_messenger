package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.Message;
import com.simpon.api_figma.entity.User;
import com.simpon.api_figma.repository.ChatRepository;
import com.simpon.api_figma.service.interf.IChatService;
import com.simpon.api_figma.service.interf.IMessageService;
import com.simpon.api_figma.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ChatService implements IChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private IUserService userService;

    @Autowired
    private IMessageService messageService;
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }

    public Chat createChat(Long userId1, Long userId2) {
        Chat chat = new Chat();
        User user1 = userService.getUser(userId1);
        User user2 = userService.getUser(userId2);
        chat.getParticipants().add(user1);
        chat.getParticipants().add(user2);
/*        chat.setParticipants(Arrays.asList(user1,user2));*/
        return chatRepository.save(chat);
    }

    public Chat getChat(Long id) {
        return chatRepository.findById(id).orElse(null);
    }

    public List<Chat> getAllChats() {
        return chatRepository.findAll();
    }

    @Override
    public Chat getChatsByUserId(Long userId) {
        return null;
    }

    @Override
    public Chat findChat(Long idCurrentUser, Long idUser) {
        return null;
    }

    public Chat updateChat(Long id, Chat chat) {
        Chat chatToUpdate = chatRepository.findById(id).orElse(null);
        if (chatToUpdate == null) {
            return null;
        }
        chatToUpdate.setParticipants(chat.getParticipants());
        return chatRepository.save(chatToUpdate);
    }

    public void deleteChat(Long id) {
        chatRepository.deleteById(id);
    }

    public Message sendMessage(Long chatId, Message message) {
        Chat chat = getChat(chatId);
        message.setChat(chat);
        return messageService.createMessage(message);
    }

    public List<Message> getAllMessages(Long chatId) {
        Chat chat = getChat(chatId);
        return messageService.getAllByChat(chat);
    }
}
