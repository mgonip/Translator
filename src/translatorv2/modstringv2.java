package translatorv2;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Goniprowski
 */
public class modstringv2 {

    public String bezwzgledna(String st) {
        int il_znk = 0;//ilosc |
        char[] kp = st.toCharArray();
        for (int i = 0; i < st.length(); i++) {
            if ((kp[i] == '|')) {
                il_znk++;
                if (il_znk % 2 == 0) {
                    kp[i] = ' ';
                }

            }

        }
        if (il_znk % 2 != 0) {
            JOptionPane.showMessageDialog(null, "brak zamkniecia wartości bezwzględnej", "Błąd", JOptionPane.ERROR_MESSAGE);
            return "";
        } else {

            return String.valueOf(kp);
        }
    }

    public String ZamianaDanychZBazy(String st, String nazwa_formuly, String przedA, String przedB, String przedC, String przedD, String przedE, String przedF, String przedG, String przedH, String przedI, String przedJ, String poJ, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10, int dl)
    {
        int dl_n = nazwa_formuly.length();//dlugosc nazwy
        char[] kp = st.toCharArray();
        char[] nf = nazwa_formuly.toCharArray();
        int ppn = 0;
        int pln = 0;
        int prze = 0;
        int pom = 0;
        int pom2 = 0;// ile zmiennych podal uzytkownik

        //szukanie schematu tłumaczenia
        for (int i = 0; i < st.length(); i++) {
            if (pom < dl_n - 1) {
                if (kp[i] == nf[pom]) {
                    pom++;
                } else {
                    pom = 0;
                }
            } else if (pom == dl_n - 1) {

//dodawanie znaków kontrolnych
                if ((kp[i] == '(') && (pln == 0))//lewy nawias
                {
                    kp[i] = '♦';//alt 4
                    pln++;
                    pom2++;
                }
                if ((kp[i] == ')') && (ppn == 0))//prawy nawias
                {
                    kp[i] = '♣';//alt 5
                    ppn++;
                    pom2++;
                }
                if ((pln == 1) && (ppn == 0) && (kp[i] == ','))//przecinki
                {
                    if (prze == 0) {
                        kp[i] = '♠';//alt 6
                        prze++;
                        pom2++;
                    } else if (prze == 1) {
                        kp[i] = '•';//alt 7
                        prze++;
                        pom2++;
                    } else if (prze == 2) {
                        kp[i] = '◘';//alt 8
                        prze++;
                        pom2++;
                    } else if (prze == 3) {
                        kp[i] = '○';//alt 9
                        prze++;
                        pom2++;
                    } else if (prze == 4) {
                        kp[i] = '◙';//alt 10
                        prze++;
                        pom2++;
                    } else if (prze == 5) {
                        kp[i] = '♂';//alt 11
                        prze++;
                        pom2++;
                    } else if (prze == 6) {
                        kp[i] = '♀';//alt 12
                        prze++;
                        pom2++;
                    } else if (prze == 7) {
                        kp[i] = '♪';//alt 13
                        prze++;
                        pom2++;
                    } else if (prze == 8) {
                        kp[i] = '♫';//alt 14
                        prze++;
                        pom2++;
                    }
                }
            }
        }
//dodawanie członów schematu
        if (pom2 - 1 == dl) {
            String q = String.valueOf(kp);
            q = q.replace("♣", "♣→");
            q = q.replace("♦", "‼" + przedA + "☼" + " ");
            q = q.replace("♠", " " + przedB + "►" + " ");
            q = q.replace("•", " " + przedC + "◄" + " ");
            q = q.replace("◘", " " + przedD + "↕" + " ");
            q = q.replace("○", " " + przedE + "¶" + " ");
            q = q.replace("◙", " " + przedF + "§" + " ");
            q = q.replace("♂", " " + przedG + "▬" + " ");
            q = q.replace("♀", " " + przedH + "↨" + " ");
            q = q.replace("♪", " " + przedI + "↑" + " ");
            q = q.replace("♫", " " + przedJ + "↓" + " ");
            q = q.replace("♣", " " + poJ + " ");

            //odmiana argumentów przez przypadki
            if (dl == 1) {
                q = od1(q, st, nazwa_formuly, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 2) {
                q = od2(q, st, nazwa_formuly, przedB, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 3) {
                q = od3(q, st, nazwa_formuly, przedB, przedC, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 4) {
                q = od4(q, st, nazwa_formuly, przedB, przedC, przedD, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 5) {
                q = od5(q, st, nazwa_formuly, przedB, przedC, przedD, przedE, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 6) {
                q = od6(q, st, nazwa_formuly, przedB, przedC, przedD, przedE, przedF, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 7) {
                q = od7(q, st, nazwa_formuly, przedB, przedC, przedD, przedE, przedF, przedG, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 8) {
                q = od8(q, st, nazwa_formuly, przedB, przedC, przedD, przedE, przedF, przedG, przedH, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 9) {
                q = od9(q, st, nazwa_formuly, przedB, przedC, przedD, przedE, przedF, przedG, przedH, przedI, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            } else if (dl == 10) {
                q = od10(q, st, nazwa_formuly, przedB, przedC, przedD, przedE, przedF, przedG, przedH, przedI, przedJ, poJ, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
            }

            q = q.replace("→", " ");

            String zz = nazwa_formuly;
            zz = zz.replace("(", "‼");
            q = q.replace(zz, "‼");

            //usuwanie znakow kontrolnych
            q = q.replace("☼", "");
            q = q.replace("►", "");
            q = q.replace("◄", "");
            q = q.replace("↕", "");
            q = q.replace("¶", "");
            q = q.replace("§", "");
            q = q.replace("▬", "");
            q = q.replace("↨", "");
            q = q.replace("↑", "");
            q = q.replace("↓", "");

            return q;
        }
        String naz = nazwa_formuly;
        naz = naz.replace("(", "");
        return st;
    }
//od1 ... od10 - 1.... 10 zmiennych
    public String od1(String q, String st, String nazwa_formuly, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf("→"));
        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);

        }
        data2.closeConnection();
        return q;
    }

    public String od2(String q, String st, String nazwa_formuly, String przedB, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf("→"));

        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);

        }
        data2.closeConnection();
        return q;
    }

    public String od3(String q, String st, String nazwa_formuly, String przedB, String przedC, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf("→"));

        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);

        }
        data2.closeConnection();
        return q;
    }

    public String od4(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf("→"));
        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);

        }
        data2.closeConnection();
        return q;
    }

    public String od5(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, String przedE, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf(przedE));

        String od5 = q.substring(q.indexOf("¶"), q.indexOf("→"));

        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);
            q = odmiany(c.nazwa_odmiany, q, od5, odE, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l5);

        }
        data2.closeConnection();
        return q;
    }

    public String od6(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, String przedE, String przedF, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf(przedE));

        String od5 = q.substring(q.indexOf("¶"), q.indexOf(przedF));

        String od6 = q.substring(q.indexOf("§"), q.indexOf("→"));
        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);
            q = odmiany(c.nazwa_odmiany, q, od5, odE, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l5);
            q = odmiany(c.nazwa_odmiany, q, od6, odF, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l6);

        }
        data2.closeConnection();
        return q;
    }

    public String od7(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, String przedE, String przedF, String przedG, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf(przedE));

        String od5 = q.substring(q.indexOf("¶"), q.indexOf(przedF));

        String od6 = q.substring(q.indexOf("§"), q.indexOf(przedG));

        String od7 = q.substring(q.indexOf("▬"), q.indexOf("→"));
        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);
            q = odmiany(c.nazwa_odmiany, q, od5, odE, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l5);
            q = odmiany(c.nazwa_odmiany, q, od6, odF, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l6);
            q = odmiany(c.nazwa_odmiany, q, od7, odG, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l7);

        }
        data2.closeConnection();
        return q;
    }

    public String od8(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, String przedE, String przedF, String przedG, String przedH, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf(przedE));

        String od5 = q.substring(q.indexOf("¶"), q.indexOf(przedF));

        String od6 = q.substring(q.indexOf("§"), q.indexOf(przedG));

        String od7 = q.substring(q.indexOf("▬"), q.indexOf(przedH));

        String od8 = q.substring(q.indexOf("↨"), q.indexOf("→"));
        
        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);
            q = odmiany(c.nazwa_odmiany, q, od5, odE, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l5);
            q = odmiany(c.nazwa_odmiany, q, od6, odF, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l6);
            q = odmiany(c.nazwa_odmiany, q, od7, odG, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l7);
            q = odmiany(c.nazwa_odmiany, q, od8, odH, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l8);

        }
        data2.closeConnection();
        return q;
    }

    public String od9(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, String przedE, String przedF, String przedG, String przedH, String przedI, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {
        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf(przedE));

        String od5 = q.substring(q.indexOf("¶"), q.indexOf(przedF));

        String od6 = q.substring(q.indexOf("§"), q.indexOf(przedG));

        String od7 = q.substring(q.indexOf("▬"), q.indexOf(przedH));

        String od8 = q.substring(q.indexOf("↨"), q.indexOf(przedI));

        String od9 = q.substring(q.indexOf("↑"), q.indexOf("→"));

        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);
            q = odmiany(c.nazwa_odmiany, q, od5, odE, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l5);
            q = odmiany(c.nazwa_odmiany, q, od6, odF, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l6);
            q = odmiany(c.nazwa_odmiany, q, od7, odG, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l7);
            q = odmiany(c.nazwa_odmiany, q, od8, odH, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l8);
            q = odmiany(c.nazwa_odmiany, q, od9, odI, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l9);

        }
        data2.closeConnection();
        return q;
    }

    public String od10(String q, String st, String nazwa_formuly, String przedB, String przedC, String przedD, String przedE, String przedF, String przedG, String przedH, String przedI, String przedJ, String poJ, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10) {

        String od1 = q.substring(q.indexOf("☼"), q.indexOf(przedB));

        String od2 = q.substring(q.indexOf("►"), q.indexOf(przedC));

        String od3 = q.substring(q.indexOf("◄"), q.indexOf(przedD));

        String od4 = q.substring(q.indexOf("↕"), q.indexOf(przedE));

        String od5 = q.substring(q.indexOf("¶"), q.indexOf(przedF));

        String od6 = q.substring(q.indexOf("§"), q.indexOf(przedG));

        String od7 = q.substring(q.indexOf("▬"), q.indexOf(przedH));

        String od8 = q.substring(q.indexOf("↨"), q.indexOf(przedI));

        String od9 = q.substring(q.indexOf("↑"), q.indexOf(przedJ));

        String od10 = q.substring(q.indexOf("↓"), q.indexOf(poJ));

        DatabaseOdmiany data2 = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data2.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            q = odmiany(c.nazwa_odmiany, q, od1, odA, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l1);
            q = odmiany(c.nazwa_odmiany, q, od2, odB, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l2);
            q = odmiany(c.nazwa_odmiany, q, od3, odC, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l3);
            q = odmiany(c.nazwa_odmiany, q, od4, odD, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l4);
            q = odmiany(c.nazwa_odmiany, q, od5, odE, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l5);
            q = odmiany(c.nazwa_odmiany, q, od6, odF, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l6);
            q = odmiany(c.nazwa_odmiany, q, od7, odG, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l7);
            q = odmiany(c.nazwa_odmiany, q, od8, odH, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l8);
            q = odmiany(c.nazwa_odmiany, q, od9, odI, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l9);
            q = odmiany(c.nazwa_odmiany, q, od10, odJ, c.mianownik, c.dopelniacz, c.celownik, c.biernik, c.narzednik, c.miejscownik, c.wolacz, c.mianownikM, c.dopelniaczM, c.celownikM, c.biernikM, c.narzednikM, c.miejscownikM, c.wolaczM, l10);

        }
        data2.closeConnection();
        return q;
    }

    public int sprOdmiany(String przypadek) {
        if (przypadek != null && !przypadek.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public String odmiany(String nazwa_odmiany, String q, String od, int przypadek, String mianownik, String dopelniacz, String celownik, String biernik, String narzednik, String miejscownik, String wolacz, String mianownikM, String dopelniaczM, String celownikM, String biernikM, String narzednikM, String miejscownikM, String wolaczM, int liczba) {
        // do zostawienia slowa bez odmiany jezeli zadnej nie ma w bazie
        int m = sprOdmiany(mianownik);
        int d = sprOdmiany(dopelniacz);
        int c = sprOdmiany(celownik);
        int b = sprOdmiany(biernik);
        int n = sprOdmiany(narzednik);
        int msc = sprOdmiany(miejscownik);
        int w = sprOdmiany(wolacz);

        int mm = sprOdmiany(mianownikM);
        int dm = sprOdmiany(dopelniaczM);
        int cm = sprOdmiany(celownikM);
        int bm = sprOdmiany(biernikM);
        int nm = sprOdmiany(narzednikM);
        int mscm = sprOdmiany(miejscownikM);
        int wm = sprOdmiany(wolaczM);
        if (od.contains(nazwa_odmiany) && (przypadek == 1)) {
            if (liczba == 1 && m != 0) {
                q = q.replace(od, "☼ " + mianownik + " ");
            } else if (liczba == 2 && mm != 0) {
                if (mianownikM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + mianownikM + " ");
            }
        } else if (od.contains(nazwa_odmiany) && (przypadek == 2)) {
            if (liczba == 1 && d != 0) {
                q = q.replace(od, "☼ " + dopelniacz + " ");
            } else if (liczba == 2 && dm != 0) {
                if (dopelniaczM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + dopelniaczM + " ");
            }
        } else if (od.contains(nazwa_odmiany) && (przypadek == 3)) {
            if (liczba == 1 && c != 0) {
                q = q.replace(od, "☼ " + celownik + " ");
            } else if (liczba == 2 && cm != 0) {
                if (celownikM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + celownikM + " ");
            }
        } else if (od.contains(nazwa_odmiany) && (przypadek == 4)) {
            if (liczba == 1 && b != 0) {
                q = q.replace(od, "☼ " + biernik + " ");
            } else if (liczba == 2 && bm != 0) {
                if (biernikM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + biernikM + " ");
            }
        } else if (od.contains(nazwa_odmiany) && (przypadek == 5)) {
            if (liczba == 1 && n != 0) {
                q = q.replace(od, "☼ " + narzednik + " ");
            } else if (liczba == 2 && nm != 0) {
                if (narzednikM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + narzednikM + " ");
            }
        } else if (od.contains(nazwa_odmiany) && (przypadek == 6)) {
            if (liczba == 1 && msc != 0) {
                q = q.replace(od, "☼ " + miejscownik + " ");
            } else if (liczba == 2 && mscm != 0) {
                if (miejscownikM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + miejscownikM + " ");
            }
        } else if (od.contains(nazwa_odmiany) && (przypadek == 7)) {
            if (liczba == 1 && w != 0) {
                q = q.replace(od, "☼ " + wolacz + " ");
            } else if (liczba == 2 && wm != 0) {
                if (wolaczM.contains("‼")) {
                    JOptionPane.showMessageDialog(null, "brak odmiany dla liczby mnogiej słowa:    " + nazwa_odmiany, "Błąd", JOptionPane.ERROR_MESSAGE);;
                    return "";
                }
                q = q.replace(od, "☼ " + wolaczM + " ");
            }
        }

        return q;
    }
}
