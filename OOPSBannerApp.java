class OOPSBannerApp5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "  OOO   ", "  OOO   ", "  PPPP   ", "  SSSS   "),
                String.join("", " O   O  ", " O   O  ", "  P   P  ", " S       "),
                String.join("", " O   O  ", " O   O  ", "  PPPP   ", "  SSS    "),
                String.join("", " O   O  ", " O   O  ", "  P      ", "     S   "),
                String.join("", " O   O  ", " O   O  ", "  P      ", "     S   "),
                String.join("", " O   O  ", " O   O  ", "  P      ", " S   S   "),
                String.join("", "  OOO   ", "  OOO   ", "  P      ", "  SSS    ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}