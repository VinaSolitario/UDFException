import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 0;
        boolean loginSuccessful = false;
        
        while (attempts < 3 && !loginSuccessful) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            try {
                LoginProcess.login("username", password);
                loginSuccessful = true;
            } catch (MaxLoginAttemptsExceededException e) {
                System.out.println(e.getMessage());
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }
            
            attempts++;
        }
        
        if (!loginSuccessful && attempts == 3) {
            System.out.println("Maximum login attempts (3) exceeded after 3 attempts");
        }
        
        scanner.close();
    }
}
