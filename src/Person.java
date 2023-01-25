public class Person {
    private String name;
    private String surname;
    private int ticketsCount;

    public Person(String name, String surname, int ticketsCount) {
        this.name = name;
        this.surname = surname;
        this.ticketsCount = ticketsCount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }

    public void setTicketsCount(int ticketsCount) {
        this.ticketsCount = ticketsCount;
    }

    public String toString() {
        return name + " " + surname + " кол-во билетов: " + ticketsCount;
    }
}
