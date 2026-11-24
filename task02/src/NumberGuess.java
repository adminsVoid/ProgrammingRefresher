int randomNumber = (int) (Math.random() * 100) + 1;
int tries = 0;

void main() {
    while (true) {
        int guess = 0;
        try {
            guess = Integer.parseInt(IO.readln("Guess the number (1 - 100): "));

            if (guess < 1 || guess > 100) {
                throw new IllegalArgumentException("Number is out of range");
            }
        } catch (NumberFormatException a) {
            IO.println("Error: Type only a correct Integer!");
            break;
        } catch (IllegalArgumentException b) {
            IO.println("Error: " + b.getMessage());
            break;
        }
        finally {
            tries++;
        }

        if (guess == randomNumber) {
            if (tries == 1) {
                IO.println("Correct! You guessed it in " + tries + " try!");
                break;
            }
            else if (tries > 1) {
                IO.println("Correct! You guessed it in " + tries + " tries!");
                break;
            }

        } else if (guess > randomNumber) {
            IO.println("Too high!");

        } else if (guess < randomNumber) {
            IO.println("Too low!");

        }

    }
}
