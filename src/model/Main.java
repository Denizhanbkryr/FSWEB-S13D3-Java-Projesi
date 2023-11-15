package model;

public class Main {
    public static void main(String[] args) {
        //Person person2 = new Person();
        Person person = new Person("Ali", "Veli", 30);
        //person.firstName.charAt(0);
        //String[] hobbies = new String[]{"piano", "chess"};
        Person dogancan = new Person("Denizhan", "Bakiryor",
                26, 8000, false, new String[]{"guitar", "soccer"});



        System.out.println("Salary: " + dogancan.salary);
        System.out.println("Is Teen: " + dogancan.isTeen());
        System.out.println("Hobbies: " + dogancan.getHobbies());
        //System.out.println("Hobbies: " + Arrays.toString(dogancan.hobbies));
        System.out.println(dogancan);
        dogancan.salary = 1000;

        Person john = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + john.getFirstName());
        System.out.println("LastName: " + john.getLastName());
        System.out.println("Age: " + john.getAge());

        System.out.println("*********************************");
        Wall wall = new Wall(5, 4);
        System.out.println("Get width: " + wall.getWidth());
        System.out.println("Get height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
        System.out.println("**********************************");
        wall.setWidth(-5);
        System.out.println("Get width: " + wall.getWidth());
        wall.setHeight(-4);
        System.out.println("Get height: " + wall.getHeight());
        System.out.println("**********************************");

        Wall wall2 = new Wall(-5, -4);
        System.out.println("Get width: " + wall2.getWidth());
        System.out.println("Get height: " + wall2.getHeight());


    }
}