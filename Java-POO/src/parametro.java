public class parametro {
	public static void somarArray(int[] x)
	{
		x[2] = x[1] + x[0];
	}
	public static void main(String args[])
	{
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 10;
		a[2] = 20;
		System.out.println("antes >"+ a[2]);
		somarArray(a);
		System.out.println("depois >"+ a[2]);
	}
}


