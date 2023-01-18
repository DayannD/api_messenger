package com.simpon.api_figma.repository;

import com.simpon.api_figma.entity.Chat;
import com.simpon.api_figma.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

    List<Message> getAllByChat(Chat chat);
}
