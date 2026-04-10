import java.util.*;
public class UseCase19 {
    public static void main(String[] args) {
        String[] ids = {"BG101","BG102","BG103","BG104"};
        Arrays.sort(ids);
        String key="BG103";
        int l=0,r=ids.length-1;
        boolean found=false;
        while(l<=r){
            int m=(l+r)/2;
            if(ids[m].equals(key)){ found=true; break; }
            else if(ids[m].compareTo(key)<0) l=m+1;
            else r=m-1;
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
