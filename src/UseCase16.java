import java.util.*;
class Bogie {String name; int cap; Bogie(String n,int c){name=n;cap=c;}}
public class UseCase16 {
    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(new Bogie("Sleeper",72), new Bogie("AC",64));
        list.sort(Comparator.comparingInt(b->b.cap));
        list.forEach(b->System.out.println(b.name+" "+b.cap));
    }
}
