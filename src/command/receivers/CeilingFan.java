package command.receivers;

public class CeilingFan {

    public enum Speed{FAST, MEDIUM, SLOW}

    private Speed currSpeedSetting = Speed.SLOW; //default speed
    private boolean on;

    public void on(){
        System.out.println("CeilingFan on.");
        on = true;
    }

    public void off(){
        System.out.println("CeilingFan off.");
        on = false;
    }

    public void setCurrSpeedSetting(Speed speed){
        this.currSpeedSetting = speed;
        System.out.println("Speed changed to " + currSpeedSetting.toString());
    }

    public Speed getCurrSpeedSetting(){
        return currSpeedSetting;
    }
}
