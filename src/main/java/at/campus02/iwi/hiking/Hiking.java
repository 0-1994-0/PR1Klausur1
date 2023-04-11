package at.campus02.iwi.hiking;

import java.lang.reflect.Array;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType) {
        int counterO = 0;
        int counterL = 0;

        for (int i = 0; i < environment.length; i++) {

            for (int j = 0; j < environment[i].length; j++) {
                enemyType = environment[i][j];


                if (enemyType == 'H') {
                    counterO++;
                }
                if (enemyType == 'L') {
                    counterL++;
                }
            }
        }

        System.out.println(counterO);
        System.out.println(counterL);
        return 0; // TODO IMPLEMENT ME
    }

    public int[] countObstaclesPerRow(int row) {
        int counterL = 0;
        int counterO = 0;


        for (int j = 0; j < environment[row].length; j++) {

            if (environment[row][j] == 'H') {
                counterO++;
                break;
            }
            if (environment[row][j] == 'L') {
                counterL++;
                break;
            }
        }
        int ruckgabewert[] = {counterO, counterL};
        System.out.println(ruckgabewert[0] + " und " + ruckgabewert[1]);
        //System.out.println();
        return ruckgabewert; // TODO IMPLEMENT ME
    }

    public int energyNeededInRow(int row) {
        int point = 0;


        for (int i = 0; i < environment[row].length; i++) {

            if (environment[row][i] == 'H') {
                point = point + 2;
                //System.out.println(point);
            }

            if (environment[row][i] == 'L') {
                point--;
                //System.out.println(point);
                // TODO IMPLEMENT ME
            }
        }
        System.out.println(point);
        return point;
    }

    public int ableToFinishHiking(int points) {
        int count = 0;


        for (int i = 0; i < environment.length; i++) {
            int energy = energyNeededInRow(i);
            if (energy != 1 && points > 0) {
                count++;
            }
        }
        return count;
    }
}


