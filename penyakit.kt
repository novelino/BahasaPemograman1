package inheritance

class penyakit {
    var nama: String = ""
    var tgl_periksa: String = ""

    fun diderita(){
        println("Pasien periksa pada tanggal $tgl_periksa dan didiagnosis sakit $nama")
    }
}