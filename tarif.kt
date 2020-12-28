package inheritance

class tarif {
    var tarif_dokter: Int = 0
    var tarif_ruang: Int = 0
    var tarif_tindakan: Int = 0
    var tarif_obat: Int = 0
    var tarif_penunjang: Int = 0
    var total_tarif: Int = 0

    fun dikenakan(){
        println("Pasien dikenakan total tarif ${(tarif_dokter+tarif_ruang+tarif_tindakan+tarif_obat+tarif_penunjang).also { total_tarif = it }} yang terdiri dari :" +
                "  tarif dokter $tarif_dokter, tarif ruang $tarif_ruang, tarif tindakan $tarif_tindakan," +
                " tarif obat $tarif_obat, tarif penunjang $tarif_penunjang")
    }

}