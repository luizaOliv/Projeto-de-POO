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
        purchase.pay();
        //add the purchase to the purchase vector
        petInventory.getPurchase().add(purchase);
        //traverse the array of products
        for(Product products : petInventory.getProduct()){
            // checks if the product added by reference is equal to some vector product
            if(products == product){ 
                products.setQuantify(products.getQuantify() + quantity);
                if(products.getQuantify() < 0){
                    products.setQuantify(0);
                }
            }
        }
    }

    /*method that realizes the register of the vet*/
    public boolean registerVet(String name, String user, String password, double salary){
        //create a new vet using the data passed by reference
        Vet vet = new Vet(petInventory, name,  user, password, salary);
        //check if there is a user with this data
        if(petInventory.getUser().contains(vet)){
            return false;
        }
        
        petInventory.getUser().add(vet);
        return true;
    }

    /*method that realizes the register of the seller*/
    public boolean registerSeller(String name, String user, String password, double salary){
        //create a new seller using the data passed by reference
        Seller seller = new Seller(petInventory, name, user, password, salary);
       //check if there is a user with this data
        if(petInventory.getUser().contains(seller)){
            return false;
        }
       
        petInventory.getUser().add(seller);
        return true;
    }

    /*method that realizes register a product*/
    public boolean registerProduct(String name, double price, int quantify, long id){
        //create a new product using the data passed by reference
        Product product = new Product(name, price, quantify, id);
        //check if there is any product with this data
        if(petInventory.getProduct().contains(product)){
            return false;
        }
        
        petInventory.getProduct().add(product);
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
        if(petInventory.getBill().contains(bill)){
            return false;
        }
    
        petInventory.getBill().add(bill);
        return true;
    }

    /*method that realizes the  purchase equipment*/
    public void buyEquipment(String equipment, double price, int quantity){
        //instantiate an object's data
        Purchase purchase = new Purchase(equipment, price);
        //make the purchase payment
        purchase.pay();
        //add to purchases vector
        petInventory.getPurchase().add(purchase);
    }

    /*lists all employees registered in the system*/
    public void listEmployees(){
        //traverses the vector of users and lists the information
        for (int i=0; i<this.petInventory.getUser().size() -1; i++){
            JOptionPane.showMessageDialog(null,"Employees" + this.petInventory.getUser().get(i));
        }
    }
    
    /*lists the data*/
    public ArrayList<Bill> listBills(){
        return this.petInventory.getBill();
    }
    
    /*lists the data*/
    public ArrayList<Purchase> listPurchase(){
        return this.petInventory.getPurchase();
    }
    
    /*lists the data*/
    public ArrayList<Purchase> listSales(){
        return this.petInventory.getSale();
    }

    /*lists the data */
    public ArrayList<TaskOrder> listOrderTask(){
        return this.petInventory.getTaskOrder();
    }

}