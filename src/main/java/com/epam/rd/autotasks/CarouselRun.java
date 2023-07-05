package com.epam.rd.autotasks;

public class CarouselRun  {

    public int [] carousel = DecrementingCarousel.carousel;
    public int capacity;
    int index;

    public CarouselRun() {

    }
    public int next() {
        if (isFinished())
            return -1;
        else {
            while (!isFinished() && carousel[index %= carousel.length] <= 0) {
                index++;
            }
        }
        return carousel[index++]--;
    }

    public boolean isFinished() {
        for (int el : carousel)
            if (el > 0)
                return false;
        return true;
    }
}
