package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatusServiceTest {

    @Test
    public void shouldFindAllSales() {
        StatusService service = new StatusService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualSales = service.amountSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindAvrgSales() {
        StatusService service = new StatusService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actualSales = service.avrgSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void shouldFindMaxSales() {
        StatusService service = new StatusService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinSales() {
        StatusService service = new StatusService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMinAvrgSales() {
        StatusService service = new StatusService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.minAvrgSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxAvrgSales() {
        StatusService service = new StatusService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.maxAvrgSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
