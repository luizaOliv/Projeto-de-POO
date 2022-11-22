package Classes;

import Interfaces.InterfaceSeller;
import Interfaces.InterfaceVet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Admin extends User implements InterfaceSeller, InterfaceVet {
    
    /*class constructor*/
    public Admin(PetInventory petInventory, String name, String user, String password, double salary){
        super(petInventory, name, TypeRole.ADMIN, user, password, salary);
    
    }

    /*method that performs stock replenishment*/
    public void stockReplenishment( Product product, int quantity, String description, double price){
        //create a new purchase
        Purchase purchase = new Purchase(description, price);
        // make the purchase payment
        purchase.buy();
        //add the purchase to the purchase vector
        petInventory.getPurchases().add(purchase);
        //traverse the array of products
        for(Product products : petInventory.getProducts()){
            // checks if the product added by reference is equal to some vector product
            if(products == product){ 
                products.setQuantity(products.getQuantity() + quantity);
                if(products.getQuantity() < 0){
                    products.setQuantity(0);
                }
            }
        }
    }

    /*method that realizes the register of the vet*/
    public boolean registerVet(String name, String user, String password, double salary){
        //create a new vet using the data passed by reference
        Vet vet = new Vet(petInventory, name,  user, password, salary);
        //check if there is a user with this data
        if(petInventory.getUsers().contains(vet)){
            return false;
        }
        
        petInventory.getUsers().add(vet);
        return true;
    }

    /*method that realizes the register of the seller*/
    public boolean registerSeller(String name, String user, String password, double salary){
        //create a new seller using the data passed by reference
        Seller seller = new Seller(petInventory, name, user, password, salary);
       //check if there is a user with this data
        if(petInventory.getUsers().contains(seller)){
            return false;
        }
       
        petInventory.getUsers().add(seller);
        return true;
    }

    /*method that realizes register a product*/
    public boolean registerProduct(String name, double price, int quantity, long id){
        //create a new product using the data passed by reference
        Product product = new Product(name, price, quantity, id);
        //check if there is any product with this data
        if(petInventory.getProducts().contains(product)){
            return false;
        }
        
        petInventory.getProducts().add(products);
        return true;
    }

    /*method that realizes the register of some service*/
    public boolean registerTask(String name, double price, long id){
        //create a new order task for the data passed by reference
        Task task = new Task(name, price, id);
        //check if there is a task with this data
        if(petInventory.getTask().contains(task)){
            return false;
        }
       
        petInventory.getTask().add(task);
        return true;
    }

    /*method that realizes the payment of bills*/
    public boolean payBill(String description, Data expirationDate, double value){
        //create a new bill
        Bill bill = new Bill(description, expirationDate, value);
        //make the bill payment
        bill.pay();
        //checks the data to see if there is any bill with this data
        if(petInventory.getBills().contains(bill)){
            return false;
        }
    
        petInventory.getBills().add(bill);
        return true;
    }

    /*method that realizes the  purchase equipment*/
    public void buyEquipment(String equipment, double price, int quantity){
        //instantiate an object's data
        Purchase purchase = new Purchase(equipment, price);
        //make the purchase payment
        purchase.pay();
        //add to purchases vector
        petInventory.getPurchases().add(purchase);
    }

    /*lists all employees registered in the system*/
    public void listEmployees(){
        //traverses the vector of users and lists the information
        for (int i=0; i<this.petInventory.getUsers().size() -1; i++){
            JOptionPane.showMessageDialog(null,"Employees" + this.petInventory.getUsers().get(i));
        }
    }
    
    /*lists the data*/
    public ArrayList<Bill> listBills(){
        return this.petInventory.getBills();
    }
    
    /*lists the data*/
    public ArrayList<Purchase> listPurchase(){
        return this.petInventory.getPurchases();
    }
    
    /*lists the data*/
    public ArrayList<Purchase> listSales(){
        return this.petInventory.getSales();
    }

    /*lists the data */
    public ArrayList<OrderTask> listOrderTasks(){
        return this.petInventory.getOrderTasks();
    }

}