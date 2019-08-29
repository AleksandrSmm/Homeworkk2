package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int age;
        int temperature;

        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Введите ваше имя");
            name = sc.nextLine();
            System.out.println("Ваше имя " + name);

            System.out.println("Введите ваш возраст:");
            age = sc.nextInt();
            System.out.println("Вы ввели ваш возраст " + age);
        }


        System.out.println("Введите температуру на улице:");
        temperature = sc.nextInt();
        System.out.println("Благодарим! Вы ввели температуру на улице" + temperature);


        if ((temperature > 30 || temperature < -20) && (age > 20 && age < 45)) {
            System.out.println(name + " не идёт гулять");

        } else if ((temperature < 0 || temperature > 28) && (age > 0 && age < 20)) {
            System.out.println(name + " Не выходит гулять");
        } else if ((temperature < 0 || temperature < -10) && (age > 45)) {
            System.out.println(name + "Не выходит гулять");

        } else {
            System.out.println(name + "Отправляются в гости к другу");
        }
    }

}
