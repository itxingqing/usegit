package pool;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @ClassName UseThreadPool
 * @Description 使用线程池
 * @Author 邢庆
 * @Date 2021/3/27 8:07
 * @Version 1.0
 **/
public class UseThreadPool {

    public void dealBusiness() throws ExecutionException, InterruptedException {

        Random random = new Random();
        ThreadPoolManager threadPoolManager = new ThreadPoolManager();
        for (int i = 0; i < 10005; i++) {
            Student student = threadPoolManager.submitTask(new ExecuteTask(random.nextInt(15)));
            System.out.println(student);
        }
        threadPoolManager.shutdownPool();
    }

    public static void main(String[] args) {
        UseThreadPool useThreadPool = new UseThreadPool();
        try {
            useThreadPool.dealBusiness();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class ExecuteTask implements Callable<Student> {

        private int count;

        public ExecuteTask(int count) {
            this.count = count;
        }

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Student call() throws Exception {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            Student student = new Student("zhangsan", count);
            return student;
        }
    }
}
