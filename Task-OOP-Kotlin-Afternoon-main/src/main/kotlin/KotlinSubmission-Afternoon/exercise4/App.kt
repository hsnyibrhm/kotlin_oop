package id.infinitelearning.KotlinSubmission.exercise4

//fun main() {
//
//}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun main() {
    println("Masukkan Score : ")
        try {
            val inScore = readLine()
            val score = inScore?.toInt()
            var result: String = ""

            if (score in 90..100) {
                result = "Selamat! Anda mendapatkan nilai A."
            } else if (score in 80..89) {
                result = "Anda mendapatkan nilai B."
            } else if (score in 70..79) {
                result = "Anda mendapatkan nilai C."
            } else if (score in 60..69) {
                result = "Anda mendapatkan nilai D."
            } else {
                result = "Anda mendapatkan nilai E."
            }

            println(result)
        } catch (e: NumberFormatException) {
            println("Data Tidak Valid, Harap Masukkan dalam Bentuk Integer")
        }
}