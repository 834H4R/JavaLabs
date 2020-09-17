package com.Lab1;

import java.util.Scanner;

public class Tasks
{
    public static Scanner in = new Scanner(System.in);
    public void Task1()
    {
        System.out.print("Задание №1: Если первая и третья цифра числа n равны, заменить его первую цифру нулем и поднести число в квадрат\n" +
                "Введите число (от 3х цифр):");
        String num = in.next();
        if (num.length() < 4)
        {
            System.out.println("Число не подходит под условие");
            return;
        }
        if (num.charAt(1) == num.charAt(2))
        {
            char[] newNumArr = num.toCharArray();
            newNumArr[0] = '0';
            int newNum = Integer.parseInt(new String(newNumArr));
            System.out.println("Число в квадрате, после замены первой цифры на 0: " + (int)Math.pow(newNum, 2));
        }
        else
        {
            System.out.println("Вторая и третья цифры числа не одинаковы");
        }
    }
    public void Task2()
    {
        System.out.print("Задание №2: Составить алгоритм, который будет указывать, является ли указаный символ цифрой, литинской буквой или буквой кирилицы\n" +
                "Введите символ:");
        String inputString = in.next();
        if(inputString.length()>1)
        {
            System.out.println("Введенная строка длиннее одного символа, будет использоваться первый символ строки");
        }
        char symbol = inputString.charAt(0);
        System.out.println("Является ли введенный символ числом?:" + Character.isDigit(symbol));
        System.out.println("Является ли введенный символ буквой кирилицы?:" + Character.UnicodeBlock.of(symbol).equals(Character.UnicodeBlock.CYRILLIC));
        System.out.println("Является ли введенный символ буквой латиницы?:" + Character.UnicodeBlock.of(symbol).equals(Character.UnicodeBlock.BASIC_LATIN));
    }
    public void Task3()
    {
        System.out.print("Задание №3: Выяснить, правда ли что произведение первых двух цифр четырехзначного числа n является меньшим чем произведение двух последних\n" +
                "Введите четырехзначное число:");
        String inputString = in.next();
        if(inputString.length()!=4)
        {
            System.out.print("Введенное число состоит не из 4-х символов");
            return;
        }
        int firstTwo = Integer.parseInt(inputString,0,1,10) * Integer.parseInt(inputString,1,2,10);
        int lastTwo = Integer.parseInt(inputString,2,3,10) * Integer.parseInt(inputString,3,4,10);
        if(firstTwo < lastTwo)
            System.out.println("Действительно, произведение первых двух цифр меньше чем произведение последних двух");
        else if(firstTwo > lastTwo)
            System.out.println("Нет, произведение первых двух цифр числа больше чем произведение последних двух");
        else
            System.out.println("Произведение первых двух чисел равно произведению последних двух");
    }
    public void Task4()
    {
        System.out.print("Задание №4: Дату некоторого дня можно охарактеризировать двумя натуральными числами m(порядкаовый номер месяца) и n(число). По заданым n и m узнать дату предыдущего дня" +
                "\n(n и m не могут определять 1 января, а год не является высокосным)\nВведите порядковый номер месяца:");
        int month = in.nextInt();
        if(month > 12 || month < 1)
        {
            System.out.print("Не правильный номер месяца");
            return;
        }
        int[] daysInMont = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Введите порядковый номер дня:");
        int day = in.nextInt();
        if(month == 1 && day == 1)
        {
            System.out.print("По условию нельзя выбирать 1 января");
            return;
        }
        if(daysInMont[month] < day)
        {
            System.out.print("В этом месяце меньше дней");
            return;
        }
        System.out.print("Выбраная дата: " + (month) + "." + day + "\nПредыдущим днем было:");
        if(day != 1)
        {
            System.out.print(month + "." + (day-1));
        }
        else
        {
            System.out.println((month-1) + "." + daysInMont[month-1]);
        }
    }
    public void Pract()
    {
        System.out.println("Практическое задание: Задано натуральное число n. Правда ли, что число а попадается в нем чаще чем число b?\n" +
                "Введите число n(более 2х цифр):");
        String number = in.next();
        System.out.print("Введите число a:");
        String a = in.next();
        if(a.length()<3)
        {
            System.out.print("Слишком короткое число");
            return;
        }
        int countOfA = 0;
        int countOfB = 0;
        if(a.length()>1)
        {
            System.out.print("Слишком большая длинна числа a");
            return;
        }
        char aInChar = a.charAt(0);
        if(number.indexOf(aInChar) == -1)
        {
            System.out.print("Цифры a нету в этом числе");
            return;
        }
        for(char ch : number.toCharArray())
        {
            if(aInChar == ch)
                countOfA++;
        }
        System.out.print("Введите число b:");
        String b = in.next();
        if(a.length()>1)
        {
            System.out.print("Слишком большая длинна числа b");
            return;
        }
        char bInChar = b.charAt(0);
        if(number.indexOf(bInChar) == -1)
        {
            System.out.print("Цифры b нету в этом числе");
            return;
        }
        for(char ch : number.toCharArray())
        {
            if(bInChar == ch)
                countOfB++;
        }
        if(countOfA < countOfB)
            System.out.print("Действительно, цифра b встречается в числе чаще чем а");
        else if(countOfA > countOfB)
            System.out.print("Нет, цифра a встречается в числе чаще чем цифра b");
        else
            System.out.print("Цифры а и b встречаются равное количество раз");


    }

}


