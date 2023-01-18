package com.simpon.api_figma.service;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.Message;
import com.simpon.api_figma.repository.MessageRepository;
import com.simpon.api_figma.service.interf.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements IMessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public Message getMessage(Long id) {
        return messageRepository.findById(id).orElse(null);
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message updateMessage(Long id, Message message) {
        Message messageToUpdate = messageRepository.findById(id).orElse(null);
        if (messageToUpdate != null) {
            messageToUpdate.setText(message.getText());
            messageToUpdate.setChat(message.getChat());
            messageToUpdate.setUser(message.getUser());
        }
        return messageRepository.save(messageToUpdate);
    }

    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }

    @Override
    public List<Message> getAllMessagesByChatId(Long chatId) {
        return null;
    }

    @Override
    public List<Message> getAllMessagesByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Message> getAllMessagesByUsername(String username) {
        return null;
    }

    @Override
    public List<Message> getAllByChat(Chat chat) {
        return null;
    }
}
