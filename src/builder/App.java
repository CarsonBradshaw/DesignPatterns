package builder;

import builder.domiciles.DogHouse;
import builder.domiciles.Domicile;
import builder.doors.EmptyDoor;
import builder.foundations.DirtFoundation;
import builder.roofs.DirtRoof;

public class App {
    public static void main(String[] args) {
        DogHouse dogHouse = new DogHouse.Builder()
                .door(new EmptyDoor())
                .roof(new DirtRoof())
                .foundation(new DirtFoundation())
                .build();

        System.out.println(dogHouse);
    }
}
