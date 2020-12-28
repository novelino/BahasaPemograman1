package inheritance

open class pasien : human() {


        var jenis_kel: String = ""
        var no_tlp: Int = 0
        var tgl_masuk: String = ""
        var keluhan: String = ""

        fun diperiksa() {
                println("Pasien $nama berjenis kelamin $jenis_kel, alamat $alamat, nomor telephone $no_tlp, " +
                        "tanggal masuk rumah sakit $tgl_masuk. $nama memiliki keluhan $keluhan")
        }

}