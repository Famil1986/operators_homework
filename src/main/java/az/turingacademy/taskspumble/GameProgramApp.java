package az.turingacademy.taskspumble;

import java.util.Random;
import java.util.Scanner;

public class GameProgramApp {

        public static void main(String[] args) {

                Random random = new Random();
                Scanner scanner = new Scanner(System.in);

                int targetNumber = random.nextInt(1001);

                System.out.println("Let the game begin!");

                System.out.print("Please enter your name: ");
                String name = scanner.nextLine();

                int[] guesses = new int[1000];
                int attempts = 0;

                while (true) {
                    int userGuess = 0;

                    while (true) {
                        System.out.print("Enter your guess: ");
                        if (scanner.hasNextInt()) {
                            userGuess = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.next();
                        }
                    }

                    guesses[attempts++] = userGuess;

                    if (userGuess < targetNumber) {
                        System.out.println("Your number is too small. Try again.");
                    } else if (userGuess > targetNumber) {
                        System.out.println("Your number is too big. Try again.");
                    } else {
                        System.out.println("Congratulations, " + name + "!");
                        break;
                    }
                }

                System.out.print("Your numbers are: ");
                int[] enteredNumbers = new int[attempts];
                System.arraycopy(guesses, 0, enteredNumbers, 0, attempts);
                sortDescending(enteredNumbers);

                for (int num : enteredNumbers) {
                    System.out.print(num + " ");
                }
                System.out.println();

                scanner.close();
            }

            public static void sortDescending(int[] array) {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] < array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }

