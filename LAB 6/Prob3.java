class ElectricityBill {
    int consumerNo;
    String consumerName;
    int previousReading;
    int currentReading;
    String connectionType;

    // Constructor
    public ElectricityBill(int consumerNo, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public void displayBillDetails() {
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousReading);
        System.out.println("Current Month Reading: " + currentReading);
        System.out.println("EB Connection Type: " + connectionType);
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(12345, "John Doe", 500, 700, "Domestic");
        bill.displayBillDetails();
    }
}