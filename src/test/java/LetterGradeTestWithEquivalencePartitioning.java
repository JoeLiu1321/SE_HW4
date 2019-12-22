import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterGradeTestWithEquivalencePartitioning{
    @Test
    public void scoreGreaterThan90(){
        assertEquals('A',LetterGrade.letterGrade(99));
    }

    @Test
    public void scoreBetween80And90(){
        assertEquals('B',LetterGrade.letterGrade(80));
    }

    @Test
    public void scoreBetween70And80(){
        assertEquals('C',LetterGrade.letterGrade(79));
    }

    @Test
    public void scoreBetween60And70(){
        assertEquals('D',LetterGrade.letterGrade(65));

    }

    @Test
    public void scoreLessThan60(){
        assertEquals('F',LetterGrade.letterGrade(0));
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
