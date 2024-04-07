class MaxLoginAttemptsExceededException extends Exception {
    public MaxLoginAttemptsExceededException(int attempts, int maxAttempts) {
        super("Maximum login attempts (" + maxAttempts + ") exceeded after " + attempts + " attempts");
    }
}