public class UC4_OOPS_Banner {
    public static void main(String[] args) {

        String[] O = {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };

        String[] P = {
                " ******  ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       "
        };

        String[] S = {
                "  *****  ",
                " *       ",
                "  *****  ",
                "       * ",
                "  *****  "
        };

        // Print OOPS banner
        for (int i = 0; i < 5; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}