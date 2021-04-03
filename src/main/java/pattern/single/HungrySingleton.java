package pattern.single;

/**
 * @ClassName HungrySingleton
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/26 19:33
 * @Version 1.0
 **/
public class HungrySingleton implements Cloneable{

    private static final  HungrySingleton hungrySingleTon;

    static {
        hungrySingleTon = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleTon;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 防止反射时间，破坏单例
        return getInstance();
    }
}
