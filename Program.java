import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Program {
    //    Реализовать приложение, которое:
//    Принимает от пользователя и запоминает строки
//    Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
//    Если введено revert, то удаляем последнюю введеную строку
//    Если введено exit, то завершаем программу
//
//    java
//    c++
//    python
//    c#
//    print
//            < [c#, python, c++, java]
//    revert
//            print
//< [python, c++, java]
//    exit
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        String input;
        while (check) {
            input = scanner.nextLine();
            switch (input) {
                case "print" -> System.out.println(queue);
                case "revert" -> queue.remove();
                case "exit" -> check = false;
                default -> queue.addFirst(input);
            }
        }
    }

}