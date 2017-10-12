package by.tc.task01.entity;

public class Laptop extends Appliance{
    private String batteryCapacity,
            os,
            memoryROM,
            systemMemory,
            CPU,
            displayInchs;
    public Laptop(){};
    public Laptop(String...args){
        this.batteryCapacity = args[0];
        this.os = args[1];
        this.memoryROM = args[2];
        this.systemMemory = args[3];
        this.CPU = args[4];
        this.displayInchs = args[5];
    }
    public void setBatteryCapacity(String value){
        this.batteryCapacity = value;
    }
    public void setOs(String value){
        this.os = value;
    }
    public void setMemoryROM(String value){
        this.memoryROM = value;
    }
    public void setSystemMemory(String value) {
        this.systemMemory = value;
    }
    public void setCPU(String value){
        this.CPU = value;
    }
    public void setDisplayInchs(String value){
        this.displayInchs = value;
    }

    public String getBatteryCapacity(){
        return this.batteryCapacity;
    }
    public String getOs(){
        return this.os;
    }
    public String getMemoryROM(){
        return this.memoryROM;
    }
    public String getSystemMemory(){
        return this.systemMemory;
    }
    public String getCPU(){
        return this.CPU;
    }
    public String getDisplayInchs(){
        return this.displayInchs;
    }

    @Override
    public String toString() {
        return "Laptop : BATTERY_CAPACITY=" + getBatteryCapacity()+
                ", OS=" + getOs() +
                ", MEMORY_ROM=" + getMemoryROM()  +
                ", SYSTEM_MEMORY=" + getSystemMemory() +
                ", CPU=" + getCPU() +
                ", DISPLAY_INCHS="+ getDisplayInchs();
    }

    // you may add your own code here
}
