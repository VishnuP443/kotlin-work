// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "A mark less than 0 or greater than 100 gives a ?"() {
       withClue("Mark = ?") { grade(-1) shouldBe "?" }
       withClue("Mark = ?") { grade(-10) shouldBe "?" }
       withClue("Mark = ?") { grade(101) shouldBe "?" }
       withClue("Mark = ?") { grade(110) shouldBe "?" }  
    }
    "A mark between 0 and 39 gives a Fail"() {
       withClue("Mark = Fail") { grade(0) shouldBe "Fail" }
       withClue("Mark = Fail") { grade(39) shouldBe "Fail" }
       withClue("Mark = Fail") { grade(23) shouldBe "Fail" }
    }
    "A mark between 40 and 69 gives a Pass"() {
       withClue("Mark = Pass") { grade(40) shouldBe "Pass" }
       withClue("Mark = Pass") { grade(69) shouldBe "Pass" }
       withClue("Mark = Pass") { grade(53) shouldBe "Pass" }
    }
    "A mark between 70 and 100 gives a Distinction"() {
       withClue("Mark = Distinction") { grade(70) shouldBe "Distinction" }
       withClue("Mark = Distinction") { grade(100) shouldBe "Distinction" }
       withClue("Mark = Distinction") { grade(82) shouldBe "Distinction" }
    }
})
