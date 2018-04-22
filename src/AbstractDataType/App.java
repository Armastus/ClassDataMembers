package AbstractDataType;

public class App {

    public static void main(String[] args) {
        Counter myCounter = new Counter("My Counter");
        /** Here are my abstract data types **/
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.getCurrentValue();

        System.out.println(myCounter);
        System.out.println(myCounter.getCurrentValue());
    }
}
