package by.tc.task01.service.validation;

public class DoubleTest {

    public static boolean test(Object obj) throws NumberFormatException {
        try {
            Double.parseDouble(obj.toString());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
