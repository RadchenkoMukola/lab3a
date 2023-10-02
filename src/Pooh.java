public class Pooh extends Thread {

    private final Bucket bucket;

    public Pooh(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void run() {
        while (isAlive()) {
            if (bucket.takeNotification()) {
                bucket.eatAllHoney();
            }
        }
    }
}