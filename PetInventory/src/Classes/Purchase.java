package Classes;

public class Purchase {
    private String description;
    Data data;
    double price;

    //classe constructor
    public Purchase(String description, double price) {
        this.description = description;
        this.price = price;
        this.data = new Data();
    }    
    
    public Purchase(String description, Data data, double price) {
        this.description = description;
        this.data = data;   
        this.price = price;
    }

    //Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //overload method toString
    @Override
    public String toString() {
        return "Purchase{" + "description=" + description + ", data=" + data + ", price=" + price + '}';
    }
    
    // method responsible for pay the purchase
    public void pay(){
        this.data.now();
    }
    
}