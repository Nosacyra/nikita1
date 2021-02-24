import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stroki {
    public static void main(String[] args) throws IOException {
        int i = 1;
        while (i == 1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("выбирете задачу со строками");
            System.out.println("1-самая большая");
            System.out.println("2-самая маленькая");
            int countString = Integer.parseInt(reader.readLine());
            switch (countString) {
                case 1:
                    Str2 a = new Str2();
                    a.Dlinna();
                    i=0;
                    break;
                case 2:
                    Str c = new Str();
                    c.Dlinna();
                    i=0;
                    break;
                default:
                    System.out.println("выбирите от одного до трёх");

            }


        }
    }
}