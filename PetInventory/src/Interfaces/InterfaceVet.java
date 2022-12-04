package Interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import Classes.Client;
import Classes.PetInventory;
import Classes.TaskOrder;

public interface InterfaceVet {

    //method that registers treatment
    default boolean registerTreatment(PetInventory petInventory, TaskOrder order, String treatment) {
        if(order == null) return false;
        boolean success = false;
        Iterator<TaskOrder> itr = petInventory.getTaskOrder().iterator();
        while (itr.hasNext()) {
            TaskOrder obj = itr.next();
            //remove this task order from the task order vector
            if (obj.getId() == order.getId()) {
                itr.remove();
                success = true;
            }
        }        
        if (success) {
        //add note to order
            order.setObservation(treatment);
            //add this order to the history vector
           // petInventory.getTaskHistory().add(order);
        }
        return success;
    }

    //method that allows the search for a task order
    default TaskOrder searchTaskOrders(PetInventory petInventory, long id) {
        //receive task orders
        Iterator<TaskOrder> itr = petInventory.getTaskOrder().iterator();
        while (itr.hasNext()) {
            TaskOrder obj = itr.next();
            //check id to identify if searched order exists
            if (obj.getId() == id) {
                //returns the order found
                return obj;
            }
        }
        return null;
    }

     //method to list clients
     default void listClient(PetInventory petInventory) {
        //traverses the vector that stores all clients
        for (Client client : petInventory.getClient()) {
            System.out.println(client);
        }
    }
    
    //list task order
    default ArrayList<TaskOrder> listTaskOrders(PetInventory petInventory){
        returns the vector that contains the task orders
        return PetInventory.getTaskOrder();
    }

}