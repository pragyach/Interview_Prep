public class LeakyBucket {
    private final int capacity;
    private final long leakRatePerSecond;
    private double water;
    private long lastUpdateTime;

    public LeakyBucket(int capacity, long leakRatePerSecond) {
        this.capacity = capacity;
        this.leakRatePerSecond = leakRatePerSecond;
        this.water = 0;
        this.lastUpdateTime = System.nanoTime();
    }

    public synchronized boolean allowRequest() {
        leak();
        if (water < capacity) {
            water += 1;
            return true;
        }
        return false;
    }

    private void leak() {
        long now = System.nanoTime();
        double secondsPassed = (now - lastUpdateTime) / 1_000_000_000.0;
        double leaked = secondsPassed * leakRatePerSecond;
        water = Math.max(0, water - leaked);
        lastUpdateTime = now;
    }
}
