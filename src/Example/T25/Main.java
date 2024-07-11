package Example.T25;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------------");
        User u1 = new User(List.of(new Group("q1"), new Group("q2")), "1");
        User u2 = new User(List.of(new Group("q1"), new Group("z2")), "2");
        User u3 = new User(List.of(new Group("z1"), new Group("z2")), "3");

        Stream.of(u1, u2, u3)
                .filter(u -> u.groups.stream()
                        .map(Group::getGroupName)
                        .anyMatch(gn -> gn.startsWith("q")))
                .map(User::getName)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
