package translatorv2;

import javax.swing.JOptionPane;

/**
 *
 * @author Goniprowski
 */
public class implikacja {

    boolean czy_jest_implikacja = true;

    public boolean isletter(char kp) {
        if ((kp == ',') || (kp == '.') || (kp == '1') || (kp == '2') || (kp == '3') || (kp == '4') || (kp == '5') || (kp == '6') || (kp == '7') || (kp == '8') || (kp == '9') || (kp == '0') || (kp == 'a') || (kp == 'A') || (kp == 'ą') || (kp == 'Ą') || (kp == 'b') || (kp == 'B') || (kp == 'c') || (kp == 'C') || (kp == 'ć') || (kp == 'Ć') || (kp == 'd') || (kp == 'D') || (kp == 'e') || (kp == 'E') || (kp == 'ę') || (kp == 'Ę') || (kp == 'f') || (kp == 'F') || (kp == 'g') || (kp == 'G') || (kp == 'h') || (kp == 'H') || (kp == 'i') || (kp == 'I') || (kp == 'j') || (kp == 'J') || (kp == 'k') || (kp == 'K') || (kp == 'l') || (kp == 'L') || (kp == 'ł') || (kp == 'Ł') || (kp == 'm') || (kp == 'M') || (kp == 'n') || (kp == 'N') || (kp == 'ń') || (kp == 'Ń') || (kp == 'o') || (kp == 'O') || (kp == 'ó') || (kp == 'Ó') || (kp == 'p') || (kp == 'P') || (kp == 'q') || (kp == 'Q') || (kp == 'r') || (kp == 'R') || (kp == 's') || (kp == 'S') || (kp == 'ś') || (kp == 'Ś') || (kp == 't') || (kp == 'T') || (kp == 'u') || (kp == 'U') || (kp == 'v') || (kp == 'V') || (kp == 'w') || (kp == 'W') || (kp == 'x') || (kp == 'X') || (kp == 'y') || (kp == 'Y') || (kp == 'z') || (kp == 'Z') || (kp == 'ż') || (kp == 'Ż') || (kp == 'ź') || (kp == 'Ź')) {
            return true;
        }
        return false;
    }

    public String impv2(String st) {
        char[] kp = st.toCharArray();
        char temp_znak = ' ';
        int ile_nawiasow = 0;
        int jakisznak = 0;
        czy_jest_implikacja = false;
        boolean pocz = false;

        int znaleziono_imp = 0;
        for (int i = 0; i < st.length(); i++)
        {
            if ((kp[i] == '⇒') && (i > 0)) {
                kp[i] = '↑';
                znaleziono_imp = 1;
                czy_jest_implikacja = true;
                for (int k = i; k >= 0; k--) {
                    if ((ile_nawiasow == 0) && (jakisznak != 0) && (!isletter(kp[k - 1]))) {
                        temp_znak = kp[k];
                        kp[k] = '↓';//alt+25
                        if (k == 0) {
                            pocz = true;
                        }
                        k = 0;

                    }
                    if ((kp[k] == ')') || (kp[k] == '↔')) {
                        ile_nawiasow++;
                    }
                    if ((kp[k] == '(') || (kp[k] == '∟')) {
                        ile_nawiasow--;
                    }
                    if (isletter(kp[k])) {
                        jakisznak++;
                    }
                }
                i = st.length();

            }
        }
        if ((jakisznak == 0) && (znaleziono_imp == 1)) {
            JOptionPane.showMessageDialog(null, "źle wprowadzona implikacja", "Błąd", JOptionPane.ERROR_MESSAGE);
            st = "";
            return st;
        }
        String q = String.valueOf(kp);
        if (!pocz) {
            q = q.replace("↓", "\nJEŻELI \n" + temp_znak);
        } else {
            q = q.replace("↓", "JEŻELI \n" + temp_znak);
        }
        if (znaleziono_imp != 0) {
            q = q.replace("↑", "\nTO \n");
        } else {
            q = q.replace("↑", "");
        }
        return q;
    }
}
