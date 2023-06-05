package telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {

    public static void main(String[] args) throws Exception {
        //створюємо обєкт який буде реєструвати ботів на серверах телеграм. Тут відбуівається підключення до серверів телеграм
        var api = new TelegramBotsApi(DefaultBotSession.class);
        //зареєструємо бота
        api.registerBot(new MyBot());

    }
}
