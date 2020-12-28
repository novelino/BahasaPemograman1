package inheritance

class obat : pasien(){

    var jenis_obat: String = ""

    fun dikonsumsi(){
        println("Pasien dianjurkan mengonsumsi obat berjenis $jenis_obat yang bernama $nama")
    }
}