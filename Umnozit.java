import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Umnozit {
    public void umnoz ()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ввидите первое число:");
        float countString = Float.parseFloat(reader.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ввидите второе число:");
        float countString2 = Float.parseFloat(reader2.readLine());
        float proizv = countString*countString2;
        System.out.println("произведение чисел = "  +proizv);

    }
}


