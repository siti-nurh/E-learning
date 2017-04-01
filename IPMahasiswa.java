import java.util.Scanner;

	public class IPMahasiswa {
public static Scanner input = new Scanner(System.in);
public static int isWithinRange(float x, float min, float max) { //cek range ip
byte result = 1;//return 1 jika x valid
if (x < min || x > max) {
result = 0;
}
return result;
}
public static void main(String[] args) {
float ip = 0, total_ip = 0, rerata = 0;
int jml_mhs = 0, mhs_lulus = 0, mhs_gagal = 0;
boolean exit = false;
/*
Data
1. Berapa banyak Mahasiswa dengan IP Valid
2. Mahasiswa yang lulus; (ip >= 2.75)
3. Mahasiswa yang tidak lulus
4. Rata-rata IP di kelas tersebut, data ip salah diabaikan
5. Jika tidak ada IP valid, tampilkan pesan "Data tidak ada atau kosong".
*/
System.out.println();
System.out.println("	Masukan");
System.out.println();
do {
System.out.print("IP Mahasiswa : ");
ip = input.nextFloat();
if (isWithinRange(ip, 0, 4) == 1) {
jml_mhs++;
if (isWithinRange(ip, 2.75f, 4) == 1) {
mhs_lulus++;
}
else {
mhs_gagal++;
}
total_ip += ip;
}
else if (ip < 0) {
exit = true;
}
else {
//abaikan
}
} while (!exit);
System.out.println();
System.out.println("	Keluaran");
System.out.println();
if (jml_mhs > 0) {
rerata = total_ip / jml_mhs;
System.out.println("Berapa banyak Mahasiswa : " + jml_mhs);
System.out.println("Mahasiswa yang Lulus (IP >= 2.75) : " + mhs_lulus);
System.out.println("Mahasiswa yang Tidak Lulus : " + mhs_gagal);
System.out.println("Rata-Rata IP Mahasiswa : " + rerata);
}
else {
System.out.println("Data tidak ada atau kosong.");
}
}
}


