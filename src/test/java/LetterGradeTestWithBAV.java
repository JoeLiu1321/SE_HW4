import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LetterGradeTestWithBAV {
    @Test
    public void scoreGreaterThan90(){
        assertEquals('A',LetterGrade.letterGrade(91));
    }

    @Test
    public void scoreBetween80And90(){
        assertEquals('B',LetterGrade.letterGrade(80));
        assertEquals('B',LetterGrade.letterGrade(89));
        assertEquals('B',LetterGrade.letterGrade(85));
    }

    @Test
    public void scoreBetween70And80(){
        assertEquals('C',LetterGrade.letterGrade(70));
        assertEquals('C',LetterGrade.letterGrade(79));
        assertEquals('C',LetterGrade.letterGrade(75));
    }

    @Test
    public void scoreBetween60And70(){
        assertEquals('D',LetterGrade.letterGrade(60));
        assertEquals('D',LetterGrade.letterGrade(69));
        assertEquals('D',LetterGrade.letterGrade(65));

    }

    @Test
    public void scoreLessThan60(){
        assertEquals('F',LetterGrade.letterGrade(59));
    }

    @Test
    public void scoreLessThan0(){
        assertEquals('X',LetterGrade.letterGrade(-1));
    }

    @Test
    public void scoreGreaterThan100(){
        assertEquals('X',LetterGrade.letterGrade(101));
    }
}
