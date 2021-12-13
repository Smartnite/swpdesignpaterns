package at.smart.encrypter;

public class Reverse implements Encrypt{
    @Override
    public String encrypt(String data) {
        String data2 = data + "Reverse";
        return data2;
    }
}
