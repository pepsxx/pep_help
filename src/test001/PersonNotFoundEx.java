package test001;

public class PersonNotFoundEx extends RuntimeException {
    public PersonNotFoundEx() {
        System.out.println("пользователь не найден");
    }
}
