package com.simpon.api_figma.service;

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

    @Override
    public Message createMessage(Message message) {
        return this.messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Long id) {

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
}
