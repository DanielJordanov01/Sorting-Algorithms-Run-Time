public class NanoSecondToMiliSecondConvertor {
    public static double convertNanoSecondToSecond(double nanosecond) {
        double converted = nanosecond * Math.pow(10, -6);
        return converted;
    }
}
