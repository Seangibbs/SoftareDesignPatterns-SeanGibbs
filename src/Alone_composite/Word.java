package Alone_composite;

import java.util.List;


public class Word extends MessageComposite {

    public Word(List<Letter> letters) {
        for(Letter letter: letters){
            this.add(letter);
        }
    }

    @Override
    protected void printBefore() {
        System.out.println(" ");
    }

    @Override
    protected void printAfter() {

    }
}
