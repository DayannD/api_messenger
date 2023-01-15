package com.simpon.api_figma.service.interf;

import com.simpon.api_figma.entity.Message;

import java.util.List;

public interface IMessageService {
    public Message createMessage(Message message);
    public void deleteMessage(Long id);
    public List<Message> getAllMessagesByChatId(Long chatId);
    public List<Message> getAllMessagesByUserId(Long userId);
    public List<Message> getAllMessagesByUsername(String username);
}
