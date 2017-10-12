package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerCreator implements Command {
    @Override
    public Appliance execute(Object[] obj) {

        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(obj[0].toString());
        vacuumCleaner.setFilterType(obj[1].toString());
        vacuumCleaner.setBagType(obj[2].toString());
        vacuumCleaner.setWandType(obj[3].toString());
        vacuumCleaner.setMotorSpeedRegulation(obj[4].toString());
        vacuumCleaner.setCleaningWidth(obj[5].toString());

        return null;
    }
}
