package md.tekwill.methodstask;

public class ExecutionService {

    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(-120,200));
        System.out.println(DataGeneratorUtil.getRandomInt(120,-320));
        System.out.println(DataGeneratorUtil.getRandomInt(-2120,-320));

        int randomInt = DataGeneratorUtil.getRandomInt(50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));

        Customer customer1 = new Customer("Vasile", "masculin", 921);
        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(90);
        System.out.println(customer1.toString());

        Customer customer2 = new Customer("Elena", "feminin", 21);
        String infoAboutCustomer2 = customer2.toString();
        System.out.println(infoAboutCustomer2);

        System.out.println("Virsta " +customer2.getName() + " este " + customer2.getAge());

        System.out.println(DataGeneratorUtil.getRandomEmail(5,"gmail.com"));

        System.out.println("Random boolean " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random double " + DataGeneratorUtil.getRandomDouble());
    }
}
