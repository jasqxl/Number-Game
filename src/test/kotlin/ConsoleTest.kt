import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class ConsoleTest {
    private var console = Console()

    @Test
    fun shouldPrintWelcomeMessage() {
        val stdout = System.out
        val outputStream = ByteArrayOutputStream()
        try {
            System.setOut(PrintStream(outputStream))
            console.start()
            Assertions.assertEquals("Welcome to the Number Game!\n", outputStream.toString())
        } finally {
            System.setOut(stdout)
        }
    }

//    @Test
//    fun shouldReturnTrueIfInputIsCorrect() {
//        console.end()
//
//    }
}
