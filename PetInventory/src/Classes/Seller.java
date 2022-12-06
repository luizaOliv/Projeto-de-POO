package Classes;

import Interfaces.InterfaceSeller;

/*creating the seller class and making it inherit data from the user class*/

public class Seller extends User implements InterfaceSeller  {

   /*creating the seller constructor*/ 

   public Seller(PetInventory petInventory, String name, String user, String password, double salary) {
        super(petInventory, name, TypeRole.SELLER, user, password, salary);
    }
}
