import org.junit.Assert.assertEquals
import org.junit.Test
import subtask3.Abbreviation

class Task2AbbreviationTest {

    private val converter = Abbreviation()

    @Test
    fun testAbbreviation1() {
        assertEquals("YES", converter.abbreviationFromA("daBcd", "ABC"))
    }

    @Test
    fun testAbbreviation2() {
        assertEquals("YES", converter.abbreviationFromA("mnbTy", "BT"))
    }

    @Test
    fun testAbbreviation3() {
        assertEquals("YES", converter.abbreviationFromA("qWerty", "WY"))
    }

    @Test
    fun testAbbreviation4() {
        assertEquals("NO", converter.abbreviationFromA("ytrewq", "RY"))
    }

    @Test
    fun testAbbreviation5() {
        assertEquals("NO", converter.abbreviationFromA("abhfs", "ASCI"))
    }

    @Test
    fun testAbbreviation6() {
        assertEquals("NO", converter.abbreviationFromA("aAA", "A"))
    }

    @Test
    fun testAbbreviation7() {
        assertEquals("YES", converter.abbreviationFromA("aaA", "A"))
    }

    @Test
    fun testAbbreviation8() {
        assertEquals("NO", converter.abbreviationFromA("popo", "PPF"))
    }

    @Test
    fun testAbbreviation9() {
        assertEquals("YES", converter.abbreviationFromA("popadanez", "PP"))
    }

    @Test
    fun testAbbreviation10() {
        assertEquals("YES", converter.abbreviationFromA("poPadanez", "PP"))
    }

    @Test
    fun testAbbreviation11() {
        assertEquals("NO", converter.abbreviationFromA("popadAnEz", "PP"))
    }

    @Test
    fun testAbbreviation12() {
        assertEquals("YES", converter.abbreviationFromA("aaaaaaaaaa", "AAAAA"))
    }

    @Test
    fun testAbbreviation13() {
        assertEquals("YES", converter.abbreviationFromA("baaaaaaBaa", "BAA"))
    }

    @Test
    fun testAbbreviation14() {
        assertEquals("NO", converter.abbreviationFromA("baaaaaaBaA", "BAB"))
    }

    @Test
    fun testAbbreviation15() {
        assertEquals("YES", converter.abbreviationFromA("baaaaaaBaA", "BABA"))
    }

    @Test
    fun testAbbreviation16() {
        assertEquals("NO", converter.abbreviationFromA("gdssAdhgfhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation17() {
        assertEquals("YES", converter.abbreviationFromA("gdsasAdhgfhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation18() {
        assertEquals("YES", converter.abbreviationFromA("gdssAdhgafhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation19() {
        assertEquals("YES", converter.abbreviationFromA("gdssadhgafhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation20() {
        assertEquals("NO", converter.abbreviationFromA(
            "babaBAA", "BABA"))
    }

    @Test
    fun testAbbreviation21() {
        assertEquals("NO", converter.abbreviationFromA(
            "baaaaaaBAA", "BABA"))
    }

    @Test
    fun testAbbreviation22() {
        assertEquals("NO", converter.abbreviationFromA(
            "babaaaaABABA", "BABA"))
    }
}
