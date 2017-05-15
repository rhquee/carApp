package pl.kfrak.carsApp;

import java.awt.*;

/**
 * Created by RENT on 2017-05-15.
 */
public class MemoryTest {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(7000);

        String s;
        for (int i = 0; i < 100_000 ; i++) {
            for (int j = 0; j < 100_000 ; j++) {
                s = "kasia";
            }
        }
    }
}
