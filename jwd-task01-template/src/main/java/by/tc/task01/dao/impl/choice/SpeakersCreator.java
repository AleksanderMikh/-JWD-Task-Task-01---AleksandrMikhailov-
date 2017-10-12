package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements Command {
    @Override
    public Appliance execute(Object[] obj) {

        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(obj[0].toString());
        speakers.setNumberOfSpeakers(obj[1].toString());
        speakers.setFrequencyRange(obj[2].toString());
        speakers.setCordLength(obj[3].toString());

        return speakers;
    }
}
