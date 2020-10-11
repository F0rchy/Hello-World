package com.max.idea;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        calculator();
    }

    public static void calculator()
    {
        String d;
        int f;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число");
            double a = in.nextDouble();
            System.out.println("Введите знак операции");
            String c = in.next();
            f=0;
            while(f == 0)
            {
                if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"))
                {
                    f++;
                }
                else
                {
                    System.out.println("Вы ввели неверный знак операции. Попробуйте еще раз");
                    c = in.next();
                }
            }
            System.out.println("Введите второе число");
            double b = in.nextDouble();
            if (c.equals("+"))
            {
                System.out.println(a + " + " + b + " = " + (a + b));
            }
            else if (c.equals("-"))
            {
                System.out.println(a + " - " + b + " = " + (a - b));
            }
            else if (c.equals("*"))
            {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
            else
            {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
            System.out.println("Чтобы продолжить, введите 'Дальше'");
            d = in.next();
        }
        while (d.equals("Дальше"));
    }
}