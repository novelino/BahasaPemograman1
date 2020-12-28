package inheritance

class tindakan : dokter(){

    var jenis_tindakan: String = ""

    fun diberi(){
        println("Pasien diberikan tindakan $nama dan $jenis_tindakan")
    }
}