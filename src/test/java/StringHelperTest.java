import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AinFirstTwoPositions(){
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinTwoLastPositions(){
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NoAinAnyPosition(){
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    //TODO rewriting this as parameterized test
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_TwoLettersScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    //TODO rewriting this as parameterized test
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_OneLetterScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}