package Classes;

import java.util.ArrayList;
import java.util.List;

public class User{
    /* attributes that will be used */
    protected PetInventory petInventory;
    protected String name;
    protected RoleType role;
    protected String user;
    protected String password;
    protected double salary;

    /*class constructor*/
    public User(PetInventory petInventory, String name, RoleType role, String user, String password, double salary) {
        this.petInventory = petInventory;
        this.name = name;
        this.role = role;
        this.user = user;
        this.password = password;
        this.salary = salary;
    }

    /*getters */
    public String getName(){
        return name;
    }

    public RoleType getRole(){
        return role;
    }

    public String getUser(){
        return user;
    }

    public String getPassword(){
        return password;
    }

    public double getSalary(){
        return salary;
    }

    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* method responsible for search a registration of a given customer */
    public Client searchRegistration(Integer cpf){
        //go through the vector of customers containing in the petInventory
        for(Client clients : petInventory.getClients()){
            //performs the comparison through the cpf. if true, returns the client. if false, it returns null.
            if(clients.getCpf() == cpf){
                return clients;
            }
        }

        return null;  
    }

    @Override
    public String toString() {
        return "User{" + "petInventory=" + petInventory + ", name=" + name + ", role=" + role + ", user=" + user + ", password=" + password + ", salary=" + salary + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof User)) return false;
        User shop = (Usuario) obj;
        return this.user.equalsIgnoreCase(shop.getUser());
    }
    

}