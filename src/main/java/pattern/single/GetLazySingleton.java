package pattern.single;

/**
 * @ClassName GetLazySingleton
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/24 21:19
 * @Version 1.0
 **/
public class GetLazySingleton implements Runnable{

    /**
     * When an objecttype implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the objecttype's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        ContainerSingleton.putInstance("key-one", new Object());
        System.out.println(ContainerSingleton.getInstance("key-one"));
    }
}
