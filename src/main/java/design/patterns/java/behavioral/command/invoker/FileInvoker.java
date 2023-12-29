package design.patterns.java.behavioral.command.invoker;

import design.patterns.java.behavioral.command.command.Command;

public class FileInvoker {

    private final Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
