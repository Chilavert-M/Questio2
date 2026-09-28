public abstract class Console implements  IConsole {

    //Declarations
    private String consoleType;
    private String store;
    private int totalSales;

    //Constructor
    public Console(String consoleType, String storeName, int totalSales){
        this.consoleType = consoleType;
        this.store = storeName;
        this.totalSales = totalSales;
    }

    //Getters
    @Override
    public String getConsoleType(){
        return this.consoleType;
    }

    @Override
    public String getStore(){
        return this.store;
    }

    @Override
    public int getTotalSales(){
        return this.totalSales;
    }
}
