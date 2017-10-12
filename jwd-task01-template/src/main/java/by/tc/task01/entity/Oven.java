package by.tc.task01.entity;

public class Oven extends Appliance{
   private String powerConsumption,
    weight,
    capacity,
    depth,
    height,
    width;
   public Oven(){};
   public Oven(String...args){
       this.powerConsumption = args[0];
       this.weight = args[1];
       this.capacity = args[2];
       this.depth = args[3];
       this.height = args[4];
       this.width = args[5];
   }
   public void setPowerConsumption(String value) {
       this.powerConsumption = value;
   }
   public void setWeight(String value) {
       this.weight = value;
   }
   public void setCapacity(String value) {
       this.capacity = value;
   }
   public void setDepth(String value) {
       this.depth = value;
   }
   public void setHeight(String value){
        this.height = value;
    }
   public void setWidth(String value){
        this.width = value;
    }

    public String getPowerConsumption(){
        return this.powerConsumption;
    }
    public String getWeight(){
        return this.weight;
    }
    public String getCapacity(){
        return this.capacity;
    }
    public String getDepth(){
        return this.depth;
    }
    public String getHeight(){
        return this.height;
    }
    public String getWidth(){
        return this.width;
    }

    @Override
    public String toString() {
        return "Oven : POWER_CONSUMPTION=" + getPowerConsumption() +
                ", WEIGHT=" + getWeight() +
                ", CAPACITY=" + getCapacity() +
                ", DEPTH=" + getDepth() +
                ", HEIGHT=" + getHeight() +
                ", WIDTH=" + getWidth();
    }

    // you may add your own code here
}
