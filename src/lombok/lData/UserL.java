package lombok.lData;

import lombok.Data;

@Data
public class UserL {
    private int id;
    private String name;
    private final String soname;
}