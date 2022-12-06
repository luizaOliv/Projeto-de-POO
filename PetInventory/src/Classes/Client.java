package Classes;

import java.util.ArrayList;


public class Client {
    private String name;
    private String typeAnimal;
    private String petName;
    private String address;
    private int phone;
    private int cpf;
    ArrayList<Purchase> purchases;
    
    

    public Client() {
        this.name = "Desconhecido";
        this.typeAnimal = "-";
        this.petName = "-";
        this.address = "-";
        this.phone = -1;
        this.cpf = -1;
        this.purchases = new ArrayList<>();
    }
    /*Client Builder*/
    public Client(String name, String typeAnimal, String petName, String address, long phone2, long cpf2) {
        this.name = name;
        this.typeAnimal = typeAnimal;
        this.petName = petName;
        this.address = address;
        this.phone = (int) phone2;
        this.cpf = (int) cpf2;
        this.purchases = new ArrayList<>();
    }            
    // getters and setters
    public String getName() {
        return name;
    }

    
    public void setNome(String name) {
        this.name = name;
    }

    
    public String getTypeAnimal() {
        return typeAnimal;
    }

   
    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    
    public String getPetName() {
        return petName;
    }

    
    public void setPetName(String petName) {
        this.petName = petName;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

   
    public int getPhone() {
        return phone;
    }

    
    public void setPhone(int phone) {
        this.phone = phone;
    }

    
    public int getCpf() {
        return cpf;
    }

    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public ArrayList<Purchase> getPurchase() {
        return purchases;
    }

    public void setPurchase(ArrayList<Purchase> purchases) {
        this.purchases = purchases;
    }
    /* toString overload for the Client class*/
    @Override
    public String toString() {
        return "" + this.name + " " + this.cpf + " " +
                this.phone + " " + this.address + " " + 
                " " + this.petName + " " + this.typeAnimal + " ";
     }
    /* take a printout of a clients purchase data*/
    public String getPurchaseDate(){
        for(Purchase comp: this.purchases)
           return comp.toString();
        
        return " ";
    }
    /*clone method overload, to clone two objects of the Client class*/
    @Override
    public Client clone(){
         return new Client(this.name, this.typeAnimal, 
                 this.petName, this.address, this.phone, this.cpf);
         
    }
    /*Overloading of the equals method, where two clients are equal if they have the same CPF*/
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Client))return false;
        Client comp = (Client) obj;
        return this.cpf == comp.getCpf();
    }
    
}
