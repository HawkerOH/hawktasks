package com.learning.tasks;

import org.junit.Assert;

public class TaskFive {

    public TaskFive() {
        validateAnswer();
    }

    /**
     *
     * @param firstDate String
     * @param secondDate String
     * @return int: Amount of days between to two given date
     */
    public int amountOfDayBetweenDates(String firstDate, String secondDate) {
        // TODO write implementation in this method
        return 0;
    }

    private void validateAnswer() {
        String beginDate = "1975-10-17";
        String endDate = "20-5-2015";

        Assert.assertEquals(14460, amountOfDayBetweenDates(beginDate, endDate));
        System.out.println("Well done!");
    }

}
