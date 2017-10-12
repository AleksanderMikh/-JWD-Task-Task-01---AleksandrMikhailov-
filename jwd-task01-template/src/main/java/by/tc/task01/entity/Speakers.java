package by.tc.task01.entity;

public class Speakers extends Appliance{
    String powerConsumption,
            numberOfSpeakers,
            frequencyRange,
            cordLength;

    public Speakers(){}
    public Speakers(String ... args){
        this.powerConsumption = args[0];
        this.numberOfSpeakers = args[1];
        this.frequencyRange = args[2];
        this.cordLength = args[3];
    }

    public String getPowerConsumption(){ return this.powerConsumption; }
    public String getNumberOfSpeakers(){ return this.numberOfSpeakers; }
    public String getFrequencyRange(){ return this.frequencyRange; }
    public String getCordLength(){ return this.cordLength; }

    public void setPowerConsumption(String value){ this.powerConsumption = value; }
    public void setNumberOfSpeakers(String value){ this.numberOfSpeakers = value; }
    public void setFrequencyRange(String value){ this.frequencyRange = value; }
    public void setCordLength(String value){ this.cordLength = value; }

    @Override
    public String toString() {
        return "Speakers : POWER_CONSUMPTION=" + getPowerConsumption() +
                ", NUMBER_OF_SPEAKERS=" + getNumberOfSpeakers() +
                ", FREQUENCY_RANGE=" + getFrequencyRange() +
                ", CORD_LENGTH=" + getCordLength();
    }

    // you may add your own code here
}
