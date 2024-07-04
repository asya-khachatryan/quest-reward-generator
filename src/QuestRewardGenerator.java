class QuestRewardGenerator {

    public static String generateRewards(int n) {
        StringBuilder rewards = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            double probability = logisticFunction(i, n);
            if (deterministicRandom(i) < probability) {
                rewards.append('s');
            } else {
                rewards.append('b');
            }
        }

        return rewards.toString();
    }

    private static double logisticFunction(int x, int n) {
        double mid = n / 2.0;
        double steepness = 0.1;
        return 1 / (1 + Math.exp(-steepness * (x - mid)));
    }

    private static double deterministicRandom(int i) {
        return (Math.sin(i) + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 100;
        String rewards = generateRewards(n);
        System.out.println(rewards);
    }
}
