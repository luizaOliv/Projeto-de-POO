package Classes;


import java.util.ArrayList;
import Screens.ScreenSellerMenu;
import Screens.ScreenAdminMenu;
import Screens.ScreenVetMenu;
import java.util.Stack;
import javax.swing.JFrame;


public class PetInventory {

    private String name;
    private User currentLogin;
    private ArrayList<User> users;
    private ArrayList<Client> clients;
    private ArrayList<Bill> bills;
    private ArrayList<Product> products;
    private ArrayList<Task> tasks;
    private ArrayList<TaskOrder> taskOrder;
    private ArrayList<TaskOrder> taskhistory;
    private ArrayList<Purchase> purchases;
    private ArrayList<Sale> sales;
    private Stack<JFrame> screenHistory;

    public PetInventory(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.bills = new ArrayList<>();
        this.products = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.taskOrder = new ArrayList<>();
        this.taskhistory = new ArrayList<>();
        this.purchases = new ArrayList<>();
        this.sales = new ArrayList<>();
        this.screenHistory = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUser() {
        return users;
    }

    public void setUser(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Client> getClient() {
        return clients;
    }

    public void setClient(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Bill> getBill() {
        return bills;
    }

    public void setBill(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void setProduct(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Task> getTask() {
        return tasks;
    }

    public void setTask(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<TaskOrder> getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(ArrayList<TaskOrder> taskOrder) {
        this.taskOrder = taskOrder;
    }

    public ArrayList<TaskOrder> getTaskOrder() {
        return taskhistory;
    }

    public void setTaskOrder(ArrayList<OrdemServico> taskhistory) {
        this.taskhistory = taskhistory;
    }

    public ArrayList<Purchase> getPurchase() {
        return purchases;
    }

    public void setPurchase(ArrayList<Purchase> purchases) {
        this.purchases = purchases;
    }

    public ArrayList<Sale> getSale() {
        return sales;
    }

    public void setSale(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public User getCurrentLogin() {
        return this.currentLogin;
    }

    public boolean login(String user, String password) {
        for (User item : this.users) {
            if (item.getUser().equals(user) && item.getPassword().equals(password)) {
                this.currentLogin = item;

                switch (item.getRole()) {
                    case SELLER: {
                        goFor(new ScreenSellerMenu(this));
                        break;
                    }
                    case VET: {
                        goFor(new ScreenVetMenu(this));
                        break;
                    }
                    case ADMIN: {
                        goFor(new ScreenAdminMenu(this));
                        break;
                    }

                }
                return true;
            }
        }
        return false;
    }

    void logOut() {
        // call method to save information to file
    }

    public void goFor(JFrame next) {
        if (!this.screenHistory.empty()) {
            
            this.screenHistory.lastElement().setVisible(false);
        }
        next.setVisible(true);
        this.screenHistory.push(next);
    }

    public void back() {
        this.screenHistory.pop().setVisible(false);
        if (this.screenHistory.empty()) {
            return;
        }
        this.screenHistory.lastElement().setVisible(true);
    }
}
