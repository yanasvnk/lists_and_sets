
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("апельсин", 100, 3);
        Product product2 = new Product("мандарин", 200, 4);
        Product product3 = new Product("дыня", 300, 1);
        Product product4 = new Product("дыня", 500, 5);



        //ProductList.add(product1);???? Как проверить функцию на добавление? Не работает.
        //ProductList.remove(product4);???? Как проверить функцию на удаление? Не работает.



        //Recipe recipe1 = new Recipe("Фруктовый салат", product2, 1000);??? Как добавить больше продуктов во вторую графу ингридиентов? Не работает.
        //Recipe recipe2 = new Recipe("Другой фруктовый салат", products1, 2000);??? Как добавить больше продуктов во вторую графу ингридиентов? Не работает.
        //Как проверить функции на удаление и добавление рецептов? Не работает.

        System.out.println(product1);


        System.out.println(product4.equals(product3));
        System.out.println(product1.equals(product4));


        //List<Product> productsList = List.of( product1, product4, product3); Это List. НЕ РАБОТАЕТ. Как рабочий Set с элементами в Main написать?
        //Напишите итоговый код по всем моим вопросам, пожалуйста.
        // products.add(product2); НЕ РАБОТАЕТ
        // products.remove(product3); НЕ РАБОТАЕТ


        Car car = new Car("Toyota", "B-901", 45, 3, 7, 250, TypeOfBody.SEDAN);

        Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145, LiftCapacity.N2);

        Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE, mechanics);

        DriverB driverB = new DriverB("Иванов Иван", true, 4);

        Sponsor lukoil = new Sponsor("Лукойл", 2000000);
        Sponsor michelin = new Sponsor("Michelin", 3000000);


        car.addDriver(new DriverB("Иванов Иван", true, 4));
        car.addMechanic(new Mechanic<Car>("Пётр ", "Петров ", "Механики России "));
        car.addSponsor(lukoil, michelin);

        lorry.addDriver(new DriverC("Cтепанов Степан", true, 10));
        lorry.addMechanic(new Mechanic<Lorry>("Сергей ", "Сергеев  ", "Механики России"));
        lorry.addSponsor(michelin);

        bus.addDriver(new DriverD("Егоров Егор", true, 19));
        bus.addMechanic(new Mechanic<Bus>("Алексей  ", "Алексеев ", "Механики России "));
        bus.addSponsor(lukoil);


        List<Transport> transports = List.of(car, lorry, bus); // КАК НАПИСАТЬ SET с элементами вместо LIST??? При замене LIST на SET в коде всё горит красным.
        //ЧТО НЕ ТАК? Напишите верный полный работающий код, пож.


        for (Transport transport : transports) {
            printInfo(transport);
        }

        }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по транспорту " + transport.getBrand() + " " + transport.getModel());

        System.out.println("Водители: ");
        for (Driver driver : transport.getDrivers()) {
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики: ");
        for (Mechanic mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + mechanic.getSurname() + mechanic.getCompany());
        }
    }





