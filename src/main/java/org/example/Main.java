package org.example;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Calc calculator = new Calc();

        // Массив чисет Integer
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(1);
        arrayInteger.add(2);
        arrayInteger.add(5);
        arrayInteger.add(2);
        arrayInteger.add(3);

        // Массив чисел Double
        ArrayList<Double> arrayDouble = new ArrayList<>();
        arrayDouble.add(1.0782);
        arrayDouble.add(0.5456);
        arrayDouble.add(5.54562);
        arrayDouble.add(1.7254);
        arrayDouble.add(2.35426);

        System.out.println("\n*****_Ввод_Integer_***************");

        System.out.println("Сумма = " + calculator.sum(arrayInteger));
        System.out.println("Вычитание = " + calculator.minus(arrayInteger));
        System.out.println("Произведение = " + calculator.multiply(arrayInteger));
        System.out.println("Деление = " + calculator.divide(arrayInteger));

        System.out.println("\n*****_Ввод_Double_****************");

        System.out.println("Сумма = " + calculator.sum(arrayDouble));
        System.out.println("Вычитание = " + calculator.minus(arrayDouble));
        System.out.println("Произведение = " + calculator.multiply(arrayDouble));
        System.out.println("Деление = " + calculator.divide(arrayDouble));

        System.out.println("**********************************\n");

        // Перевод чисел
        System.out.println("         ПЕРЕВОД  ЧИСЛА         ");
        System.out.println("Из десятичной системы в двоичную");
        System.out.println("--------------------------------");

        System.out.println("Исходное число: 219");
        System.out.println("Если ввод String, ответ:  " + calculator.tenToBin("219"));
        System.out.println("Если ввод Integer, ответ: " + calculator.tenToBin(219));
        System.out.println("Если ввод Double, ответ:  " + calculator.tenToBin(219.0));

        System.out.println("--------------------------------");
        System.out.println("Из двоичной системы в десятичную");
        System.out.println("--------------------------------");

        System.out.println("Исходное число: 11011011");
        System.out.println("Если ввод String, ответ:  " + calculator.binToTen("11011011"));
        System.out.println("Если ввод Integer, ответ: " + calculator.binToTen(11011011));

    }
}