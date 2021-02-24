import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stroki {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("выбирете задачу со строками");
        System.out.println("1-самая большая");
        System.out.println("2-средняя");
        System.out.println("3-самая маленькая");
        int countString = Integer.parseInt(reader.readLine());
        switch (countString){
            case 1:
                Str2 a = new Str2();
                a.Dlinna();
            case 2:
                Str1 b = new Str1();
                b.Dlinna();
            case 3:
                Str c = new Str();
                c.Dlinna();

        }


    }
}