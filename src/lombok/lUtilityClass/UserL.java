package lombok.lUtilityClass;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class UserL {
    private final int id = 25;
    private final String name = "Dino";
    private final String soname = "Joy";

    public UserL get() {
        return new UserL();
    }
}