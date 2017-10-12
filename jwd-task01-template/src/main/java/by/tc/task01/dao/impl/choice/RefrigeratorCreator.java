package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements Command {
    @Override
    public Appliance execute(Object[] obj) {

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(obj[0].toString());
        refrigerator.setWeight(obj[1].toString());
        refrigerator.setFreezerCapacity(obj[2].toString());
        refrigerator.setOverallCapacity(obj[3].toString());
        refrigerator.setHeight(obj[4].toString());
        refrigerator.setWidth(obj[5].toString());

        return refrigerator;
    }
}
