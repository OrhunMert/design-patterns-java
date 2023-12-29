package design.patterns.java.behavioral.mediator.client;

import design.patterns.java.behavioral.mediator.colleague.AbstractUser;
import design.patterns.java.behavioral.mediator.colleague.impl.AUserImpl;
import design.patterns.java.behavioral.mediator.mediator.ChatMediator;
import design.patterns.java.behavioral.mediator.mediator.impl.ChatMediatorImpl;

public class MediatorDesignPatternClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        AbstractUser user1 = new AUserImpl(mediator, "Orhun");
        AbstractUser user2 = new AUserImpl(mediator, "Mert");
        AbstractUser user3 = new AUserImpl(mediator, "Bozkurt");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hi All");
        user2.sendMessage("Hi User2");
        user3.sendMessage("Hi User3");
    }
}
