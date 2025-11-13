public class practiceSingleton {
    private static volatile practiceSingleton instance; // Private instance declaration

    // Private variables go here

    private practiceSingleton () {} // Private contstructor

    public static practiceSingleton instanceOf() {
        practiceSingleton result = instance; // Access instance through local variable (faster)
        if (result == null) { // Check if instance exists
            synchronized (practiceSingleton.class) { // Synchronize block for the whole class if instance != exist
               if (result == null) { // Check if another thread has created instance after first lock
                instance = result = new practiceSingleton(); // Create new singleton and set as local variable
               }
            }
        }
        return result; // Return the instance through the local variable
    }

    // Methods go below
}
