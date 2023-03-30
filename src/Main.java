import java.util.Scanner;

/*
Написать метод, принимающий на вход слово и возвращающий true если слово является палиндромом.
Палиндром - слово, которое при чтении в справа на лево не меняет значения.
Пример - "шалаш", если перевернуть слово, то ничего не измениться.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки на палиндром");
        String str = scanner.next();
        if (isPalindrom(str)) {
            System.out.println("Слово " + str + " является палиндромом");
        } else {
            System.out.println("Слово " + str + " не является палиндромом");
        }
    }

    static boolean isPalindrom(String str) {
        String strRev = new StringBuilder(str).reverse().toString();
        return str.equals(strRev);

    }
}