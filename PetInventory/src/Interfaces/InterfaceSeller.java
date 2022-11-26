package Interfaces;

import Classes.Client;
import Classes.Purchase;
import Classes.Data;
import Classes.TaskOrder;
import Classes.PetInventory;
import Classes.Product;
import Classes.Task;
import java.util.ArrayList;

public interface InterfaceSeller {

    /**Register a customer by adding him to the pet Inventory vector.
     * @return Sucess: Client. failure: null.
     */
    default Client registerClient(PetInventory petInventory, String name, String typeAnimal, String petName, String address, int phone, int cpf) {
        /*creating a new customer according to the information passed by reference*/
        Client client = new Client(name, typeAnimal, petName, address, phone, cpf);
        if (petInventory.getClients().contains(client)) {
            return null;
        }
        /*adding the customer in the Clients vector*/
        petInventory.getClientes().add(client);
        return client;
    }

     /**
     * Search for a product already registered
     * @return Sucess: Product. failure: null.
     */
    default product searchProduct(PetInventory petInventory, int id) {
        for (Product products : petInventory.getProducts()) {
            if (products.getId() == id) {
                return products;
            } 
        }
        return null;
    }
    
    /*make the list of products*/
    default void listProduct(PetInventory petInventory) {
        /*travel through the product vector and then prints*/
        for (Product products : petInventory.getProducts()) {
            System.out.println(products.toString());
        }
    }
    
    /*search for a certain service and returns it through the function*/
    default Task searchTask(PetInventory petInventory, int id) {
        /*traverses the vector and makes comparisons through the if*/
        for (Task tasks : petInventory.getTask()) {
            if (tasks.getId() == id) {
                return tasks;
            }
        }
        return null;
    }
    
    /*performs the listing of all services*/
    default void listTask(PetInventory petInventory) {
        /*traverses the services vector and prints the data*/
        for (Task tasks : petInventory.getTask()) {
            System.out.println(tasks.toString());
        }
    }

    /*method responsible for carrying out the sale of a given service*/
    default void saleTask(PetShop petshop, Cliente cliente, Servico servico, Data dataServico) {
        int id = 0;
        //If the array is not empty, we move on to the next id
        if (!petInventory.getTaskOrder().isEmpty()) {
            id = petInventory.getTaskOrder().get(petInventory.getTaskOrder().size() - 1).getId() + 1;
        }
        //we create the task order using the information present in the vector
        TaskOrder taskOrder = new TaskOrder(task, client, dataTask, id, "");
        //we added the task order in the pet Inventory orders vector
        petInventory.getTaskOrder().add(taskOrder);
    }
    
    /*method responsible for carrying out the sale of a particular product*/
    default void saleProduct(PetInventory petInventory, Client client, ArrayList<Product> shoppingBag) {

        String saleDescription = "";
        double preco = 0.0;
        //scroll through the product list
        for (product product : shoppingBag) {
            saleDescription += product.getQuantify() + "x " + product.getName() + " (R$ " + product.getPrice() + " each)";
            if (product.getId() != shoppingBag.get(shoppingBag.size() - 1).getId()) {
                saleDescription += ", ";
            }

            price += product.getPrice() * product.getQuantify();
            //make the sale happen
            for (Product productInventory : petInventory.getProduct()) {
                if (product.equals(productInventory)) {
                    productInventory.setQuantify(productInventory.getQuantify() - product.getQuantify());
                    if (productInventory.getQuantify() < 0) {
                        productInventory.setQuantify(0);
                    }
                }
            }
        }
        //create a new purchase with the information above
        Purchase sale = new Purchase(descriptionPurchase, price);
        //make the payment
        sale.pay();
        //add sale in petInventory sales vector
        petInventory.getSales().add(sale);
        //check if the client exists
        for (Client clients : petInventory.getClients()) {
            if (client.equals(clients)) {
                client.getPurchases().add(sale);
            }
        }
    }
}
