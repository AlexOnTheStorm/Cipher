package first;

public class CeasarCipher extends MyCipher implements EnterInterface{

    String alphabet = "abcdefghijklmnopqrstuvwxyz"; //английский строчный
    String capalphabet = "ABCDEFGHIJKLMNOPRSTUVWXYZ"; //английский заглавный
    String rusalphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"; //русский строчный
    String ruscapalphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"; //русский заглавный
    public static int sdvig; //на сколько символов сдвинуть
    public static int decip = 1; //флаг, показывающий, прямое шифрование или обратное

    public void Option (boolean f){

        if (f) {
            System.out.println("На сколько символов сдвинуть? (1-33 для русской строки, 1-25 для английской)");
            sdvig = Integer.valueOf(myKeyboard.nextLine());
        }
    }

    public void DeCipher(boolean f){

        if (!f){
            decip = -1;
        } else decip = 1;
    }

    public char Method(char originalchar) {

        char secret = ' ';
        String originalstring = String.valueOf(originalchar);
        if (alphabet.contains(originalstring)){
            secret = Move(originalchar, alphabet); //если буква английская строчная
        } else if (rusalphabet.contains(originalstring))
        {
            secret = Move(originalchar, rusalphabet); //если буква русская строчная
        } else if (capalphabet.contains(originalstring))
        {
            secret = Move(originalchar, capalphabet); //если буква английская заглавная
        } else if (ruscapalphabet.contains(originalstring))
        {
            secret = Move(originalchar, ruscapalphabet); //если буква русская заглавная
        }
        return secret;
    }

    public char Move (char originalchar, String letters) {

        //метод, сдвигающий символ по алфавиту
        char secretchar = ' ';
        try {
            secretchar = letters.charAt(letters.indexOf(originalchar) + decip*sdvig); //если сдвиг в пределах алфавита
        } catch (Exception e) {
            secretchar = letters.charAt(-decip*letters.length() + letters.indexOf(originalchar) + decip*sdvig); //если сдвиг с конца алфавита в начало и обратно
        }

        return secretchar;
    }

}
