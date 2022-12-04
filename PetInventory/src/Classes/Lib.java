package Classes;

import java.util.ArrayList;

public class Lib {
    final int M = 51;
    final int MD10 = 501;
    /**
 * Conduct manual tests to verify functionality
 * @return petInventory - PetInventory with test values
 */
    public static PetInventory tests(){
        PetInventory petInventory = new PetInventory("Puppy cat");
        Admin admin = new Admin(petInventory, "Lore", "admin", "admin", 5000.0);
        Vet vet = new Vet(petInventory, "Alice", "vet", "vet", 3000.0);
        Seller seller = new Seller(petInventory, "Patrick", "seller", "seller", 3000.0);
        ArrayList<User> users = new ArrayList<>();
        users.add(admin);
        users.add(vet);
        users.add(seller);
        petInventory.setUser(users);
        
        //petInventory.login("admin", "admin");
        
        Client client = new Client("Bella", "Cat", "Simba", "Streat 450", 2133321, 577415);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client);
        petInventory.setClient(clients);
        
        petInventory.getBill().add(new Bill("water bill", new Data(11, 12, 2021), new Data(10, 12, 2021), 33.3));
        petInventory.getBill().add(new Bill("light bill", new Data(25, 12, 2021), new Data(22, 12, 2021), 555));

        petInventory.getPurchase().add(new Purchase("sticking plaster", new Data(25, 12, 2021), 35.9));
        petInventory.getPurchase().add(new Purchase("tool z ", new Data(12, 12, 2021), 769));

        petInventory.getProduct().add(new Product("portion", 15, 55, 1));
        petInventory.getProduct().add(new Product("medicine", 5, 56, 2));
        
        petInventory.getClient().add(new Client("John", "Dog", "Rex", "Streat LA", 9999, 111));
        Client client1 = new Client("Marienne", "Cat", "Kiara", "Streat San Francisco", 122623, 123);
        petInventory.getClient().add(client1); 
                
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("bath", 100, 100));
        tasks.add(new Task("Query", 100, 0));
        petInventory.setTask(tasks);
        
        petInventory.getTaskOrder().add(new TaskOrder(new Task("Query", 50.0, 0), client, new Data(12, 12, 2021), 0, ""));
        petInventory.getTaskOrder().add(new TaskOrder(new Task("bath", 100.0, 1), client1, new Data(13, 7, 2021), 1, ""));
        petInventory.getTaskOrder().add(new TaskOrder(new Task("shave", 150.0, 2), petInventory.getClient().get(1), new Data(20, 8, 2021), 2, ""));
    
        return petInventory;
    }
}