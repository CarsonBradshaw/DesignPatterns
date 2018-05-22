package command;

import command.commands.*;
import command.invoker.RemoteControl;
import command.receivers.CeilingFan;
import command.receivers.Light;

public class AppInvokerLoader {
    public static void main(String[] args) {

        Light light = new Light();
        CeilingFan fan = new CeilingFan();

        CeilingFanFastSpeedCommand ceilingFanFastSpeedCommand = new CeilingFanFastSpeedCommand(fan);
        CeilingFanMedSpeedCommand ceilingFanMedSpeedCommand = new CeilingFanMedSpeedCommand(fan);
        CeilingFanSlowSpeedCommand ceilingFanSlowSpeedCommand = new CeilingFanSlowSpeedCommand(fan);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(fan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(fan);

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        MacroCommand macroCommand = new MacroCommand(ceilingFanFastSpeedCommand, ceilingFanOnCommand, lightOffCommand);

        RemoteControl remoteControl = new RemoteControl(10);

        remoteControl.setOnCommand(0, lightOnCommand);
        remoteControl.setOffCommand(0, lightOffCommand);
        remoteControl.setOnCommand(1, ceilingFanOnCommand);
        remoteControl.setOffCommand(1, ceilingFanOffCommand);
        remoteControl.setOnCommand(2, ceilingFanFastSpeedCommand);
        remoteControl.setOnCommand(3, ceilingFanMedSpeedCommand);
        remoteControl.setOnCommand(4, ceilingFanSlowSpeedCommand);
        remoteControl.setOnCommand(5, macroCommand);

        remoteControl.onButtonPress(0);
        remoteControl.onButtonPress(1);
        remoteControl.onButtonPress(2);
        remoteControl.onButtonPress(3);
        remoteControl.onButtonPress(4);
        remoteControl.onButtonPress(5);

        System.out.println();

        remoteControl.offButtonPress(0);
        remoteControl.offButtonPress(1);
        remoteControl.offButtonPress(2);
        remoteControl.offButtonPress(3);
        remoteControl.offButtonPress(4);
        remoteControl.offButtonPress(5);

        System.out.println();

        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();
        remoteControl.undoButtonPress();

    }
}
