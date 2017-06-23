package ru.otus.l41;

/**
 * Created by tully.
 */
class Benchmark implements BenchmarkMBean {
    private int size = 0;

    @SuppressWarnings("InfiniteLoopStatement")
    void run() {
        Object[] array = new Object[size];
        System.out.println("Array of size: " + array.length + " created");

        System.out.println("Starting the loop");
        while (true) {
            for (int i = 0; i < size; i++) {
                array[i] = new String(new char[0]);
            }
            System.out.println("Created " + size + " objects.");
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

}
