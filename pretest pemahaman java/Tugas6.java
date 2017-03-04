public class Tugas6{
	public static void main(String []args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Masukkan Nilai anda = ");
	int n = scanner.nextInt();
	String hasil = Tampilkan(n);
	System.out.println("Nilai yang anda masukkan adalah = " + n + "berarti anda " + hasil);

}
	public static String Tampilkan(int a){
	int n = a;

	String hasil;
	if (n<60){
	hasil = "tidak lulus";} else{ hasil = "Lulus";}

	return hasil;
}

}
