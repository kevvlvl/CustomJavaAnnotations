package com.kevvlvl.customannotation.processor;

import com.kevvlvl.customannotation.annotation.Fund;
import com.kevvlvl.customannotation.annotation.Symbol;
import com.kevvlvl.customannotation.model.FinanceData;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    /**
     * Process method level annotations
     * @param financeData Finance model
     */
    public static void processAnnotations(FinanceData financeData) {

        // Obtain the fund Class level annotation information

        Fund f = financeData.getClass().getAnnotation(Fund.class);

        if(f != null) {
            System.out.println("      Stock is of type " + f.type());
        }

        // Obtain the method level annotation informations

        Method[] methods = financeData.getClass().getMethods();

        for(Method m : methods) {

            Symbol s = m.getAnnotation(Symbol.class);
            if(s != null) {

                if(s.upper()) {
                    financeData.setStockSymbol(financeData.getStockSymbol().toUpperCase());
                }
            }
        }
    }
}
