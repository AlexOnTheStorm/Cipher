package first;

public class UnCeasarCipher extends MyCipher {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public char Method(char originalchar) {

        char secretchar = alphabet.charAt(alphabet.indexOf(originalchar) - 1);
        return secretchar;
    }

}
