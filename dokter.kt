package inheritance

open class dokter : human(){

    var spesialisasi: String = ""
    var jenis_kel: String = ""

    fun memeriksa(){
        println("Dokter $nama merupakan dokter spesialisasi $spesialisasi" +
                " berjenis kelamin $jenis_kel dan alamatnya di $alamat")
    }

}