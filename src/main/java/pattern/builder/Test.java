package pattern.builder;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:42
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        ComputerBuilder computerBuilder = new MacComputerBuilder();
        // 指导者来控制具体的制作过程
        Director director = new Director(computerBuilder);

        director.makeComputer("电脑", "macbook", "88.888");

        Computer computer = computerBuilder.build();

        System.out.println(computer);


    }
}
