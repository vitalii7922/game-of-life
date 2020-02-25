package life;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random;

        int n = scanner.nextInt();
        random = new Random(scanner.nextInt());

        String[][] life = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (random.nextBoolean()) {
                    life[i][j] = "O";
                } else {
                    life[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < life.length; i++) {
            System.out.println(Arrays.toString(life[i]));
        }

        String[][] temp = new String[n][n];
        int i = scanner.nextInt();

        while (i > 0) {
            i--;
            for (int row = 0; row < n; row++) {
                for (int column = 0; column < n; column++) {
                    int aliveNeighbors = 0;

                    if (row != 0 && column != 0) { //1
                        if (life[row - 1][column - 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (row != 0) {
                        if (life[row - 1][column].equals("O")) { //2
                            aliveNeighbors++;
                        }
                    }

                    if (row != 0 && column != n - 1) { //3
                        if (life[row - 1][column + 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (column != 0) {   //4
                        if (life[row][column - 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (column != n - 1) {   //5
                        if (life[row][column + 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (row != n - 1 && column != 0) {
                        if (life[row + 1][column - 1].equals("O")) { //6
                            aliveNeighbors++;
                        }
                    }

                    if (row != n - 1) {
                        if (life[row + 1][column].equals("O")) { //7
                            aliveNeighbors++;
                        }
                    }

                    if (row != n - 1 && column != n - 1) {
                        if (life[row + 1][column + 1].equals("O")) { //8
                            aliveNeighbors++;
                        }
                    }

                    if (row == 0 && column == 0) {  //9
                        if (life[n - 1][n - 1].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[row + 1][n - 1].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[n - 1][column + 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }


                    if (row == 0 && column == n - 1) {  //10
                        if (life[n - 1][0].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[row + 1][0].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[n - 1][column - 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (row == n - 1 && column == 0) {  //11
                        if (life[0][n - 1].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[row - 1][n - 1].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[0][column + 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (row == n - 1 && column == n - 1) {  //12
                        if (life[0][0].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[row - 1][0].equals("O")) {
                            aliveNeighbors++;
                        }

                        if (life[0][n - 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }


                    if (row == 0) { // 13
                        if (life[n - 1][column].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (column == 0) { //14
                        if (life[row][n - 1].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (row == n - 1) { //15
                        if (life[0][column].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (column == n - 1) { //16
                        if (life[row][0].equals("O")) {
                            aliveNeighbors++;
                        }
                    }

                    if (row == 0 && column != 0 && column != n - 1){ //17
                        if (life[n - 1][column - 1].equals("O")){
                            aliveNeighbors++;
                        }

                        if (life[n - 1][column + 1].equals("O")){
                            aliveNeighbors++;
                        }
                    }

                    if (row == n - 1 && column != 0 && column != n - 1){ //18
                        if (life[0][column - 1].equals("O")){
                            aliveNeighbors++;
                        }

                        if (life[0][column + 1].equals("O")){
                            aliveNeighbors++;
                        }
                    }

                    if (column == 0 && row != 0 && row != n - 1){ //19
                        if (life[row - 1][n - 1].equals("O")){
                            aliveNeighbors++;
                        }

                        if (life[row + 1][n - 1].equals("O")){
                            aliveNeighbors++;
                        }
                    }


                    if (column == n - 1 && row != 0 && row != n - 1){ //20
                        if (life[row - 1][0].equals("O")){
                            aliveNeighbors++;
                        }

                        if (life[row + 1][0].equals("O")){
                            aliveNeighbors++;
                        }
                    }

                    if (aliveNeighbors == 2 || aliveNeighbors == 3) { //21
                        temp[row][column] = "O";
                    } else {
                        temp[row][column] = " ";
                    }
                }
             /*   for (int i = 0; i < n; i++) {
                System.arraycopy(temp[i], 0, life[i], 0, temp[i].length);
            }*/
            }
            System.out.println();

            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
            for (int j = 0; j < n; j++) {
                System.arraycopy(temp[j], 0, life[j], 0, temp[j].length);
            }
        }
    }
}
