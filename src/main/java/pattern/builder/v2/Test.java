package pattern.builder.v2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 19:54
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Computer2 computer2 = new Computer2.Builder().setName("lenovo").setBrand("xxx").build();
        System.out.println(computer2);
    }
}
