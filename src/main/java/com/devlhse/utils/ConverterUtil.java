package com.devlhse.utils;

import com.devlhse.constants.GenericKeys;
import com.devlhse.constants.TimeDayConstants;
import com.devlhse.enums.DishesMorningKeys;
import com.devlhse.enums.DishesNightKeys;

public class ConverterUtil {

    public static String convertEntry(String entry) {
        if(!VerificationUtils.isNullOrEmptyString(entry)) {
            if (entry.contains(TimeDayConstants.MORNING) || entry.contains(TimeDayConstants.NIGHT)) {
                String[] values = entry.split(GenericKeys.COMMA);
                StringBuilder output = new StringBuilder();
                int i = 0;
                String timeDay = "";
                for (String value : values) {
                    if(i == 0) {
                        if (TimeDayConstants.MORNING.equals(value) || TimeDayConstants.NIGHT.equals(value)) {
                            timeDay = value;
                        } else {
                            return GenericKeys.ERROR;

                        }
                    }else{

                        if (TimeDayConstants.MORNING.equals(timeDay)) {
                            output.append(DishesMorningKeys.getNamefromMorningDish(value));
                        }else{
                            output.append(DishesNightKeys.getNamefromNightDish(value));
                        }
                        output.append(GenericKeys.COMMA).append(" ");
                    }
                    i++;
                }
                return output.toString();
            }
        }
        return GenericKeys.ERROR;
    }
}
