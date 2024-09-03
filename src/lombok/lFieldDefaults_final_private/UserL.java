package lombok.lFieldDefaults_final_private;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level= AccessLevel.PRIVATE)
public class UserL {
    int id = 1;
    String name = "John";
    String soname = "Doe";
}

