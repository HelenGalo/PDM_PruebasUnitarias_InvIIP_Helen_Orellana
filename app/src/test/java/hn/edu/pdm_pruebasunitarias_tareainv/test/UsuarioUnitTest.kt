package hn.edu.pdm_pruebasunitarias_tareainv.test

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UsuarioUnitTest {
    @Test
    fun ValidarUsuario() {
        assertEquals("Helen",Usuario(usuario ="BRENDA" ))
    }



    fun Usuario(usuario:String):String {
        if (usuario=="Helen"){

        }
        return usuario.toString()

    }

}