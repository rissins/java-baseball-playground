package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void containTest(){
        List<Integer> list = Arrays.asList(1, 2);

        assertThat(list).contains(1);
        assertThat(list).containsExactly(1, 2);

    }
    @Test
    void subStringTest(){
        String str = "(1, 2)";
        String result = str.substring(1, 5);
        System.out.println(result);

    }
    @Test
    @DisplayName("특정위치 문자열 추출")
    void charAtTest(){
        String str = "abc";
        char result = str.charAt(1);
        System.out.println(result);
    }

    @Test
    @DisplayName("문자의 위치를 벗어날 때 테스트")
    void charAt(){
        assertThatThrownBy(() -> {"abc".charAt(5); }).isInstanceOf(StringIndexOutOfBoundsException.class)
//                .hasMessage("index: %s, Size: %s", 2, 2)
//                .hasMessageContaining("2");
                .hasMessage("Index: %s, Size: %s", 2, 2)
                .hasMessageStartingWith("Index: 2")
                .hasMessageContaining("2")
                .hasMessageEndingWith("Size: 2")
                .hasMessageMatching("Index: \\d+, Size: \\d+")
                .hasCauseInstanceOf(IOException.class)
                .hasStackTraceContaining("java.io.IOException");
    }




}
