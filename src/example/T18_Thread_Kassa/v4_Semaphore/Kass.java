package example.T18_Thread_Kassa.v4_Semaphore;

public class Kass {
    private final int id;
    private static int counter;

    public Kass() {
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "Kass{" +
                "id=" + id +
                '}';
    }
}
