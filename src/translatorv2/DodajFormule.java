package translatorv2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Goniprowski
 */
public class DodajFormule extends JFrame implements ActionListener {

    JButton button = new JButton("Dodaj");

    final JRadioButton wybor1 = new JRadioButton("1 zmienna", true);
    final JRadioButton wybor2 = new JRadioButton("2 zmienne", false);
    final JRadioButton wybor3 = new JRadioButton("3 zmienne", false);
    final JRadioButton wybor4 = new JRadioButton("4 zmienne", false);
    final JRadioButton wybor5 = new JRadioButton("5 zmienych", false);
    final JRadioButton wybor6 = new JRadioButton("6 zmienych", false);
    final JRadioButton wybor7 = new JRadioButton("7 zmienych", false);
    final JRadioButton wybor8 = new JRadioButton("8 zmienych", false);
    final JRadioButton wybor9 = new JRadioButton("9 zmienych", false);
    final JRadioButton wybor10 = new JRadioButton("10 zmienych", false);


    final JRadioButton lp1 = new JRadioButton("l.poj.", true);
    final JRadioButton lm1 = new JRadioButton("l.mn.", false);
    final JRadioButton lp2 = new JRadioButton("l.poj.", true);
    final JRadioButton lm2 = new JRadioButton("l.mn.", false);
    final JRadioButton lp3 = new JRadioButton("l.poj.", true);
    final JRadioButton lm3 = new JRadioButton("l.mn.", false);
    final JRadioButton lp4 = new JRadioButton("l.poj.", true);
    final JRadioButton lm4 = new JRadioButton("l.mn.", false);
    final JRadioButton lp5 = new JRadioButton("l.poj.", true);
    final JRadioButton lm5 = new JRadioButton("l.mn.", false);
    final JRadioButton lp6 = new JRadioButton("l.poj.", true);
    final JRadioButton lm6 = new JRadioButton("l.mn.", false);
    final JRadioButton lp7 = new JRadioButton("l.poj.", true);
    final JRadioButton lm7 = new JRadioButton("l.mn.", false);
    final JRadioButton lp8 = new JRadioButton("l.poj.", true);
    final JRadioButton lm8 = new JRadioButton("l.mn.", false);
    final JRadioButton lp9 = new JRadioButton("l.poj.", true);
    final JRadioButton lm9 = new JRadioButton("l.mn.", false);
    final JRadioButton lp10 = new JRadioButton("l.poj.", true);
    final JRadioButton lm10 = new JRadioButton("l.mn.", false);

    final JRadioButton m1 = new JRadioButton("mianownik", true);
    final JRadioButton d1 = new JRadioButton("dopełniacz", false);
    final JRadioButton c1 = new JRadioButton("celownik", false);
    final JRadioButton b1 = new JRadioButton("biernik", false);
    final JRadioButton n1 = new JRadioButton("narzędnik", false);
    final JRadioButton mie1 = new JRadioButton("miejscownik", false);
    final JRadioButton w1 = new JRadioButton("wołacz", false);

    final JRadioButton m2 = new JRadioButton("mianownik", true);
    final JRadioButton d2 = new JRadioButton("dopełniacz", false);
    final JRadioButton c2 = new JRadioButton("celownik", false);
    final JRadioButton b2 = new JRadioButton("biernik", false);
    final JRadioButton n2 = new JRadioButton("narzędnik", false);
    final JRadioButton mie2 = new JRadioButton("miejscownik", false);
    final JRadioButton w2 = new JRadioButton("wołacz", false);

    final JRadioButton m3 = new JRadioButton("mianownik", true);
    final JRadioButton d3 = new JRadioButton("dopełniacz", false);
    final JRadioButton c3 = new JRadioButton("celownik", false);
    final JRadioButton b3 = new JRadioButton("biernik", false);
    final JRadioButton n3 = new JRadioButton("narzędnik", false);
    final JRadioButton mie3 = new JRadioButton("miejscownik", false);
    final JRadioButton w3 = new JRadioButton("wołacz", false);

    final JRadioButton m4 = new JRadioButton("mianownik", true);
    final JRadioButton d4 = new JRadioButton("dopełniacz", false);
    final JRadioButton c4 = new JRadioButton("celownik", false);
    final JRadioButton b4 = new JRadioButton("biernik", false);
    final JRadioButton n4 = new JRadioButton("narzędnik", false);
    final JRadioButton mie4 = new JRadioButton("miejscownik", false);
    final JRadioButton w4 = new JRadioButton("wołacz", false);

    final JRadioButton m5 = new JRadioButton("mianownik", true);
    final JRadioButton d5 = new JRadioButton("dopełniacz", false);
    final JRadioButton c5 = new JRadioButton("celownik", false);
    final JRadioButton b5 = new JRadioButton("biernik", false);
    final JRadioButton n5 = new JRadioButton("narzędnik", false);
    final JRadioButton mie5 = new JRadioButton("miejscownik", false);
    final JRadioButton w5 = new JRadioButton("wołacz", false);

    final JRadioButton m6 = new JRadioButton("mianownik", true);
    final JRadioButton d6 = new JRadioButton("dopełniacz", false);
    final JRadioButton c6 = new JRadioButton("celownik", false);
    final JRadioButton b6 = new JRadioButton("biernik", false);
    final JRadioButton n6 = new JRadioButton("narzędnik", false);
    final JRadioButton mie6 = new JRadioButton("miejscownik", false);
    final JRadioButton w6 = new JRadioButton("wołacz", false);

    final JRadioButton m7 = new JRadioButton("mianownik", true);
    final JRadioButton d7 = new JRadioButton("dopełniacz", false);
    final JRadioButton c7 = new JRadioButton("celownik", false);
    final JRadioButton b7 = new JRadioButton("biernik", false);
    final JRadioButton n7 = new JRadioButton("narzędnik", false);
    final JRadioButton mie7 = new JRadioButton("miejscownik", false);
    final JRadioButton w7 = new JRadioButton("wołacz", false);

    final JRadioButton m8 = new JRadioButton("mianownik", true);
    final JRadioButton d8 = new JRadioButton("dopełniacz", false);
    final JRadioButton c8 = new JRadioButton("celownik", false);
    final JRadioButton b8 = new JRadioButton("biernik", false);
    final JRadioButton n8 = new JRadioButton("narzędnik", false);
    final JRadioButton mie8 = new JRadioButton("miejscownik", false);
    final JRadioButton w8 = new JRadioButton("wołacz", false);

    final JRadioButton m9 = new JRadioButton("mianownik", true);
    final JRadioButton d9 = new JRadioButton("dopełniacz", false);
    final JRadioButton c9 = new JRadioButton("celownik", false);
    final JRadioButton b9 = new JRadioButton("biernik", false);
    final JRadioButton n9 = new JRadioButton("narzędnik", false);
    final JRadioButton mie9 = new JRadioButton("miejscownik", false);
    final JRadioButton w9 = new JRadioButton("wołacz", false);

    final JRadioButton m10 = new JRadioButton("mianownik", true);
    final JRadioButton d10 = new JRadioButton("dopełniacz", false);
    final JRadioButton c10 = new JRadioButton("celownik", false);
    final JRadioButton b10 = new JRadioButton("biernik", false);
    final JRadioButton n10 = new JRadioButton("narzędnik", false);
    final JRadioButton mie10 = new JRadioButton("miejscownik", false);
    final JRadioButton w10 = new JRadioButton("wołacz", false);

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

    JLabel identyfikator = new JLabel("Nazwa funkcji:");
    JLabel cialo = new JLabel("Ciało szablonu:");
    JLabel A = new JLabel("+ A +");
    JLabel B = new JLabel("+ B +");
    JLabel C = new JLabel("+ C +");
    JLabel D = new JLabel("+ D +");
    JLabel E = new JLabel("+ E +");
    JLabel F = new JLabel("+ F +");
    JLabel G = new JLabel("+ G +");
    JLabel H = new JLabel("+ H +");
    JLabel I = new JLabel("+ I +");
    JLabel J = new JLabel("+ J +");

    public DodajFormule() {

        super("Dodaj nowy szablon tłumaczenia");

        setSize(1750, 600);  

        JPanel p = new JPanel();  
        p.setOpaque(true);

        p.setLayout(null);
        txtIdentyfikator.setLineWrap(true);
        txtIdentyfikator.setRows(12);
        identyfikator.setBounds(1, 1, 500, 20);//(LewaSzer,GorWys,PrawaSzer,DolnaDL)
        txtIdentyfikator.setBounds(1, 20, 400, 30);

        cialo.setBounds(1, 55, 400, 30);

        txt1.setBounds(1, 80, 345, 30);
        A.setBounds(350, 80, 400, 30);
        txt2.setBounds(1, 120, 345, 30);
        B.setBounds(350, 120, 400, 30);
        txt3.setBounds(1, 160, 345, 30);
        C.setBounds(350, 160, 400, 30);
        txt4.setBounds(1, 200, 345, 30);
        D.setBounds(350, 200, 400, 30);
        txt5.setBounds(1, 240, 345, 30);


        E.setBounds(350, 240, 400, 30);
        txt6.setBounds(1, 280, 345, 30);
        F.setBounds(350, 280, 400, 30);
        txt7.setBounds(1, 320, 345, 30);
        G.setBounds(350, 320, 400, 30);
        txt8.setBounds(1, 360, 345, 30);
        H.setBounds(350, 360, 400, 30);
        txt9.setBounds(1, 400, 345, 30);
    
        I.setBounds(350, 400, 400, 30);
        txt10.setBounds(1, 440, 345, 30);
        J.setBounds(350, 440, 400, 30);
        txt11.setBounds(1, 480, 345, 30);

    
        button.setBounds(1, 520, 100, 40);

        //grupowanie RadioButton'ow
        ButtonGroup group = new ButtonGroup();

        group.add(wybor1);
        group.add(wybor2);
        group.add(wybor3);
        group.add(wybor4);
        group.add(wybor5);
        group.add(wybor6);
        group.add(wybor7);
        group.add(wybor8);
        group.add(wybor9);
        group.add(wybor10);

        wybor1.setForeground(Color.blue);
        wybor2.setForeground(Color.blue);
        wybor3.setForeground(Color.blue);
        wybor4.setForeground(Color.blue);
        wybor5.setForeground(Color.blue);
        wybor6.setForeground(Color.blue);
        wybor7.setForeground(Color.blue);
        wybor8.setForeground(Color.blue);
        wybor9.setForeground(Color.blue);
        wybor10.setForeground(Color.blue);
        
        ButtonGroup l1 = new ButtonGroup();
        l1.add(lp1);
        l1.add(lm1);
        ButtonGroup l2 = new ButtonGroup();
        l2.add(lp2);
        l2.add(lm2);
        ButtonGroup l3 = new ButtonGroup();
        l3.add(lp3);
        l3.add(lm3);
        ButtonGroup l4 = new ButtonGroup();
        l4.add(lp4);
        l4.add(lm4);
        ButtonGroup l5 = new ButtonGroup();
        l5.add(lp5);
        l5.add(lm5);
        ButtonGroup l6 = new ButtonGroup();
        l6.add(lp6);
        l6.add(lm6);
        ButtonGroup l7 = new ButtonGroup();
        l7.add(lp7);
        l7.add(lm7);
        ButtonGroup l8 = new ButtonGroup();
        l8.add(lp8);
        l8.add(lm8);
        ButtonGroup l9 = new ButtonGroup();
        l9.add(lp9);
        l9.add(lm9);
        ButtonGroup l10 = new ButtonGroup();
        l10.add(lp10);
        l10.add(lm10);

        lp1.setForeground(Color.MAGENTA);
        lm1.setForeground(Color.MAGENTA);
        lp2.setForeground(Color.MAGENTA);
        lm2.setForeground(Color.MAGENTA);
        lp3.setForeground(Color.MAGENTA);
        lm3.setForeground(Color.MAGENTA);
        lp4.setForeground(Color.MAGENTA);
        lm4.setForeground(Color.MAGENTA);
        lp5.setForeground(Color.MAGENTA);
        lm5.setForeground(Color.MAGENTA);
        lp6.setForeground(Color.MAGENTA);
        lm6.setForeground(Color.MAGENTA);
        lp7.setForeground(Color.MAGENTA);
        lm7.setForeground(Color.MAGENTA);
        lp8.setForeground(Color.MAGENTA);
        lm8.setForeground(Color.MAGENTA);
        lp9.setForeground(Color.MAGENTA);
        lm9.setForeground(Color.MAGENTA);
        lp10.setForeground(Color.MAGENTA);
        lm10.setForeground(Color.MAGENTA);

        ButtonGroup od1 = new ButtonGroup();

        od1.add(m1);
        od1.add(d1);
        od1.add(c1);
        od1.add(b1);
        od1.add(n1);
        od1.add(mie1);
        od1.add(w1);
        ButtonGroup od2 = new ButtonGroup();

        od2.add(m2);
        od2.add(d2);
        od2.add(c2);
        od2.add(b2);
        od2.add(n2);
        od2.add(mie2);
        od2.add(w2);
        ButtonGroup od3 = new ButtonGroup();

        od3.add(m3);
        od3.add(d3);
        od3.add(c3);
        od3.add(b3);
        od3.add(n3);
        od3.add(mie3);
        od3.add(w3);
        ButtonGroup od4 = new ButtonGroup();

        od4.add(m4);
        od4.add(d4);
        od4.add(c4);
        od4.add(b4);
        od4.add(n4);
        od4.add(mie4);
        od4.add(w4);
        ButtonGroup od5 = new ButtonGroup();

        od5.add(m5);
        od5.add(d5);
        od5.add(c5);
        od5.add(b5);
        od5.add(n5);
        od5.add(mie5);
        od5.add(w5);
        ButtonGroup od6 = new ButtonGroup();

        od6.add(m6);
        od6.add(d6);
        od6.add(c6);
        od6.add(b6);
        od6.add(n6);
        od6.add(mie6);
        od6.add(w6);
        ButtonGroup od7 = new ButtonGroup();

        od7.add(m7);
        od7.add(d7);
        od7.add(c7);
        od7.add(b7);
        od7.add(n7);
        od7.add(mie7);
        od7.add(w7);
        ButtonGroup od8 = new ButtonGroup();

        od8.add(m8);
        od8.add(d8);
        od8.add(c8);
        od8.add(b8);
        od8.add(n8);
        od8.add(mie8);
        od8.add(w8);
        ButtonGroup od9 = new ButtonGroup();

        od9.add(m9);
        od9.add(d9);
        od9.add(c9);
        od9.add(b9);
        od9.add(n9);
        od9.add(mie9);
        od9.add(w9);
        ButtonGroup od10 = new ButtonGroup();

        od10.add(m10);
        od10.add(d10);
        od10.add(c10);
        od10.add(b10);
        od10.add(n10);
        od10.add(mie10);
        od10.add(w10);

        lp1.setBounds(1550, 80, 100, 30);
        lm1.setBounds(1650, 80, 100, 30);
        p.add(lp1);
        p.add(lm1);
        lp2.setBounds(1550, 120, 100, 30);
        lm2.setBounds(1650, 120, 100, 30);
        p.add(lp2);
        p.add(lm2);
        lp3.setBounds(1550, 160, 100, 30);
        lm3.setBounds(1650, 160, 100, 30);
        p.add(lp3);
        p.add(lm3);
        lp4.setBounds(1550, 200, 100, 30);
        lm4.setBounds(1650, 200, 100, 30);
        p.add(lp4);
        p.add(lm4);
        lp5.setBounds(1550, 240, 100, 30);
        lm5.setBounds(1650, 240, 100, 30);
        p.add(lp5);
        p.add(lm5);
        lp6.setBounds(1550, 280, 100, 30);
        lm6.setBounds(1650, 280, 100, 30);
        p.add(lp6);
        p.add(lm6);
        lp7.setBounds(1550, 320, 100, 30);
        lm7.setBounds(1650, 320, 100, 30);
        p.add(lp7);
        p.add(lm7);
        lp8.setBounds(1550, 360, 100, 30);
        lm8.setBounds(1650, 360, 100, 30);
        p.add(lp8);
        p.add(lm8);
        lp9.setBounds(1550, 400, 100, 30);
        lm9.setBounds(1650, 400, 100, 30);
        p.add(lp9);
        p.add(lm9);
        lp10.setBounds(1550, 440, 100, 30);
        lm10.setBounds(1650, 440, 100, 30);
        p.add(lp10);
        p.add(lm10);


        m1.setBounds(550, 80, 150, 30);
        m2.setBounds(550, 120, 150, 30);
        m3.setBounds(550, 160, 150, 30);
        m4.setBounds(550, 200, 150, 30);
        m5.setBounds(550, 240, 150, 30);
        m6.setBounds(550, 280, 150, 30);
        m7.setBounds(550, 320, 150, 30);
        m8.setBounds(550, 360, 150, 30);
        m9.setBounds(550, 400, 150, 30);
        m10.setBounds(550, 440, 150, 30);

        p.add(m1);
        p.add(m2);
        p.add(m3);
        p.add(m4);
        p.add(m5);
        p.add(m6);
        p.add(m7);
        p.add(m8);
        p.add(m9);
        p.add(m10);

        d1.setBounds(700, 80, 150, 30);
        d2.setBounds(700, 120, 150, 30);
        d3.setBounds(700, 160, 150, 30);
        d4.setBounds(700, 200, 150, 30);
        d5.setBounds(700, 240, 150, 30);
        d6.setBounds(700, 280, 150, 30);
        d7.setBounds(700, 320, 150, 30);
        d8.setBounds(700, 360, 150, 30);
        d9.setBounds(700, 400, 150, 30);
        d10.setBounds(700, 440, 150, 30);

        p.add(d1);
        p.add(d2);
        p.add(d3);
        p.add(d4);
        p.add(d5);
        p.add(d6);
        p.add(d7);
        p.add(d8);
        p.add(d9);
        p.add(d10);

        c1.setBounds(850, 80, 150, 30);
        c2.setBounds(850, 120, 150, 30);
        c3.setBounds(850, 160, 150, 30);
        c4.setBounds(850, 200, 150, 30);
        c5.setBounds(850, 240, 150, 30);
        c6.setBounds(850, 280, 150, 30);
        c7.setBounds(850, 320, 150, 30);
        c8.setBounds(850, 360, 150, 30);
        c9.setBounds(850, 400, 150, 30);
        c10.setBounds(850, 440, 150, 30);

        p.add(c1);
        p.add(c2);
        p.add(c3);
        p.add(c4);
        p.add(c5);
        p.add(c6);
        p.add(c7);
        p.add(c8);
        p.add(c9);
        p.add(c10);

        b1.setBounds(1000, 80, 100, 30);
        b2.setBounds(1000, 120, 100, 30);
        b3.setBounds(1000, 160, 100, 30);
        b4.setBounds(1000, 200, 100, 30);
        b5.setBounds(1000, 240, 100, 30);
        b6.setBounds(1000, 280, 100, 30);
        b7.setBounds(1000, 320, 100, 30);
        b8.setBounds(1000, 360, 100, 30);
        b9.setBounds(1000, 400, 100, 30);
        b10.setBounds(1000, 440, 100, 30);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);

        n1.setBounds(1100, 80, 150, 30);
        n2.setBounds(1100, 120, 150, 30);
        n3.setBounds(1100, 160, 150, 30);
        n4.setBounds(1100, 200, 150, 30);
        n5.setBounds(1100, 240, 150, 30);
        n6.setBounds(1100, 280, 150, 30);
        n7.setBounds(1100, 320, 150, 30);
        n8.setBounds(1100, 360, 150, 30);
        n9.setBounds(1100, 400, 150, 30);
        n10.setBounds(1100, 440, 150, 30);

        p.add(n1);
        p.add(n2);
        p.add(n3);
        p.add(n4);
        p.add(n5);
        p.add(n6);
        p.add(n7);
        p.add(n8);
        p.add(n9);
        p.add(n10);

        mie1.setBounds(1250, 80, 150, 30);
        mie2.setBounds(1250, 120, 150, 30);
        mie3.setBounds(1250, 160, 150, 30);
        mie4.setBounds(1250, 200, 150, 30);
        mie5.setBounds(1250, 240, 150, 30);
        mie6.setBounds(1250, 280, 150, 30);
        mie7.setBounds(1250, 320, 150, 30);
        mie8.setBounds(1250, 360, 150, 30);
        mie9.setBounds(1250, 400, 150, 30);
        mie10.setBounds(1250, 440, 150, 30);
 
        p.add(mie1);
        p.add(mie2);
        p.add(mie3);
        p.add(mie4);
        p.add(mie5);
        p.add(mie6);
        p.add(mie7);
        p.add(mie8);
        p.add(mie9);
        p.add(mie10);
  
        w1.setBounds(1400, 80, 150, 30);
        w2.setBounds(1400, 120, 150, 30);
        w3.setBounds(1400, 160, 150, 30);
        w4.setBounds(1400, 200, 150, 30);
        w5.setBounds(1400, 240, 150, 30);
        w6.setBounds(1400, 280, 150, 30);
        w7.setBounds(1400, 320, 150, 30);
        w8.setBounds(1400, 360, 150, 30);
        w9.setBounds(1400, 400, 150, 30);
        w10.setBounds(1400, 440, 150, 30);

        p.add(w1);
        p.add(w2);
        p.add(w3);
        p.add(w4);
        p.add(w5);
        p.add(w6);
        p.add(w7);
        p.add(w8);
        p.add(w9);
        p.add(w10);

        wybor1.setBounds(400, 80, 100, 30);
        wybor2.setBounds(400, 120, 100, 30);
        wybor3.setBounds(400, 160, 100, 30);
        wybor4.setBounds(400, 200, 100, 30);
        wybor5.setBounds(400, 240, 100, 30);
        wybor6.setBounds(400, 280, 100, 30);
        wybor7.setBounds(400, 320, 100, 30);
        wybor8.setBounds(400, 360, 100, 30);
        wybor9.setBounds(400, 400, 100, 30);
        wybor10.setBounds(400, 440, 100, 30);

        p.add(wybor1);
        p.add(wybor2);
        p.add(wybor3);
        p.add(wybor4);
        p.add(wybor5);
        p.add(wybor6);
        p.add(wybor7);
        p.add(wybor8);
        p.add(wybor9);
        p.add(wybor10);

        p.add(identyfikator);
        p.add(txtIdentyfikator);
        p.add(button);

        p.add(cialo);

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
        p.add(txt8);
        p.add(H);
        p.add(txt9);

        p.add(I);
        p.add(txt10);
        p.add(J);
        p.add(txt11);

        Container cp = getContentPane();
        cp.add(p);

        p.setPreferredSize(new Dimension(1700, 555));
        JScrollPane scrollFrame = new JScrollPane(p);
        p.setAutoscrolls(true);
        scrollFrame.setPreferredSize(new Dimension(800, 300));
        this.add(scrollFrame);


        button.addActionListener(this);

        wybor1.addActionListener(this);
        wybor2.addActionListener(this);
        wybor3.addActionListener(this);
        wybor4.addActionListener(this);
        wybor5.addActionListener(this);
        wybor6.addActionListener(this);
        wybor7.addActionListener(this);
        wybor8.addActionListener(this);
        wybor9.addActionListener(this);
        wybor10.addActionListener(this);
        BlockAllEditTxt();
        txt1.setEditable(true);
        txt1.setBackground(Color.WHITE);
        txt2.setEditable(true);
        txt2.setBackground(Color.WHITE);
        A.setForeground(Color.BLACK);
        setVisible(true);  

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

    }

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

    public void BlockAllEditTxt() {
        txt1.setEditable(false);
        txt1.setBackground(Color.lightGray);
        txt2.setEditable(false);
        txt2.setBackground(Color.lightGray);
        txt3.setEditable(false);
        txt3.setBackground(Color.lightGray);
        txt4.setEditable(false);
        txt4.setBackground(Color.lightGray);
        txt5.setEditable(false);
        txt5.setBackground(Color.lightGray);
        txt6.setEditable(false);
        txt6.setBackground(Color.lightGray);
        txt7.setEditable(false);
        txt7.setBackground(Color.lightGray);
        txt8.setEditable(false);
        txt8.setBackground(Color.lightGray);
        txt9.setEditable(false);
        txt9.setBackground(Color.lightGray);
        txt10.setEditable(false);
        txt10.setBackground(Color.lightGray);
        txt11.setEditable(false);
        txt11.setBackground(Color.lightGray);
        A.setForeground(Color.LIGHT_GRAY);
        B.setForeground(Color.LIGHT_GRAY);
        C.setForeground(Color.LIGHT_GRAY);
        D.setForeground(Color.LIGHT_GRAY);
        E.setForeground(Color.LIGHT_GRAY);
        F.setForeground(Color.LIGHT_GRAY);
        G.setForeground(Color.LIGHT_GRAY);
        H.setForeground(Color.LIGHT_GRAY);
        I.setForeground(Color.LIGHT_GRAY);
        J.setForeground(Color.LIGHT_GRAY);

        m2.setEnabled(false);
        m3.setEnabled(false);
        m4.setEnabled(false);
        m5.setEnabled(false);
        m6.setEnabled(false);
        m7.setEnabled(false);
        m8.setEnabled(false);
        m9.setEnabled(false);
        m10.setEnabled(false);

        d2.setEnabled(false);
        d3.setEnabled(false);
        d4.setEnabled(false);
        d5.setEnabled(false);
        d6.setEnabled(false);
        d7.setEnabled(false);
        d8.setEnabled(false);
        d9.setEnabled(false);
        d10.setEnabled(false);

        c2.setEnabled(false);
        c3.setEnabled(false);
        c4.setEnabled(false);
        c5.setEnabled(false);
        c6.setEnabled(false);
        c7.setEnabled(false);
        c8.setEnabled(false);
        c9.setEnabled(false);
        c10.setEnabled(false);

        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);

        n2.setEnabled(false);
        n3.setEnabled(false);
        n4.setEnabled(false);
        n5.setEnabled(false);
        n6.setEnabled(false);
        n7.setEnabled(false);
        n8.setEnabled(false);
        n9.setEnabled(false);
        n10.setEnabled(false);

        mie2.setEnabled(false);
        mie3.setEnabled(false);
        mie4.setEnabled(false);
        mie5.setEnabled(false);
        mie6.setEnabled(false);
        mie7.setEnabled(false);
        mie8.setEnabled(false);
        mie9.setEnabled(false);
        mie10.setEnabled(false);

        w2.setEnabled(false);
        w3.setEnabled(false);
        w4.setEnabled(false);
        w5.setEnabled(false);
        w6.setEnabled(false);
        w7.setEnabled(false);
        w8.setEnabled(false);
        w9.setEnabled(false);
        w10.setEnabled(false);
        
        lp2.setEnabled(false);
        lm2.setEnabled(false);
        lp3.setEnabled(false);
        lm3.setEnabled(false);
        lp4.setEnabled(false);
        lm4.setEnabled(false);
        lp5.setEnabled(false);
        lm5.setEnabled(false);
        lp6.setEnabled(false);
        lm6.setEnabled(false);
        lp7.setEnabled(false);
        lm7.setEnabled(false);
        lp8.setEnabled(false);
        lm8.setEnabled(false);
        lp9.setEnabled(false);
        lm9.setEnabled(false);
        lp10.setEnabled(false);
        lm10.setEnabled(false);

    }

    public void UnblockEditTxt(int i) {
        if (i > 0) {

            txt1.setEditable(true);
            txt1.setBackground(Color.WHITE);
            txt2.setEditable(true);
            txt2.setBackground(Color.WHITE);
            A.setForeground(Color.BLACK);

        }
        if (i > 1) {
            txt3.setEditable(true);
            txt3.setBackground(Color.WHITE);
            B.setForeground(Color.BLACK);

            m2.setEnabled(true);
            d2.setEnabled(true);
            c2.setEnabled(true);
            b2.setEnabled(true);
            n2.setEnabled(true);
            mie2.setEnabled(true);
            w2.setEnabled(true);
            lp2.setEnabled(true);
            lm2.setEnabled(true);
        }
        if (i > 2) {
            txt4.setEditable(true);
            txt4.setBackground(Color.WHITE);
            C.setForeground(Color.BLACK);

            m3.setEnabled(true);
            d3.setEnabled(true);
            c3.setEnabled(true);
            b3.setEnabled(true);
            n3.setEnabled(true);
            mie3.setEnabled(true);
            w3.setEnabled(true);
            lp3.setEnabled(true);
            lm3.setEnabled(true);
        }
        if (i > 3) {
            txt5.setEditable(true);
            txt5.setBackground(Color.WHITE);
            D.setForeground(Color.BLACK);

            m4.setEnabled(true);
            d4.setEnabled(true);
            c4.setEnabled(true);
            b4.setEnabled(true);
            n4.setEnabled(true);
            mie4.setEnabled(true);
            w4.setEnabled(true);
            lp4.setEnabled(true);
            lm4.setEnabled(true);
        }
        if (i > 4) {
            txt6.setEditable(true);
            txt6.setBackground(Color.WHITE);
            E.setForeground(Color.BLACK);

            m5.setEnabled(true);
            d5.setEnabled(true);
            c5.setEnabled(true);
            b5.setEnabled(true);
            n5.setEnabled(true);
            mie5.setEnabled(true);
            w5.setEnabled(true);
            lp5.setEnabled(true);
            lm5.setEnabled(true);
        }
        if (i > 5) {
            txt7.setEditable(true);
            txt7.setBackground(Color.WHITE);
            F.setForeground(Color.BLACK);

            m6.setEnabled(true);
            d6.setEnabled(true);
            c6.setEnabled(true);
            b6.setEnabled(true);
            n6.setEnabled(true);
            mie6.setEnabled(true);
            w6.setEnabled(true);
            lp6.setEnabled(true);
            lm6.setEnabled(true);
        }
        if (i > 6) {
            txt8.setEditable(true);
            txt8.setBackground(Color.WHITE);
            G.setForeground(Color.BLACK);

            m7.setEnabled(true);
            d7.setEnabled(true);
            c7.setEnabled(true);
            b7.setEnabled(true);
            n7.setEnabled(true);
            mie7.setEnabled(true);
            w7.setEnabled(true);
            lp7.setEnabled(true);
            lm7.setEnabled(true);
        }
        if (i > 7) {
            txt9.setEditable(true);
            txt9.setBackground(Color.WHITE);
            H.setForeground(Color.BLACK);

            m8.setEnabled(true);
            d8.setEnabled(true);
            c8.setEnabled(true);
            b8.setEnabled(true);
            n8.setEnabled(true);
            mie8.setEnabled(true);
            w8.setEnabled(true);
            lp8.setEnabled(true);
            lm8.setEnabled(true);
        }
        if (i > 8) {
            txt10.setEditable(true);
            txt10.setBackground(Color.WHITE);
            I.setForeground(Color.BLACK);

            m9.setEnabled(true);
            d9.setEnabled(true);
            c9.setEnabled(true);
            b9.setEnabled(true);
            n9.setEnabled(true);
            mie9.setEnabled(true);
            w9.setEnabled(true);
            lp9.setEnabled(true);
            lm9.setEnabled(true);
        }
        if (i > 9) {
            txt11.setEditable(true);
            txt11.setBackground(Color.WHITE);
            J.setForeground(Color.BLACK);

            m10.setEnabled(true);
            d10.setEnabled(true);
            c10.setEnabled(true);
            b10.setEnabled(true);
            n10.setEnabled(true);
            mie10.setEnabled(true);
            w10.setEnabled(true);
            lp10.setEnabled(true);
            lm10.setEnabled(true);
        }
    }
    int ileZmiennych = 1;// domyslnie dla 1

    public int liczba1() {
        if (lp1.isSelected()) {
            return 1;
        } else if (lm1.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba2() {
        if (lp2.isSelected()) {
            return 1;
        } else if (lm2.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba3() {
        if (lp3.isSelected()) {
            return 1;
        } else if (lm3.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba4() {
        if (lp4.isSelected()) {
            return 1;
        } else if (lm4.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba5() {
        if (lp5.isSelected()) {
            return 1;
        } else if (lm5.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba6() {
        if (lp6.isSelected()) {
            return 1;
        } else if (lm6.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba7() {
        if (lp7.isSelected()) {
            return 1;
        } else if (lm7.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba8() {
        if (lp8.isSelected()) {
            return 1;
        } else if (lm8.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba9() {
        if (lp9.isSelected()) {
            return 1;
        } else if (lm9.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int liczba10() {
        if (lp10.isSelected()) {
            return 1;
        } else if (lm10.isSelected()) {
            return 2;
        }

        return 0;
    }

    public int ktoryprzypadek1() {
        if (m1.isSelected()) {
            return 1;
        } else if (d1.isSelected()) {
            return 2;
        } else if (c1.isSelected()) {
            return 3;
        } else if (b1.isSelected()) {
            return 4;
        } else if (n1.isSelected()) {
            return 5;
        } else if (mie1.isSelected()) {
            return 6;
        } else if (w1.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek2() {
        if (m2.isSelected()) {
            return 1;
        } else if (d2.isSelected()) {
            return 2;
        } else if (c2.isSelected()) {
            return 3;
        } else if (b2.isSelected()) {
            return 4;
        } else if (n2.isSelected()) {
            return 5;
        } else if (mie2.isSelected()) {
            return 6;
        } else if (w2.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek3() {
        if (m3.isSelected()) {
            return 1;
        } else if (d3.isSelected()) {
            return 2;
        } else if (c3.isSelected()) {
            return 3;
        } else if (b3.isSelected()) {
            return 4;
        } else if (n3.isSelected()) {
            return 5;
        } else if (mie3.isSelected()) {
            return 6;
        } else if (w3.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek4() {
        if (m4.isSelected()) {
            return 1;
        } else if (d4.isSelected()) {
            return 2;
        } else if (c4.isSelected()) {
            return 3;
        } else if (b4.isSelected()) {
            return 4;
        } else if (n4.isSelected()) {
            return 5;
        } else if (mie4.isSelected()) {
            return 6;
        } else if (w4.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek5() {
        if (m5.isSelected()) {
            return 1;
        } else if (d5.isSelected()) {
            return 2;
        } else if (c5.isSelected()) {
            return 3;
        } else if (b5.isSelected()) {
            return 4;
        } else if (n5.isSelected()) {
            return 5;
        } else if (mie5.isSelected()) {
            return 6;
        } else if (w5.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek6() {
        if (m6.isSelected()) {
            return 1;
        } else if (d6.isSelected()) {
            return 2;
        } else if (c6.isSelected()) {
            return 3;
        } else if (b6.isSelected()) {
            return 4;
        } else if (n6.isSelected()) {
            return 5;
        } else if (mie6.isSelected()) {
            return 6;
        } else if (w6.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek7() {
        if (m7.isSelected()) {
            return 1;
        } else if (d7.isSelected()) {
            return 2;
        } else if (c7.isSelected()) {
            return 3;
        } else if (b7.isSelected()) {
            return 4;
        } else if (n7.isSelected()) {
            return 5;
        } else if (mie7.isSelected()) {
            return 6;
        } else if (w7.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek8() {
        if (m8.isSelected()) {
            return 1;
        } else if (d8.isSelected()) {
            return 2;
        } else if (c8.isSelected()) {
            return 3;
        } else if (b8.isSelected()) {
            return 4;
        } else if (n8.isSelected()) {
            return 5;
        } else if (mie8.isSelected()) {
            return 6;
        } else if (w8.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek9() {
        if (m9.isSelected()) {
            return 1;
        } else if (d9.isSelected()) {
            return 2;
        } else if (c9.isSelected()) {
            return 3;
        } else if (b9.isSelected()) {
            return 4;
        } else if (n9.isSelected()) {
            return 5;
        } else if (mie9.isSelected()) {
            return 6;
        } else if (w9.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int ktoryprzypadek10() {
        if (m10.isSelected()) {
            return 1;
        } else if (d10.isSelected()) {
            return 2;
        } else if (c10.isSelected()) {
            return 3;
        } else if (b10.isSelected()) {
            return 4;
        } else if (n10.isSelected()) {
            return 5;
        } else if (mie10.isSelected()) {
            return 6;
        } else if (w10.isSelected()) {
            return 7;
        }

        return 0;
    }

    public int wyboor() {
        if (wybor1.isSelected()) {
            return 1;
        } else if (wybor2.isSelected()) {
            return 2;
        } else if (wybor3.isSelected()) {
            return 3;
        } else if (wybor4.isSelected()) {
            return 4;
        } else if (wybor5.isSelected()) {
            return 5;
        } else if (wybor6.isSelected()) {
            return 6;
        } else if (wybor7.isSelected()) {
            return 7;
        } else if (wybor8.isSelected()) {
            return 8;
        } else if (wybor9.isSelected()) {
            return 9;
        } else if (wybor10.isSelected()) {
            return 10;
        }
        return 0;
    }

    public boolean CheckForm(String pform, int dl) {
        DatabaseFormuly data = new DatabaseFormuly();
        List<DaneFormuly> form = data.selectFormulyLog();
        for (DaneFormuly c : form) {
            String nazForm = c.nazwa_formuly;
            nazForm = nazForm.replace("▼", "");
            if (nazForm.contains(pform + "(") && c.dl == dl) {
                JOptionPane.showMessageDialog(null, "Szablon o takiej samej nazwie funkcji oraz o takiej samej liczbie argumentów już istnieje", "Błąd", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public boolean CheckFormOnlyLetter(String nazwa) {
        char[] kp = nazwa.toCharArray();
        for (int i = 0; i < nazwa.length(); i++)
        {
            if ((kp[i] == 'a') || (kp[i] == 'A') || (kp[i] == 'ą') || (kp[i] == 'Ą') || (kp[i] == 'b') || (kp[i] == 'B') || (kp[i] == 'c') || (kp[i] == 'C') || (kp[i] == 'ć') || (kp[i] == 'Ć') || (kp[i] == 'd') || (kp[i] == 'D') || (kp[i] == 'e') || (kp[i] == 'E') || (kp[i] == 'ę') || (kp[i] == 'Ę') || (kp[i] == 'f') || (kp[i] == 'F') || (kp[i] == 'g') || (kp[i] == 'G') || (kp[i] == 'h') || (kp[i] == 'H') || (kp[i] == 'i') || (kp[i] == 'I') || (kp[i] == 'j') || (kp[i] == 'J') || (kp[i] == 'k') || (kp[i] == 'K') || (kp[i] == 'l') || (kp[i] == 'L') || (kp[i] == 'ł') || (kp[i] == 'Ł') || (kp[i] == 'm') || (kp[i] == 'M') || (kp[i] == 'n') || (kp[i] == 'N') || (kp[i] == 'ń') || (kp[i] == 'Ń') || (kp[i] == 'o') || (kp[i] == 'O') || (kp[i] == 'ó') || (kp[i] == 'Ó') || (kp[i] == 'p') || (kp[i] == 'P') || (kp[i] == 'q') || (kp[i] == 'Q') || (kp[i] == 'r') || (kp[i] == 'R') || (kp[i] == 's') || (kp[i] == 'S') || (kp[i] == 'ś') || (kp[i] == 'Ś') || (kp[i] == 't') || (kp[i] == 'T') || (kp[i] == 'u') || (kp[i] == 'U') || (kp[i] == 'v') || (kp[i] == 'V') || (kp[i] == 'w') || (kp[i] == 'W') || (kp[i] == 'x') || (kp[i] == 'X') || (kp[i] == 'y') || (kp[i] == 'Y') || (kp[i] == 'z') || (kp[i] == 'Z') || (kp[i] == 'ż') || (kp[i] == 'Ż') || (kp[i] == 'ź') || (kp[i] == 'Ź')) {
                ;
            } else {
                JOptionPane.showMessageDialog(null, "Nazwa funkcji może zawierać tylko duże lub małe litery polskiego alfabetu", "Błąd", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public boolean ChceckFormIsNotEmpty(String nazwa) {
        if (nazwa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Podaj nazwę funkcji", "Błąd", JOptionPane.ERROR_MESSAGE);
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

        int o1 = ktoryprzypadek1();
        int o2 = ktoryprzypadek2();
        int o3 = ktoryprzypadek3();
        int o4 = ktoryprzypadek4();
        int o5 = ktoryprzypadek5();
        int o6 = ktoryprzypadek6();
        int o7 = ktoryprzypadek7();
        int o8 = ktoryprzypadek8();
        int o9 = ktoryprzypadek9();
        int o10 = ktoryprzypadek10();

        int l1 = liczba1();
        int l2 = liczba2();
        int l3 = liczba3();
        int l4 = liczba4();
        int l5 = liczba5();
        int l6 = liczba6();
        int l7 = liczba7();
        int l8 = liczba8();
        int l9 = liczba9();
        int l10 = liczba10();

        int dl = wyboor();

        if (source == button) {
            if (ChceckFormIsNotEmpty(ti) && CheckFormOnlyLetter(ti) && CheckForm(ti, dl)) {

                if (ti.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "brak nazwy funkcji ", "Błąd", JOptionPane.ERROR_MESSAGE);
                    dispose();//zamkniecie okna Dodaj formule
                }
                //dodanie do pustych pozycji znaku kontrolnego
                if (t1.isEmpty()) {
                    t1 = "‼";//alt+19
                }
                if (t2.isEmpty()) {
                    t2 = "‼";
                }
                if (t3.isEmpty()) {
                    t3 = "‼";
                }
                if (t4.isEmpty()) {
                    t4 = "‼";
                }
                if (t5.isEmpty()) {
                    t5 = "‼";
                }
                if (t6.isEmpty()) {
                    t6 = "‼";
                }
                if (t7.isEmpty()) {
                    t7 = "‼";
                }
                if (t8.isEmpty()) {
                    t8 = "‼";
                }
                if (t9.isEmpty()) {
                    t9 = "‼";
                }
                if (t10.isEmpty()) {
                    t10 = "‼";
                }
                if (t11.isEmpty()) {
                    t11 = "‼";
                }
                if (ileZmiennych == 1) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼" + "(", t1, "‼", "‼", "‼", "‼", "‼", "‼", "‼", "‼", "‼", t2, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();

                }
                if (ileZmiennych == 2) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼" + "(", t1, t2, "‼", "‼", "‼", "‼", "‼", "‼", "‼", "‼", t3, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 3) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼" + "(", t1, t2, t3, "‼", "‼", "‼", "‼", "‼", "‼", "‼", t4, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 4) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼" + "(", t1, t2, t3, t4, "‼", "‼", "‼", "‼", "‼", "‼", t5, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 5) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼▼" + "(", t1, t2, t3, t4, t5, "‼", "‼", "‼", "‼", "‼", t6, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 6) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼▼▼" + "(", t1, t2, t3, t4, t5, t6, "‼", "‼", "‼", "‼", t7, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 7) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼▼▼▼" + "(", t1, t2, t3, t4, t5, t6, t7, "‼", "‼", "‼", t8, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 8) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼▼▼▼▼" + "(", t1, t2, t3, t4, t5, t6, t7, t8, "‼", "‼", t9, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 9) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼▼▼▼▼▼" + "(", t1, t2, t3, t4, t5, t6, t7, t8, t9, "‼", t10, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }
                if (ileZmiennych == 10) {
                    DaneFormuly form = new DaneFormuly('1', ti + "▼▼▼▼▼▼▼▼▼▼" + "(", t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, dl);
                    form.zapisDoBazy();
                }

                dispose();

            }
        }
        if (source == wybor1) {
            BlockAllEditTxt();
            UnblockEditTxt(1);
            ileZmiennych = 1;
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");

        }
        if (source == wybor2) {
            BlockAllEditTxt();
            UnblockEditTxt(2);
            ileZmiennych = 2;

            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor3) {
            BlockAllEditTxt();
            UnblockEditTxt(3);
            ileZmiennych = 3;

            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor4) {
            BlockAllEditTxt();
            UnblockEditTxt(4);
            ileZmiennych = 4;

            txt6.setText("");
            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor5) {
            BlockAllEditTxt();
            UnblockEditTxt(5);
            ileZmiennych = 5;

            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor6) {
            BlockAllEditTxt();
            UnblockEditTxt(6);
            ileZmiennych = 6;

            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor7) {
            BlockAllEditTxt();
            UnblockEditTxt(7);
            ileZmiennych = 7;

            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor8) {
            BlockAllEditTxt();
            UnblockEditTxt(8);
            ileZmiennych = 8;

            txt10.setText("");
            txt11.setText("");
        }
        if (source == wybor9) {
            BlockAllEditTxt();
            UnblockEditTxt(9);
            ileZmiennych = 9;

            txt11.setText("");

        }
        if (source == wybor10) {
            BlockAllEditTxt();
            UnblockEditTxt(10);
            ileZmiennych = 10;

        }
    }
}
