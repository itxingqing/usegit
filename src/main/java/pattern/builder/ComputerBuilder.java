package pattern.builder;

/**
 * @ClassName ComputerBuilder
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:36
 * @Version 1.0
 **/
public interface ComputerBuilder {

    void setName(String name);
    void setBrand(String brand);
    void setPrice(String price);
    Computer build();
}
