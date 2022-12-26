package observer;

import java.util.ArrayList;

public class GroupAdmin implements Sender{
    ArrayList<Member> members = new ArrayList<Member>();
    UndoableStringBuilder s = new UndoableStringBuilder();

    /**
     * added new Member to the members ArrayList
     * @param obj
     */
    @Override
    public void register(Member obj) {
        members.add(obj);


    }

    /**
     * delete Member from the members ArrayList
     * @param obj
     */

    @Override
    public void unregister(Member obj) {
        members.remove(obj);

    }

    /**
     * Inserts the string into this character sequence.
     * After the insertion we will update all the Members
     * @param offset - int object.
     * @param obj    - String object.
     *
     */

    @Override
    public void insert(int offset, String obj) {
        s.insert(offset,obj);
        for (int i = 0; i < members.size() ; i++) {
            members.get(i).update(s);
        }

    }

    /**
     * Appends the specified string to this character sequence
     * After the addition we will update all the Members
     * @param obj - String object.
     */

    @Override
    public void append(String obj) {
        s.append(obj);
        for (int i = 0; i < members.size(); i++) {
            members.get(i).update(s);

        }

    }
    /**
     * Removes the characters in a substring of this sequence. The substring begins
     * at the specified start and extends to the character at index
     * end - 1 or to the end of the sequence if no such character exists.
     * If start is equal to end, no changes are made
     * After the deletion we will update all the Members
     * @param start - int object.
     * @param end   - int object.
     */
    @Override
    public void delete(int start, int end) {
        s.delete(start,end);
        for (int i = 0; i < members.size(); i++) {
            members.get(i).update(s);
        }

    }

    @Override
    public String toString() {
        return members.toString();
    }




    /**
     * Undoes the last operation (StringBuilder that was before the last operation)
     * After we did undo we will update all the Members
     */
    @Override
    public void undo() {
        s.undo();
        for (int i = 0; i < members.size(); i++) {
            members.get(i).update(s);

        }


    }
}