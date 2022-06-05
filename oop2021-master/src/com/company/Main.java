package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog", FoodType.MEAT);

        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;
        me.hashCode();

        me.feed(1.0, FoodType.ALL);
        System.out.println(me.species);

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                OperatingSystem.Android);

        Phone iPhone6 = new Phone("apple", "6s", 5.0, OperatingSystem.iOS);

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Car("fiat", "bravo");
        fiat.engineSize = 1.9;
        fiat.fuelType = "disel";
        System.out.println(fiat.producer);

        dog.feed(1.0, FoodType.MEAT);

        Human brother = new Human(1231.2);

        dog.sell(me, brother, 1.0);

        fiat.refill();


        System.out.println("**************Task2*************");
        Animal cat = new Animal("cat", FoodType.MEAT);
        cat.feed(10.0, FoodType.MEAT);


        Animal dog1 = new Animal("dog", FoodType.ALL);
        dog1.feed(10.0, FoodType.ALL);


        //Task3
        System.out.println("**************Task3*************");
        System.out.println("Country GDP in PLN" + Country.POLAND.getGdpInPln());


        //Task4
        System.out.println("**************Task4*************");

        Map<Country, Double> area = new HashMap<>();
        area.put(Country.POLAND, 84510444.554);
        area.put(Country.SPAIN, 4152454150.554);
        area.put(Country.GERMANY, 70044514150.554);
        area.put(Country.ENGLAND, 662302150.554);

        double minimum = Collections.min(area.values());
        double maximum = Collections.max(area.values());

        for (Map.Entry<Country, Double> item : area.entrySet()) {
            if (item.getValue().equals(minimum)) {
                System.out.println("The minimum value is: " + item.getValue() + " and the country code is: " + item.getKey().getCode() + " and the language is: " + item.getKey().getLanguage());
            }
            if (item.getValue().equals(maximum)) {
                System.out.println("The maximum value is: " + item.getValue() + " and the country code is: " + item.getKey().getCode() + " and the language is: " + item.getKey().getLanguage());
            }
        }

        //Task 5
        System.out.println("**************Task5*************");

        Map<String, Country> capital = new HashMap<>();
        capital.put("Berlin", Country.GERMANY);
        capital.put("Warsaw", Country.POLAND);
        capital.put("London", Country.ENGLAND);


        Map<String, Country> capitalSorted = new TreeMap<>(capital);

        for (Map.Entry<String, Country> cap : capitalSorted.entrySet()) {
            System.out.println("The capital sorted are: " + cap.getKey());
        }

        //Task6
        System.out.println("**************Task6*************");
        System.out.println("**************Animal*************");

        Animal aida = new Pet("dog", FoodType.MEAT, "Aida");
        Animal leo = new Pet("cat", FoodType.MEAT, "Leo");
        Animal giuseppe = new Human(2000.0);
        Animal giovanni = new Human(2000.0);
        Animal cow = new FarmAnimal("cow", FoodType.CROPS, "Agata");
        Animal lamb = new FarmAnimal("cow", FoodType.CROPS, "Agata");

        List<Animal> petsList = new ArrayList<>();
        petsList.add(aida);
        petsList.add(leo);

        List<Animal> humanList = new ArrayList<>();
        humanList.add(giuseppe);
        humanList.add(giovanni);

        List<Animal> farmAnimalList = new ArrayList<>();
        farmAnimalList.add(cow);
        farmAnimalList.add(lamb);


        Map<FoodType, List<Animal>> animalMap = new HashMap<>();
        animalMap.put(FoodType.MEAT, petsList);
        animalMap.put(FoodType.ALL, humanList);
        animalMap.put(FoodType.CROPS, farmAnimalList);

        System.out.println(animalMap.get(FoodType.CROPS));
        System.out.println(animalMap.get(FoodType.ALL));
        System.out.println(animalMap.get(FoodType.MEAT));


        Device appleCar = new Car("apple", "applecar X");
        Device iphone12 = new Car("apple", "12");
        Device tesla = new Car("tesla", "model x");
        Device teslaPhone = new Phone("tesla", "phone x", 9.0, OperatingSystem.Android);

        List<Device> teslaList = new LinkedList<>();
        teslaList.add(teslaPhone);
        teslaList.add(tesla);

        List<Device> appleList = new ArrayList<>();
        appleList.add(iphone12);
        appleList.add(appleCar);


        Map<String, List> producer = new HashMap<>();
        producer.put("tesla", teslaList);
        producer.put("apple", appleList);
        //First way:
        System.out.println("**************Devices*************");
        System.out.println("**************First Way*************");
        System.out.println(producer.get("tesla"));
        System.out.println(producer.get("apple"));


        //Second way:
        System.out.println("**************Second Way*************");
        for (Map.Entry<String, List> findProducer : producer.entrySet()) {

            if (findProducer.getKey().equals("tesla")) {
                System.out.println(findProducer.getValue().get(0) + " model: " + findProducer.getValue().get(1));
            } else if (findProducer.getKey().equals("apple")) {
                System.out.println(findProducer.getValue().get(0) + ", " + findProducer.getValue().get(1));
            }
        }


        //Task7
        System.out.println("**************Task7*************");
        Car ferrari = new Car("Ferrari", "458");
        ferrari.startACar();

        //Task8
        System.out.println("**************Task8*************");


        //First way

//            Animal enzo = new Human(80.0);
//            Animal giuseppe = new Human(80.0);
//            Animal cat1 = new Pet("cat",FoodType.CROPS);
//            Animal dog2 = new Pet("dog",FoodType.CROPS);
//            Animal chicken = new FarmAnimal("chicken", FoodType.CROPS);
//            Animal cow = new FarmAnimal("cow", FoodType.CROPS);
//            animals.add(enzo);
//            animals.add(giuseppe);
//            animals.add(cat1);
//            animals.add(dog2);
//            animals.add(chicken);
//            animals.add(cow);
//            enzo.setWeight(80.0);
//            giuseppe.setWeight(90.0);
//            cat1.setWeight(5.0);
//            dog1.setWeight(6.0);
//            chicken.setWeight(5.0);
//            cow.setWeight(200.0);

        //Second way

        List<Animal> animals = new LinkedList<>();

        animals.add(new Human(1000.0));
        animals.add(new Human(80.0));
        animals.add(new Pet("cat", FoodType.ALL, "Baloo"));
        animals.add(new Pet("dog", FoodType.ALL, "Bufo"));
        animals.add(new FarmAnimal("cow", FoodType.CROPS, "Ben"));
        animals.add(new FarmAnimal("chicken", FoodType.CROPS, "Klara"));
        animals.get(0).setWeight(80.0);
        animals.get(0).name = "Giuseppe";
        animals.get(1).setWeight(90.0);
        animals.get(1).name = "Enzo";
        animals.get(2).setWeight(5.0);
        animals.get(3).setWeight(30.0);
        animals.get(4).setWeight(200.0);
        animals.get(5).setWeight(6.0);


        Collections.sort(animals, new Comparator<>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });


        System.out.println(animals.toString());

        for (Animal animal : animals) {
            System.out.println("The weight of the animal " + animal.species + " is: " + animal.getWeight());
        }

        //Task 11

        Collections.sort(animals, (o1, o2) -> o1.getWeight().compareTo(o2.getWeight()));
        Collections.sort(animals, Comparator.comparing(Animal::getWeight));


        System.out.println(animals);


        System.out.println("***************API*************");

        APIConnector connector = new APIConnector();
        try {

            String data = connector.getCurrencyData();
            System.out.println(data.toString());
            String[] array = data.split(",");
            String numberValue;
            double plnvalue;
            for (String s : array) {
                if (s.contains("PLN")) {
                    numberValue = s.split(":")[1];
                    plnvalue = Double.parseDouble(numberValue);
                    System.out.println(plnvalue);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            connector.getCurrency(connector.getCurrencyData());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Task 12
        try {
            System.out.println("***************Task12*************");
            connector.exchangeToPln(2000.0, 4.25, connector.getCurrencyData());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}


