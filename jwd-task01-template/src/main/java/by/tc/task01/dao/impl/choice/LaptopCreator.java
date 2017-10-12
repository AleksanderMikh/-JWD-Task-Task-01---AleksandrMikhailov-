package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCreator implements Command {
    @Override
    public Appliance execute(Object[] obj) {

        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(obj[0].toString());
        laptop.setOs(obj[1].toString());
        laptop.setMemoryROM(obj[2].toString());
        laptop.setSystemMemory(obj[3].toString());
        laptop.setCPU(obj[4].toString());
        laptop.setDisplayInchs(obj[5].toString());

        return laptop;
    }
}
