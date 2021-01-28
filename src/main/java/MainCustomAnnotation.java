import com.kevvlvl.customannotation.model.FinanceData;
import com.kevvlvl.customannotation.processor.AnnotationProcessor;

import java.math.BigDecimal;

public class MainCustomAnnotation {

    public static void main(String[] args) {

        System.out.println("1. Instantiate a few stocks");

        FinanceData stockOne = new FinanceData("abc", new BigDecimal("30.25"));
        FinanceData stockTwo = new FinanceData("xyz", new BigDecimal("15.50"));
        FinanceData stockThree = new FinanceData("hah", new BigDecimal("74.10"));

        System.out.println("2. Process the annotations");

        AnnotationProcessor.processAnnotations(stockOne);
        AnnotationProcessor.processAnnotations(stockTwo);
        AnnotationProcessor.processAnnotations(stockThree);

        System.out.println("  stockOne - " + stockOne);
        System.out.println("  stockTwo - " + stockTwo);
        System.out.println("  stockThree - " + stockThree);

    }
}