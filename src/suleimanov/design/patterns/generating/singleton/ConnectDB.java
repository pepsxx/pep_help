package suleimanov.design.patterns.generating.singleton;

public class ConnectDB {
    private volatile static ConnectDB instance; // volatile

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
