package inheritance

fun main(){

    val afrig = dosen()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "Condongcatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = mahasiswa()
    andika.nama = "Andika Maharani"
    andika.alamat ="Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()

    val budi = satpam()
    budi.nama = "Budi Satria"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "Pos Barat"
    budi.menjaga()

    println()
    println()
    val dino = dokter()
    dino.nama = "Dino Hardiansyah"
    dino.perkenalan()
    dino.alamat = "Sleman"
    dino.jenis_kel = "Laki-laki"
    dino.spesialisasi = "Saraf"
    dino.memeriksa()

    val ega = asisten_dokter()
    ega.nama = "Ega Brahmantya"
    ega.pendidikan = "S1-keperawatan"
    ega.membantu()

    println()

    val fahmi = pasien()
    fahmi.nama = "Muhammad Fahmi Azriel"
    fahmi.perkenalan()
    fahmi.jenis_kel = "Laki-laki"
    fahmi.no_tlp = +628124353
    fahmi.alamat = "Condongcatur"
    fahmi.tgl_masuk = "22 November 2019"
    println()
    fahmi.keluhan = "Tangan bengkok dan sakit setelah terjatuh dari sepeda"
    fahmi.diperiksa()

    val kamar = ruang()
    kamar.nama_ruang = "Cenderawasih"
    kamar.kelas_perawatan = 1
    kamar.jml_kasur = 2
    kamar.disediakan()

    val sakit = penyakit()
    sakit.nama = "Fraktur"
    sakit.tgl_periksa = "22 November 2019"
    sakit.diderita()

    val cek = tindakan()
    cek.nama = "Pemindaian/Rontgen"
    cek.jenis_tindakan = "pindai dua atau tiga dimensi"
    cek.diberi()

    val pil = obat()
    pil.nama = "Opioid"
    pil.jenis_obat = "Penghilang rasa sakit"
    pil.dikonsumsi()

    val berkas = penunjang()
    berkas.jenis_penunjang = "Pemindaian/Rontgen"
    berkas.tgl_periksa = "21 November 2019"
    berkas.hasil_penunjang = "Retak di bagian tangan"
    berkas.diberi()

    val total = tarif()
    total.tarif_dokter = 50000
    total.tarif_obat = 25000
    total.tarif_penunjang = 2000
    total.tarif_ruang = 3000000
    total.tarif_tindakan = 200000
    total.total_tarif
    total.dikenakan()

    val pulang = ringkasan_kepulangan()
    pulang.tgl_pulang = "30 November 2019"
    pulang.keadaan_pulang = "pemulihan menggunakan gips"
    pulang.dicatat()
}