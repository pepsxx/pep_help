package lombok.lBuilder;

import lombok.Builder;

@Builder
public class UserL {
    private int id;
    private String name;
    private final String soname;
}