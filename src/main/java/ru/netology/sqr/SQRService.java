package ru.netology.sqr;

public class SQRService {

    public int countSquared(int lowBorder, int highBorder) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowBorder && i * i <= highBorder) {
                number++;
            }
        }
        return number++;
    }
}


