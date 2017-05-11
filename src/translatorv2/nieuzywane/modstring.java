/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translatorv2.nieuzywane;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Goniprowski
 */

/*
jak chcesz zamieniać literki pojedynczo, to String.toCharArray() 
i sobie zamieniaj, a później String.valueOf(char[])
jak chcesz się bardziej bawić, to to co podał powyżej... 
*/
public class modstring {
   public String bezwzgledna(String st)
    {
        int il_znk=0;//ilosc |
        List<Character> pom_kp = new ArrayList<>();
        //char[] pom_kp;
        char[] kp=st.toCharArray();
        for(int i=0;i<st.length();i++)//petla po calym strumieniu
        {
            int pom=1;//czy parzysta ilosc |
       //    kp[1]='i';
            int pocz_wbez=0;
           /* if(kp[i]=='|')
            {
                il_znk++;
            }*/
            if((kp[i]=='|')&&((pom%2)!=0))
            {
                 il_znk++;
                pocz_wbez=i;
               // int k=0;
                i++;//aby nie rozpatrywac tego samego |
                while((kp[i]!='|'))//kopiowanie zawartosci modulo
                {
                    if(pom_kp.add(kp[i]))
                   // pom_kp[k]=kp[i];
                            i++;
                }
                 il_znk++;
                pom++;
            }
        }
        //String str = String.valueOf(kp);
     
        String ret=pom_kp.toString();//przechowuje zawartosc pomiedzy modulami wszystkimi
        
        //////do usuwania smieci z listy
       /* ret=ret.replace("[","");
        ret=ret.replace("]","");
        ret=ret.replace(",","");
        ret=ret.replace(" ","");*/
        if(il_znk%2==0)
        {
            return ret;

        }
        else
        {
                    JOptionPane.showMessageDialog(null, "brak zamkniecia wartości bezwzględnej");
            return "";
        }
         //  return String.valueOf(kp);
    }
}
