import java.util.Scanner; //kullanıcıdan alınan toplama işlemi
public class toplama2 {
    public static void main(String[] args) {
        System.out.println("------------");
        Scanner oku=new Scanner (System.in);
        System.out.println("birinci sayıyı giriniz=");
        int sayi1=oku.nextInt();
        System.out.println("ikinci sayıyı giriniz=");
        int sayi2=oku.nextInt();

        System.out.println(sayi1+sayi2);
    }
    
}
