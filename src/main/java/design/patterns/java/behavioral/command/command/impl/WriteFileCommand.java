package design.patterns.java.behavioral.command.command.impl;

import design.patterns.java.behavioral.command.command.Command;
import design.patterns.java.behavioral.command.receiver.FileSystem;

public class WriteFileCommand implements Command {

    private final FileSystem fileSystem;

    public WriteFileCommand(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.writeFile();
    }
}
