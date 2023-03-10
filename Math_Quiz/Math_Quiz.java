
//importing Scanner class
import java.util.Scanner;

public class Math_Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // an infinite loop
        while (true) {
            System.out.println("Choose your prefered Math Quiz.");
            System.out.println("1. Guess the number\n2. Subtraction Quiz\n3. Addition Quiz\n4. Multiplication Quiz");
            System.out.println("quit by entering any key different from the option above");
            int choice = input.nextInt();

            // allowing user to choose quiz option
            switch (choice) {
                case 1:
                    System.out.println("===> GUESS THE NUMBER <===");

                    while (true) {
                        System.out.println("You have three attempts to guess the number between 1 - 20.");
                        int num = (int) (Math.random() * 20 + 1);
                        int value;

                        // a costraint to give user three attempts
                        for (int i = 1; i <= 3; i++) {
                            value = input.nextInt();
                            if (num == value) {
                                System.out.println("Correct! " + value + " is the number.");
                                break;
                            }

                            // giving user a clue if answer is wrong and stating remaining attempts
                            else {
                                if (num > value) {
                                    System.out.println("Your value is too small.");
                                } else {
                                    System.out.println("Your value is too high.");
                                }
                                System.out.println("You have " + (3 - i) + " attempt.");
                            }
                        }

                        // asking user to play again
                        System.out.println("Enter 1 to continue and 2 to quit.");
                        choice = input.nextInt();
                        if (choice == 1) {
                            continue;
                        } else if (choice == 2) {
                            break;
                        } else {
                            System.out.println("Enter 1 to continue and 2 to quit!");
                        }

                    }

                    continue;
                case 2:
                    System.out.println("===> Substraction of Numbers <===");

                    while (true) {
                        // initializing two random numbers
                        int number1 = (int) (Math.random() * 100 + 1);
                        int number2 = (int) (Math.random() * 100 + 1);
                        // swapping numbers if number1 < number2
                        if (number1 < number2) {
                            int temp = number1;
                            number1 = number2;
                            number2 = temp;
                        }
                        // quiz the user
                        System.out.println("What is " + number1 + " - " + number2 + "?");
                        int answer = input.nextInt();
                        if (number1 - number2 == answer) {
                            System.out.println("That's correct!");
                        } else {
                            System.out.println("Your answer is wrong.");
                            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
                        }

                        // opt to quit or con
                        System.out.println("Enter 1 to continue and 2 to quit.");
                        choice = input.nextInt();
                        if (choice == 1) {
                            continue;
                        } else if (choice == 2) {
                            break;
                        } else {
                            System.out.println("Enter 1 to continue and 2 to quit!");
                        }

                    }

                    continue;
                case 3: // sholud be able to work for three numbers
                    System.out.println("===> Addition of Numbers <===");
                    while (true) {
                        // initializing two random numbers
                        int number1 = (int) (Math.random() * 100 + 1);
                        int number2 = (int) (Math.random() * 100 + 1);

                        // quiz user
                        System.out.println("What is " + number1 + " + " + number2 + "?");
                        int answer = input.nextInt();
                        if (number1 + number2 == answer) {
                            System.out.println("That's correct!");
                        } else {
                            System.out.println("Your answer is wrong.");
                            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
                        }

                        // opt to quit or continue
                        System.out.println("Enter 1 to continue and 2 to quit.");
                        choice = input.nextInt();
                        if (choice == 1) {
                            continue;
                        } else if (choice == 2) {
                            break;
                        } else {
                            System.out.println("Enter 1 to continue and 2 to quit!");
                        }

                    }

                    continue;
                case 4:
                    System.out.println("===> Substraction of Numbers <===");
                    while (true) {
                        // initialize random numbers
                        int number1 = (int) (Math.random() * 100 + 1);
                        int number2 = (int) (Math.random() * 100 + 1);

                        // quiz the user
                        System.out.println("What is " + number1 + " * " + number2 + "?");
                        int answer = input.nextInt();
                        if (number1 * number2 == answer) {
                            System.out.println("That's correct!");
                        } else {
                            System.out.println("Your answer is wrong.");
                            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2));
                        }

                        // opt to quit or continue
                        System.out.println("Enter 1 to continue and 2 to quit.");
                        choice = input.nextInt();
                        if (choice == 1) {
                            continue;
                        } else if (choice == 2) {
                            break;
                        } else {
                            System.out.println("Enter 1 to continue and 2 to quit!");
                        }

                    }
                    continue;

                default:
                    break;
            }

            input.close();
        }

    }
}
