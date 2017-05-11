package translatorv2;

/**
 *
 * @author Goniprowski
 */
public class IleArgFun {

    public String DodajZnakKontrolny(String st, String nazwa_formuly) {
        int dl_n = nazwa_formuly.length();//dlugosc nazwy
        char[] kp = st.toCharArray();
        char[] nf = nazwa_formuly.toCharArray();
        int ppn = 0;
        int pln = 0;
        int prze = 0;
        int pom = 0;
        int pom2 = 0;// ile zmiennych podal uzytkownik
        char last = 'a';
        for (int i = 0; i < st.length(); i++) {
            if (pom < dl_n - 1) {
                if (kp[i] == nf[pom]) {
                    pom++;
                } else {
                    pom = 0;
                }

            } else if (pom == dl_n - 1) {

                if ((kp[i] == '(') && (pln == 0))//lewy nawias
                {
                    last = kp[i - 1];
                    kp[i - 1] = '♣';//alt +5
                    kp[i] = '♦';//alt 4
                    pln++;
                    pom2++;
                }
                if ((kp[i] == ')') && (ppn == 0))//prawy nawias
                {
                    ppn++;
                    pom2++;
                }
                if ((pln == 1) && (ppn == 0) && (kp[i] == ','))//przecinki
                {
                    if (prze == 0) {
                        prze++;
                        pom2++;
                    } else if (prze == 1) {
                        prze++;
                        pom2++;
                    } else if (prze == 2) {
                        prze++;
                        pom2++;
                    } else if (prze == 3) {
                        prze++;
                        pom2++;
                    } else if (prze == 4) {
                        prze++;
                        pom2++;
                    } else if (prze == 5) {
                        prze++;
                        pom2++;
                    } else if (prze == 6) {
                        prze++;
                        pom2++;
                    } else if (prze == 7) {
                        prze++;
                        pom2++;
                    } else if (prze == 8) {
                        prze++;
                        pom2++;
                    }
                }
            }
        }

        pom2 = pom2 - 1;
        String q = String.valueOf(kp);
        if (pom2 == 1) {
            q = q.replace("♦", "▼(");
        } else if (pom2 == 2) {
            q = q.replace("♦", "▼▼(");
        } else if (pom2 == 3) {
            q = q.replace("♦", "▼▼▼(");
        } else if (pom2 == 4) {
            q = q.replace("♦", "▼▼▼▼(");
        } else if (pom2 == 5) {
            q = q.replace("♦", "▼▼▼▼▼(");
        } else if (pom2 == 6) {
            q = q.replace("♦", "▼▼▼▼▼▼(");
        } else if (pom2 == 7) {
            q = q.replace("♦", "▼▼▼▼▼▼▼(");
        } else if (pom2 == 8) {
            q = q.replace("♦", "▼▼▼▼▼▼▼▼(");
        } else if (pom2 == 9) {
            q = q.replace("♦", "▼▼▼▼▼▼▼▼▼(");
        } else if (pom2 == 10) {
            q = q.replace("♦", "▼▼▼▼▼▼▼▼▼▼(");
        }

        q = q.replace("♣", "♠" + last);
        return q;
    }

    public String UsunKontrol(String st) {
        String q = st;
        for (int i = 0; i != 10; i++) {
            q = q.replace("▼", "");
        }
        return q;
    }
}
