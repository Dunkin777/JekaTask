public class Test {
    public static void main(String[] args) {
User user1 = new User("Egor");
User user2 = new User("Jeka");
User user3 = new User("Dima");

    MessageDatabase.sendMessage(user1, user2, "Привет");
    MessageDatabase.sendMessage(user1, user2, "Как дела?");
    MessageDatabase.sendMessage(user2, user1, "Нормально, как сам?");
    MessageDatabase.sendMessage(user2, user1, "Сижу, работаю");
    MessageDatabase.sendMessage(user2, user1, "Думаю о планах");
    MessageDatabase.sendMessage(user3, user1, "Привет, есть работа?");
    MessageDatabase.sendMessage(user3, user1, "В кармане пусто, у тебя есть что-то?");
    MessageDatabase.sendMessage(user3, user1, "Дома детей кормить нужно");
    MessageDatabase.sendMessage(user1, user3, "Нужно подумать");
    MessageDatabase.sendMessage(user1, user3, "Что ты умеешь делать?");
    MessageDatabase.sendMessage(user1, user3, "Есть работёнка Java программиста");
    MessageDatabase.sendMessage(user3, user1, "Я как раз закончил машиностроительный");
    MessageDatabase.sendMessage(user3, user1, "Самое оно вкатиться");
    MessageDatabase.sendMessage(user3, user1, "У меня опыта нет, но я стараюсь");
    MessageDatabase.showDialog(user1,user3);
    }
}
