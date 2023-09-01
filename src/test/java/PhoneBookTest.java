import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PhoneBookTest {
    @Test
    public void testAddFirst(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", "+79456739878");
        phoneBook.add("Вика", "+79153856723");

        assertThat(phoneBook.getPhones().size(), equalTo(2));
    }

    @Test
    public void testAddSecond(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", "+79456739878");
        phoneBook.add("Вика", "+79153856723");
        phoneBook.add("Никита", "+79153856723");

        assertThat(phoneBook.getPhones().size(), equalTo(3));
    }
}
