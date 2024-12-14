import java.util.ArrayList;
import java.util.List;

public class Rendeles {
    private List<Etel> etelek = new ArrayList<>();

    public void addEtel (Etel etel){
        etelek.add(etel);
    }
    public void pushRendeles(){
        System.out.println("Rendelésed: ");
        for (Etel etel : etelek){
            etel.leiras();
        }
    }
    public int osszeg(){
        int total = 0;
        for (Etel etel : etelek){
            total += etel.getAr();
        }
        return total;
    }
}