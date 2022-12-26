package observer;

import java.util.Stack;

import static java.lang.System.*;

public class UndoableStringBuilder {

    public UndoableStringBuilder(String s) {
        this.str = new StringBuilder(s);
    }

    //use
    public UndoableStringBuilder(StringBuilder h) {this.str = new StringBuilder(h);}


    public StringBuilder str = new StringBuilder();

    public String s = new String();


    public Stack<StringBuilder> st = new Stack<StringBuilder>();

    public UndoableStringBuilder() {

    }

    /**
     * Appends the specified string to this character sequence
     *
     * @param s - String object.
     * @return new StringBuilder with string object
     */
    public UndoableStringBuilder append(String s) {
        this.str.append(s);
        this.st.push(new StringBuilder(str));
        return new UndoableStringBuilder(str);
    }


    /**
     * Removes the characters in a substring of this sequence. The substring begins
     * at the specified start and extends to the character at index
     * end - 1 or to the end of the sequence if no such character exists.
     * If start is equal to end, no changes are made
     *
     * @param start - int object.
     * @param end   - int object.
     * @return new StringBuilder without the objects that between the index start to end.
     */
    public UndoableStringBuilder delete(int start, int end) {
        try {
            str.delete(start, end);
            st.push(new StringBuilder(str));
        } catch (Exception err) {
            out.println("please enter valid numbers");
        }
        return new UndoableStringBuilder(str);
    }


    /**
     * Inserts the string into this character sequence.
     *
     * @param offset - int object.
     * @param str    - String object.
     * @return StringBuilder with string object that get in on some index.
     */
    public UndoableStringBuilder insert(int offset, String str) {
        try {
            this.str.insert(offset, str);
            st.push(new StringBuilder(this.str));
        } catch (Exception err) {
            System.out.println("please enter valid numbers");
        }
        return new UndoableStringBuilder(this.str);
    }

    /**
     * Replaces the characters in a substring of this sequence with characters in
     * the specified String. The substring begins at the specified start and
     * extends to the character at index end - 1 or to the end of the sequence if
     * no such character exists. First the characters in the substring are removed
     * and then the specified String is inserted at start. (This sequence will be
     * lengthened to accommodate the specified String if necessary).
     *
     * @param start - int object.
     * @param end   - int object.
     * @param str   - String object.
     * @return A new StringBuilder with a string that swaps the objects between start and end index
     */

    public UndoableStringBuilder replace(int start, int end, String str) {
        try {
            this.str.replace(start, end, str);
            st.push(new StringBuilder(this.str));
        } catch (Exception err) {
            out.println("please enter valid numbers");
        }
        return new UndoableStringBuilder(this.str);
    }

    /**
     * Causes this character sequence to be replaced by the reverse of the
     * sequence.
     *
     * @return reversed StringBuilder object.
     */


    public UndoableStringBuilder reverse() {

        str.reverse();
        st.push(new StringBuilder(str));

        return new UndoableStringBuilder(str);
    }


    /**
     * Undoes the last operation.
     *
     * @return StringBuilder that was before the last operation.
     */

    public UndoableStringBuilder undo() {
        try {
            if (st.empty()) {
                out.println("the stack is empty");
            }
            UndoableStringBuilder c = new UndoableStringBuilder(this.st.pop() + "");
            return c;
        }catch (Exception err) {
            return null;
        }
    }

    @Override
    public String toString() {

        if (st.empty()){
            return "";
        }
        return this.st.peek()+"";
    }
}