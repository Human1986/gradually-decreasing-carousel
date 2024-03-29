package com.epam.rd.autotasks;

public class DecrementingCarousel extends CarouselRun {
    public static int[] carousel;
    static int countElement;
    boolean isRun;

    public DecrementingCarousel(final int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];

    }

    public DecrementingCarousel() {
    }

    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new DecrementingCarousel();
        }
        return null;
    }

    public boolean addElement(int element) {
        if (element > 0 && index < carousel.length && !isRun) {
            carousel[index++] = element;
            countElement++;
            return true;
        }
        return false;
    }
}
