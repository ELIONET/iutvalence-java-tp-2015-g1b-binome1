package fr.iutvalence.moturf.motus;

/* TODO Remove this class. */
public class Test {
    public static void main(String[] args) {

        String[][] arr = {{"|", "2", "1", "|", "1"}, {"|", "2", "1", "|", "1"}, {"|", "2", "1", "|", "1"}, {"|", "2", "1", "|", "1"}, {"|", "2", "1", "|", "1"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
