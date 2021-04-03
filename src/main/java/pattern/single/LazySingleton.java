package pattern.single;

/**
 * @ClassName LazySingleton
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 21:16
 * @Version 1.0
 **/
public class LazySingleton {
    /**
     * 私有构造器
     */
    private LazySingleton() {

    }

    private static LazySingleton lazySingleton = null;

    /**
     * 懒汉式单例
     * @return
     */
    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
