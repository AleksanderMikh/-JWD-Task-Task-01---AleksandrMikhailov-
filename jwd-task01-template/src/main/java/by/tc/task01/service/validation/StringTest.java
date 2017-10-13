package by.tc.task01.service.validation;

public class StringTest {

    public static boolean testString(Object obj) throws NumberFormatException {
        try {
            Double.parseDouble(obj.toString());
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }
    }
}
