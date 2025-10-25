package ru.urfu;

/**
 * Обработчик сообщений
 */
public class MessageHandler {

    /**
     *  Обработка сообщения от пользователя и вернуть ответ
     */
    public String handleMessage(String messageFromUser) {
        if (messageFromUser == null || messageFromUser.isEmpty()) {
            return "Ничего не отправлено";
        }
        return "Ваше сообщение: '" + messageFromUser + "'";
    }
}
