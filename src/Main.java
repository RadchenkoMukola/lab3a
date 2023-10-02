
class BeeApp {
    public BeeApp(int beesNumber, int bucketCapacity) {
        Bucket bucket = new Bucket(bucketCapacity);

        Pooh pooh = new Pooh(bucket);
        pooh.start();

        for (int i = 0; i < beesNumber; ++i) {
            Thread thread = new Bees(bucket);
            thread.start();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new BeeApp(10,100);
    }
}