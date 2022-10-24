package CokBoyutDizi;

import java.util.Scanner;

public class Kuresel {

	public static void main(String[] args) {
		int[] soru1= {1,2,3,4};
		int[] soru2= {1,2,3,4};
		int[] soru3= {1,2,3,4};
		int[] soru4= {1,2,3,4};
		int[] soru5= {1,2,3,4};
		
		int cevap1=0,cevap2=0,cevap3=0,cevap4=0,cevap5;
		int dogru=0;

		System.out.println("a-1 b-2 c-3 d-4");
		System.out.printf("Hangi ulke en cok zarar vermektedir");
		
		System.out.printf("a-cin b almanya  c-turkiye d-abd");
		Scanner scanner=new Scanner(System.in);
		cevap1=scanner.nextInt();
		int[] soru;
		if(cevap1==soru1[0]) {
			dogru=dogru+1;
			System.out.println("dogru cevap");
		}
		System.out.printf("Sera salimini zararlimi");
		System.out.printf("a-evet b hayir c-olabilir d-bilmem");
		Scanner scanner1=new Scanner(System.in);
		cevap2=scanner1.nextInt();
		if(cevap2==soru2[2]) {
			dogru=dogru+1;
			System.out.println("dogru cevap");
		}
		System.out.printf("hangi hayvan korunmasizdir");
		System.out.printf("a-denizgergedani b at c-kopek d-kedi");
		Scanner scanner2=new Scanner(System.in);
		cevap3=scanner2.nextInt();
		if(cevap3==soru3[2]) {
			dogru=dogru+1;
			System.out.println("dogru cevap");
		}
		System.out.printf("kuresel isinmadan zarar goren gezegen");
		System.out.printf("a-venus b jupiterc-dunya d-mars");
		Scanner scanner3=new Scanner(System.in);
		cevap4=scanner3.nextInt();
		if(cevap4==soru4[0]) {
			dogru=dogru+1;
			System.out.println("dogru cevap");
		}
		System.out.printf("ne kadar canli oluyor");
		System.out.printf("a-500 b 1000c-200");
		Scanner scanner4=new Scanner(System.in);
		cevap5=scanner4.nextInt();
		if(cevap5==soru5[0]) {
			dogru=dogru+1;
			System.out.println("dogru cevap");
		}
		if(dogru==5) {
			System.out.println("mukemmel");
		}
		if(dogru==4) {
			System.out.println("cokiyi");
		}
		else {
			System.out.println("bilgileri tazele");
		}
}


}

		
		

