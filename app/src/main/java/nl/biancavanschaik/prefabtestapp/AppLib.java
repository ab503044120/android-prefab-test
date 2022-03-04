package nl.biancavanschaik.prefabtestapp;

public class AppLib {
    static {
        System.loadLibrary("applib");
    }
    public native int intFromJNI();
}