package sql;

import java.sql.*;

public class SQLDemo {
    public static void runSQL() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver loaded");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pitomnik", "root", "11")) {
            System.out.println("CONNECTED to db pitomnik");
            conn.createStatement().executeUpdate("TRUNCATE TABLE Characters"); //
            conn.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS Characters (hero VARCHAR(20)," +
                " superskill VARCHAR(20), petik VARCHAR(20),id INT PRIMARY KEY AUTO_INCREMENT)");
            conn.createStatement().executeUpdate("INSERT INTO characters(hero, superskill, petik) VALUES('batman'," +
                " 'boomerang', 'Neko'), ('superman', 'superpunch', 'puppy'), ('hulk', 'rrrrr', 'plutto') ");

//            conn.createStatement().executeUpdate("ALTER TABLE Characters ADD id INT");

            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM Characters LEFT JOIN pet ON Characters.petik = pet.name");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            System.out.println();
            ResultSet rs2 = conn.createStatement().executeQuery("SELECT superskill FROM Characters WHERE petik REGEXP 'o$'");
            while (rs2.next()) {
                System.out.println(rs2.getString(1));
            }

            DatabaseMetaData meta = conn.getMetaData();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SQLDemo.runSQL();
    }


}
