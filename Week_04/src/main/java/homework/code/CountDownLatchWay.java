package homework.code;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * <p>
 * 一个简单的代码参考：
 */
public class CountDownLatchWay {

    private int result = 0;
    private CountDownLatch latch = new CountDownLatch(1);

    private void sum() {
        result = fibo(36);
        latch.countDown();
    }

    private static int fibo(int a) {
        if (a < 2) {
            return 1;
        }
        return fibo(a - 1) + fibo(a - 2);
    }
    private int getResult() throws InterruptedException {
        latch.await();
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        // 异步执行 下面方法
        final  CountDownLatchWay countDownLatchWay = new CountDownLatchWay();
        Thread t = new Thread(()->{
            countDownLatchWay.sum();
        });
        t.start();
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为：" + countDownLatchWay.getResult());
        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
        // 然后退出main线程
    }

}
