public class Task_6 {
    public static void main(String[] args) {
        final int ROW = 5;

        for (int row = 0; row < ROW; row++) // outer loop to print the rows
        {
            for(int col = (ROW-row); col > 0; col--) // inner loop to print the column
            {
                System.out.printf("*"); // outputs asterisk
            }
            System.out.println(""); // empty output to print asterisks on different lines
        }
    }
}
