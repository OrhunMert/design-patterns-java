package design.patterns.java.behavioral.mediator.mediator.impl;

import design.patterns.java.behavioral.mediator.colleague.AbstractUser;
import design.patterns.java.behavioral.mediator.mediator.ChatMediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ChatMediatorImpl implements ChatMediator {
    private List<AbstractUser> userList;

    public ChatMediatorImpl() {
        userList = new ArrayList<>();
    }

    @Override
    public void addUser(AbstractUser user) {
        if (Objects.nonNull(userList)) {
            userList.add(user);
        }
    }

    @Override
    public void sendMessage(String message, AbstractUser user) {
        if (Objects.nonNull(userList)) {
             userList.forEach(user1 -> {
                 if (Objects.equals(user1, user)) {
                     user.receiveMessage(message);
                 }
             });
        }
    }
}
