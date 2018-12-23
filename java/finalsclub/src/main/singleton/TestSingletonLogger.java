package main.singleton;

public class TestSingletonLogger {

    public static void main(String[] args) {
        Logger logAllMessages = Logger.getInstance();
        Logger logAllMessagesSeparated = Logger.getInstance();

        System.out.println("======= Logger hashCode instance 1 "+ logAllMessages.hashCode());
        System.out.println("======= Logger logAllMessagesSeparated instance 2 "+ logAllMessagesSeparated.hashCode() );

    }
}
