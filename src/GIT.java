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
            statement.close();
        }catch(SQLException sqlException){
            this.msj = sqlException.getMessage();
        }
        return lstEstudiantes;
    }
    
    public String InsertarEstudiante(Estudiante est) {
        try{
            setConcDB("jdbc:sqlite:src/MODEL/DB_Est.db");
            Statement statement = concDB.createStatement();
            String strInsertEst = String.format("insert into Estudiante(nombreEst, nota1, nota2, promedio, estado) " +  "values(%s, %d, %d, %d, %s)", est.nombre, est.nota1, est.nota2, est.promedio, est.stado);
            statement.executeUpdate(strInsertEst);
            statement.close();
        }catch (SQLException sqlException) {
            this.msj = sqlException.getMessage();
        }
        return msj;
    }
}


