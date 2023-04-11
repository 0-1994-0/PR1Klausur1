package at.campus02.iwi.hiking;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();

        a.totalNrObstacles('L');
        a.totalNrObstacles('H');
        a.countObstaclesPerRow(0);
        a.energyNeededInRow(5);
        //a.ableToFinishHiking(10);
    }
}