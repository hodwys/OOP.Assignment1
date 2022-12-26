package observer;

public class ConcreteMember implements Member{
    public UndoableStringBuilder s;
    @Override
    public void update(UndoableStringBuilder usb) {
        s = usb;
        //System.out.println(s.toString());

    }

    @Override
    public String toString() {
        return s.toString();
    }
}
