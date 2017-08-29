package Alone_decorator;


public abstract class EncryptDecorator implements IEncryptor {
    IEncryptor encryptor;

    public EncryptDecorator(IEncryptor encryptor) {
        this.encryptor = encryptor;
    }

}
