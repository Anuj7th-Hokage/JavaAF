package Saturday_Lab2.Ticket;public class TicketMain {    public static BusTicket getTicketDetails(){        BusTicket bus = new BusTicket();        Person person = new Person();        bus.setTicketNo(238911);        bus.setTicketPrice(200.05f);        person.setGender('m');        person.setName("Anuj");        person.setAge(17);        bus.setPerson(person);        return bus;    }    public static void main(String[] args) {        BusTicket t =getTicketDetails();        System.out.println("------------------------------------------------------");        System.out.println("| Ticket no is- "+t.getTicketNo()+"                               |");        System.out.println("| Person Name- "+t.getPerson().getName()+"                                  |");        System.out.println("| Gender- "+t.getPerson().getGender()+"                                          |");        System.out.println("| Ticket pricece- "+t.getTicketPrice()+"                             |");        t.calculateTotal();        System.out.println("| Ticket amount- "+t.getTotalAmount()+"                              |");        System.out.println("------------------------------------------------------");    }}