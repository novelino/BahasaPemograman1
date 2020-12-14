fun main() {

    val elda : Human = Human("Novelino Yoga Ferindra")
    val dito : Human = Human("Agnes")

    Novel.email = "Novel@gmail.com"
    Novel.address = "sleman, Yogyakarta"

    Agnes.email = "Agnes@gmail.com"
    Agnes.address = "sleman, Yogyakarta"

    Novel.talk()
    Agnes.talk()

    Novel.introduce()

    println(Novel.verify("Novel@gmail.com"))

    println(Novel.name)

    val Novel : Novel = Novel
    println(ardi.nationality)

    println(Novel)
}