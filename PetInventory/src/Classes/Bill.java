package Classes;

public class Bill {
   
    private String description;
    private Data dataExpiration;
    private Data dataPay;
    private double value;

    //classe constructor
    public Bill(String description, Data dataExpiration, double value) {
        this.description = description;
        this.dataExpiration = dataExpiration;
        this.value = value;
        this.dataPay = new Data();
    }
    
    public Bill(String description, Data dataExpiration, Data dataPay, double value) {
        this.description = description;
        this.dataExpiration = dataExpiration;
        this.dataPay = dataPay;
        this.value = value;
    }

    //Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Data getDataExpiration() {
        return dataExpiration;
    }

    public void setDataExpiration(Data dataExpiration) {
        this.dataExpiration = dataExpiration;
    }

    public Data getDataPay() {
        return dataPay;
    }

    public void setDataPay(Data dataPay) {
        this.dataPay = dataPay;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //overload method toString
    @Override
    public String toString() {
        return "Bill{" + "description=" + description + ", dataExpiration=" + dataExpiration + ", dataPay=" + dataPay + ", value=" + value + '}';
    }
    
    // method responsible for pay the bill
    public void pay(){
        this.dataPay.now();
    }
    
}
