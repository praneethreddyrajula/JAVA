public class Conversions {
    public static void main(String[] args){
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        int v1 = 50;
        v1 = (int) 100.0;
        short result1 = (byte)longVal;
        short result2 = (short)(byteVal - longVal);

        System.out.println();
    }
}
