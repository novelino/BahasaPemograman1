package inheritance

class penunjang : pasien(){
    var jenis_penunjang: String = ""
    var hasil_penunjang: String = ""
    var tgl_periksa: String = ""

    fun diberi(){
        println("Penunjang berisi jenis pemeriksaan : $jenis_penunjang, hasil pemeriksaan : $hasil_penunjang, " +
                "dan tanggal periksa $tgl_periksa")
    }
}