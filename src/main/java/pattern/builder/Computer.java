package pattern.builder;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:34
 * @Version 1.0
 **/
public class Computer {

    private String name;
    private String brand;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
