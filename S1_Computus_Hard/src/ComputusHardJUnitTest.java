// Import the relevant JUnit classes
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputusHardJUnitTest {

    // Source of Easters: https://webspace.science.uu.nl/~gent0113/easter/easter_text2b.htm
    @Test
    void testalgorithGregorian() {

        // Test different cases
        ComputusHard easter1 = new ComputusHard(1598);
        assertEquals("March 22",easter1.algorithmGregorian());
        ComputusHard easter2 = new ComputusHard(1595);
        assertEquals("March 26",easter2.algorithmGregorian());
        ComputusHard easter3 = new ComputusHard(1587);
        assertEquals("March 29",easter3.algorithmGregorian());
        ComputusHard easter4 = new ComputusHard(1584);
        assertEquals("April 1",easter4.algorithmGregorian());
        ComputusHard easter5 = new ComputusHard(1589);
        assertEquals("April 2",easter5.algorithmGregorian());
        ComputusHard easter6 = new ComputusHard(1583);
        assertEquals("April 10",easter6.algorithmGregorian());
        ComputusHard easter7 = new ComputusHard(1599);
        assertEquals("April 11",easter7.algorithmGregorian());
        ComputusHard easter8 = new ComputusHard(1591);
        assertEquals("April 14",easter8.algorithmGregorian());
        ComputusHard easter9 = new ComputusHard(1593);
        assertEquals("April 18",easter9.algorithmGregorian());
        ComputusHard easter10 = new ComputusHard(1585);
        assertEquals("April 21",easter10.algorithmGregorian());
        ComputusHard easter11 = new ComputusHard(1666);
        assertEquals("April 25",easter11.algorithmGregorian());
        ComputusHard easter12 = new ComputusHard(1639);
        assertEquals("April 24",easter12.algorithmGregorian());
        ComputusHard easter13 = new ComputusHard(1628);
        assertEquals("April 23",easter13.algorithmGregorian());
        ComputusHard easter14 = new ComputusHard(1631);
        assertEquals("April 20",easter14.algorithmGregorian());
        ComputusHard easter15 = new ComputusHard(1609);
        assertEquals("April 19",easter15.algorithmGregorian());
        ComputusHard easter16 = new ComputusHard(1623);
        assertEquals("April 16",easter16.algorithmGregorian());
        ComputusHard easter17 = new ComputusHard(1607);
        assertEquals("April 15",easter17.algorithmGregorian());
        ComputusHard easter18 = new ComputusHard(1977);
        assertEquals("April 10",easter18.algorithmGregorian());
        ComputusHard easter19 = new ComputusHard(1966);
        assertEquals("April 10",easter19.algorithmGregorian());
        ComputusHard easter20 = new ComputusHard(1955);
        assertEquals("April 10",easter20.algorithmGregorian());
        ComputusHard easter21 = new ComputusHard(2411);
        assertEquals("April 10",easter21.algorithmGregorian());
        ComputusHard easter22 = new ComputusHard(2349);
        assertEquals("April 10",easter22.algorithmGregorian());
        ComputusHard easter23 = new ComputusHard(2338);
        assertEquals("April 10",easter23.algorithmGregorian());
        ComputusHard easter24 = new ComputusHard(2941);
        assertEquals("April 9",easter24.algorithmGregorian());
        ComputusHard easter25 = new ComputusHard(2930);
        assertEquals("April 9",easter25.algorithmGregorian());
        ComputusHard easter26 = new ComputusHard(2023);
        assertEquals("April 9",easter26.algorithmGregorian());
        ComputusHard easter27 = new ComputusHard(1950);
        assertEquals("April 9",easter27.algorithmGregorian());
        ComputusHard easter28 = new ComputusHard(2034);
        assertEquals("April 9",easter28.algorithmGregorian());
        ComputusHard easter29 = new ComputusHard(1730);
        assertEquals("April 9",easter29.algorithmGregorian());
        ComputusHard easter30 = new ComputusHard(1993);
        assertEquals("April 11",easter30.algorithmGregorian());
        ComputusHard easter31 = new ComputusHard(2004);
        assertEquals("April 11",easter31.algorithmGregorian());
        ComputusHard easter32 = new ComputusHard(2066);
        assertEquals("April 11",easter32.algorithmGregorian());
        ComputusHard easter33 = new ComputusHard(1971);
        assertEquals("April 11",easter33.algorithmGregorian());
        ComputusHard easter34 = new ComputusHard(2590);
        assertEquals("April 11",easter34.algorithmGregorian());
        ComputusHard easter35 = new ComputusHard(2680);
        assertEquals("April 11",easter35.algorithmGregorian());
        ComputusHard easter36 = new ComputusHard(1800);
        assertEquals("April 13",easter36.algorithmGregorian());
        ComputusHard easter37 = new ComputusHard(1705);
        assertEquals("April 12",easter37.algorithmGregorian());
        ComputusHard easter38 = new ComputusHard(1925);
        assertEquals("April 12",easter38.algorithmGregorian());
        ComputusHard easter39 = new ComputusHard(2020);
        assertEquals("April 12",easter39.algorithmGregorian());
        ComputusHard easter40 = new ComputusHard(2009);
        assertEquals("April 12",easter40.algorithmGregorian());
        ComputusHard easter41 = new ComputusHard(1998);
        assertEquals("April 12",easter41.algorithmGregorian());
        ComputusHard easter42 = new ComputusHard(2533);
        assertEquals("April 12",easter42.algorithmGregorian());
        ComputusHard easter43 = new ComputusHard(2308);
        assertEquals("April 12",easter43.algorithmGregorian());
        ComputusHard easter44 = new ComputusHard(2843);
        assertEquals("April 12",easter44.algorithmGregorian());
        ComputusHard easter45 = new ComputusHard(1857);
        assertEquals("April 12",easter45.algorithmGregorian());
        ComputusHard easter46 = new ComputusHard(1903);
        assertEquals("April 12",easter46.algorithmGregorian());
        ComputusHard easter47 = new ComputusHard(1716);
        assertEquals("April 12",easter47.algorithmGregorian());
        ComputusHard easter48 = new ComputusHard(2245);
        assertEquals("April 13",easter48.algorithmGregorian());
        ComputusHard easter49 = new ComputusHard(2691);
        assertEquals("April 12",easter49.algorithmGregorian());
        ComputusHard easter50 = new ComputusHard(1789);
        assertEquals("April 12",easter50.algorithmGregorian());
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */