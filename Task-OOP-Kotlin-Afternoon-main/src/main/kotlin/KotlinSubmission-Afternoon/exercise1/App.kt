package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Hasany"
    val lastName: String = "Ibrohim"
    val umur : Int = 21
    val Status : Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $umur")
    println("Status: ${if (Status) "Single" else "Tidak Single"}")
    println("\n")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(i: Int): List<Any> {
    val anggota = listOf<String>("Raihanah Luthfiyah Rosanti",
            "Fatah Muhamad Fikrudin",
            "sultan alif",
            "Hasany Ibrohim",
            "Titin ",
            "Andi sarippudin",
            "Muhammad Andra Fahreza ",
            "Tri Saputra. S",
            "Rikza Akmal Habibi",
            "aizal irawan",
            "Muhammad Raviedul Huda")
    if (i < 2){
        return listOf(anggota[3])
    }else{
        return(anggota)
        }

}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("KAK JOY", "KAK MAUl")
    val countOfGroup = 11

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()
    var y: Int = 1
    val myTeam = myTeam(y)
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("8", myTeam(y+1), "A Afternoon")


}