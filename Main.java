import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int numberObstacles = 6;
        List<Creator> listPartucipants = new ArrayList<>();

        listPartucipants.add(new Human("Петя"));
        listPartucipants.add(new Cat("Барсик", "рыжий"));
        listPartucipants.add(new Robot("Робот1", "Model-111"));

        printCreatorList(listPartucipants, "УЧАСТНИКИ СОРЕВНОВАНИЙ:");
        System.out.println("--------------------");

        List<Obstacle> listObstacles = new ArrayList<>(numberObstacles);
        Random rn = new Random();

        for (int i = 0; i < numberObstacles; i++) {
            int variant = rn.nextInt(2);
            if (variant == 0) {
                listObstacles.add(new Wall());
            } else {
                listObstacles.add(new Road());
            }
        }

        printObstaclesList(listObstacles);

        List<Creator> winners = new ArrayList<>();

        for (Creator participant : listPartucipants) {
            System.out.println("----------" + participant + "----------");
            boolean status = true;
            for (Obstacle obstacle : listObstacles) {
                if (status) {
                    switch (obstacle.getObject()) {
                        case ("Дорожка") -> status = participant.run(obstacle.getSize());
                        case ("Стена") -> status = participant.jump(obstacle.getSize());
                    }
                }
            }
            if (status) {
                System.out.println("Закончил соревнования");
                winners.add(participant);
            } else {
                System.out.println("Сошел с дистанции");
            }
        }
        System.out.println("--------------------");
        if (winners.isEmpty()) {
            System.err.println("Победителей нет");
        } else {
            printCreatorList(winners, "ПОБЕДИТЕЛИ: ");
        }
    }

    /**
     * @apiNote - метод выводит в консоль список участников
     * @param list - список участников
     * @param msg  - текст
     */
    public static void printCreatorList(List<Creator> list, String msg) {
        System.out.println(msg);
        for (Creator item : list) {
            System.out.println(item);
        }
    }

    /**
     * @apiNote - метод выводит в консоль список препятствий
     * @param list - список препятствий
     */
    public static void printObstaclesList(List<Obstacle> list) {
        System.out.println("ПРЕПЯТСТВИЯ");
        System.out.println("НАЗВАНИЕ \tПАРАМЕТРЫ");

        for (Obstacle item : list) {
            System.out.println(item.getObject() + "\t\t" + item.getSize());
        }
    }

}