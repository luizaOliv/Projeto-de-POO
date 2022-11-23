package Classes;

import Interfaces.InterfaceVet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/*creating the vet class and making it inherit data from the user class*/

public class Vet extends User implements InterfaceVet {

    /*creating the vet constructor*/ 
    public Vet(PetInventory petInventory, String name,  String user, String password, double salary) {
        super(petInventory, name, TypeRole.VET, user, password, salary);
    }
}
