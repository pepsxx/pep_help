package example.T25_Reflection;

@Table(name = "car")
public class Car {
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Info(name = "info")
    private String info = "Нет информации";

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, String info) {
        this.brand = brand;
        this.model = model;
        this.info = info;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
