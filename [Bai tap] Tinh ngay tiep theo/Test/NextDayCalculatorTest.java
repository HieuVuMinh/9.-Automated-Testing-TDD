import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void findNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int expectedDay = 2;
        int expectedMonth = 1;
        int expectedYear= 2018;

        int resultDay = NextDayCalculator.findNextDay(day);
        assertEquals(expectedDay, resultDay);
        int resultMonth = NextDayCalculator.findNextMonth(month);
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.findNextYear(year);
        assertEquals(expectedYear, resultYear);
    }
}