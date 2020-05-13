package org.jiajie.coffeecode.concurrent;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

    static final int THRESHOLD = 100;
    long[] array;
    int start;
    int end;

    public SumTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        // 先判断任务是不是足够小，如果足够小，就直接计算并返回结果（注意模拟了1秒延时）
        if (end - start <= THRESHOLD) {
            // 如果任务足够小,直接计算:
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(String.format("compute %d~%d = %d", start, end, sum));
            return sum;
        }

        // 任务太大,一分为二:
        // 否则，把自身任务一拆为二，分别计算两个子任务，再返回两个子任务的结果之和。
        int middle = (end + start) / 2;
        System.out.println(String.format("split %d~%d ==> %d~%d, %d~%d", start, end, start, middle, middle, end));

        SumTask subtask1 = new SumTask(this.array, start, middle);
        SumTask subtask2 = new SumTask(this.array, middle, end);

        invokeAll(subtask1, subtask2);

        Long subresult1 = subtask1.join();
        Long subresult2 = subtask2.join();
        Long result = subresult1 + subresult2;

        System.out.println("result = " + subresult1 + " + " + subresult2 + " ==> " + result);
        return result;
    }

    static Random random = new Random(0);

    static long random() {
        return random.nextInt(10000);
    }

    public static void main(String[] args) {
        // 我们设置任务的最小阀值是100，当提交一个400大小的任务时，在4核CPU上执行，
        // 会一分为二，再二分为四，每个最小子任务的执行时间是1秒，由于是并发4个子任务执行，
        // 整个任务最终执行时间大约为1秒。

        // 创建随机数组成的数组:
        long[] array = new long[400];
        long expectedSum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random();
            expectedSum += array[i];
        }
        System.out.println("Expected sum: " + expectedSum);
        // fork/join task:
        // 最大并发数4
        ForkJoinPool fjp = new ForkJoinPool(4);
        ForkJoinTask<Long> task = new SumTask(array, 0, array.length);

        long startTime = System.currentTimeMillis();
        // fjp.invoke(task)来提交一个Fork/Join任务并发执行，然后获得异步执行的结果。
        Long result = fjp.invoke(task);
        long endTime = System.currentTimeMillis();

        System.out.println("Fork/join sum: " + result + " in " + (endTime - startTime) + " ms.");
    }
}
