package com.legstar.base.type.gen;

import java.util.LinkedHashMap;
import java.util.Map;

import com.legstar.base.type.CobolType;
import com.legstar.base.type.composite.*;
import com.legstar.base.type.primitive.*;

public class CobolStru03Record extends CobolComplexType {

    public CobolStru03Record() {
        super("Stru03Record", createStru03RecordFields());
    }

    private static Map < String, CobolType > createComArrayFields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolBinaryType < Short > comItem1 =
                new CobolBinaryType.Builder < Short >(Short.class)
                        .signed(true)
                        .totalDigits(4)
                        .minInclusive((short) 0)
                        .maxInclusive((short) 99)
                        .build();
        fields.put("comItem1", comItem1);

        CobolStringType < String > comItem2 =
                new CobolStringType.Builder < String >(String.class)
                        .charNum(2)
                        .build();
        fields.put("comItem2", comItem2);

        return fields;

    }

    private static Map < String, CobolType > createStru03RecordFields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolZonedDecimalType < Long > comNumber =
                new CobolZonedDecimalType.Builder < Long >(Long.class)
                        .totalDigits(6)
                        .build();
        fields.put("comNumber", comNumber);

        CobolStringType < String > comName =
                new CobolStringType.Builder < String >(String.class)
                        .charNum(20)
                        .build();
        fields.put("comName", comName);

        CobolPackedDecimalType < java.math.BigDecimal > comAmount =
                new CobolPackedDecimalType.Builder < java.math.BigDecimal >(java.math.BigDecimal.class)
                        .totalDigits(7)
                        .fractionDigits(2)
                        .build();
        fields.put("comAmount", comAmount);

        fields.put("comArray", new CobolArrayType(new CobolComplexType("ComArray",  createComArrayFields()), 5));

        return fields;

    }

}