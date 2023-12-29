package design.patterns.java.behavioral.command.receiver.impl;

import design.patterns.java.behavioral.command.receiver.FileSystem;

public class WindowsFileSystemImpl implements FileSystem {

    @Override
    public void openFile() {
        System.out.println("Windows is opening the file!");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows is writing the file!");
    }
}
