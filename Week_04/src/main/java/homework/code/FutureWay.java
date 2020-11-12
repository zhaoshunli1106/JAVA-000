package homework.code;

import java.util.concurrent.*;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-11-11 19:52
 **/
public class FutureWay implements Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start=System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Long> future = executor.submit(new FutureWay());
        long result = future.get(); //这是得到的返回值
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        // 然后退出main线程
        executor.shutdown();
    }


    private long sum() {
        return fibo(36);
    }

    private long fibo(int a) {
        if ( a < 2) {
            return 1;
        }
        return fibo(a-1) + fibo(a-2);
    }

    @Override
    public Long call() throws Exception {
        return sum();
    }



}
