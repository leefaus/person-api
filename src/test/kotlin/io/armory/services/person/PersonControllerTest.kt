package io.armory.services.person

import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
internal class PersonControllerTest {

    val personController = PersonController()

    @Test
    fun greetingWithValue() {
        val result = personController.greeting(name = "Armory")
        assertNotNull(result)
        assertEquals("Hello, Armory", result.content )
    }
}