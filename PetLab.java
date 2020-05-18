public class PetLab {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("puppy", 1, "Minthill","Bulldog");
        
        System.out.println("Pet1 name is " + pet1.getName());
        System.out.println("Age " + pet1.getAge());
        System.out.println("It's type is " + pet1.getType());
        System.out.println("Located " + pet1.getLocation());

        System.out.println("Pet2 name is " + pet2.getName());
        System.out.println("Age "+pet2.getAge());
        System.out.println("It's type is "+pet2.getType());
        System.out.println("Location " +pet2.getLocation());
        // System.out.print(getName.newName);

    }

}
