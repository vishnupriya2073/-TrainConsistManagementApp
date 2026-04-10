public class UseCase15 {
    public static void main(String[] args) {
        try {
            int cargoWeight = 120;
            if (cargoWeight > 100) throw new Exception("Overload!");
            System.out.println("Cargo Assigned");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Check Completed");
        }
    }
}
