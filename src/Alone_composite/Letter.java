package Alone_composite;


public class Letter extends MessageComposite {

    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }

    @Override
    protected void printBefore() {
        System.out.println(aChar);
    }

    @Override
    protected void printAfter() {}
}
