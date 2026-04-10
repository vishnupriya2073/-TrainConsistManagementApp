public class UseCase20 {
    public static void main(String[] args) {
        String[] ids = {"BG101","BG102"};
        String key = null;
        try {
            for(String id: ids){
                if(id.equals(key)){
                    System.out.println("Found");
                    return;
                }
            }
            System.out.println("Not Found");
        } catch (Exception e) {
            System.out.println("Error during search: " + e);
        }
    }
}
