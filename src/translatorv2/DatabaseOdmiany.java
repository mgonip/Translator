package translatorv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Goniprowski
 */
public class DatabaseOdmiany {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    private Connection conn;
    private Statement stat;

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:odmiany.db";

    public DatabaseOdmiany() {
        try {
            Class.forName(DatabaseOdmiany.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }

        createTables();
    }

    public boolean createTables() {

        String createOdmiany = "CREATE TABLE IF NOT EXISTS odmianyLog (id_odmiany INTEGER PRIMARY KEY AUTOINCREMENT, nazwa_odmiany varchar(8000),mianownik varchar(8000),dopelniacz varchar(8000),celownik varchar(8000),biernik varchar(8000),narzednik varchar(8000),miejscownik varchar(8000),wolacz varchar(8000),mianownikM varchar(8000),dopelniaczM varchar(8000),celownikM varchar(8000),biernikM varchar(8000),narzednikM varchar(8000),miejscownikM varchar(8000),wolaczM varchar(8000))";
        try {
            stat.execute(createOdmiany);
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertOdmiany(String nazwa_odmiany, String mianownik, String dopelniacz, String celownik, String biernik, String narzednik, String miejscownik, String wolacz , String mianownikM, String dopelniaczM, String celownikM, String biernikM, String narzednikM, String miejscownikM, String wolaczM) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("insert into OdmianyLog values (NULL, ?, ?, ?,?,?,?,?, ?, ?,?,?,?,?,?,?);");
            prepStmt.setString(1, nazwa_odmiany);
            prepStmt.setString(2, mianownik);
            prepStmt.setString(3, dopelniacz);
            prepStmt.setString(4, celownik);
            prepStmt.setString(5, biernik);
            prepStmt.setString(6, narzednik);
            prepStmt.setString(7, miejscownik);
            prepStmt.setString(8, wolacz);
            prepStmt.setString(9, mianownikM);
            prepStmt.setString(10, dopelniaczM);
            prepStmt.setString(11, celownikM);
            prepStmt.setString(12, biernikM);
            prepStmt.setString(13, narzednikM);
            prepStmt.setString(14, miejscownikM);
            prepStmt.setString(15, wolaczM);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu rekordu");
            e.printStackTrace();
            return false;
        }
        return true;
    }
public void Usun(String nod) {
        Connection polaczenie = null;
        Statement stat = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:odmiany.db");
            stat = polaczenie.createStatement();
            String usunSQL = "DELETE FROM OdmianyLog WHERE nazwa_odmiany='" + nod + "';";
            System.out.println("Polecenie:\n" + usunSQL);
            stat.executeUpdate(usunSQL);

            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println("Nie mogę usunąć danych " + e.getMessage());
        }
 
    }

    public List<DaneOdmiany> selectOdmianyLog() {
        List<DaneOdmiany> odm = new LinkedList<DaneOdmiany>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM OdmianyLog");
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

            while (result.next()) {
                id = result.getInt("id_odmiany");
                nazwa_odmiany = result.getString("nazwa_odmiany");
                mianownik = result.getString("mianownik");
                dopelniacz = result.getString("dopelniacz");
                celownik = result.getString("celownik");
                biernik = result.getString("biernik");
                narzednik = result.getString("narzednik");
                miejscownik = result.getString("miejscownik");
                wolacz = result.getString("wolacz");
                mianownikM = result.getString("mianownikM");
                dopelniaczM = result.getString("dopelniaczM");
                celownikM = result.getString("celownikM");
                biernikM = result.getString("biernikM");
                narzednikM = result.getString("narzednikM");
                miejscownikM = result.getString("miejscownikM");
                wolaczM = result.getString("wolaczM");
                odm.add(new DaneOdmiany(id, nazwa_odmiany, mianownik, dopelniacz, celownik, biernik, narzednik, miejscownik, wolacz, mianownikM, dopelniaczM, celownikM, biernikM, narzednikM, miejscownikM, wolaczM));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return odm;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }
}
