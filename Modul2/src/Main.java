import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan");
        System.out.println(Hewan.get(0));
        System.out.println(Hewan.get(1));
        System.out.println(Hewan.get(2));
        System.out.println(Hewan.get(3));
        System.out.println(Hewan.get(4));
        System.out.println(Hewan.get(5));
        System.out.println(Hewan.get(6));

        System.out.println("Hewan Yang Dihapus");
        System.out.println(DeleteHewan.get(0));
        System.out.println(DeleteHewan.get(1));
        System.out.println(DeleteHewan.get(2));

        Hewan.removeAll(DeleteHewan);

        System.out.println("Output Hewan");
        System.out.println(Hewan);
    }
}