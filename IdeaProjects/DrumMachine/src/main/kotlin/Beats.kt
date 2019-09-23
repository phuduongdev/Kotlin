import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(150 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(file)
    )
    clip.open(audioInputStream)
    clip.start()
}

suspend fun main() {
    for (i in 1..4) {
        popRyhm()
    }
}

suspend fun popRyhm() {
//    GlobalScope.launch {
//        playBeats("x-----x-x-------", "audio/kick_drum.aiff")
//    }
//    GlobalScope.launch { playBeats("x-x-x-x-x-x-x-x-", "audio/high_hat.aiff") }
//    playBeats("----x-------x---", "audio/snare.aiff")
    runBlocking {
        launch { playBeats("x-----x-x-------", "audio/kick_drum.aiff") }
        launch { playBeats("----x-------x---", "audio/snare.aiff") }
        playBeats("x---x---x---x---", "audio/high_hat.aiff")
    }

}