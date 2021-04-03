package pattern.adapter.objecttype;

/**
 * @ClassName Voltage5VAdapter
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/2 19:18
 * @Version 1.0
 **/
public class Voltage5VAdapter implements  VoltageAdapter {

    private Voltage220v voltage220v = new Voltage220v();

    /**
     * 输出5V
     *
     * @return
     */
    @Override
    public int output5V() {
        int inputV = voltage220v.outputV();
        int output5V = inputV / 44;
        return output5V;
    }
}
