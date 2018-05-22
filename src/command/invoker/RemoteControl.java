package command.invoker;

import command.commands.Command;

import java.util.*;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Queue<Command> undoCommandStack = Collections.asLifoQueue(new ArrayDeque<>());

    public RemoteControl(int numButtons){
        onCommands = new Command[numButtons];
        offCommands = new Command[numButtons];
        //could potentially fill with Null Object to satisfy Null Object Pattern
    }

    private void validatePosition(int pos){
        if(pos < 0 || pos >= onCommands.length)
            throw new IllegalArgumentException("Invaid command position: " + pos);
    }

    public void setOnCommand(int pos, Command command){
        validatePosition(pos);
        onCommands[pos] = command;
    }

    public void setOffCommand(int pos, Command command){
        validatePosition(pos);
        offCommands[pos] = command;
    }

    public void onButtonPress(int pos){
        validatePosition(pos);
        if(onCommands[pos] != null) {
            onCommands[pos].execute();
            undoCommandStack.add(onCommands[pos]);
        }
    }

    public void offButtonPress(int pos){
        validatePosition(pos);
        if(offCommands[pos] != null) {
            offCommands[pos].execute();
            undoCommandStack.add(offCommands[pos]);
        }
    }

    public void undoButtonPress(){
        if(!undoCommandStack.isEmpty())
            undoCommandStack.remove().undo();
    }
}
