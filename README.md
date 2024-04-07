# UDFException
Custom Exception Handling for Login Process
This Java program demonstrates custom exception handling for a simple login process. The program defines two custom exceptions: MaxLoginAttemptsExceededException and InvalidPasswordException, which are used to validate the login process.

Features:
1. MaxLoginAttemptsExceededException: This exception is thrown when the user exceeds the maximum number of login attempts (3 attempts in this case).
2. InvalidPasswordException: This exception is thrown when the user enters an invalid password.
Note: The correct password for the login process is "password".

Code Overview:
1. Main.java: Contains the main method to test the login process using a scanner for user input.
2. LoginProcess.java: Implements the login process and handles custom exceptions.
3. MaxLoginAttemptsExceededException.java: Defines the custom exception for exceeding the maximum login attempts.
4. InvalidPasswordException.java: Defines the custom exception for an invalid password.
How to Use:
1. Clone or download the repository.
2. Compile the Java files using javac Main.java LoginProcess.java MaxLoginAttemptsExceededException.java InvalidPasswordException.java.
3. Run the compiled program using java Main.
4. Follow the prompts to input the password. The user has three attempts before the process ends.


Example output: 
Enter your password: wrongpassword
Invalid password. Please try again.
Enter your password: wrongpassword
Invalid password. Please try again.
Enter your password: wrongpassword
Maximum login attempts (3) exceeded after 3 attempts
