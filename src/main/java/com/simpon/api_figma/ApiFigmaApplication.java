package com.simpon.api_figma;

import com.github.javafaker.Faker;
import com.simpon.api_figma.entity.*;
import com.simpon.api_figma.service.interf.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ApiFigmaApplication {
    @Autowired
    private IChatService chatService;
    @Autowired
    private IMessageService messageService;
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserProfileService userProfileService;


    public static void main(String[] args) {
        SpringApplication.run(ApiFigmaApplication.class, args);
    }

    @PostConstruct
    public void build(){
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            User user1 = new User();
            user1.setUsername(faker.name().username());
            user1.setPassword(faker.internet().password());
            userService.createUser(user1);
            
            User user2 = new User();
            user2.setUsername(faker.name().username());
            user2.setPassword(faker.internet().password());
            userService.createUser(user2);

            Chat chat = new Chat();
            List<User> users = userService.getAllUsers();
            chatService.createChat(users.get(0).getId(),users.get(1).getId());

            for (int j = 0; j < 5; j++) {
                Message message = new Message();
                message.setText(faker.lorem().sentence());
                message.setUser(faker.random().nextBoolean() ? user1 : user2);
                message.setChat(chat);
                messageService.createMessage(message);
            }
        }
    }

}
