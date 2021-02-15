import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Str1 {
    public void Dlinna()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int countString = Integer.parseInt(reader.readLine());
        String veryShortString= new String();
        String g = new String() ;
        for (int i = 0; i < countString; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            String currentStrin = reader.readLine();
            {
                veryShortString=g+currentStrin;
                g=veryShortString;


            }
        }
        int a = g.length() / countString;

        System.out.println("общая длинна = " + veryShortString);
        System.out.println("средняя длинна " + a);
    }
}
