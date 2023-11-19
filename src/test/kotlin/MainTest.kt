import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MainTest {

    @Test
    fun `Selection Sort returns Sorted Array`() {
        val main = Main(arrayOf(3, 20, -4, 23, 4, 5))
//        val originalArr = main.getArr().copyOf()

        main.selectionSort(main.getArr())
        var result = main.getArr()
        assertThat(result).isEqualTo(arrayOf(-4, 3, 4, 5, 20, 23))


    }
}