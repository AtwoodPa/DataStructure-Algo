package oi.pp;

/**
 * 计时器
 */
public class Stopwatch {
    private static long startTime;
    private static long endTime;
    private static boolean running;

    public static void start() {
        if (!running) {
            startTime = System.nanoTime();
            running = true;
        } else {
            throw new IllegalStateException("Stopwatch is already running.");
        }
    }

    public static void stop() {
        if (running) {
            endTime = System.nanoTime();
            running = false;
        } else {
            throw new IllegalStateException("Stopwatch is not running.");
        }
    }

    public static void reset() {
        running = false;
    }

    public static long getTimeElapsedInMilliseconds() {
        if (running) {
            throw new IllegalStateException("Stopwatch is still running.");
        }
        return (endTime - startTime) / 1000000; // 将纳秒转换为毫秒
    }

    public static long getTimeElapsedInNanoseconds() {
        if (running) {
            throw new IllegalStateException("Stopwatch is still running.");
        }
        return endTime - startTime;
    }
}
