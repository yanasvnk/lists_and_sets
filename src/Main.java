


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
        //productList.add(product4);
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
        //recipes.add(recipe3);
        System.out.println(recipes);


        Car car = new Car("Toyota", "B-901", 45, 3, 7, 250, TypeOfBody.SEDAN);

        Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145, LiftCapacity.N2);

        Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE);
        Bus bus1 = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE);

        DriverB<Car> driverB = new DriverB<>("Иванов Иван", true, 4);
        Sponsor lukoil = new Sponsor("Лукойл", 2000000);
        Sponsor michelin = new Sponsor("Michelin", 3000000);


        car.addDriver(new DriverB<>("Иванов Иван", true, 4));
        car.addMechanic(new Mechanic<Car>("Пётр ", "Петров ", "Механики России "));
        car.addSponsor(lukoil, michelin);

        lorry.addDriver(new DriverC<>("Cтепанов Степан", true, 10));
        lorry.addMechanic(new Mechanic<Lorry>("Сергей ", "Сергеев  ", "Механики России"));
        lorry.addSponsor(michelin);

        bus.addDriver(new DriverD<>("Егоров Егор", true, 19));
        bus.addMechanic(new Mechanic<Bus>("Алексей  ", "Алексеев ", "Механики России "));
        bus.addSponsor(lukoil);

        bus.addDriver(new DriverD<>("Егоров Егор", true, 19));
        bus.addMechanic(new Mechanic<Bus>("Алексей  ", "Алексеев ", "Механики России "));
        bus.addSponsor(lukoil);


        List<Transport> transports = List.of(car, lorry, bus);


        for (Transport transport : transports) {
            printInfo(transport);}


            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


            Map<Transport, Mechanic> map = new HashMap<>();
            map.put(car, new Mechanic<Car>("Пётр", "Петров", "Механики России"));
            map.put(lorry, new Mechanic<Lorry>("Сергей", "Сергеев", "Механики России"));
            map.put(bus, new Mechanic<Bus>("Алексей ", "Алексеев", "Механики России"));
            map.put(bus1, new Mechanic<Bus>("Алексей", "Алексеев", "Механики России"));


            String mechanicCar = String.valueOf(map.get(car));
            System.out.println(String.valueOf(map.get(car)));

            String mechanicLorry = String.valueOf(map.get(lorry));
            System.out.println(String.valueOf(map.get(lorry)));

            String mechanicBus = String.valueOf(map.get(bus));
            System.out.println(String.valueOf(map.get(bus)));

            String mechanicBus1 = String.valueOf(map.get(bus1));
            System.out.println(String.valueOf(map.get(bus1)));

        System.out.println(map);
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
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + mechanic.getSurname() + mechanic.getCompany());
        }
    }

    public final boolean equals(Object o) {
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<Transport, Mechanic> e = (Map.Entry<Transport, Mechanic>) o;
        Object k1 = ((Map.Entry) o).getKey();
        Object k2 = e.getKey();
        if (Objects.equals(getValue(), e.getValue())) {
            Object v1 = getValue();
            Object v2 = e.getValue();
            if (Objects.equals(v1, v2))
                return true;
        }
        return false;
    }

    private Object getValue() {
        return String.valueOf(Map.of());
    }
}









