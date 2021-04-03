package pool;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @ClassName ThreadPoolManager
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/27 7:50
 * @Version 1.0
 **/
public class ThreadPoolManager {

    private ThreadPoolExecutor executorService;

    public ThreadPoolManager() {
        ThreadFactory nameThreadFactory = new CustomizableThreadFactory("spring-thread-");
        executorService = new ThreadPoolExecutor(10, 100, 10000L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(1024), nameThreadFactory, new ThreadPoolExecutor.AbortPolicy());
    }

    public <T> T submitTask(Callable<T> callable) throws ExecutionException, InterruptedException {


        Future<T> future = executorService.submit(callable);
        System.out.println(executorService.getActiveCount() + ">>>>" + executorService.getCompletedTaskCount() + ">>>" + executorService.getPoolSize());

        return future.get();
    }

    public void shutdownPool() {
        executorService.shutdown();
    }
}
