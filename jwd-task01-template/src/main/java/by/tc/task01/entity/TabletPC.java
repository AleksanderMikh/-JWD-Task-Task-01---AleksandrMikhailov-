package by.tc.task01.entity;

public class TabletPC extends Appliance{
    String battaryCapacity,
            displayInches,
            memoryROM,
            flashMemoryCapacity,
            color;

    public TabletPC(){}
    public TabletPC(String ... args){
        this.battaryCapacity = args[0];
        this.displayInches = args[1];
        this.memoryROM = args[2];
        this.flashMemoryCapacity = args[3];
        this.color = args[4];
    }

    public String getBattaryCapacity(){ return this.battaryCapacity; }
    public String getDisplayInches(){ return this.displayInches; }
    public String getMemoryROM(){ return this.memoryROM; }
    public String getFlashMemoryCapacity(){ return this.flashMemoryCapacity; }
    public String getColor(){ return this.color; }

    public void setBattaryCapacity(String value){ this.battaryCapacity = value; }
    public void setDisplayInches(String value){ this.displayInches = value; }
    public void setMemoryROM(String value){ this.memoryROM = value; }
    public void setFlashMemoryCapacity(String value){ this.flashMemoryCapacity = value; }
    public void setColor(String value){ this.color = value; }

    @Override
    public String toString() {
        return "TabletPC : BATTERY_CAPACITY=" + getBattaryCapacity() +
                ", DISPLAY_INCHES=" + getDisplayInches() +
                ", MEMORY_ROM=" + getMemoryROM() +
                ", FLASH_MEMORY_CAPACITY=" + getFlashMemoryCapacity() +
                ", COLOR=" + getColor();
    }

    // you may add your own code here
}
