package design.patterns.java.behavioral.command.client;

import design.patterns.java.behavioral.command.command.Command;
import design.patterns.java.behavioral.command.command.impl.OpenFileCommand;
import design.patterns.java.behavioral.command.command.impl.WriteFileCommand;
import design.patterns.java.behavioral.command.invoker.FileInvoker;
import design.patterns.java.behavioral.command.receiver.FileSystem;
import design.patterns.java.behavioral.command.receiver.impl.LinuxFileSystemImpl;
import design.patterns.java.behavioral.command.receiver.impl.WindowsFileSystemImpl;

public class CommandClient {

    public static void main(String[] args) {
        FileSystem windowsFileSystem = new WindowsFileSystemImpl();
        FileSystem linuxFileSystem = new LinuxFileSystemImpl();

        Command windowsOpenCommand = new OpenFileCommand(windowsFileSystem);
        Command linuxWriteCommand = new WriteFileCommand(linuxFileSystem);

        FileInvoker fileInvoker = new FileInvoker(windowsOpenCommand);
        fileInvoker.execute();

        fileInvoker = new FileInvoker(linuxWriteCommand);
        fileInvoker.execute();
    }
}
