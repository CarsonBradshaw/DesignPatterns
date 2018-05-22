package command.commands;

import command.receivers.CeilingFan;

public class CeilingFanFastSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed;

    public CeilingFanFastSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getCurrSpeedSetting();
        ceilingFan.setCurrSpeedSetting(CeilingFan.Speed.FAST);
    }

    @Override
    public void undo() {
        ceilingFan.setCurrSpeedSetting(prevSpeed);
    }
}
