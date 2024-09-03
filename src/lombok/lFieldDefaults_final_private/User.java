package lombok.lFieldDefaults_final_private;

//@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
// fields - final и private
public class User {
    final private int id = 1;
    final private String name = "John";
    final private String soname = "Doe";
}
