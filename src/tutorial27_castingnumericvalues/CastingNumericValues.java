package tutorial27_castingnumericvalues;

public class CastingNumericValues {

    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355l;
        float floatValue = 8834.8f;
        float floatValue1 = (float) 99.3; //Alternate way of writing float where we don't have to include f at the end.
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Float.MAX_VALUE); //3.4028235E38
        System.out.println(Float.MAX_EXPONENT); //127
        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println(Double.MAX_EXPONENT); //1023

        //casting
        intValue = (int) longValue;
        System.out.println(intValue); //Will print 23355

        doubleValue = intValue; //This didn't work with long since long can sometimes be a very big num which would not fit in an int
        System.out.println(doubleValue);

        intValue = (int) floatValue; //Will print 8834 because it chops of the num. In order to round, we would have to use Math.round
        System.out.println(intValue);

        byteValue = (byte) 128; //Will print -128 since byte can only hold up to 127
        System.out.println(byteValue);
    }
}
