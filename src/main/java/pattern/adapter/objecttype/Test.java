package pattern.adapter.objecttype;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/2 19:20
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        VoltageAdapter voltageAdapter = new Voltage5VAdapter();
        int output5V = voltageAdapter.output5V();
        System.out.println("输出电压" + output5V + "V");
    }
}
