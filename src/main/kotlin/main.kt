

fun main() {
    val likes = 201
    val residue = (likes % 10).toString()
    val strLikes = likes.toString()
    if (likes > 10 && ("${strLikes[strLikes.length - 1]}${strLikes[strLikes.length - 2]}") == "11") {
        println("Понравилось $likes людям")
    } else if ("${residue[residue.length - 1]}" == "1") {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}