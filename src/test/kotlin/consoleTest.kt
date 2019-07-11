import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class ConsoleTest {
    private var console = Console(Number(Validator()))

    @Test
    fun shouldPrintWelcomeMessage() {
        val stdout = System.out
        val outputStream = ByteArrayOutputStream()
        try {
            System.setOut(PrintStream(outputStream))
            console.play()
            Assertions.assertEquals("Welcome to the Validator Game!\n", outputStream.toString())
        } finally {
            System.setOut(stdout)
        }
    }
}
