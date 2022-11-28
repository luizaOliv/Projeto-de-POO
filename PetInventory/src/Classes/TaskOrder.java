package Classes;

public class TaskOrder {

    private Task task;
    private Client client;
    private Data data; 
    private long id;
    private String observation; 
     
    
    //classe constructor
    public TaskOrder (Task task, Client client, Data data, long id, String observation) {
        setTask(task);
        setClient(client);
        setData(data);
        setId(id);
        setObservation(observation);
    }
        
    public TaskOrder(){
    }
    
    //Getters and Setters
    public Task getTask (){
        return task;
    }
    
    public Client getClient (){
        return client;
    }
    
    public Data getData() {
        return data;
    }
    
    public String getObservation(){
        return observation;
    }
    
    public long getId(){
        return id;
    }
    
    public void setTask(Task task){
        this.task = task;
    }    
    
    public void setClient (Client client){
        this.client = client;
    }
    
    public void setData(Data data){
        this.data = data;
    }
       
    public void setObservation(String observation{
        this.observation = observation;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    //overload method equals
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TaskOrder)) return false;
     else{
         TaskOrder comp = (TaskOrder) obj;
         return this.id == comp.getId();
     }
    }
                
    @Override
    //overload method toString
    public String toString() {
        return "" + 
                this.data + "|" + this.id + "|" + 
                this.task+ "|" + this.client.getName() 
                + "|" + this.observation;
    }    
}   