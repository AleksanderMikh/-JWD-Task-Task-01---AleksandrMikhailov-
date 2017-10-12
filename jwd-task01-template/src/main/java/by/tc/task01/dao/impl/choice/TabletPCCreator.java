package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCCreator implements Command {
    @Override
    public Appliance execute(Object[] obj) {

        TabletPC tabletPC = new TabletPC();
        tabletPC.setBattaryCapacity(obj[0].toString());
        tabletPC.setDisplayInches(obj[1].toString());
        tabletPC.setMemoryROM(obj[2].toString());
        tabletPC.setFlashMemoryCapacity(obj[3].toString());
        tabletPC.setColor(obj[4].toString());

        return tabletPC;
    }
}
