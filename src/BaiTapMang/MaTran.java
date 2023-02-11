package BaiTapMang;

import java.util.Scanner;

public class MaTran {

	public static void main(String[] args) {

		/*
		 * Nhap ma tran
		 */
		Scanner n = new Scanner(System.in);
		System.out.println("Nhap vao so dong: ");
		int a = n.nextInt();
		System.out.println("Nhap vao so cot: ");
		int b = n.nextInt();
		int mang[][] = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("Nhap phan tu thu [" + (i + 1) + "][" + (j + 1) + "]:");
				mang[i][j] = n.nextInt();
			}
		}
		/*
		 * tinh tong ma tran
		 */
		int s=0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				s+=mang[i][j];
			}
		}
		System.out.println("Tong ma tran la: " + s);

		/*
		 * xuat ma tran
		 */
		System.out.println("Ma tran sau khi nhap la: ");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(mang[i][j] + " ");
			}
			System.out.println();
		}
	}

}
