package by.tc.task01.dao.impl.choice;

import by.tc.task01.entity.Appliance;

public interface Command {
    Appliance execute(Object[] obj);
}
