public class enküçükeleman {
    public static void main(String[] args) {

        double[] dizi={10,11,12,13,9,8,22223,999999,1000000};
        double enKucuk= dizi[0];
        
        for (double sayi: dizi) {
            if(enKucuk > sayi)
                enKucuk = sayi;

        }
        System.out.format("Dizideki En Küçük Sayı=%.2f \n",enKucuk);

    }
    
}
