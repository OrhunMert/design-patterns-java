package design.patterns.java.behavioral.command.receiver.impl;

import design.patterns.java.behavioral.command.receiver.FileSystem;

public class LinuxFileSystemImpl implements FileSystem {

    @Override
    public void openFile() {
        System.out.println("Linux is opening the file!");
    }

    @Override
    public void writeFile() {
        System.out.println("Linux is writing the file!");
    }
}
