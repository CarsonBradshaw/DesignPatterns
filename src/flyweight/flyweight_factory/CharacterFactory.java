package flyweight.flyweight_factory;

import flyweight.flyweight.CharacterFlyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private CharacterFactory(){}

    private static final Map<CharacterFlyweight, CharacterFlyweight> charCache = new HashMap<>();

    public static CharacterFlyweight getCharacterFlyweight(char character, int fontSize, String font){
        CharacterFlyweight characterFlyweight = new CharacterFlyweight(character, fontSize, font);
        charCache.putIfAbsent(characterFlyweight, characterFlyweight);
        return charCache.get(characterFlyweight);
    }

}
