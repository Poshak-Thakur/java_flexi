import java.util.Scanner;

public class TicTacToe {
    static String[] board = new String[9];
    static String turn = "X";

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = "";
            if (a == 0) line = board[0] + board[1] + board[2];
            else if (a == 1) line = board[3] + board[4] + board[5];
            else if (a == 2) line = board[6] + board[7] + board[8];
            else if (a == 3) line = board[0] + board[3] + board[6];
            else if (a == 4) line = board[1] + board[4] + board[7];
            else if (a == 5) line = board[2] + board[5] + board[8];
            else if (a == 6) line = board[0] + board[4] + board[8];
            else if (a == 7) line = board[2] + board[4] + board[6];

            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        printBoard();
        String winner = null;

        for (int i = 0; i < 9; i++) {
            if (turn.equals("X")) {
                System.out.print("Enter a slot number to place X in: ");
            } else {
                System.out.print("Now, O's turn, Enter a slot number to place O in: ");
            }

            int input = scanner.nextInt();

            if (input > 0 && input <= 9) {
                if (!board[input - 1].equals("X") && !board[input - 1].equals("O")) {
                    board[input - 1] = turn;
                    
                    if (turn.equals("X")) {
                        turn = "O";
                    } else {
                        turn = "X";
                    }
                    
                    printBoard();
                    winner = checkWinner();
                    
                    if (winner != null) {
                        System.out.println(winner + " wins!");
                        break;
                    }
                } else {
                    System.out.println("Slot already taken. Try again.");
                    i--;
                }
            } else {
                System.out.println("Invalid input. Enter a number between 1 and 9.");
                i--;
            }
        }

        if (winner == null) {
            System.out.println("The game ended in a draw.");
        }
        
        scanner.close();
    }
}