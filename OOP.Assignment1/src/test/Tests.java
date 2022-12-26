import observer.ConcreteMember;
import observer.GroupAdmin;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    public static final Logger logger = LoggerFactory.getLogger(Tests.class);
    // stub method to check external dependencies compatibility
    @Test
    public void test(){
        String s1 = "Alice";
        String s2 = "Bob";

        logger.info(()->JvmUtilities.objectFootprint(s1));

        logger.info(()->JvmUtilities.objectFootprint(s1,s2));

        logger.info(()->JvmUtilities.objectTotalSize(s1));

        logger.info(() -> JvmUtilities.jvmInfo());
    }

    @Test
    void insert() {
        GroupAdmin st = new GroupAdmin();
        ConcreteMember x = new ConcreteMember();
        ConcreteMember y = new ConcreteMember();
        ConcreteMember z = new ConcreteMember();
        st.register(x);
        st.register(y);
        st.register(z);
        st.insert(0,"adi");
        assertEquals("[adi, adi, adi]",st.toString());
    }

    @Test
    void append() {
        GroupAdmin st = new GroupAdmin();
        ConcreteMember x = new ConcreteMember();
        ConcreteMember y = new ConcreteMember();
        st.register(x);
        st.register(y);
        st.append("adi_and_hod");
        st.append("400");
        assertEquals("[adi_and_hod400, adi_and_hod400]",st.toString());


    }

    @Test
    void delete() {
        GroupAdmin st = new GroupAdmin();
        ConcreteMember x = new ConcreteMember();
        st.register(x);
        st.append("adi_and_hod");
        st.delete(0,3);
        assertEquals("[_and_hod]",st.toString());


    }

    @Test
    void undo() {
        GroupAdmin st = new GroupAdmin();
        ConcreteMember x = new ConcreteMember();
        ConcreteMember y = new ConcreteMember();
        st.register(x);
        st.register(y);
        st.append("adi_and_hod");
        st.append("400");
        st.undo();
         );
    }

    @Test
    void JVMUTILTtest() {
        GroupAdmin st = new GroupAdmin();
        logger.info(()->JvmUtilities.objectFootprint(st));
        ConcreteMember y = new ConcreteMember();
        logger.info(()->JvmUtilities.objectTotalSize(y));


    }


}
