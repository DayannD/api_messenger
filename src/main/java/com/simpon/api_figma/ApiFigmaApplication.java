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
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ApiFigmaApplication {
    @Autowired
    private IChatService chatService;
    @Autowired
    private IFriendService friendService;
    @Autowired
    private IMessageService messageService;
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserProfileService userProfileService;
    @Autowired
    private IUserGroupService userGroupService;

    public static void main(String[] args) {
        SpringApplication.run(ApiFigmaApplication.class, args);
    }

    @PostConstruct
    public void build(){
        Faker faker = new Faker();

        List<User> users = new ArrayList<>();
        List<Message> messages = new ArrayList<>();
        List<Friend> friends = new ArrayList<>();
        List<UserGroup> userGroups = new ArrayList<>();
        List<Chat> chats = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            User user = User.builder()
                    .username(faker.name().username())
                    .password(faker.internet().password())
                    .build();
            UserProfile userProfile = UserProfile.builder()
                    .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .birthdate(LocalDate.now())
                    .emailId(faker.internet().emailAddress())
                    .build();
            user.setUserProfile(userProfile);
            users.add(user);
        }
        for (int i = 0; i < 3; i++) {
            UserGroup userGroup = UserGroup.builder()
                    .name(faker.name().username())
                    .build();

            userGroups.add(userGroup);
        }

        for (int i = 0; i < 3; i++) {
            UserGroup userGroup = UserGroup.builder()
                    .name(faker.name().username())
                    .build();

            userGroups.add(userGroup);
        }

        for (int i = 0; i < 3; i++) {
            Chat chat = Chat.builder()
                    .build();

            chats.add(chat);
        }

        for (int i = 0; i < 3; i++) {
            Message message = Message.builder()
                    .text(faker.lorem().sentence())
                    .isRead(faker.bool().toString())
                    .build();

            messages.add(message);
        }

        for (int i = 0; i < 3; i++) {
            Friend friend = Friend.builder()
                    .username(faker.name().username())
                    .build();

            friends.add(friend);
        }

/*        for (int i = 0; i < 3; i++) {
            User user = users.get(i);
            UserGroup userGroup = userGroups.get(i);
            user.getUserGroups().add(userGroup);
            userGroup.getUsers().add(user);
        }

        for (int i = 0; i < 3; i++) {
            User user = users.get(i);
            Chat chat = chats.get(i);
            user.getChats().add(chat);
            chat.getUsers().add(user);

        }

        for (int i = 0; i < 3; i++) {
            Chat chat = chats.get(i);
            Message message = messages.get(i);
            chat.getMessages().add(message);
            message.setChat(chat);

        }

        for (int i = 0; i < 3; i++) {
            User user = users.get(i);
            Friend friend = friends.get(i);
            user.getFriends().add(friend);
            friend.getUsers().add(user);

        }*/

        for (int i = 0; i < 3; i++) {
/*
            System.err.println("user" + i +": " +users.get(i));
            System.err.println("getUserProfile" + i +": " +users.get(i).getUserProfile());
            System.err.println("userGroups" + i +": " +userGroups.get(i));
            System.err.println("chats" + i +": " +chats.get(i));
            System.err.println("messages" + i +": " +messages.get(i));
*/
            this.userProfileService.createUserProfile(users.get(i).getUserProfile());
            this.userService.createUser(users.get(i));
            this.userGroupService.createGroup(userGroups.get(i));
/*            this.chatService.createChat(chats.get(i));*/
            this.messageService.createMessage(messages.get(i));


/*            this.friendService.newFriend(users.get(0),users.get(1));*/

        }

        this.chatService.createChat(1l,2l);
        System.out.println(this.chatService.getChat(1l));
/*        this.chatService.findChat(Long idCurrentUser,Long idUser);*/

        // TODO: 16/01/2023  newFriend,newChat(user1,user2,Message)
    }

}
