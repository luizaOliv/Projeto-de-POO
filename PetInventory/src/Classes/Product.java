package Classes;

public class Product {
    private String name;
    private double price;
    private int quantify;
    private long id;

     /*Product Builder*/
    public Product(String name, double price, int quantify, int id) {
        this.name = name;
        this.price = price;
        this.quantify = quantify;
        this.id = id;
    }
    /* getters e setters*/
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

    
    public int getQuantify() {
        return quantify;
    }

    
    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    
    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }
    /* toString overload for Product class */
    @Override
    public String toString() {
        return "" + 
                this.id + "|" + this.name + "|" + 
                this.price + "|" + this.quantify;
    }
    /*overload of the clone method, to place two objects of the Product class*/
    @Override
    public Product clone(){
        return new Product(this.getName(), this.getPrice(), this.getQuantify(), this.getId()); 
    }
    /*overload of the equals method, where two products are equal if they have the same Id */
    public boolean equals(Object obj) {
        if(!(obj instanceof Product))return false;
        Product prod = (Product) obj;
        return (prod.getId() == this.id);
    }
    
    
    
}