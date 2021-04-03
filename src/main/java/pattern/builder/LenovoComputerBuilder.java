package pattern.builder;

/**
 * @ClassName LenovoComputerBuilder
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:39
 * @Version 1.0
 **/
public class LenovoComputerBuilder implements ComputerBuilder {

    Computer computer = new Computer();

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
