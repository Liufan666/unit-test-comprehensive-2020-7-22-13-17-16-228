package example;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumebr guessNumebr = new GuessNumebr(answerGenerator);
        int[] inputGuess = {1,2,3,4};
        //when
        String result = guessNumebr.guess(inputGuess);
        //then
        assertEquals("4A0B",result);
    }
    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678(){
        //given
        int[] answer = {5,6,7,8};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumebr guessNumebr = new GuessNumebr(answerGenerator);
        int[] inputGuess = {1,2,3,4};
        //when
        String result = guessNumebr.guess(inputGuess);
        //then
        assertEquals("0A0B",result);
    }
    @Test
    void should_return_2A0B_when_guess_given_answer_1234_and_input_guess_1256(){
        //given
        int[] answer = {5,6,7,8};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumebr guessNumebr = new GuessNumebr(answerGenerator);
        int[] inputGuess = {1,2,5,6};
        //when
        String result = guessNumebr.guess(inputGuess);
        //then
        assertEquals("2A0B",result);
    }
}
