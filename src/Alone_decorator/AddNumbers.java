package Alone_decorator;


public class AddNumbers extends EncryptDecorator {

    public AddNumbers(IEncryptor encryptor) {
        super(encryptor);
    }

    public String encrypt(String enteredText) {
        int randomNum = (int) (Math.random() * 100);
        String randomNumString = String.valueOf(randomNum);

        StringBuilder newWord = new StringBuilder();
        newWord.append(enteredText);
        newWord.append(randomNumString);
        String combinedWords = newWord.toString();

        return encryptor.encrypt(combinedWords);
    }
}
