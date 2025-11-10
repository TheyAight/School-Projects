public class Pet {
    
    //Fields
    private String name;
    private String animal;
    private int age;

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }

    //Main method for testing
    public static void main(String[] args) {
        //first pet object
        Pet pet1 = new Pet();
        pet1.setName("Buddy");
        pet1.setAnimal("Dog");
        pet1.setAge(3);

        //display info
        System.out.println("Pet 1:");
        System.out.println("Name: " + pet1.getName());
        System.out.println("Animal: " + pet1.getAnimal());
        System.out.println("Age: " + pet1.getAge());

        //second pet object
        Pet pet2 = new Pet();
        pet2.setName("Whiskers");
        pet2.setAnimal("Dragon");
        pet2.setAge(4);

        //display info
        System.out.println("\nPet 2:");
        System.out.println("Name: " + pet2.getName());
        System.out.println("Animal: " + pet2.getAnimal());
        System.out.println("Age: " + pet2.getAge());

    }


}
