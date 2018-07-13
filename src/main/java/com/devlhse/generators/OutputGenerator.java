package com.devlhse.generators;

import com.devlhse.constants.GenericKeys;
import com.devlhse.constants.TimeDayConstants;
import com.devlhse.enums.DishesMorningKeys;
import com.devlhse.enums.DishesNightKeys;

public class OutputGenerator {
    private boolean hasError;
    private String entry;
    private StringBuilder output;

    public OutputGenerator(String entry) {
        this.entry = entry;
    }

    public boolean hasError() {
        return hasError;
    }

    public StringBuilder getOutput() {
        return output;
    }

    public OutputGenerator invoke() {
        String[] values = entry.split(GenericKeys.COMMA);
        output = new StringBuilder();
        int i = 0;
        String timeDay = "";
        for (String value : values) {
            if(i == 0) {
                if (TimeDayConstants.MORNING.equals(value) || TimeDayConstants.NIGHT.equals(value)) {
                    timeDay = value;
                } else {
                    hasError = true;
                    return this;
                }
            }else{
                if (TimeDayConstants.MORNING.equals(timeDay)) {
                    if(GenericKeys.FOUR.equals(value)){
                        output.append(GenericKeys.ERROR);
                    }else{
                        output.append(DishesMorningKeys.getNamefromMorningDishByKey(value));
                    }
                }else{
                    output.append(DishesNightKeys.getNamefromNightDishByKey(value));
                }
                if(i < values.length - 1 ) {
                    output.append(GenericKeys.COMMA).append(" ");
                }
            }
            i++;
        }
        hasError = false;
        return this;
    }
}
