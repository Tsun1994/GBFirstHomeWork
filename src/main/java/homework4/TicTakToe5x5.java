package homework4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTakToe5x5 {
    private static char [][] map;
    private static final int SIZE = 5;
    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static final int WIN = 4;
    private static Scanner sc;

    public static void main (String[] args){
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            System.out.println();
            if (checkWin(X_DOT)){
                System.out.println("You win");
                break;
            }
            if (checkDraw()){
                System.out.println("Draw");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(O_DOT)){
                System.out.println("You lose");
                break;
            }
            if (checkDraw()){
                System.out.println("Draw");
                break;
            }
            try {
                Thread.sleep((500));
            } catch (InterruptedException ignored){
            }
        }


    }

    private static boolean checkDraw(){
        for (char[] chars : map){
            for (char aChar : chars){
                if (aChar == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean checkWin(char c) {
        int check1 = 0;
        int ch2 = 0;
        int ch3 = 0;
        int ch4 = 0;
        for (int i = 0; i < SIZE; i++) { //были разные варианты, но я уже не знаю как правильно двигаться в этой программе и считать победу
            if ((map[i][0] == c && map[i][1] == c && map[i][2] == c && map [i][3] == c) || (map[i][1] == c && map[i][2] == c && map[i][3] == c && map [i][4] == c)){ // проверка по горизонтали
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) { // проверка по горизонтали
            if ((map[0][i] == c && map[1][i] == c && map[2][i] == c && map [3][i] == c) || (map[1][i] == c && map[2][i] == c && map[3][i] == c && map [4][i] == c)){ // проверка по горизонтали
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c && i == j){ // проверка по диагонали сверху вниз вправо
                    check1++;
                }
            }
        }
        return false;
    }

    private static void computerTurn(){
        int xCoordinate;
        int yCoordinate;
        do {
            Random rand = new Random();
            xCoordinate = rand.nextInt(SIZE);
            yCoordinate = rand.nextInt(SIZE);
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[xCoordinate][yCoordinate] = O_DOT;
    }

    private static void humanTurn(){
        int xCoordinate = -1;
        int yCoordinate = -1;
        do {
            System.out.println("Введите координаты в формате x y");
            if (sc.hasNextInt()){
                xCoordinate = sc.nextInt() - 1;
            }
            if (sc.hasNextInt()) {
                yCoordinate = sc.nextInt() - 1;
            }
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[xCoordinate][yCoordinate] = X_DOT;
    }

    private static boolean isValidCell (int x, int y){
        if (x < 0 || y < 0 || x > map.length -1 || y > map.length - 1) {
            return false;
        }
        return map[x][y] == EMPTY_DOT;
    }

    private static void printMap () {
        for (char[] chars : map){
            for (char aChar : chars){
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }
    private static void initMap () {
        sc = new Scanner(System.in);
        map = new char[SIZE][SIZE];
        for (char [] chars : map){
            Arrays.fill(chars, EMPTY_DOT);
        }
    }
}
