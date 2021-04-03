package pattern.single;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 21:18
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new GetLazySingleton());
        Thread thread2 = new Thread(new GetLazySingleton());

        thread1.start();
        thread2.start();

        System.out.println("main线程结束");
    }
}
