package ru.otus.l152.local;

/**
 * Created by tully.
 */
public class ThreadLocalMain {

    public static void main(String[] args) throws InterruptedException {
        Wrapper<Integer> wrapper = new Wrapper<>(0);
        //ThreadLocal<Integer> wrapper = ThreadLocal.withInitial(() -> 0);

        Runnable sharedRunnable = () -> {
            int count = 0;
            while (count < 5_000) {
                int current = wrapper.get();
                wrapper.set(++current);

                count++;
            }
            System.out.println(Thread.currentThread().getName() + ": " + wrapper.get());
        };

        Thread thread1 = new Thread(sharedRunnable);
        Thread thread2 = new Thread(sharedRunnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(Thread.currentThread().getName() + ": " + wrapper.get());
    }

    private static class Wrapper<T> {
        private T value;

        Wrapper(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }

        void set(T value) {
            this.value = value;
        }
    }
}
