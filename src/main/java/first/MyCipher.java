package first;

public abstract class MyCipher { //абстрактный класс для всех методов шифрования

    public abstract char Method(char s); //абстрактный метод, описывающий, как менять символы в строке
    public abstract void Option(boolean f); //абстрактный метод, который уточняет параметры шифрования
    public abstract void DeCipher(boolean f); //абстрактный метод, указывающий, прямое шифрование или обратное
    public String Cipherification(String original, boolean f){

        String secret = "";

        Option(f); //уточняем параметры шифрования
        DeCipher(f); //указываем прямое шифрование или обратное

        for (int i = 0; i<original.length(); i++){

            //если символ в строке не пробел, то шифруем каждый символ в строке и формируем зашифрованную строку
            if (original.charAt(i) != ' ') {
                secret += Method(original.charAt(i));
            } else secret += ' ';

        }

        return secret;
    }


}
