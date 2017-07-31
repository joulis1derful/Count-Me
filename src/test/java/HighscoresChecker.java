import com.joulis1derful.countme.model.User;
import com.joulis1derful.countme.service.DigitOperationsService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HighscoresChecker {
    DigitOperationsService operationsService = new DigitOperationsService();
    List<User> users = new ArrayList<>();

    @Before
    public void setUp() {
        User user1 = new User(1, "uchihaanton", "uchihaanton@yandex.ru", "6803708", 15000);
        User user2 = new User(2, "joulis1derful", "joulis1derful@gmail.com", "6803708", 20000);
        User user3 = new User(3, "antonhuzhov", "antonhuzhov@gmail.com", "6803708", 30000);
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Test
    public void mapContainsHighscoresList() {
        setUp();
        assertEquals(true, operationsService.showHighscores(users).containsValue(30000));
        assertEquals(true, operationsService.showHighscores(users).containsValue(20000));
        assertEquals(true, operationsService.showHighscores(users).containsValue(15000));

    }
}
