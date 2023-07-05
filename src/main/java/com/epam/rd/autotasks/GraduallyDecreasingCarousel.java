package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {

    int decrement = 1;

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    public GraduallyDecreasingCarousel() {

    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new GraduallyDecreasingCarousel();
        }
        return null;
    }

    @Override
    public int next() {
        if (isFinished()) {
            return -1;
        } else {

            while (carousel[index %= carousel.length] <= 0) {
                index++;
                if (index == carousel.length) {
                    decrement++;
                }
            }
        }

        int value = carousel[index];
        carousel[index++] -= decrement;

        if (index == carousel.length) {
            decrement++;
        }

        return value;
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}