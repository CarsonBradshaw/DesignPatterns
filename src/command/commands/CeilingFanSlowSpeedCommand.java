package command.commands;

import command.receivers.CeilingFan;

public class CeilingFanSlowSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed;

    public CeilingFanSlowSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getCurrSpeedSetting();
        ceilingFan.setCurrSpeedSetting(CeilingFan.Speed.SLOW);
    }

    @Override
    public void undo() {
        ceilingFan.setCurrSpeedSetting(prevSpeed);
    }
}
