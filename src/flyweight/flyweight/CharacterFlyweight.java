package flyweight.flyweight;

import java.util.Objects;

public class CharacterFlyweight {

    private final char character;
    private final int fontSize;
    private final String font;

    public CharacterFlyweight(char character, int fontSize, String font) {
        this.character = character;
        this.fontSize = fontSize;
        this.font = font;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterFlyweight that = (CharacterFlyweight) o;
        return character == that.character &&
                fontSize == that.fontSize &&
                Objects.equals(font, that.font);
    }

    @Override
    public int hashCode() {

        return Objects.hash(character, fontSize, font);
    }

    public void printCharAtPosition(int x, int y){
        System.out.println("Printed ${character} at " + x + ", " + y);
    }

    @Override
    public String toString() {
        return "CharacterFlyweight{" +
                "character=" + character +
                ", fontSize=" + fontSize +
                ", font='" + font + '\'' +
                '}';
    }

    public char getCharacter() {
        return character;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFont() {
        return font;
    }
}
