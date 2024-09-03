package example.T01_AFPS;

class PersonAbstractExtends extends PersonAbstract {

    PersonAbstractExtends(String name) {
        super(name);
    }

    @Override
    String getName() {
        return this.name;
    }
}
