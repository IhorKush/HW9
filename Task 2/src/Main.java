import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        truth();
    }

    public static void truth() {
        System.out.println("Input your number: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(input % 2 == 0);
    }

}
