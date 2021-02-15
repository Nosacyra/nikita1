import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calcul {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ввидите знак операции:");

        String countString = new String(reader.readLine());
        switch (countString) {
            case "*":
                umnozit a = new umnozit();
                a.umnoz();
            case "/":
                del b = new del();
                b.del();
            case "+":
                Summa c = new Summa();
                c.summ();
            case "-":
                Razdnost d = new Razdnost();
                d.raz();


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + countString);
        }
    }


    }

