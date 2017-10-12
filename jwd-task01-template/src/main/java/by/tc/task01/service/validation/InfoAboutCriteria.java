package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

public class InfoAboutCriteria {

    private static Map<Object, Object> test = new HashMap<Object, Object>();
    static {
        test.put("POWER_CONSUMPTION","double");
        test.put("WEIGHT","double");
        test.put("CAPACITY","double");
        test.put("DEPTH","double");
        test.put("HEIGHT","double");
        test.put("WIDTH","double");
        test.put("BATTERY_CAPACITY","double");
        test.put("MEMORY_ROM","double");
        test.put("OS","string");
        test.put("SYSTEM_MEMORY","double");
        test.put("DISPLAY_INCHS","double");
        test.put("CPU","double");
        test.put("FREEZER_CAPACITY","double");
        test.put("OVERALL_CAPACITY","double");
        test.put("FILTER_TYPE","string");
        test.put("BAG_TYPE","string");
        test.put("WAND_TYPE","string");
        test.put("MOTOR_SPEED_REGULATION","double");
        test.put("CLEANING_WIDTH","double");
        test.put("FLASH_MEMORY_CAPACITY","double");
        test.put("COLOR","string");
        test.put("NUMBER_OF_SPEAKERS","double");
        test.put("FREQUENCY_RANGE","string");
        test.put("CORD_LENGTH","double");
        test.put("DISPLAY_INCHES","double");
    }

    public static Map<Object, Object> getInfo() {
        return test;
    }
}
