package pattern.builder;

/**
 * @ClassName Director
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:40
 * @Version 1.0
 **/
public class Director {

    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    /**
     * 这里可以根据实际情况来决定具体如何生产制造
     * @param name
     * @param brand
     * @param price
     */
    public void makeComputer(String name, String brand, String price) {
        this.computerBuilder.setName(name);
        this.computerBuilder.setBrand(brand);
        this.computerBuilder.setPrice(price);
    }
}
