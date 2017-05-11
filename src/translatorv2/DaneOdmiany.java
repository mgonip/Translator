package translatorv2;

/**
 *
 * @author Goniprowski
 */
public class DaneOdmiany {

    public DaneOdmiany(int id, String nazwa_odmiany, String mianownik, String dopelniacz, String celownik, String biernik, String narzednik, String miejscownik, String wolacz, String mianownikM, String dopelniaczM, String celownikM, String biernikM, String narzednikM, String miejscownikM, String wolaczM) {
        this.id = id;
        this.nazwa_odmiany = nazwa_odmiany;
        this.mianownik = mianownik;
        this.dopelniacz = dopelniacz;
        this.celownik = celownik;
        this.biernik = biernik;
        this.narzednik = narzednik;
        this.miejscownik = miejscownik;
        this.wolacz = wolacz;
        this.mianownikM = mianownikM;
        this.dopelniaczM = dopelniaczM;
        this.celownikM = celownikM;
        this.biernikM = biernikM;
        this.narzednikM = narzednikM;
        this.miejscownikM = miejscownikM;
        this.wolaczM = wolaczM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa_odmiany() {
        return nazwa_odmiany;
    }

    public void setNazwa_odmiany(String nazwa_odmiany) {
        this.nazwa_odmiany = nazwa_odmiany;
    }

    public String getMianownik() {
        return mianownik;
    }

    public void setMianownik(String mianownik) {
        this.mianownik = mianownik;
    }

    public String getDopelniacz() {
        return dopelniacz;
    }

    public void setDopelniacz(String dopelniacz) {
        this.dopelniacz = dopelniacz;
    }

    public String getCelownik() {
        return celownik;
    }

    public void setCelownik(String celownik) {
        this.celownik = celownik;
    }

    public String getBiernik() {
        return biernik;
    }

    public void setBiernik(String biernik) {
        this.biernik = biernik;
    }

    public String getNarzednik() {
        return narzednik;
    }

    public void setNarzednik(String narzednik) {
        this.narzednik = narzednik;
    }

    public String getMiejscownik() {
        return miejscownik;
    }

    public void setMiejscownik(String miejscownik) {
        this.miejscownik = miejscownik;
    }

    public String getWolacz() {
        return wolacz;
    }

    public void setWolacz(String wolacz) {
        this.wolacz = wolacz;
    }

    public String getMianownikM() {
        return mianownikM;
    }

    public void setMianownikM(String mianownikM) {
        this.mianownikM = mianownikM;
    }

    public String getDopelniaczM() {
        return dopelniaczM;
    }

    public void setDopelniaczM(String dopelniaczM) {
        this.dopelniaczM = dopelniaczM;
    }

    public String getCelownikM() {
        return celownikM;
    }

    public void setCelownikM(String celownikM) {
        this.celownikM = celownikM;
    }

    public String getBiernikM() {
        return biernikM;
    }

    public void setBiernikM(String biernikM) {
        this.biernikM = biernikM;
    }

    public String getNarzednikM() {
        return narzednikM;
    }

    public void setNarzednikM(String narzednikM) {
        this.narzednikM = narzednikM;
    }

    public String getMiejscownikM() {
        return miejscownikM;
    }

    public void setMiejscownikM(String miejscownikM) {
        this.miejscownikM = miejscownikM;
    }

    public String getWolaczM() {
        return wolaczM;
    }

    public void setWolaczM(String wolaczM) {
        this.wolaczM = wolaczM;
    }

    int id;
    String nazwa_odmiany;
    String mianownik;
    String dopelniacz;
    String celownik;
    String biernik;
    String narzednik;
    String miejscownik;
    String wolacz;
    String mianownikM;
    String dopelniaczM;
    String celownikM;
    String biernikM;
    String narzednikM;
    String miejscownikM;
    String wolaczM;
    

    @Override
    public String toString() {
        if(mianownikM.contains("‼"))
        {
             return "Identyfikator Odmiany:    " + nazwa_odmiany + "    Mianownik:  " + mianownik + " Dopełniacz:  " + dopelniacz + " Celownik:  " + celownik + " Biernik:  " + biernik + " Narzędnik:  " + narzednik + " Miejscownik:  " + miejscownik + " Wołacz:  " + wolacz ;
  
        }
        return "Identyfikator Odmiany:    " + nazwa_odmiany + "    Mianownik:  " + mianownik + " Dopełniacz:  " + dopelniacz + " Celownik:  " + celownik + " Biernik:  " + biernik + " Narzędnik:  " + narzednik + " Miejscownik:  " + miejscownik + " Wołacz:  " + wolacz + " Liczba Mnoga:   Mianownik:  " + mianownikM + " Dopełniacz:  " + dopelniaczM + " Celownik:  " + celownikM + " Biernik:  " + biernikM + " Narzędnik  " + narzednikM + " Miejscownik:  " + miejscownikM + " Wołacz:  " + wolaczM;
    }


    public void zapisDoBazy() {
        DatabaseOdmiany data = new DatabaseOdmiany();
        data.createTables();
        data.insertOdmiany(nazwa_odmiany, mianownik, dopelniacz, celownik, biernik, narzednik, miejscownik, wolacz, mianownikM, dopelniaczM, celownikM, biernikM, narzednikM, miejscownikM, wolaczM);
        data.closeConnection();
    }
}
