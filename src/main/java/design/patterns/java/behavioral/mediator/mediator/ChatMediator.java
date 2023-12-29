package design.patterns.java.behavioral.mediator.mediator;

import design.patterns.java.behavioral.mediator.colleague.AbstractUser;

public interface ChatMediator {

    void addUser(AbstractUser user);
    void sendMessage(String message, AbstractUser user);
}
