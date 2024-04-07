class LoginProcess {
    private static final String VALID_PASSWORD = "password";
    private static final int MAX_ATTEMPTS = 3;

    public static void login(String username, String password) throws MaxLoginAttemptsExceededException, InvalidPasswordException {
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            if (password.equals(VALID_PASSWORD)) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts++;
                if (attempts == MAX_ATTEMPTS) {
                    throw new MaxLoginAttemptsExceededException(attempts, MAX_ATTEMPTS);
                } else {
                    System.out.println("Invalid password. Please try again.");
                }
            }
        }
        throw new InvalidPasswordException();
    }
}
