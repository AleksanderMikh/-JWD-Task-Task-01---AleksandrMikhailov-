package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    String powerConsumption,
            filterType,
            bagType,
            wandType,
            motorSpeedRegulation,
            cleaningWidth;
    public VacuumCleaner(){}
    public VacuumCleaner(String ... args){
        this.powerConsumption = args[0];
        this.filterType = args[1];
        this.bagType = args[2];
        this.wandType = args[3];
        this.motorSpeedRegulation = args[4];
        this.cleaningWidth = args[5];
    }

    public String getPowerConsumption(){ return this.powerConsumption; }
    public String getFilterType(){ return this.filterType; }
    public String getBagType(){ return this.bagType; }
    public String getWandType(){ return this.wandType; }
    public String getMotorSpeedRegulation(){ return this.motorSpeedRegulation; }
    public String getCleaningWidth(){ return this.cleaningWidth; }

    public void setPowerConsumption(String value){ this.powerConsumption = value; }
    public void setFilterType(String value){ this.filterType = value; }
    public void setBagType(String value){ this.bagType = value; }
    public void setWandType(String value){ this.wandType = value; }
    public void setMotorSpeedRegulation(String value){ this.motorSpeedRegulation = value; }
    public void setCleaningWidth(String value){ this.cleaningWidth = value; }

    @Override
    public String toString() {
        return "VacuumCleaner : POWER_CONSUMPTION=" + getPowerConsumption() +
                ", FILTER_TYPE=" + getFilterType() +
                ", BAG_TYPE=" + getBagType() +
                ", WAND_TYPE=" + getWandType() +
                ", MOTOR_SPEED_REGULATION=" + getMotorSpeedRegulation() +
                ", CLEANING_WIDTH=" + getCleaningWidth();
    }

    // you may add your own code here
}
