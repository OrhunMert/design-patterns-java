package design.patterns.java.behavioral.mediator.colleague;

import design.patterns.java.behavioral.mediator.mediator.ChatMediator;

public abstract class AbstractUser {
    protected ChatMediator chatMediator;
    protected String userName;

    public AbstractUser(ChatMediator chatMediator, String userName) {
        this.chatMediator = chatMediator;
        this.userName = userName;
    }

    public abstract void sendMessage(String message);
    public abstract void  receiveMessage(String message);
}
