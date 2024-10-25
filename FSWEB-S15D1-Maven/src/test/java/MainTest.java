import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    MobilePhone mobilePhone;

    @BeforeEach
    void setUp() {
        Grocery.groceryList.clear();
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "123123123"));
        contacts.add(new Contact("Jane Doe", "124124124"));
        contacts.add(new Contact("Baby Doe", "125125125"));
        mobilePhone = new MobilePhone("11111111", contacts);
    }

    @DisplayName("addItems methodu doğru çalışıyor mu mu?")
    @Test
    public void testAddItemsMethod() {
        Grocery.groceryList.add("tomato");
        Grocery.addItems("lemon");
        Grocery.addItems("cherry,artichoke");

        assertEquals(Grocery.groceryList.size(), 4);
        assertTrue(Grocery.groceryList.contains("lemon"));
        assertTrue(Grocery.groceryList.contains("cherry"));
        assertTrue(Grocery.groceryList.contains("artichoke"));
    }

    @DisplayName("addItems methodu aynı elemanları eklemiyor mu?")
    @Test
    public void testAddItemsWithSameValues() {
        Grocery.groceryList.add("tomato");
        Grocery.addItems("tomato");
        Grocery.addItems("cherry,artichoke");
        Grocery.addItems("cherry,potato");

        assertEquals(Grocery.groceryList.size(), 4);
    }

    @DisplayName("addItems methodu sonrasında liste sort ediliyor mu?")
    @Test
    public void testAddItemsSorted()  {
        Grocery.groceryList.add("tomato");
        Grocery.addItems("tomato");
        Grocery.addItems("cherry,artichoke");
        Grocery.addItems("cherry,potato");

        assertEquals(Grocery.groceryList.get(0), "artichoke");
    }

    @DisplayName("removeItems methodu doğru çalışıyor mu mu?")
    @Test
    public void testRemoveItemsMethod() {
        Grocery.groceryList.add("tomato");
        Grocery.groceryList.add("lemon");
        Grocery.groceryList.add("cherry");
        Grocery.groceryList.add("banana");

        Grocery.removeItems("cherry");
        assertEquals(Grocery.groceryList.size(), 3);
        assertFalse(Grocery.groceryList.contains("cherry"));

        Grocery.removeItems("lemon,banana");
        assertEquals(Grocery.groceryList.size(), 1);
        assertFalse(Grocery.groceryList.contains("lemon"));
        assertFalse(Grocery.groceryList.contains("banana"));
    }


    @DisplayName("removeItems methodu sonrasında liste sort ediliyor mu?")
    @Test
    public void testRemoveItemsSorted()  {
        Grocery.groceryList.add("tomato");
        Grocery.addItems("tomato");
        Grocery.addItems("cherry,artichoke");
        Grocery.addItems("cherry,potato");

        assertEquals(Grocery.groceryList.get(0), "artichoke");
    }

    @DisplayName("checkItemsInList methodu doğru çalışıyor mu?")
    @Test
    public void testCheckItemsInListSorted()  {
        Grocery.groceryList.add("tomato");
        Grocery.groceryList.add("potato");

        assertTrue(Grocery.groceryList.contains("potato"));
        assertFalse(Grocery.groceryList.contains("onion"));
    }

    @DisplayName("printSorted methodu doğru çalışıyor mu?")
    @Test
    public void testPrintSortedInListSorted()  {
        Grocery.groceryList.add("tomato");
        Grocery.groceryList.add("potato");
        Grocery.printSorted();
        assertEquals(Grocery.groceryList.get(0), "potato");
    }

    @DisplayName("createNewContact methodu doğru çalışıyor mu?")
    @Test
    public void testCreateNewContact()  {
        mobilePhone.addNewContact(new Contact("Test", "12345678"));
        assertEquals(mobilePhone.getMyContacts().size(),4);
        assertEquals(mobilePhone.getMyContacts().get(3).getName(), "Test");
    }

    @DisplayName("updateNewContact methodu doğru çalışıyor mu?")
    @Test
    public void testUpdateContact()  {
        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(contact);
        Contact updatedContact = new Contact("Test", "12345679");

        assertTrue(mobilePhone.updateContact(contact, updatedContact));
        assertEquals(mobilePhone.getMyContacts().size(),4);
    }

    @DisplayName("removeNewContact methodu doğru çalışıyor mu?")
    @Test
    public void testRemoveContact()  {
        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(new Contact("Test", "12345678"));

        assertTrue(mobilePhone.removeContact(contact));
        assertEquals(mobilePhone.getMyContacts().size(),3);
    }

    @DisplayName("findContact(Contact) methodu doğru çalışıyor mu?")
    @Test
    public void testFindContact()  {
        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(new Contact("Test", "12345678"));

        assertEquals(mobilePhone.findContact(contact), 3);
    }

    @DisplayName("findContact(String) methodu doğru çalışıyor mu?")
    @Test
    public void testFindContactString()  {
        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(new Contact("Test", "12345678"));

        assertEquals(mobilePhone.findContact(contact.getName()), 3);
    }

    @DisplayName("queryContact(String) methodu doğru çalışıyor mu?")
    @Test
    public void testQueryContactString()  {
        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(new Contact("Test", "12345678"));

        assertEquals(mobilePhone.queryContact(contact.getName()), contact);
    }
}
