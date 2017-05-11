package translatorv2;

/**
 *
 * @author Goniprowski
 */
public class DefaultTranslate {

    boolean czySaJakiesFormuly = true;

    public boolean CheckOnlyLetter(char kp) {
        {
            if ((kp == 'a') || (kp == 'A') || (kp == 'ą') || (kp == 'Ą') || (kp == 'b') || (kp == 'B') || (kp == 'c') || (kp == 'C') || (kp == 'ć') || (kp == 'Ć') || (kp == 'd') || (kp == 'D') || (kp == 'e') || (kp == 'E') || (kp == 'ę') || (kp == 'Ę') || (kp == 'f') || (kp == 'F') || (kp == 'g') || (kp == 'G') || (kp == 'h') || (kp == 'H') || (kp == 'i') || (kp == 'I') || (kp == 'j') || (kp == 'J') || (kp == 'k') || (kp == 'K') || (kp == 'l') || (kp == 'L') || (kp == 'ł') || (kp == 'Ł') || (kp == 'm') || (kp == 'M') || (kp == 'n') || (kp == 'N') || (kp == 'ń') || (kp == 'Ń') || (kp == 'o') || (kp == 'O') || (kp == 'ó') || (kp == 'Ó') || (kp == 'p') || (kp == 'P') || (kp == 'q') || (kp == 'Q') || (kp == 'r') || (kp == 'R') || (kp == 's') || (kp == 'S') || (kp == 'ś') || (kp == 'Ś') || (kp == 't') || (kp == 'T') || (kp == 'u') || (kp == 'U') || (kp == 'v') || (kp == 'V') || (kp == 'w') || (kp == 'W') || (kp == 'x') || (kp == 'X') || (kp == 'y') || (kp == 'Y') || (kp == 'z') || (kp == 'Z') || (kp == 'ż') || (kp == 'Ż') || (kp == 'ź') || (kp == 'Ź')) {
            } else {
                return false;
            }
        }
        return true;
    }

    public String znajdzFormule(String st) {
        char[] kp = st.toCharArray();
        boolean znalezionoCiag;
        int poczatekFormuly = -1;
        int pozycjaNawiasuCiagu = -1;
        char ostatniaLitera = ' ';
        czySaJakiesFormuly = false;
        for (int i = 0; i < st.length(); i++)
        {
            if (kp[i] == '(') {
                if ((i > 0) && (CheckOnlyLetter(kp[i - 1]))) {
                    ostatniaLitera = kp[i - 1];
                    kp[i - 1] = '◙';//alt +10
                    znalezionoCiag = true;
                    pozycjaNawiasuCiagu = i;
                    if (znalezionoCiag) {
                        for (int k = i - 2; k >= 0; k--) {
                            if (CheckOnlyLetter(kp[k])) {
                            } else {
                                poczatekFormuly = k;
                                k = 0;
                            }
                        }
                        for (int z = i; z < st.length(); z++) {
                            if (kp[z] == ')') {
                                kp[z] = '▼';
                                z = st.length();
                            }
                        }
                        i = st.length();
                        czySaJakiesFormuly = true;
                    }
                } 
            }
        }
 
        String q = String.valueOf(kp);
        String slowo;
        if ((poczatekFormuly != -1) && (pozycjaNawiasuCiagu != -1)) {
            slowo = q.substring(poczatekFormuly, pozycjaNawiasuCiagu);
            q = q.replace(slowo + "(", "↔"); //alt+29
            q = q.replace("▼", "∟ jest " + slowo + ostatniaLitera + " ");//alt+28
            q = q.replace("◙", "");//alt+10
        }
        return q;
    }

}
