import java.util.*;
public class maintodolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t=== Welcome Program To do list ===");
        boolean trem = true;
        processtodolist ps = new processtodolist();
        ArrayList<String>plus=new ArrayList<>();
        while (trem) {
            for(String showlist : plus){
                System.out.println(showlist);
            }
            ps.List();
            String option = sc.next();
            switch (option) {
                case "เพิ่ม":
                System.out.println("ระบุได้เลย");
                String Plus = sc.next();
                plus.add(Plus);
                continue;
                case "ลบ": 
                for(String showlist : plus){
                System.out.println(showlist);}
                plus.clear();
                continue;
                case "ออก":trem=false; break;
                default:System.out.println("ระบุไม่ถูกต้อง"); break;
            }
        }
        sc.close();
    }
}