package hn.edu.pdm_pruebasunitarias_tareainv

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun Factorial_isCorrect() {
        assertEquals(120,factorial(5))
    }



    fun factorial(numero: Int): Int {
            if (numero > 1){
            return numero * factorial(numero - 1)
        } else {
            return numero
        }

    }
}