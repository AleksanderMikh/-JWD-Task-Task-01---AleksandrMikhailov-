package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenCreator implements Command {
    @Override
    public Appliance execute(Object[] obj){

        Oven oven = new Oven();
        oven.setPowerConsumption(obj[0].toString());
        oven.setWeight(obj[1].toString());
        oven.setCapacity(obj[2].toString());
        oven.setDepth(obj[3].toString());
        oven.setHeight(obj[4].toString());
        oven.setWidth(obj[5].toString());

        return oven;
    }
}
