package inheritance

class asisten_dokter : dokter(){

    var pendidikan: String = ""

    fun membantu(){
        println("Dokter dibantu oleh asisten bernama $nama yang masih berpendidikan $pendidikan")
    }
}