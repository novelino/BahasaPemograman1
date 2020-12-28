package inheritance

class mahasiswa : orang() {

    var nim: String = ""
    var prodi: String = ""


    fun belajar(){
        println("Saya belajar di prodi $prodi")
    }
}