package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(101);
        return new Ball(color, number);
    }
}
