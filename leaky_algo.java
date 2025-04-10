public class TokenBucket {
    private final long capacity;
    private final long refillRatePerSecond;
    private double tokens;
    private long lastRefillTimestamp;

    public TokenBucket(long capacity, long refillRatePerSecond) {
        this.capacity = capacity;
        this.refillRatePerSecond = refillRatePerSecond;
        this.tokens = capacity;
        this.lastRefillTimestamp = System.nanoTime();
    }

    public synchronized boolean allowRequest() {
        refill();
        if (tokens >= 1) {
            tokens -= 1;
            return true;
        }
        return false;
    }

    private void refill() {
        long now = System.nanoTime();
        double secondsPassed = (now - lastRefillTimestamp) / 1_000_000_000.0;
        double tokensToAdd = secondsPassed * refillRatePerSecond;
        tokens = Math.min(capacity, tokens + tokensToAdd);
        lastRefillTimestamp = now;
    }
}
