package first;

public abstract class MyCipher {

    public abstract char Method(char s);

    public String Choice(String original){

        String secret = "";

        for (int i = 0; i<original.length(); i++){

            secret += Method(original.charAt(i));
            //original.charAt(i) = Method(original.charAt(i));

        }

        return secret;
    }

}
