// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b += 1;

        boolean isOdd = b % 2 != 0;
        System.out.println("Il numero è dispari: " + isOdd);

        var fattore = b * (b+1);
        boolean isMultiple=fattore % 3 == 0;
        System.out.print("E' un multiplo di 3: " + isMultiple);
    }
}