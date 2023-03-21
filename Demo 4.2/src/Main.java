import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        Hewan.add("Kelinci");
        Hewan.add("Unta");
        
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        
        
        System.out.println("Hewan : " );
        System.out.println(Hewan);
        System.out.println("Hewan Yang Dihapus : " );
        System.out.println(DeleteHewan);
        
        Hewan.removeAll(DeleteHewan);
        
        System.out.println("Output Hewan : " );
        System.out.println(Hewan);
    }
}
