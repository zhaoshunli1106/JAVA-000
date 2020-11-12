package homework.code;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * <p>
 * 一个简单的代码参考：
 */
public class TheadWaitNotify {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final TheadWaitNotify theadSynchronized = new TheadWaitNotify();
        Thread thread = new Thread(() -> {
            theadSynchronized.sum();
        });
        thread.start();
        System.out.println("异步计算结果为：" + theadSynchronized.getValue());
        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
    }


    private Integer value = null;

    private synchronized void sum() {
        value = fibo(36);
        notifyAll();
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }

    synchronized public int getValue() throws InterruptedException {
        while (value == null) {
            wait();
        }
        return value;
    }
}
