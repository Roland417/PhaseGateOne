import java.util.Scanner;

public class GroceryManagerApp{

    public static void main(String[] args) {
        

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            1. Add items
            2. Remove items
            3. Show all available items
            """);
System.out.println("Enter options:");
        int addItems = scanner.nextInt();

        switch (addItems){
            case 1 -> {
                System.out.println("""
                    1. Add items
                    2. Number of items
                    """);


System.out.println("Enter options:");  
    int removeItems = scanner.nextInt();
    switch (removeItems){
        case 2 -> {
            System.out.println("""
                1. Remove items
                2. Number of items            
                """);
System.out.println("Enter options:");
        int showAllAvailableItems = scanner.nextInt();
        switch (showAllAvailableItems){
            case 3 -> {
             System.out.println("""
               1. Show all available items
               """);


  }
   }
    }
   }              
  }
  }
 }
}
