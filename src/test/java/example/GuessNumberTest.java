package example;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,2,3,4};
        //when
        String result = guessNumeber.guess(inputGuess);
        //then
        assertEquals("4A0B",result);
    }
    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {5,6,7,8};
        //when
        String result = guessNumeber.guess(inputGuess);
        //then
        assertEquals("0A0B",result);
    }
    @Test
    void should_return_2A0B_when_guess_given_answer_1234_and_input_guess_1256(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,2,5,6};
        //when
        String result = guessNumeber.guess(inputGuess);
        //then
        assertEquals("2A0B",result);
    }
    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4321(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {4,3,2,1};
        //when
        String result = guessNumeber.guess(inputGuess);
        //then
        assertEquals("0A4B",result);
    }
    @Test
    void should_return_2A2B_when_guess_given_answer_1234_and_input_guess_1243(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,2,4,3};
        //when
        String result = guessNumeber.guess(inputGuess);
        //then
        assertEquals("2A2B",result);
    }
    @Test
    void should_return_1A1B_when_guess_given_answer_1234_and_input_guess_1357(){
        //given
        int[] answer = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,3,5,7};
        //when
        String result = guessNumeber.guess(inputGuess);
        //then
        assertEquals("1A1B",result);
    }
    @Test
    void should_return_true_when_isLegal_given_input_guess_1234(){
        //given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,2,3,4};
        //when
        boolean result = guessNumeber.isLegal(inputGuess);
        //then
        assertTrue(result);
    }
    @Test
    void should_return_false_when_isLegal_given_input_guess_123(){
        //given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,2,3};
        //when
        boolean result = guessNumeber.isLegal(inputGuess);
        //then
        assertFalse(result);
    }
    @Test
    void should_return_false_when_isLegal_given_input_guess_1233(){
        //given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);

        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        int[] inputGuess = {1,2,3,3};
        //when
        boolean result = guessNumeber.isLegal(inputGuess);
        //then
        assertFalse(result);
    }
    @Test
    void should_return_true_when_isLegal_given_answer_by_generate(){
        //given
        AnswerGenerator answerGenerator = new AnswerGenerator();
        int[] answer = answerGenerator.generate();
        GuessNumeber guessNumeber = new GuessNumeber(answerGenerator);
        //when
        boolean result = guessNumeber.isLegal(answer);
        //then
        assertTrue(result);
    }

}
