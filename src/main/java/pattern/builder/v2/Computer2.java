package pattern.builder.v2;

/**
 * @ClassName Computer2
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:49
 * @Version 1.0
 **/
public class Computer2 {

    private String name;
    private String brand;
    private String price;

    public Computer2(Builder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Computer2{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private String brand;
        private String price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        Computer2 build() {
            return new Computer2(this);
        }
    }
}
