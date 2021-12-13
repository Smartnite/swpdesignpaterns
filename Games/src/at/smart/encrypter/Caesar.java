package at.smart.encrypter;

public class Caesar implements Encrypt{

    @Override
    public String encrypt(String data) {
        String data1 = data+"Caesar";
        return data1;
    }
}
