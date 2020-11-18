package com.siit.functions;

import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class LibraryUsage {

    public static void main(String[] args) {

        boolean isCreatable = NumberUtils.isCreatable("23a2");
        System.out.println(isCreatable);

        CharEncoding.isSupported("");// deprecated

        boolean isParsable = NumberUtils.isParsable("1111");
        System.out.println(isParsable);


        boolean isNumeric = StringUtils.isNumeric("22");
        System.out.println(isNumeric);
    }
}
