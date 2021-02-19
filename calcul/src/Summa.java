import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summa {
    public void summ ()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ввидите первое число:");
        float countString = Integer.parseInt(reader.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ввидите второе число:");
        float countString2 = Integer.parseInt(reader2.readLine());
        float summ = countString+countString2;
        System.out.println("сумма двух чисел = " + +summ);

    }
}