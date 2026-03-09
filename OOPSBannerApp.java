import java.util.*;

public class UC7_OOPS_Banner {

    // Static Inner Class to Store Character Pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Centralized Pattern Storage
    private static final Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

    // Load Patterns
    static {
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                "  ** **  ",
				" *     * ",
                "*       *",
                "*       *",
                "*       *",
				" *     * ",
                "  ** **  "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
				"*     *",
                "****** ",
				"*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
				"*      ",
                " ***** ",
                "      *",
				"      *",
                " ***** "
        }));
    }

    // Display Banner
    public static void displayBanner(String text) {
        text = text.toUpperCase();

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                CharacterPatternMap patternObj = patternMap.get(ch);

                if (patternObj != null) {
                    line.append(patternObj.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}