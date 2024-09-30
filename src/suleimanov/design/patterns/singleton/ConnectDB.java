package suleimanov.design.patterns.singleton;

public class ConnectDB {
    private static ConnectDB instance;

    private ConnectDB() {
    }

    public static ConnectDB getInstance() {
        if (instance == null) {
            synchronized (ConnectDB.class) {
                if (instance == null) {
                    instance = new ConnectDB();
                }
            }
        }
        return instance;
    }
}
