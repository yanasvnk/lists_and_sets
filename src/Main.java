
import java.util.*;


public class Main {
    public static void main(String[] args) {


        Product product1 = new Product("апельсин", 100, 3);
        Product product2 = new Product("мандарин", 200, 4);
        Product product3 = new Product("дыня", 300, 1);
        Product product4 = new Product("дыня", 500, 5);


        System.out.println(product1);

        System.out.println(product4.equals(product3));
        System.out.println(product1.equals(product4));


        ProductList productList = new ProductList(new HashSet<>());
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        System.out.println(productList);
        productList.remove(product1);
        System.out.println(productList);
        productList.add(product4);
        System.out.println(productList);

        ProductList productList2 = new ProductList(new HashSet<>());
        productList2.add(product1);
        productList2.add(product4);
        System.out.println(productList);

        ProductList productList3 = new ProductList(new HashSet<>());
        productList3.add(product2);
        productList3.add(product3);


        Recipe recipe1 = new Recipe("Фруктовый салат", productList, 1000);
        Recipe recipe2 = new Recipe("Другой фруктовый салат", productList2, 2000);
        Recipe recipe3 = new Recipe("Фруктовый салат", productList3, 3000);

        RecipeList recipes = new RecipeList(new HashSet<>());
        recipes.add(recipe1);
        recipes.add(recipe2);
        recipes.add(recipe3);
        System.out.println(recipes);


        Car car = new Car("Toyota", "B-901", 45, 3, 7, 250, TypeOfBody.SEDAN);

        Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145, LiftCapacity.N2);

        Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE, new HashSet<>());
        Bus bus1 = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE, new HashSet<>());

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

        bus1.addDriver(new DriverD("Егоров Егор", true, 19));
        bus1.addMechanic(new Mechanic<Bus>("Алексей  ", "Алексеев ", "Механики России "));
        bus1.addSponsor(lukoil);


        List<Transport> transports = List.of(car, lorry, bus);


        for (Transport transport : transports) {
            printInfo(transport);
        }


        private static void printInfo (Transport transport){
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
    }

}






