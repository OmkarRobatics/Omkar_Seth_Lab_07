public class Task_9 {
    public static void main(String[] args) {

final int Row = 2;
        for (int row = 0; row < Row; row++)
        {
            for(int col = 0; col < Row; col++)
            {
                System.out.printf("*");
                if(col == 0 || col == 9)
                {
                    System.out.println("        *");
                }
            }
            System.out.println("");

        }
    }
}
