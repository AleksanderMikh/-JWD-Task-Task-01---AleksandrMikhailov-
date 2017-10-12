package by.tc.task01.dao.impl.choice;

import java.util.Map;
import java.util.HashMap;

public class ApplianceDirector {
    public Map<String, Command> map = new HashMap<String, Command>();

    public ApplianceDirector(){

        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("Speakers", new SpeakersCreator());
        map.put("TabletPC", new TabletPCCreator());
        map.put("VacuumCleaner", new VacuumCleanerCreator());

    }

    public Command getCommand(String typeName){

        Command command;

        command = map.get(typeName);

        return command;

    }
}
