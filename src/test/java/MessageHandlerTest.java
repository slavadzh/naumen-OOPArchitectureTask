import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.urfu.MessageHandler;

/**
 *  Проверка обработчика ошибок
 */
public class MessageHandlerTest {

    /**
     *  проверка корректного сообщения
     */
    @Test
    public void testValidMessage() {
        MessageHandler messageHandler = new MessageHandler();
        String messageFromUser = "привет";
        Assertions.assertEquals("Ваше сообщение: 'привет'",
                messageHandler.handleMessage(messageFromUser));
    }
}
