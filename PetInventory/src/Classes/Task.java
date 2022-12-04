package Classes;

public class Task {
    private String name;
    private double price;
    private int id;
   
    
    public Task() {
    }
     /*Task Builder*/
    public Task(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    
    /* getters and setters*/

    public Task(String name2, double price2, long id2) {
    }
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

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
     /* toString overload for Task class*/
    public String toString() {
        return "" + 
                this.id + "|" + this.name + "|" + 
                this.price;
    }
    /*overload of the clone method, to place two objects of the Task class*/
    @Override
    public Task clone(){
        return new Task(this.getName(), this.getPrice(), this.getId()); 
    }
    /*equals method overload, where two tasks are equal if they have the same Id*/
    @Override
    public boolean equals(Object obj) {
     if (!(obj instanceof Task)) return false;
     else{
         Task comp = (Task) obj;
         return this.id == comp.getId();
     }
    }
}
