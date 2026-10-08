public class Locker {
    private String code;
    private final int lockerNumber;

    public Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public boolean changeCode(String oldCode, String newCode) {
        if (oldCode.equals(code)) {
            code = newCode;
            return true;
        }
        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        boolean r1 = l.changeCode("1234", "5678");
        System.out.println("l.changeCode(\"1234\", \"5678\") -> " + (r1 ? "success" : "rejected"));
        boolean r2 = l.changeCode("0000", "9999");
        System.out.println("l.changeCode(\"0000\", \"9999\") -> " + (r2 ? "success" : "rejected, code is still \"5678\""));
    }
}
