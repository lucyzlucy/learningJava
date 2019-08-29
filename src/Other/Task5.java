package Other;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
// prog — число созданное программой
// user — число введённое пользователем
        int prog, user;
        int attempts = 0;
        // Генерируем случайное целое число от 1 до 10
        do {
            prog = (int) (Math.random() * 20 - 10);
        } while (prog == 0);
        System.out.println(prog);
        System.out.println("Я загадала число от -10 до 10 (кроме 0), отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        // Проверяем, есть ли в потоке ввода целое число
        if (input.hasNextInt()) {
            do {
                // Считаем количество попыток
                attempts++;
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("Вы угадали!");
                } else {
                    // Проверяем, входит ли число в отрезок [-10;10]
                    if (user >= -10 && user <= 10) {
                        System.out.print("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if (prog < user) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                        if (prog < 0 && user > 0 || prog > 0 && user < 0){
                            System.out.println("Ошибся в знаке.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while (user != prog);
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("Количество попыток - " + attempts + ". До свиданья!");
    }


}
