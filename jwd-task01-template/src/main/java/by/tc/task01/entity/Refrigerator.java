package by.tc.task01.entity;

public class Refrigerator extends Appliance{
    String powerConsumption,
    weight,
    freezerCapacity,
    overallCapacity,
    height,
    width;
    public Refrigerator(){}
    public Refrigerator(String ... args){
        this.powerConsumption = args[0];
        this.weight = args[1];
        this.freezerCapacity = args[2];
        this.overallCapacity = args[3];
        this.height = args[4];
        this.width = args[5];
    }

    public String getPowerConsumption(){ return this.powerConsumption; }
    public String getWeight(){ return this.weight; }
    public String getFreezerCapacity(){ return this.freezerCapacity; }
    public String getOverallCapacity(){ return this.overallCapacity; }
    public String getHeight(){ return this.height; }
    public String getWidth(){ return this.width; }

    public void setPowerConsumption(String value){ this.powerConsumption = value; }
    public void setWeight(String value){ this.weight = value; }
    public void setFreezerCapacity(String value){ this.freezerCapacity = value; }
    public void setOverallCapacity(String value){ this.overallCapacity = value; }
    public void setHeight(String value){ this.height = value; }
    public void setWidth(String value){ this.width = value; }

    @Override
    public String toString() {
        return "Refrigerator : POWER_CONSUMPTION=" + getPowerConsumption() +
                ", WEIGHT=" + getWeight() +
                ", FREEZER_CAPACITY=" + getFreezerCapacity() +
                ", OVERALL_CAPACITY=" + getOverallCapacity() +
                ", HEIGHT=" + getHeight() +
                ", WIDTH=" + getWidth();
    }

    // you may add your own code here
}
