import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        //board
        char[][] gameBoard = {{' ', '|', ' ','|',' '},
                                {'-', '+', '-','+','-'},
                                {' ', '|', ' ','|',' '},
                                {'-', '+', '-','+','-'},
                                {' ', '|', ' ','|',' '}};

        System.out.println("This is the game board: ");
        printGameBoard(gameBoard);

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = in.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("Position Taken! Enter a correct Position");
                playerPos = in.nextInt();
            }

            placePieces(gameBoard, playerPos, "player");

            String result = checkWinner();
            if(!result.isEmpty()) {
                System.out.print(result);
                break;
            }

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = rand.nextInt(9) + 1;
            }
            placePieces(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);

            result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row: gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePieces(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;

            default:
                break;
        }
    }

    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList( 1, 2, 3);
        List<Integer> midRow = Arrays.asList( 4, 5, 6);
        List<Integer> botRow = Arrays.asList( 7, 8, 9);
        List<Integer> leftColumn = Arrays.asList( 1, 4, 7);
        List<Integer> midColumn = Arrays.asList( 2, 5, 8);
        List<Integer> rightColumn = Arrays.asList( 3, 6, 9);
        List<Integer> cross1 = Arrays.asList( 1, 5, 9);
        List<Integer> cross2 = Arrays.asList( 3, 5, 7);

        List<List<Integer>> winningConditions = new ArrayList<>();
            winningConditions.add(topRow);
            winningConditions.add(midRow);
            winningConditions.add(botRow);
            winningConditions.add(leftColumn);
            winningConditions.add(midColumn);
            winningConditions.add(rightColumn);
            winningConditions.add(cross1);
            winningConditions.add(cross2);


            for (List<Integer> l: winningConditions) {
                if (playerPositions.containsAll(l)) {
                    return " Congratulations you won!";
                } else if (cpuPositions.containsAll(l)) {
                    return "CPU wins! Sorry : (";
                }
            }

            if (playerPositions.size() + cpuPositions.size() == 9) {
                return "tie!";
            } return "";
    }

}
