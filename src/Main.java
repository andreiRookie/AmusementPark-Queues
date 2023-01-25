import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> clients = generateClients(5);
        Queue<Person> queue = new ArrayDeque<>(clients);
        for (Person client : queue) {
            System.out.println(client.toString());
        }

        while (!queue.isEmpty()) {
            Person client = queue.poll();
            System.out.println(client.getName() + " " + client.getSurname() +
            "(" + client.getTicketsCount() + ")" + " прокатился на аттракционе!");

            client.setTicketsCount(client.getTicketsCount() - 1);
            if (client.getTicketsCount() > 0) {
                queue.offer(client);
            } else {
                System.out.println(client.getName() + " " +
                        client.getSurname() + " потратил все билетики((");
            }
        }
    }

    static List<Person> generateClients(int clientsCount) {
        String[] names = {"Саша", "Паша", "Гриша", "Андрюша", "Антоша", "Алеша"};
        String[] surnames = {"Иванов", "Петров", "Сидоров", "Николаев", "Антонов", "Нетоложко"};

        List<Person> clients = new ArrayList<>(clientsCount);

        Random random = new Random();
        String name;
        String surname;
        int tickets;

        for (int i = 0; i < clientsCount; i++) {
            name = names[random.nextInt(0, names.length)];
            surname = surnames[random.nextInt(0, surnames.length)];
            tickets = random.nextInt(0, clientsCount + i);
            clients.add(new Person(name, surname, tickets));
        }
        return clients;
    }
}