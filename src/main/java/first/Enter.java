package first;


import java.util.Scanner;

public class Enter implements EnterInterface{

    public static Scanner myKeyboard = new Scanner(System.in);
    public static String original = ""; //оригинальная строка

    public static void SuperSecretCipher(){

        Vvod(); //метод для ввода строки
        String secret = ""; //зашифрованная строка
        String backoriginal = "";  //расшифрованная строка

        do {
            System.out.println("Выберете действие: 1 - шифр Цезаря, 2 - битовый сдвиг, 3 - ввести новую строку");
            switch (myKeyboard.nextLine()){
                case "1": {
                    CeasarCipher ceaser = new CeasarCipher(); //объект класса шифр Цезаря
                    secret = ceaser.Cipherification(original, true); //передача строки и флага прямого шифрования в метод шифрования
                    backoriginal = ceaser.Cipherification(secret, false); //передача строки и флага дешифрования в метод шифрования
                    break;
                }
                case "2": {
                    ByteInverse bitCipher = new ByteInverse(); //объект класса битового сдвига
                    secret = bitCipher.Cipherification(original, true); //передача строки и флага прямого шифрования в метод шифрования
                    backoriginal = bitCipher.Cipherification(secret, false); //передача строки и флага дешифрования в метод шифрования
                    break;
                }
                case "3": {
                    Vvod(); //ввод новой строки
                    continue;
                }

            }
            System.out.println("Зашифрованное сообщение - " + secret); //вывод в консоль
            System.out.println("Расшифрованное сообщение - " + backoriginal);
        } while (true); //бесконечный цикл
    }

    public static String Vvod()
    {
        System.out.println("Введите строку (русские либо английские буквы, заглавные либо строчные)");
        original = myKeyboard.nextLine(); //ожидание пользовательского ввода с использованием объекта ввода Scanner из интерфейса EnterInterface
        return original;
    }
}
