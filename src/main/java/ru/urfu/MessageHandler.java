package ru.urfu;

/**
 * Обработчик сообщений
 */
public class MessageHandler {

    /**
     *  Обработка сообщения от пользователя и вернуть ответ
     */
    public String handleMessage(String messageFromUser) {
        return "Ваше сообщение: '" + messageFromUser + "'";
    }
}
