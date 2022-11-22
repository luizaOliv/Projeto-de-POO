package Interfaces;

public interface InterfaceVet {

    //method that registers treatment
    default boolean registrarTratamento(PetInventory petInventory, TaskOrders order, String treatment) {
        if(order == null) return false;
        boolean success = false;
        Iterator<TaskOrders> itr = petInventory.getTaskOrders().iterator();
        while (itr.hasNext()) {
            TaskOrders obj = itr.next();
            //remove this task order from the task order vector
            if (obj.getId() == order.getId()) {
                itr.remove();
                success = true;
            }
        }        
        if (success) {
        //add note to order
            order.setNote(treatment);
            //add this order to the history vector
            petInventory.getTaskHistory().add(order);
        }
        return success;
    }

    //method that allows the search for a task order
    default TaskOrders searchTaskOrders(PetInventory petInventory, long id) {
        //receive task orders
        Iterator<TaskOrders> itr = petInventory.getTaskOrders().iterator();
        while (itr.hasNext()) {
            TaskOrders obj = itr.next();
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
        //traverses the vector that stores all clientes
        for (Client client : petInventory.getClients()) {
            System.out.println(client);
        }
    }
    
    //list task order
    default ArrayList<TaskOrders> listTaskOrders(PetInventory petInventory){
        //returns the vector that contains the task orders
        return PetInventory.getTaskOrders();
    }

}