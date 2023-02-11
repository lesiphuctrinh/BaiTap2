package BaiTapMang;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float mang[]=Main.nhapmang();
		float s=Main.tong(mang);
		System.out.println("Tong cua mang: " + s);
		float sn=Main.tongsnt(mang);
		System.out.println("Tong so nguyen to trong mang: " + sn);
		float mi=Main.min(mang);
		System.out.println("Gia tri min: " + mi);
		float ma=Main.max(mang);
		System.out.println("Gia tri max: " + ma);
		float su=Main.tbc(mang);
		System.out.println("Gia tri trung binh: " + su);
		float r=Main.minmax(mang);
		System.out.println("Tong gia tri min max: " + r);
	}
	/*
	 * nhap mang
	 */
	public static float[] nhapmang() {
		int n;
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		n=nhap.nextInt();
		float mang[]=new float[n];
		for(int i=0; i<n; i++) {
			mang[i]=nhap.nextFloat();
		}
		return mang;
	}
	/*
	 * tinh tong mang
	 */
	public static float tong(float mang[]) {
		int t=0;
		for(int i=0; i<mang.length; i++) {
			t+=mang[i];
		}
		return t;
	}
	/*
	 * check nguyen to
	 */
	public static boolean snt(int n) {
		if(n<2)
			return false;
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	/*
	 * tinh tong so nguyen to
	 */
	public static float tongsnt(float mang[]) {
		int s=0;
		for(int i=0; i<mang.length; i++) {
			int n=(int)mang[i];
			if(n==mang[i] && snt(n))
				s+=n;
		}
		return s;
	}
	/*
	 * tim min
	 */
	public static float min(float mang[]) {
		float m=Float.MAX_VALUE;
		for(int i=0; i<mang.length; i++) {
			if(m > mang[i])
				m=mang[i];
		}
		return m;
	}
	/*
	 * tim max
	 */
	public static float max(float mang[]) {
		float m=Float.MIN_VALUE;
		for(int i=0; i<mang.length; i++) {
			if(m < mang[i])
				m=mang[i];
		}
		return m;
	}
	/*
	 * trung binh cong
	 */
	public static float tbc(float mang[]) {
		float s=tong(mang);
		return s/mang.length;
	}
	/*
	 * tong min max
	 */
	public static float minmax(float mang[]) {
		float t=0;
		t+=max(mang)+min(mang);
		return t;
	}
	
}