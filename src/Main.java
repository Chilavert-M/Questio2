import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

void main() {
    Scanner scanner = new Scanner(System.in);

    //Declarations
    String store;
    int totalSales;
    String consoleType;


    System.out.println("Select the beverage type(PS5, XBOX, SWITCH): ");
    System.out.println("1) PS5");
    System.out.println("2) XBOX");
    System.out.println("3) SWITCH");
    System.out.print("Enter a choice from 1-3: ");

    String consoleType;


    int choice = scanner.nextInt();
    scanner.nextLine();
    switch(choice){
        case 1:
            consoleType = "PS5";
            break;
        case 2:
            consoleType = "XBOX";
            break;
        case 3:
            consoleType = "SWITCH";
            break;
    }

    System.out.print("Enter the store: ");
    store = scanner.nextLine();

    System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
    totalSales = scanner.nextInt();

    ConsoleSales consoleSales = new ConsoleSales(consoleType, store, totalSales);
    consoleSales.printConsoleSalesReport();
}

