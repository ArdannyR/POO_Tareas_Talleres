package Sistema_Hospitalario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_hospitalario_poo";
    // Usuario de la base de datos
    private static final String USER = "root"; // Reemplaza con tu usuario de MySQL (usualmente 'root')
    // Contraseña de la base de datos
    private static final String PASSWORD = "Arev2005"; // Reemplaza con tu contraseña de MySQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }
        return connection;
    }
}