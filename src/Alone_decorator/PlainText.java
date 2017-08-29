package Alone_decorator;


public class PlainText implements IEncryptor {

    @Override
    public String encrypt(String text) {
        return text;
    }
}
