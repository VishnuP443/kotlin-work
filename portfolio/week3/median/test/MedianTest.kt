// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "List of size one" {
        val floatList = listOf(12.0f)
        median(floatList) shouldBe 12.0f
    }
    
    "List of size two" {
        val floatList = listOf(8.0f, 3.5f)
        median(floatList) shouldBe 5.75f
    }
    
    "List of size three" {
        val floatList = listOf(8.0f, 3.5f, 7.6f)
        median(floatList) shouldBe 7.6f
    }
    
    "List of size four" {
        val floatList = listOf(8.0f, 3.5f, 7.6f, 9.3f)
        median(floatList) shouldBe 7.8f
    } 

    
})
