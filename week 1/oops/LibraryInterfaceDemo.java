public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        
        // Test Case #1: KidUser
        KidUsers kid1 = new KidUsers();
        kid1.age = 10;
        kid1.registerAccount();
        kid1.bookType = "Kids";
        kid1.requestBook();

        KidUsers kid2 = new KidUsers();
        kid2.age = 18;
        kid2.registerAccount();
        kid2.bookType = "Fiction";
        kid2.requestBook();

        // Test Case #2: AdultUser
        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}
