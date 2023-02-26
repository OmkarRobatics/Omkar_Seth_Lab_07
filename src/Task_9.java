public class Task_9 {
    public static void main(String[] args) {
// var declarations
final int COL = 5;
        for (int row = 0; row < 3; row++) // outer loop for row
        {
            for(int col = 0; col < COL; col++) // inner loop for column
            {
                System.out.printf("*"); // prints asterisks
                if(col == 0 )
                {
                    System.out.println("        ");
                }
            }
            System.out.println("");

        }
    }
}
