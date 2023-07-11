// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b += 1;

        boolean isOdd = true;
        if (b % 2 == 0) {
            isOdd = false;
        }
        System.out.println("Il numero è dispari: " + isOdd);
    }
}