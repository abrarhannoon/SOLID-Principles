package Abstract;

public  abstract class DatabaseOperation {

    public static void insertNewRecord(String interQuery) {

        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery('insert this into");
        System.out.println("db.close()");
    }

    public static void DeleteRecord(String interQuery) {

        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery('delete this from");
        System.out.println("db.close()");
    }
}
