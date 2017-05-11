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
public class DatabaseFormuly {

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
    public static final String DB_URL = "jdbc:sqlite:formuly.db";

    public DatabaseFormuly() {
        try {
            Class.forName(DatabaseFormuly.DRIVER);
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

        String createFormuly = "CREATE TABLE IF NOT EXISTS FormulyLog (id_formuly INTEGER PRIMARY KEY AUTOINCREMENT, nazwa_formuly varchar(8000),przedA varchar(8000),przedB varchar(8000),przedC varchar(8000),przedD varchar(8000),przedE varchar(8000),przedF varchar(8000),przedG varchar(8000),przedH varchar(8000),przedI varchar(8000),przedJ varchar(8000),poJ varchar(8000),odA varchar(10),odB varchar(10),odC varchar(10),odD varchar(10),odE varchar(10),odF varchar(10),odG varchar(10),odH varchar(10),odI varchar(10),odJ varchar(10),l1 varchar(10),l2 varchar(10),l3 varchar(10),l4 varchar(10),l5 varchar(10),l6 varchar(10),l7 varchar(10),l8 varchar(10),l9 varchar(10),l10 varchar(10),dl varchar(10))";
        try {
            stat.execute(createFormuly);
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertFormuly(String nazwa_formuly, String przedA, String przedB, String przedC, String przedD, String przedE, String przedF, String przedG, String przedH, String przedI, String przedJ, String poJ, int odA, int odB, int odC, int odD, int odE, int odF, int odG, int odH, int odI, int odJ, int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9, int l10, int dl) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("insert into FormulyLog values (NULL, ?, ?, ?,?,?,?,?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            prepStmt.setString(1, nazwa_formuly);
            prepStmt.setString(2, przedA);
            prepStmt.setString(3, przedB);
            prepStmt.setString(4, przedC);
            prepStmt.setString(5, przedD);
            prepStmt.setString(6, przedE);
            prepStmt.setString(7, przedF);
            prepStmt.setString(8, przedG);
            prepStmt.setString(9, przedH);
            prepStmt.setString(10, przedI);
            prepStmt.setString(11, przedJ);
            prepStmt.setString(12, poJ);

            prepStmt.setInt(13, odA);
            prepStmt.setInt(14, odB);
            prepStmt.setInt(15, odC);
            prepStmt.setInt(16, odD);
            prepStmt.setInt(17, odE);
            prepStmt.setInt(18, odF);
            prepStmt.setInt(19, odG);
            prepStmt.setInt(20, odH);
            prepStmt.setInt(21, odI);
            prepStmt.setInt(22, odJ);

            prepStmt.setInt(23, l1);
            prepStmt.setInt(24, l2);
            prepStmt.setInt(25, l3);
            prepStmt.setInt(26, l4);
            prepStmt.setInt(27, l5);
            prepStmt.setInt(28, l6);
            prepStmt.setInt(29, l7);
            prepStmt.setInt(30, l8);
            prepStmt.setInt(31, l9);
            prepStmt.setInt(32, l10);

            prepStmt.setInt(33, dl);
      
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu rekordu");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    

public void Usun(String nf) {
        Connection polaczenie = null;
        Statement stat = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:formuly.db");
            stat = polaczenie.createStatement();
            String usunSQL = "DELETE FROM FormulyLog WHERE nazwa_formuly='" + nf + "';";
            System.out.println("Polecenie:\n" + usunSQL);
            stat.executeUpdate(usunSQL);

            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println("Nie mogę usunąć danych " + e.getMessage());
        }
 
    }


    public List<DaneFormuly> selectFormulyLog() {
        List<DaneFormuly> form = new LinkedList<DaneFormuly>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM FormulyLog");
            String nazwa_formuly;
            String przedA;
            String przedB;
            String przedC;
            String przedD;
            String przedE;
            String przedF;
            String przedG;
            String przedH;
            String przedI;
            String przedJ;
            String poJ;

            int odA;
            int odB;
            int odC;
            int odD;
            int odE;
            int odF;
            int odG;
            int odH;
            int odI;
            int odJ;

            int l1;
            int l2;
            int l3;
            int l4;
            int l5;
            int l6;
            int l7;
            int l8;
            int l9;
            int l10;

            int dl; 

            while (result.next()) {
                id = result.getInt("id_formuly");
                nazwa_formuly = result.getString("nazwa_formuly");
                przedA = result.getString("przedA");
                przedB = result.getString("przedB");
                przedC = result.getString("przedC");
                przedD = result.getString("przedD");
                przedE = result.getString("przedE");
                przedF = result.getString("przedF");
                przedG = result.getString("przedG");
                przedH = result.getString("przedH");
                przedI = result.getString("przedI");
                przedJ = result.getString("przedJ");
                poJ = result.getString("poJ");

                odA = result.getInt("odA");
                odB = result.getInt("odB");
                odC = result.getInt("odC");
                odD = result.getInt("odD");
                odE = result.getInt("odE");
                odF = result.getInt("odF");
                odG = result.getInt("odG");
                odH = result.getInt("odH");
                odI = result.getInt("odI");
                odJ = result.getInt("odJ");

                l1 = result.getInt("l1");
                l2 = result.getInt("l2");
                l3 = result.getInt("l3");
                l4 = result.getInt("l4");
                l5 = result.getInt("l5");
                l6 = result.getInt("l6");
                l7 = result.getInt("l7");
                l8 = result.getInt("l8");
                l9 = result.getInt("l9");
                l10 = result.getInt("l10");
                dl = result.getInt("dl");
                form.add(new DaneFormuly(id, nazwa_formuly, przedA, przedB, przedC, przedD, przedE, przedF, przedG, przedH, przedI, przedJ, poJ, odA, odB, odC, odD, odE, odF, odG, odH, odI, odJ, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,dl));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return form;
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
