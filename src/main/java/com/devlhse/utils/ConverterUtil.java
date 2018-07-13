package com.devlhse.utils;

import com.devlhse.constants.GenericKeys;
import com.devlhse.constants.TimeDayConstants;
import com.devlhse.enums.DishesMorningKeys;
import com.devlhse.enums.DishesNightKeys;
import com.devlhse.generators.OutputGenerator;

public class ConverterUtil {

    public static String convertEntry(String entry) {
        if(!VerificationUtils.isNullOrEmptyString(entry)) {
            if (entry.contains(TimeDayConstants.MORNING) || entry.contains(TimeDayConstants.NIGHT)) {
                OutputGenerator outputGenerator = new OutputGenerator(entry).invoke();
                if (outputGenerator.hasError()) return GenericKeys.ERROR;
                StringBuilder output = outputGenerator.getOutput();
                return output.toString();
            }
        }
        return GenericKeys.ERROR;
    }

}
