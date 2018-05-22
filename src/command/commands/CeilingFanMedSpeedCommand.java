package command.commands;

import command.receivers.CeilingFan;

public class CeilingFanMedSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed;

    public CeilingFanMedSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getCurrSpeedSetting();
        ceilingFan.setCurrSpeedSetting(CeilingFan.Speed.MEDIUM);
    }

    @Override
    public void undo() {
        ceilingFan.setCurrSpeedSetting(prevSpeed);
    }
}
