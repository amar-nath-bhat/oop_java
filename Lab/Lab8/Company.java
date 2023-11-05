package Lab8;

interface MarketItem {
    double calculateTotalSales();
}

class Hardware implements MarketItem {
    private String category;
    private String manufacturer;
    private double[] salesData; 

    public Hardware(String category, String manufacturer, double[] salesData) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.salesData = salesData;
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (double sales : salesData) {
            totalSales += sales;
        }
        return totalSales;
    }
}

class Software implements MarketItem {
    private String type;
    private String operatingSystem;
    private double[] salesData;

    public Software(String type, String operatingSystem, double[] salesData) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.salesData = salesData;
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (double sales : salesData) {
            totalSales += sales;
        }
        return totalSales;
    }
}

public class Company {
    public static void main(String[] args) {

        double[] hardwareSalesData = {10000.0, 12000.0, 8000.0};
        double[] softwareSalesData = {5000.0, 6000.0, 4000.0};

        Hardware hardwareItem = new Hardware("Desktop", "Dell", hardwareSalesData);
        Software softwareItem = new Software("Antivirus", "Windows", softwareSalesData);

        double hardwareTotalSales = hardwareItem.calculateTotalSales();
        double softwareTotalSales = softwareItem.calculateTotalSales();

        System.out.println("Total sales for hardware item: Rs." + hardwareTotalSales);
        System.out.println("Total sales for software item: Rs." + softwareTotalSales);
    }
}
