package Classes;

import Interfaces.InterfaceVet;

/*creating the vet class and making it inherit data from the user class*/

public class Vet extends User implements InterfaceVet {

    /*creating the vet constructor*/ 
    public Vet(PetInventory petInventory, String name,  String user, String password, double salary) {
        super(petInventory, name, TypeRole.VET, user, password, salary);
    }
}
