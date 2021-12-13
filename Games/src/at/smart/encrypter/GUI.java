package at.smart.encrypter;

public class GUI {
    private static String toEncrypt = "Hallo Welt";

    public static void main(String[] args)
    {
        Encrypt encryptCaesar = new Caesar();
        Encrypt encryptReverse = new Reverse();
        String encryptedCaesar = encryptCaesar.encrypt(toEncrypt);
        String encryptedReverse = encryptReverse.encrypt(toEncrypt);

        System.out.println("Reverse: " + encryptedReverse + " Caesar: " + encryptedCaesar);

    }

}
