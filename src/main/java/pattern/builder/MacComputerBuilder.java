package pattern.builder;

/**
 * @ClassName MacComputerBuilder
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:46
 * @Version 1.0
 **/
public class MacComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void setName(String name) {
        computer.setName(name);
    }

    @Override
    public void setBrand(String brand) {
        computer.setBrand(brand);
    }

    @Override
    public void setPrice(String price) {
        computer.setPrice(price);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
