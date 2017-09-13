package first;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;

public class Enter {

    public static void EnterString(){

        System.out.println("Введите строку");
        Scanner myString = new Scanner(System.in);
        String original = myString.nextLine();
        String secret = "";
        String backoriginal = "";
        String choiceMethod = "";
        boolean f = true;
        do {
            System.out.println(original + "\n Выберете метод шифрования: 1 - шифр Цезаря, 2 - битовый сдвиг");
            switch (myString.nextLine()){
                case "1": {
                    CeasarCipher ceaser = new CeasarCipher();
                    UnCeasarCipher unceasar = new UnCeasarCipher();
                    secret = ceaser.Choice(original);
                    backoriginal = unceasar.Choice(secret);
                    break;
                }
                case "2": {
                    ByteInverse zad = new ByteInverse();
                    UnByteInverse pered = new UnByteInverse();
                    secret = zad.Choice(original);
                    backoriginal = pered.Choice(secret);
                    break;
                }
                case "0": {
                    f = false;
                    break;
                }

            }
            System.out.println("Зашифрованное сообщение - " + secret);
            System.out.println("Расшифрованное сообщение - " + backoriginal);
        } while (f);

    }

}
