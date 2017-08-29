package Alone_composite;

import java.util.List;


public class Sentence extends MessageComposite {

    public Sentence(List<Word> words) {
        for(Word word: words){
            this.add(word);
        }
    }

    @Override
    protected void printBefore() {}

    @Override
    protected void printAfter() {
        System.out.println(".");
    }
}
