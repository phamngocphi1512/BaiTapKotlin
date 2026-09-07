import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val hoTen = "Phạm Ngọc Phi"
    val stt = 29

    println("--- Nhập điểm ---")
    print("Nhập điểm Math: ")
    val math = scanner.nextDouble()
    
    print("Nhập điểm Programming: ")
    val programming = scanner.nextDouble()
    
    print("Nhập điểm Database: ")
    val database = scanner.nextDouble()

    println("\n--- Kết quả ---")
    println("Sinh viên: $hoTen - STT: $stt")
    val total = math + programming + database
    val average = total / 3.0

    println("- Tổng điểm: $total")
    println("- Điểm trung bình: $average")
}