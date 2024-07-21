package Example.T28_JDBC_DAO.entity;

public class TestEntity {
    private Integer id;
    private String name;

    public TestEntity() {
    }

    public TestEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "test{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }
}
