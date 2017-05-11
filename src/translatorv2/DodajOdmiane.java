package translatorv2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Goniprowski
 */
public class DodajOdmiane extends JFrame implements ActionListener {

    JButton button = new JButton("Dodaj");

    final JTextArea txtIdentyfikator = new JTextArea(12, 35);
    final JTextArea txt1 = new JTextArea(12, 35);
    final JTextArea txt2 = new JTextArea(12, 35);
    final JTextArea txt3 = new JTextArea(12, 35);
    final JTextArea txt4 = new JTextArea(12, 35);
    final JTextArea txt5 = new JTextArea(12, 35);
    final JTextArea txt6 = new JTextArea(12, 35);
    final JTextArea txt7 = new JTextArea(12, 35);

    final JTextArea txt8 = new JTextArea(12, 35);
    final JTextArea txt9 = new JTextArea(12, 35);
    final JTextArea txt10 = new JTextArea(12, 35);
    final JTextArea txt11 = new JTextArea(12, 35);
    final JTextArea txt12 = new JTextArea(12, 35);
    final JTextArea txt13 = new JTextArea(12, 35);
    final JTextArea txt14 = new JTextArea(12, 35);

    JLabel identyfikator = new JLabel("Odmiana przez przypadki słowa:");
    JLabel Lpoj = new JLabel(" Liczba Pojedyncza ");
    JLabel LMnog = new JLabel(" Liczba Mnoga ");

    JLabel A = new JLabel(" Mianownik ");
    JLabel B = new JLabel(" Dopełniacz");
    JLabel C = new JLabel(" Celownik ");
    JLabel D = new JLabel(" Biernik ");
    JLabel E = new JLabel(" Narzędnik ");
    JLabel F = new JLabel(" Miejscownik ");
    JLabel G = new JLabel(" Wołacz ");

    JLabel AM = new JLabel(" Mianownik ");
    JLabel BM = new JLabel(" Dopełniacz");
    JLabel CM = new JLabel(" Celownik ");
    JLabel DM = new JLabel(" Biernik ");
    JLabel EM = new JLabel(" Narzędnik ");
    JLabel FM = new JLabel(" Miejscownik ");
    JLabel GM = new JLabel(" Wołacz ");

    final JCheckBox checkbox = new JCheckBox();

    public DodajOdmiane() {

        super("Dodaj nową odmianę");

        setSize(600, 800);  

        JPanel p = new JPanel();  
        p.setOpaque(true);

        p.setLayout(null);
        txtIdentyfikator.setLineWrap(true);
        txtIdentyfikator.setRows(12);
        identyfikator.setBounds(1, 1, 500, 20);//(LewaSzer,GorWys,PrawaSzer,DolnaDL)
        txtIdentyfikator.setBounds(1, 20, 400, 30);

        Lpoj.setBounds(1, 55, 200, 30);
        Lpoj.setFont(new Font("Arial", Font.BOLD, 20));

        A.setBounds(1, 100, 80, 30);
        txt1.setBounds(80, 100, 250, 30);
        B.setBounds(1, 140, 80, 30);
        txt2.setBounds(80, 140, 250, 30);
        C.setBounds(1, 180, 80, 30);
        txt3.setBounds(80, 180, 250, 30);
        D.setBounds(1, 220, 80, 30);
        txt4.setBounds(80, 220, 250, 30);
        E.setBounds(1, 260, 80, 30);
        txt5.setBounds(80, 260, 250, 30);
        F.setBounds(1, 300, 80, 30);
        txt6.setBounds(80, 300, 250, 30);
        G.setBounds(1, 340, 80, 30);
        txt7.setBounds(80, 340, 250, 30);

        LMnog.setBounds(1, 400, 200, 30);
        checkbox.setBounds(150, 400, 300, 30);

        LMnog.setFont(new Font("Arial", Font.BOLD, 20));
        AM.setBounds(1, 440, 80, 30);
        txt8.setBounds(80, 440, 250, 30);
        BM.setBounds(1, 480, 80, 30);
        txt9.setBounds(80, 480, 250, 30);
        CM.setBounds(1, 520, 80, 30);
        txt10.setBounds(80, 520, 250, 30);
        DM.setBounds(1, 560, 80, 30);
        txt11.setBounds(80, 560, 250, 30);
        EM.setBounds(1, 600, 80, 30);
        txt12.setBounds(80, 600, 250, 30);
        FM.setBounds(1, 640, 80, 30);
        txt13.setBounds(80, 640, 250, 30);
        GM.setBounds(1, 680, 80, 30);
        txt14.setBounds(80, 680, 250, 30);
       
        button.setBounds(1, 720, 100, 40);

        p.add(identyfikator);
        p.add(txtIdentyfikator);
        p.add(button);

        p.add(Lpoj);
        p.add(txt1);
        p.add(A);
        p.add(txt2);
        p.add(B);
        p.add(txt3);
        p.add(C);
        p.add(txt4);
        p.add(D);
        p.add(txt5);
        p.add(E);
        p.add(txt6);
        p.add(F);
        p.add(txt7);
        p.add(G);
        p.add(LMnog);
        p.add(txt8);
        p.add(txt9);
        p.add(txt10);
        p.add(txt11);
        p.add(txt12);
        p.add(txt13);
        p.add(txt14);
        p.add(AM);
        p.add(BM);
        p.add(CM);
        p.add(DM);
        p.add(EM);
        p.add(FM);
        p.add(GM);
        p.add(checkbox);

        TabKeyFocus(txtIdentyfikator);
        TabKeyFocus(txt1);
        TabKeyFocus(txt2);
        TabKeyFocus(txt3);
        TabKeyFocus(txt4);
        TabKeyFocus(txt5);
        TabKeyFocus(txt6);
        TabKeyFocus(txt7);
        TabKeyFocus(txt8);
        TabKeyFocus(txt9);
        TabKeyFocus(txt10);
        TabKeyFocus(txt11);
        TabKeyFocus(txt12);
        TabKeyFocus(txt13);
        TabKeyFocus(txt14);

        BlockLMNG();
        Container cp = getContentPane();
        cp.add(p);
        p.setPreferredSize(new Dimension(560, 755));
        JScrollPane scrollFrame = new JScrollPane(p);
        p.setAutoscrolls(true);
        scrollFrame.setPreferredSize(new Dimension(800, 300));
        this.add(scrollFrame);
        button.addActionListener(this);
        checkbox.addActionListener(this);
        

        setVisible(true);  
    }

    //obsługa przełączania pól tabulatorem
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

    public void BlockLMNG() {
        txt8.setEditable(false);
        txt8.setBackground(Color.lightGray);
        txt9.setEditable(false);
        txt9.setBackground(Color.lightGray);
        txt10.setEditable(false);
        txt10.setBackground(Color.lightGray);
        txt11.setEditable(false);
        txt11.setBackground(Color.lightGray);
        txt12.setEditable(false);
        txt12.setBackground(Color.lightGray);
        txt13.setEditable(false);
        txt13.setBackground(Color.lightGray);
        txt14.setEditable(false);
        txt14.setBackground(Color.lightGray);
        AM.setForeground(Color.LIGHT_GRAY);
        BM.setForeground(Color.LIGHT_GRAY);
        CM.setForeground(Color.LIGHT_GRAY);
        DM.setForeground(Color.LIGHT_GRAY);
        EM.setForeground(Color.LIGHT_GRAY);
        FM.setForeground(Color.LIGHT_GRAY);
        GM.setForeground(Color.LIGHT_GRAY);
        LMnog.setForeground(Color.LIGHT_GRAY);
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
    }

    public void UnblockLMNG() {
        txt8.setEditable(true);
        txt8.setBackground(Color.WHITE);
        txt9.setEditable(true);
        txt9.setBackground(Color.WHITE);
        txt10.setEditable(true);
        txt10.setBackground(Color.WHITE);
        txt11.setEditable(true);
        txt11.setBackground(Color.WHITE);
        txt12.setEditable(true);
        txt12.setBackground(Color.WHITE);
        txt13.setEditable(true);
        txt13.setBackground(Color.WHITE);
        txt14.setEditable(true);
        txt14.setBackground(Color.WHITE);
        AM.setForeground(Color.BLACK);
        BM.setForeground(Color.BLACK);
        CM.setForeground(Color.BLACK);
        DM.setForeground(Color.BLACK);
        EM.setForeground(Color.BLACK);
        FM.setForeground(Color.BLACK);
        GM.setForeground(Color.BLACK);
        LMnog.setForeground(Color.BLACK);

    }

    public boolean CheckOdm(String podm) {
        DatabaseOdmiany data = new DatabaseOdmiany();
        List<DaneOdmiany> odm = data.selectOdmianyLog();
        for (DaneOdmiany c : odm) {
            if (c.nazwa_odmiany.contains(podm) && podm.length() == c.nazwa_odmiany.length()) {
                JOptionPane.showMessageDialog(null, "odmiana o taki samym identyfikatorze już istnieje", "Błąd", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public boolean CheckIdOnlyLetter(String odmiana) {
        char[] kp = odmiana.toCharArray();
        for (int i = 0; i < odmiana.length(); i++)
        {
            if ((kp[i] == 'a') || (kp[i] == 'A') || (kp[i] == 'ą') || (kp[i] == 'Ą') || (kp[i] == 'b') || (kp[i] == 'B') || (kp[i] == 'c') || (kp[i] == 'C') || (kp[i] == 'ć') || (kp[i] == 'Ć') || (kp[i] == 'd') || (kp[i] == 'D') || (kp[i] == 'e') || (kp[i] == 'E') || (kp[i] == 'ę') || (kp[i] == 'Ę') || (kp[i] == 'f') || (kp[i] == 'F') || (kp[i] == 'g') || (kp[i] == 'G') || (kp[i] == 'h') || (kp[i] == 'H') || (kp[i] == 'i') || (kp[i] == 'I') || (kp[i] == 'j') || (kp[i] == 'J') || (kp[i] == 'k') || (kp[i] == 'K') || (kp[i] == 'l') || (kp[i] == 'L') || (kp[i] == 'ł') || (kp[i] == 'Ł') || (kp[i] == 'm') || (kp[i] == 'M') || (kp[i] == 'n') || (kp[i] == 'N') || (kp[i] == 'ń') || (kp[i] == 'Ń') || (kp[i] == 'o') || (kp[i] == 'O') || (kp[i] == 'ó') || (kp[i] == 'Ó') || (kp[i] == 'p') || (kp[i] == 'P') || (kp[i] == 'q') || (kp[i] == 'Q') || (kp[i] == 'r') || (kp[i] == 'R') || (kp[i] == 's') || (kp[i] == 'S') || (kp[i] == 'ś') || (kp[i] == 'Ś') || (kp[i] == 't') || (kp[i] == 'T') || (kp[i] == 'u') || (kp[i] == 'U') || (kp[i] == 'v') || (kp[i] == 'V') || (kp[i] == 'w') || (kp[i] == 'W') || (kp[i] == 'x') || (kp[i] == 'X') || (kp[i] == 'y') || (kp[i] == 'Y') || (kp[i] == 'z') || (kp[i] == 'Z') || (kp[i] == 'ż') || (kp[i] == 'Ż') || (kp[i] == 'ź') || (kp[i] == 'Ź')) {
                ;
            } else {
                JOptionPane.showMessageDialog(null, "Identyfikator odmiany może zawierać tylko duże lub małe litery polskiego alfabetu", "Błąd", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public boolean CheckOdmALL(String od1, String od2, String od3, String od4, String od5, String od6, String od7, String od8, String od9, String od10, String od11, String od12, String od13, String od14) {
        if (CheckOdmOnlyLetter(od1) && CheckOdmOnlyLetter(od2) && CheckOdmOnlyLetter(od3) && CheckOdmOnlyLetter(od4) && CheckOdmOnlyLetter(od5) && CheckOdmOnlyLetter(od6) && CheckOdmOnlyLetter(od7) && CheckOdmOnlyLetter(od8) && CheckOdmOnlyLetter(od9) && CheckOdmOnlyLetter(od10) && CheckOdmOnlyLetter(od11) && CheckOdmOnlyLetter(od12) && CheckOdmOnlyLetter(od13) && CheckOdmOnlyLetter(od14)) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "odmiany mogą zawierać tylko duże lub małe litery polskiego alfabetu", "Błąd", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean CheckOdmOnlyLetter(String odmiana) {
        char[] kp = odmiana.toCharArray();
        for (int i = 0; i < odmiana.length(); i++)
        {
            if ((kp[i] == 'a') || (kp[i] == 'A') || (kp[i] == 'ą') || (kp[i] == 'Ą') || (kp[i] == 'b') || (kp[i] == 'B') || (kp[i] == 'c') || (kp[i] == 'C') || (kp[i] == 'ć') || (kp[i] == 'Ć') || (kp[i] == 'd') || (kp[i] == 'D') || (kp[i] == 'e') || (kp[i] == 'E') || (kp[i] == 'ę') || (kp[i] == 'Ę') || (kp[i] == 'f') || (kp[i] == 'F') || (kp[i] == 'g') || (kp[i] == 'G') || (kp[i] == 'h') || (kp[i] == 'H') || (kp[i] == 'i') || (kp[i] == 'I') || (kp[i] == 'j') || (kp[i] == 'J') || (kp[i] == 'k') || (kp[i] == 'K') || (kp[i] == 'l') || (kp[i] == 'L') || (kp[i] == 'ł') || (kp[i] == 'Ł') || (kp[i] == 'm') || (kp[i] == 'M') || (kp[i] == 'n') || (kp[i] == 'N') || (kp[i] == 'ń') || (kp[i] == 'Ń') || (kp[i] == 'o') || (kp[i] == 'O') || (kp[i] == 'ó') || (kp[i] == 'Ó') || (kp[i] == 'p') || (kp[i] == 'P') || (kp[i] == 'q') || (kp[i] == 'Q') || (kp[i] == 'r') || (kp[i] == 'R') || (kp[i] == 's') || (kp[i] == 'S') || (kp[i] == 'ś') || (kp[i] == 'Ś') || (kp[i] == 't') || (kp[i] == 'T') || (kp[i] == 'u') || (kp[i] == 'U') || (kp[i] == 'v') || (kp[i] == 'V') || (kp[i] == 'w') || (kp[i] == 'W') || (kp[i] == 'x') || (kp[i] == 'X') || (kp[i] == 'y') || (kp[i] == 'Y') || (kp[i] == 'z') || (kp[i] == 'Z') || (kp[i] == 'ż') || (kp[i] == 'Ż') || (kp[i] == 'ź') || (kp[i] == 'Ź')) {
                ;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean ChceckOdmIsNotEmpty(String odmiana) {
        if (odmiana.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Podaj identyfikator odmiany", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        String ti = txtIdentyfikator.getText();
        String t1 = txt1.getText();
        String t2 = txt2.getText();
        String t3 = txt3.getText();
        String t4 = txt4.getText();
        String t5 = txt5.getText();
        String t6 = txt6.getText();
        String t7 = txt7.getText();
        String t8 = txt8.getText();
        String t9 = txt9.getText();
        String t10 = txt10.getText();
        String t11 = txt11.getText();
        String t12 = txt12.getText();
        String t13 = txt13.getText();
        String t14 = txt14.getText();
        boolean controll = true;
        boolean controllM = true;
        if (source == button) {
            if (ChceckOdmIsNotEmpty(ti) && CheckIdOnlyLetter(ti) && CheckOdm(ti) && CheckOdmALL(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)) {
                if (ti.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "brak słowa do odmiany przez przypadki", "Błąd", JOptionPane.ERROR_MESSAGE);
                    dispose();
                }
                if (t1.isEmpty() || t2.isEmpty() || t3.isEmpty() || t4.isEmpty() || t5.isEmpty() || t6.isEmpty() || t7.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Uzupełnij wszystkie przypadki liczby pojedynczej", "Błąd", JOptionPane.ERROR_MESSAGE);
                    controll = false;
                } else {
                    controll = true;
                }
                if (checkbox.isSelected()) {
                    if (t8.isEmpty() || t9.isEmpty() || t10.isEmpty() || t11.isEmpty() || t12.isEmpty() || t13.isEmpty() || t14.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Uzupełnij wszystkie przypadki liczby mnogiej", "Błąd", JOptionPane.ERROR_MESSAGE);
                        controllM = false;
                    } else {
                        controllM = true;
                    }

                } else {
                    t8 = "‼";
                    t9 = "‼";
                    t10 = "‼";
                    t11 = "‼";
                    t12 = "‼";
                    t13 = "‼";
                    t14 = "‼";
                    controllM = true;
                }
                if (controll == true && controllM == true) {
                    DaneOdmiany odm = new DaneOdmiany('1', ti, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14);
                    odm.zapisDoBazy();
                    dispose();
                }

            }
        } else if (source == checkbox) {
            if (checkbox.isSelected()) {
                UnblockLMNG();
            } else {
                BlockLMNG();
            }
        }
    }
}
