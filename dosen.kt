package inheritance

class dosen : karyawan(){

    var prodi: String = ""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi")
    }
}