package jdk;

import lombok.Data;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {

    DelayQueue<DelayStrategy> delayQueue = new DelayQueue<>();

    @Data
    class DelayStrategy implements Delayed {

        private long delayTime;
        private String taskName;
        private long expireTime;

        public DelayStrategy(String taskName, long delayTime) {
            this.taskName = taskName;
            this.delayTime = delayTime;
            expireTime = System.currentTimeMillis() + delayTime;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(expireTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }
    }

    @Test
    public void testDelayQueue() {

        new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                DelayStrategy delayStrategy = new DelayStrategy("task_" + i, random.nextInt(10000));
                delayQueue.add(delayStrategy);
            }
        }).start();

        System.err.println("output element");
        DelayStrategy delayStrategy = null;
        try {
            for (;;) {
                if ((delayStrategy = delayQueue.take()) != null) {
                    System.out.println(delayStrategy);
                }
            }
        } catch (Exception e) {

        }

    }

    @Test
    public void test() {
        Random random = new Random();
        System.out.println(random.nextInt(10000000));
    }

}
