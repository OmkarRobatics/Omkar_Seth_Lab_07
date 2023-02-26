public class Task_5 {
    public static void main(String[] args) {
        // var declarations
        final int ROW = 5;

        for (int row = 0; row < ROW; row++) // outer for loops that prints the row
        {
            for(int col = 0; col <= row; col++) // inner for loop that prints the column
            {
                System.out.printf("*"); // outputs asterisks
            }
            System.out.println(""); // empty output to print asterisks on different lines
           }
}}
