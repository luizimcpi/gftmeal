package com.devlhse.generators;

import com.devlhse.constants.GenericKeys;
import com.devlhse.constants.TimeDayConstants;
import com.devlhse.enums.DishesMorningKeys;
import com.devlhse.enums.DishesNightKeys;

import java.util.Arrays;

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
        values = this.getOrdenatedEntryArray(values);
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

    private String[] getOrdenatedEntryArray(String[] values) {
        int[] numberValues = new int[values.length-1];
        int counter = 1;
        String timeDay = "";
        for (int ii = 0; ii < numberValues.length; ii++) {
            numberValues[ii] = Integer.parseInt(values[counter].trim());
            counter++;
        }
        Arrays.sort(numberValues);
        counter=0;
        timeDay = values[0];
        values = new String[values.length];
        for (String value : values) {
            if(counter == 0){
                values[counter] = timeDay;
            }else{
                values[counter] = String.valueOf(numberValues[counter-1]);
            }
            counter++;
        }
        return values;
    }
}
