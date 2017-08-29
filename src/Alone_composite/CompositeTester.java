package Alone_composite;


public class CompositeTester {

    public static void main(String[] args) {

        System.out.println("New Message");
        MessageComposite message = new Messenger().message();
        message.print();
        System.out.println(message.count());
    }
}
