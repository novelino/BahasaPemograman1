package inheritance

class ruang : pasien() {

    var nama_ruang: String = ""
    var kelas_perawatan: Int =0
    var jml_kasur: Int=0

    fun disediakan(){
        println("Pasien memesan ruang $nama_ruang kelas $kelas_perawatan yang memiliki $jml_kasur tempat tidur")
    }
}