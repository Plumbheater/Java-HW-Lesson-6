package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int x, int y) {
        int count = 0;
        for (int i = 1; i <= y; i++) {
            if (i * i < x) {
                continue;
            }
            if (i * i <= x || i * i <= y) {
                count++;
            }
        }
        return count;
    }
}
