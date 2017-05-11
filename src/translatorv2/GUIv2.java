package translatorv2;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.List;

/**
 *
 * @author Goniprowski
 */
public class GUIv2 extends JFrame implements ActionListener {

    private static final String negacja = " NIEPRAWDA ŻE ";
    private static final String koniunkcja = "\n I \n";
    private static final String alternatywa = "\n LUB \n";
    private static final String rownowaznosc = "\n WTEDY I TYLKO WTEDY GDY \n";

    private static final String Duzy = " DLA KAŻDEGO ";
    private static final String Maly = " ISTNIEJE ";

    private static final String rowna = "\n JEST IDENTYCZNE Z \n";

    private static final String wbez = " WARTOŚĆ BEZWZGLĘDNA Z ";

    JButton button = new JButton("Wykonaj");
    JButton button2 = new JButton("Legenda");
    JButton button3 = new JButton("Dodaj nowy szablon tłumaczenia");
    JButton button4 = new JButton("Dodaj nową odmianę");
    JButton button5 = new JButton("Lista szablonów tłumaczeń");
    JButton button6 = new JButton("Lista odmian");
    JButton button7 = new JButton("Autor");
    JButton l1 = new JButton();
    JButton l2 = new JButton();
    JButton l3 = new JButton();
    JButton l4 = new JButton();
    JButton l5 = new JButton();
    JButton l6 = new JButton();
    JButton l7 = new JButton();
    JButton l8 = new JButton();
    private JScrollPane scrollText, scrollText2;
    private static JTextArea txtFormula;

    private static JTextArea txtWynik;

    void TabKeyFocus(final JTextArea txt) {
        txt.addKeyListener(
                new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e
            ) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    if (e.getModifiers() > 0) {
                        txt.transferFocusBackward();
                    } else {
                        txt.transferFocus();
                    }
                    e.consume();
                }
            }
        });
    }
    private static GUIv2 guiv2 = new GUIv2();

    public static GUIv2 getInstance() {
        return guiv2;
    }

    private GUIv2() {

        super("Translator");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setOpaque(true);

        p.setLayout(null);

        JLabel formula = new JLabel("Formuła:");
        JLabel wynik = new JLabel("Wynik:");

        formula.setBounds(1, 1, 300, 20);

        wynik.setBounds(1, 300, 200, 40);
        txtFormula = new JTextArea("", 50, 895);
        scrollText = new JScrollPane(txtFormula);
        scrollText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        txtFormula.setLineWrap(true);
        txtFormula.setWrapStyleWord(true);
        txtFormula.setFont(txtFormula.getFont().deriveFont(20f));
        scrollText.setBounds(1, 60, 400, 200);
        p.add(scrollText);

        txtWynik = new JTextArea("", 50, 895);
        scrollText2 = new JScrollPane(txtWynik);
        scrollText2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        txtWynik.setLineWrap(true);
        txtWynik.setWrapStyleWord(true);
        txtWynik.setFont(txtWynik.getFont().deriveFont(20f));
        scrollText2.setBounds(1, 340, 400, 200);
        txtWynik.setEditable(false);
        p.add(scrollText2);

        button.setBounds(1, 260, 200, 40);
        button2.setBounds(420, 60, 250, 40);
        button3.setBounds(420, 100, 250, 40);
        button4.setBounds(420, 140, 250, 40);
        button5.setBounds(420, 180, 250, 40);
        button6.setBounds(420, 220, 250, 40);
        button7.setBounds(420, 520, 250, 40);

        p.add(button);
        p.add(button2);
        p.add(button3);
        p.add(button4);
        p.add(button5);
        p.add(button6);
        p.add(button7);

        l1.setBounds(1, 20, 40, 40);
        l2.setBounds(40, 20, 40, 40);
        l3.setBounds(80, 20, 40, 40);
        l4.setBounds(120, 20, 40, 40);
        l5.setBounds(160, 20, 40, 40);
        l6.setBounds(200, 20, 40, 40);
        l7.setBounds(240, 20, 40, 40);
        l8.setBounds(280, 20, 40, 40);

        try {
            Image img = ImageIO.read(getClass().getResource("img/koniunkcja.gif"));
            l1.setIcon(new ImageIcon(img));
            Image img2 = ImageIO.read(getClass().getResource("img/alternatywa.gif"));
            l2.setIcon(new ImageIcon(img2));
            Image img3 = ImageIO.read(getClass().getResource("img/negacja.gif"));
            l3.setIcon(new ImageIcon(img3));
            Image img4 = ImageIO.read(getClass().getResource("img/rowna.gif"));
            l4.setIcon(new ImageIcon(img4));
            Image img5 = ImageIO.read(getClass().getResource("img/implikacja.gif"));
            l5.setIcon(new ImageIcon(img5));
            Image img6 = ImageIO.read(getClass().getResource("img/rownowaznosc.gif"));
            l6.setIcon(new ImageIcon(img6));
            Image img7 = ImageIO.read(getClass().getResource("img/dlakazdego.gif"));
            l7.setIcon(new ImageIcon(img7));
            Image img8 = ImageIO.read(getClass().getResource("img/istnieje.gif"));
            l8.setIcon(new ImageIcon(img8));
        } catch (IOException ex) {
        }

        p.add(formula);

        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        p.add(l6);
        p.add(l7);
        p.add(l8);

        p.add(wynik);

        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        l4.addActionListener(this);
        l5.addActionListener(this);
        l6.addActionListener(this);
        l7.addActionListener(this);
        l8.addActionListener(this);

        TabKeyFocus(txtFormula);
        TabKeyFocus(txtWynik);

        Container cp = getContentPane();
        cp.add(p);
        p.setPreferredSize(new Dimension(660, 555));
        JScrollPane scrollFrame = new JScrollPane(p);
        p.setAutoscrolls(true);
        scrollFrame.setPreferredSize(new Dimension(800, 300));
        this.add(scrollFrame);
        setVisible(true);

    }

    public void SetResultNull() {
        txtWynik.setText("");
    }

    public static String DeleteChar(String s, int i) {
        return s.substring(0, i) + s.substring(i + 1);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String st = "  " + txtFormula.getText();

        if (source == l1) {
            txtFormula.replaceSelection("˄");
        } else if (source == l2) {
            txtFormula.replaceSelection("˅");
        } else if (source == l3) {
            txtFormula.replaceSelection("¬");
        } else if (source == l4) {
            txtFormula.replaceSelection("=");
        } else if (source == l5) {
            txtFormula.replaceSelection(" ⇒");
        } else if (source == l6) {
            txtFormula.replaceSelection("⇔");
        } else if (source == l7) {
            txtFormula.replaceSelection("∀");
        } else if (source == l8) {
            txtFormula.replaceSelection("∃");
        } else if (source == button) {
            boolean controll = true;

            st = st.replace("\n\n", "\n");
            st = st.replace("¬", negacja);
            st = st.replace("˄", koniunkcja);
            st = st.replace("˅", alternatywa);

            st = st.replace("⇔", rownowaznosc);

            st = st.replace("∀", Duzy);
            st = st.replace("∃", Maly);

            st = st.replace("=", rowna);

            modstringv2 modst = new modstringv2();

            IleArgFun IAF = new IleArgFun();
            //implikacja
            implikacja imp = new implikacja();
            while (imp.czy_jest_implikacja) {
                st = imp.impv2(st);
            }

            st = st.replace("  ", " ");//usuwanie podwojonej spacji
            //schematy tlumaczen
            if (controll) {
                DatabaseFormuly data = new DatabaseFormuly();
                List<DaneFormuly> form = data.selectFormulyLog();
                for (DaneFormuly c : form) {
                    while (st.indexOf(IAF.UsunKontrol(c.nazwa_formuly)) != -1) {
                        st = IAF.DodajZnakKontrolny(st, IAF.UsunKontrol(c.nazwa_formuly));
                    }
                }
                st = st.replace("♠", "");//usuwanie znaku kontrolnego
                DatabaseFormuly data2 = new DatabaseFormuly();
                List<DaneFormuly> form2 = data2.selectFormulyLog();
                for (DaneFormuly c : form2) {

                    while (st.indexOf(c.nazwa_formuly) != -1) {
                        String stpom = "▲" + st.indexOf(c.nazwa_formuly);
                        st = modst.ZamianaDanychZBazy(st, c.nazwa_formuly, c.przedA + "▲" + st.indexOf(c.nazwa_formuly), c.przedB + "▲▲" + st.indexOf(c.nazwa_formuly), c.przedC + "▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedD + "▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedE + "▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedF + "▲▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedG + "▲▲▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedH + "▲▲▲▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedI + "▲▲▲▲▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.przedJ + "▲▲▲▲▲▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.poJ + "▲▲▲▲▲▲▲▲▲▲▲" + st.indexOf(c.nazwa_formuly), c.odA, c.odB, c.odC, c.odD, c.odE, c.odF, c.odG, c.odH, c.odI, c.odJ, c.l1, c.l2, c.l3, c.l4, c.l5, c.l6, c.l7, c.l8, c.l9, c.l10, c.dl);
                        st = st.replace(stpom, "");
                    }

                }

                st = st.replace("☼", "");//usuwanie znaku kontrolnego do nie potrzebnych elemntow z zamiany tekstu
                st = st.replace("‼", "");// usuwanie znaku kontrolnego do pustych pol w bazie

                st = st.replace("▲", "");//usuwanie znaku kontrolnego alt+30 potrzebny do rozroznienia elementow przez IndexOf 
                st = st.replace("▼", "");//usuwanie znaku kontrolnego alt+31 potrzebny do przeciazania formul

                //tlumaczenie domyslne
                DefaultTranslate dt = new DefaultTranslate();
                while (dt.czySaJakiesFormuly) {
                    st = dt.znajdzFormule(st);
                }
                //usuwanie multi spacji
                while (st.contains("  ")) {
                    st = st.replace("  ", " ");
                }

                st = st.replace(")", "");//usuwanie zbednych nawiasow
                st = st.replace("(", "");//usuwanie zbednych nawiasow
                st = st.replace("∟", ")");//usuwanie znaku kontrolnego alt+31 potrzebny do przeciazania formul
                st = st.replace("↔", "(");//usuwanie znaku kontrolnego alt+31 potrzebny do przeciazania formul
                if (st.substring(0, 2).contains("\n")) //usuwanie znaku nowej lini z poczatku formuly
                {
                    st = DeleteChar(st, 1);
                }

                st = st.replace("\n\n", "\n");//usuwanie za duzej ilosc znakow nowej lini
                st = st.replace("\n \n", "\n");
                ////WARTOSC BEZWZGLEDNA
                //obsluga bledu wart bezwzglednej
                if (st.contains("||") || st.contains("| |")) {
                    JOptionPane.showMessageDialog(null, "brak wartości pomiędzy znakiem wartości bezwzględnej", "Błąd", JOptionPane.ERROR_MESSAGE);;
                    txtWynik.setText("");
                    controll = false;
                }
                if (controll == true) {
                    st = modst.bezwzgledna(st);
                    st = st.replace("|", wbez);
                    txtWynik.setText(st);
                    data.closeConnection();
                    data2.closeConnection();
                }

            }
        } else if (source == button2) {
            JOptionPane.showMessageDialog(null,
                    "˄  : koniunkcja \n"
                    + "˅  : Alternatywa \n"
                    + "= : Równa się \n"
                    + "¬ : Negacja \n"
                    + "⇒ : Implikacja \n"
                    + "⇔ : Równoważność\n"
                    + "∀ : Dla Każdego\n"
                    + "∃ : Istnieje\n"
                    + "|-X| : 	wartosc bezwzgledna\n\n\n\n\n", "Legenda", JOptionPane.INFORMATION_MESSAGE);
        } else if (source == button3) {
            DodajFormule dodfo = new DodajFormule();
        } else if (source == button4) {
            DodajOdmiane dododm = new DodajOdmiane();
        } else if (source == button5) {
            ListaFormul listForm = new ListaFormul();
        } else if (source == button6) {
            ListaOdmian listOdmm = new ListaOdmian();
        } else if (source == button7) {
            JOptionPane.showMessageDialog(null,"Goniprowski Mateusz", "Autor", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
