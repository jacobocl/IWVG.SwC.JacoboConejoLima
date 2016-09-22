package es.upm.miw.iwvg.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;
    
    @Before
    public void before() {
        user = new User(28, "jacobo", "conejo");
    }

    @Test
    public void testUser() {
        user = new User(120, "juan", "diaz");
        assertEquals(120, user.getNumber());
        assertEquals("Juan", user.getName());
        assertEquals("Diaz", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Jacobo Conejo", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    public void testGetNumber() {
        assertEquals(28, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Jacobo", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Conejo", user.getFamilyName());
    }

}
