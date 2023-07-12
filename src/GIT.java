public class POO_DATA_BASE {
    public static void main(String[] args) {
        public class View_Est_Consola {
        public static void main(String[] args) {
        ConexionDB_Est obj = new ConexionDB_Est();
        ArrayList<Estudiante> lstEstudiantes = obj.getLstEstudiantes();
        for (Estudiante est : lstEstudiantes) {
            System.out.println(est);    
        }
    }
}


package MODEL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ConexionDB_Est {
    public Connection concDB;
    public ArrayList <Estudiante> lstEstudiantes;
    public String msj;
    public void setConcDB(String url) {
        try{
         this.concDB = DriverManager.getConnection(url);
        }catch(SQLException sqlException){
        this.msj = sqlException.getMessage();
    }
        
    }

    public ArrayList<Estudiante> getLstEstudiantes() {
        try{
            lstEstudiantes = new ArrayList<Estudiante>();
            setConcDB("jdbc:sqlite:src/MODEL/DB_Est.db");
            Statement statement = concDB.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Estudiante");
            while(resultSet.next())
                lstEstudiantes.add(new Estudiante(resultSet.getString("nombreEst"),
                resultSet.getInt("nota1"),
                resultSet.getInt("nota2"),
                resultSet.getInt("promedio"),
                resultSet.getString("estado")));
        }catch(SQLException sqlException){
            this.msj = sqlException.getMessage();
        }
        return lstEstudiantes;
    }
}

