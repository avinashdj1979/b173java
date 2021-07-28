package edu.vcentry.recap.objectex;

public class ObjectAsReference {

	public static void main(String[] args) {
		new Vehicle("SuperType").getType();
		
//		Vehicle v = new Vehicle("My Type");
//
//		// v.changeType(v);
//		// System.out.println(v.getType());
//
//		Vehicle v1 = v;
//		v1.setType("Changed Type");
//		v.setType("My Type");
//
//		System.out.println(v.getType());
//		System.out.println(v1.getType());

//		int[] a = { 1, 2, 3, 4 };
//		int[] b = a;
//		
//		b[3] = 6;
//		
//		System.out.println(a[3]);
		
		int a1 = 6;
		int b1 = a1;
		
		b1 = 9;
		
		System.out.println(a1);

	}

}
