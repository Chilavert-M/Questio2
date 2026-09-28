class ConsoleSales extends Console {

    //Constructor
    public ConsoleSales(String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }

    //Print out console sales report
    public void printConsoleSalesReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*****************************");

        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE NUMBER: "  + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
