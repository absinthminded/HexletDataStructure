package devices;

public class CopyController <T extends IPrinter & IScanner>{
    // BEGIN (write your solution here)
    public static <T extends IPrinter & IScanner>void copy(T device) {
        device.print(device.scan());

    }
    // END
}
