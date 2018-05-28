package flyweight;

import flyweight.flyweight.CharacterFlyweight;
import flyweight.flyweight_factory.CharacterFactory;

public class App {
    public static void main(String[] args) {
        CharacterFlyweight characterFlyweight1 = CharacterFactory.getCharacterFlyweight('c', 12, "Helevetica");
        System.out.println(System.identityHashCode(characterFlyweight1));
        characterFlyweight1.printCharAtPosition(0, 0);

        CharacterFlyweight characterFlyweight2 = CharacterFactory.getCharacterFlyweight('C', 12, "TimesNewRoman");
        System.out.println(System.identityHashCode(characterFlyweight2));
        characterFlyweight2.printCharAtPosition(0, 1);

        CharacterFlyweight characterFlyweight3 = CharacterFactory.getCharacterFlyweight('c', 12, "Helevetica");
        System.out.println(System.identityHashCode(characterFlyweight3));
        characterFlyweight3.printCharAtPosition(0, 2);

    }
}
