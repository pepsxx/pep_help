package lombok.lEqualsAndHashCode_Id;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "id")
public class UserL {
    private int id;
    private String name;
}