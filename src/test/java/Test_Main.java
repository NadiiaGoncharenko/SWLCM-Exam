import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_Main {

    @Test
    public void Test_Given_When_ProgramStarts_Then_CorrectAnswerIsExpected() {

        //arrange
        String expected = " Hello Exam";
        //act

        String actual = Main.GetMessage();

        //Assert

        Assertions.assertEquals(expected, actual);

    }
}
