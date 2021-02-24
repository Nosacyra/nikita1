import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcul {
    public static void main(String[] args) throws IOException {
        int i = 1;
        while (i == 1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ввидите знак операции:");

            String countString = new String(reader.readLine());
            switch (countString) {
                case "*":
                    Umnozit a = new Umnozit();
                    a.umnoz();
                    i=0;
                    break;
                case "/":
                    Del b = new Del();
                    b.del();
                    i=0;
                    break;
                case "+":
                    Summa c = new Summa();
                    c.summ();
                    i=0;
                    break;
                case "-":
                    Raznost d = new Raznost();
                    d.raz();
                    i=0;


                    break;
                default:
                    i=1;
                    System.out.println("Это не знак операции.");
            }
        }
    }

}