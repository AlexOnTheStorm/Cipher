package first;

public class ByteInverse extends MyCipher implements EnterInterface {

    public static byte sdvig; //на сколько бит сдвинуть
    public static boolean flag = true; //флаг, показывающий, прямое шифрование или обратное
    public void Option (boolean f){

        if (f) {
            System.out.println("На сколько символов сдвинуть? (1-5 для русской строки, 1-9 для английской)");
            sdvig = Byte.valueOf(myKeyboard.nextLine());
        }
    }
    public void DeCipher(boolean f){

        if (!f) {
            flag = false;
        } else flag = true;
    }
    public char Method(char originalchar) {

        char secretchar;
        if (flag) {
            int tmp = (int) originalchar << sdvig;
            secretchar = (char) tmp;
        } else {
            int tmp = (int) originalchar >> sdvig;
            secretchar = (char) tmp;
        }
        return secretchar;
    }
}
