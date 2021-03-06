package test.example;

import java.util.LinkedHashMap;
import java.util.Map;

import com.legstar.base.type.CobolType;
import com.legstar.base.type.composite.*;
import com.legstar.base.type.primitive.*;

public class CobolFlat01Record extends CobolComplexType {

    public CobolFlat01Record() {
        super(new CobolComplexType.Builder()
                    .name("Flat01Record")
                    .cobolName("FLAT01-RECORD")
                    .fields(createFlat01RecordFields())
              );
    }

    private static Map < String, CobolType > createFlat01RecordFields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolZonedDecimalType < Long > comNumber =
                new CobolZonedDecimalType.Builder < Long >(Long.class)
                        .cobolName("COM-NUMBER")
                        .totalDigits(6)
                        .build();
        fields.put("comNumber", comNumber);

        CobolStringType < String > comName =
                new CobolStringType.Builder < String >(String.class)
                        .cobolName("COM-NAME")
                        .charNum(20)
                        .build();
        fields.put("comName", comName);

        CobolPackedDecimalType < java.math.BigDecimal > comAmount =
                new CobolPackedDecimalType.Builder < java.math.BigDecimal >(java.math.BigDecimal.class)
                        .cobolName("COM-AMOUNT")
                        .totalDigits(7)
                        .fractionDigits(2)
                        .build();
        fields.put("comAmount", comAmount);

        return fields;

    }


}

