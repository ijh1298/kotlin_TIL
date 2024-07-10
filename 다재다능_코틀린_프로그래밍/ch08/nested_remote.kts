interface Remote {
    fun up()
    fun down()
    fun doubleUp() {
        up()
        up()
    }

    companion object {
        fun combine(first: Remote, second: Remote): Remote = object: Remote {
            override fun up() {
                first.up()
                second.up()
            }

            override fun down() {
                first.down()
                second.down()
            }
        }
    }
}

class TV {
    var volume = 0
    val remote: Remote
        get() = TVRemote()
    override fun toString(): String = "Volume: ${volume}"
    inner class TVRemote(): Remote {
        override fun up() {
            volume++
        }

        override fun down() {
            volume--
        }

        override fun toString(): String = "Remote: ${this@TV.toString()}"
    }
}

val tv = TV()
val remote = tv.remote
println("$tv") // volume: 0
remote.up()
println("After increasing: $tv") // After increasing: Volume: 1
remote.doubleUp()
println("After doubleUp: $tv") // After doubleUp: Volume: 3