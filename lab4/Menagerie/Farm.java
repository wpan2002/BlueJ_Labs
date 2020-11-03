class Farm {
    public static void main(String[] args) {
        Menagerie menagerie = new Menagerie();

        // We can add animals to the farm using menagerie.addAnimal.
        // The method signature for adding an animal looks like this:
        // void addAnimal(Animal animal) {
        //   ...
        // }
        // This means you can add any animal as long as it extends Animal.
        // Check out Monkey, Blobfish, and Dog to see how.
        menagerie.addAnimal(new Monkey());
        menagerie.addAnimal(new Blobfish());
        menagerie.addAnimal(new Dog());

        // The code we commented out below doesn't work because there is no Bear class.
        // Can you make one?
        // menagerie.addAnimal(new Bear());

        // EXTRA CREDIT: can you design the Bear class so that you give the bear a name when you construct it?
        // menagerie.addAnimal(new Bear("Cuddles"));
    }
}
