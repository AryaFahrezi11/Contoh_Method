import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohMethod {

// Method / function / fungsi adalah blok kode yang berisi perintah2 yang akan dijalankan ketika method tersebut dipanggil.
public static void main(String[] args) throws IOException {
    // penjumlahan dua angka
    Cetakjudul();// function / method
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Masukan Angka 1 : ");
    int x = Integer.parseInt(reader.readLine());// diisi angka 3
    System.out.print("Masukan angka 2 : ");
    int y = Integer.parseInt((reader.readLine()));// diisi angka 10
    System.out.println(x + y);

    System.out.println("Hitung Penjumlahan Dua angka Menggunakan Method");
    // Method Type 1
    JumlahDuaAngka();// function

    // Method Type 2
    Jumlah_Method2(x, y);// Jumlah_Method2(3,10)

    // Method Type 3
    int ary = Jumlah_Method3();// Function
    System.out.println(ary);// 12
}
// Routines / sub program
private static void Cetakjudul() { System.out.println(" Contoh Penjumlahan Dua Angka Tanpa Menggunakan Method");}

private static int Jumlah_Method3() throws IOException {
    BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Masukan Number1 : ");
    int number1 = Integer.parseInt(baca.readLine()); //5
    System.out.print("masukan Number2 : ");
    int number2 = Integer.parseInt((baca.readLine())); // 7
    return number1+number2;
}

private static void Jumlah_Method2(int number1, int number2) {System.out.println(number1+number2); }

private static void JumlahDuaAngka() throws IOException {
    BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Masukan Number1 : ");
    int number1 = Integer.parseInt(baca.readLine());
    System.out.print("Masukan Number2 : ");
    int number2 = Integer.parseInt((baca.readLine()));
    System.out.print(number1+number2);
}
// Tipe Method :
// 1. Method Tanpa Parameter dan Tanpa Return Value(Void)
// 2. Method Dengan Parameter dan Tanpa Return Value(Void)
// 3. Method Tanpa Parameter dan Dengan Return Value (Non Void)
// 4. Method Dengan Parameter dan Dengan Return Value (Non Void)
}