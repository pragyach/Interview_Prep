public class FrugalMedianEstimator {
    private int estimate;

    public FrugalMedianEstimator(int initialEstimate) {
        this.estimate = initialEstimate;
    }

    public void update(int value) {
        if (value > estimate) {
            estimate += 1;
        } else if (value < estimate) {
            estimate -= 1;
        }
        // Do nothing if value == estimate
    }

    public int getEstimate() {
        return estimate;
    }

    // Example usage
    public static void main(String[] args) {
        int[] stream = {5, 7, 6, 3, 9, 1, 4, 8, 2, 10};
        FrugalMedianEstimator estimator = new FrugalMedianEstimator(0); // Start from 0 or first element

        for (int num : stream) {
            estimator.update(num);
            System.out.println("Current estimate: " + estimator.getEstimate());
        }

        System.out.println("Final median estimate: " + estimator.getEstimate());
    }
}
