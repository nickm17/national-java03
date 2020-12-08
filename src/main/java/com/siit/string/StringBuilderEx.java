package com.siit.string;

public class StringBuilderEx {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("first");
        StringBuffer stringBuffer = new StringBuffer("first");
        stringBuffer.append("aa");
        System.out.println(sb.toString());

        sb.append("Second");
        System.out.println(sb.reverse());
        System.out.println(sb.toString());

        methodWithParamStringBuilder(sb);
//        sb = null;
        System.out.println(sb.toString());

        String string = "aaa";
        methodWithParamString(string);
        System.out.println(string);
    }

    private static void methodWithParamStringBuilder(StringBuilder sb){
        sb.append("Third");
        sb = null;
    }

    private static void methodWithParamString(String string){
        string.concat("Third");
    }

}
