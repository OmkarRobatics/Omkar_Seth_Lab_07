public class Task_7 {
    public static void main(String[] args) {
        final int ROW = 5;
        final int COL = 5;

        for (int row = 0; row < ROW; row++) // outer loop for rows
        {
            for(int col = 0; col< COL; col++) // inner loop for columns
            {
                System.out.printf("*"); // outputs asterisks
            }
            System.out.println(""); // empty output to print asterisks on different lines
        }
    }
}
