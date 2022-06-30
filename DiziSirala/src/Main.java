import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		        Scanner deger = new Scanner(System.in);
		       System.out.println("Dizinin boyutunu giriniz :");
		        int boyut = deger.nextInt();

		        int[] dizi = new int[boyut];
		        for(int i=0;i<boyut;i++)
		        {
		            System.out.print(i+". elemani giriniz: ");
		            int sayi = deger.nextInt();
		            dizi[i] = sayi;
		        }
		        Arrays.sort(dizi);
		        System.out.print("Siralanan Dizi : " + Arrays.toString(dizi));
	}

}
