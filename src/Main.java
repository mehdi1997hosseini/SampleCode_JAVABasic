import datasource.DataSource;

public class Main {
    public static void main(String[] args) {

        DataSource dataSource = DataSource.getInstance();
        dataSource.getConnection("oracle", "mehdi", "1376", "orcl");
        dataSource.createAllTables();

    }
}