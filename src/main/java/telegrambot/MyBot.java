package telegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;


public class MyBot extends TelegramLongPollingBot {
    public MyBot() {
        super("6147746660:AAHa_iJHVVEy88VOvM0d15FL5cFqFMeKtwA");
    }

    @Override//кожного разу коли користувач буде щось писати боту цей метод буде викликаний автоматично
    public void onUpdateReceived(Update update) {
        //цей номер чату потрібен мені щоб відповідати користувачу
        var chatId = update.getMessage().getChatId();
        //розрізняти що саме написав користувач
        var text = update.getMessage().getText();
        try {
            var message = new SendMessage();
            message.setChatId(chatId);


            //відправляю повідомлення користувачу


            if (text.equals("/start")) {
                message.setText("hi");
            } else if (text.equals("Tea")) {
                message.setText("Ok");
            } else if (text.equals("Dinner")) {
                message.setText("Ok");
            } else {
                message.setText("Unknow command");
            }
            execute(message);
        } catch (Exception e) {
            System.out.println("Error!");

        }
    }

    @Override
    public String getBotUsername() {
        return "YaAlinaSuper_bot";
    }
}
