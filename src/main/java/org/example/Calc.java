package org.example;

import java.util.List;

public class Calc {

    /**
     * Сумма чисел в массиве
     *
     * @param items массив чисел
     * @return возвращает "Double" результат сложения
     */
    public Double sum(List<? extends Number> items) {
        double sum = 0.0;
        for (Number i : items) {
            sum += i.doubleValue();
        }
        return roundNumber(sum, 2);
    }

    /**
     * Сумма чисел в массиве
     *
     * @param items массив чисел
     * @return возвращает "Double" результат сложения
     */
    public Double minus(List<? extends Number> items) {
        double minus = 0.0;
        for (Number i : items) {
            minus -= i.doubleValue();
        }
        return roundNumber(minus, 2);
    }

    /**
     * Умножение чисел в массиве
     *
     * @param items массив чисел
     * @return возвращает "Double" результат умножения
     */
    public Double multiply(List<? extends Number> items) {
        double multiply = 1.0;
        for (Number i : items) {
            multiply *= i.doubleValue();
        }
        return roundNumber(multiply, 2);
    }

    /**
     * Деление чисел в массиве
     *
     * @param items массив чисел
     * @return возвращает "Double" результат деления
     */
    public Double divide(List<? extends Number> items) {
        double divide = 1.0;
        for (Number i : items) {
            divide /= i.doubleValue();
        }
        return roundNumber(divide, 2);
    }

    /**
     * Переводит двоичное число в десятичное
     *
     * @param num двоичное число
     * @param <T> неопределенный тип переменной
     *            (String, Integer, Double...)
     * @return возвращает "int" десятичное число
     */
    public <T> Integer binToTen(T num) {
        int base = 2;
        String number = "";
        number += num;
        char[] ch = (number).toCharArray();
        int newNum = 0;
        int degree = ch.length - 1;
        for (char c : ch) {
            newNum += (Character.getNumericValue(c)) * Math.pow(base, degree);
            degree--;
        }
        return newNum;
    }

    /**
     * Переводит десятичное число в двоичное
     *
     * @param number десятичное число
     * @param <T>    неопределенный тип переменной
     *               (String, Integer, Double...)
     * @return возвращает "int" двоиное число
     */
    public <T> Integer tenToBin(T number) {
        int base = 2;
        int num = getIntNum(number);
        StringBuilder bin = new StringBuilder();
        while (num / base > 0) {
            int temp = num / base;
            bin.insert(0, num % base);
            num = temp;
        }
        bin.insert(0, num % base);
        return Integer.parseInt(bin.toString());
    }

    /**
     * Приведение неизвестного типа переменной к Integer
     *
     * @param str переменная неизвестого типа
     * @param <T> неопределенный тип переменной
     *            (String, Integer, Double...)
     *            <p>при переводе числа с плавающей точкой,</p>
     *            <p>всё что после точки, отбрасывается</p>
     * @return возвращает переменную типа "Integer"
     */
    public <T> Integer getIntNum(T str) {
        String res = "";
        res += str;
        int index = res.indexOf('.');
        if (index > 0) {
            res = res.substring(0, index);
        }
        return Integer.parseInt(res);
    }

    /**
     * Округление числа
     *
     * @param number исходное число
     * @param n      сколько знаков после запятой
     * @return округленное число
     */
    public Double roundNumber(Double number, int n) {
        double scale = Math.pow(10.0, n);
        return (Math.round(number * scale) / scale);
    }
}