public class UseCase18 {
    public static void main(String[] args) {
        String[] ids = {"BG101","BG102","BG103"};
        String key = "BG102";
        boolean found = false;
        for(String id: ids){
            if(id.equals(key)){ found=true; break; }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
