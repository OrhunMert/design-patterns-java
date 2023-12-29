package design.patterns.java.behavioral.mediator.colleague.impl;

import design.patterns.java.behavioral.mediator.colleague.AbstractUser;
import design.patterns.java.behavioral.mediator.mediator.ChatMediator;

public class AUserImpl extends AbstractUser {

    public AUserImpl(ChatMediator chatMediator, String userName) {
        super(chatMediator, userName);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.userName + ": Sending Message=" + message);
        this.chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.userName + ": Received Message=" + message);
    }
}
