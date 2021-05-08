package com.sbn.util;

public class StringUtil {
    public static String[] getCombination(String inpStr) {
        int length = inpStr.length();
        String[] opArray = new String[length];
        for(int i=0;i<length;i++){
            opArray[i] = inpStr;
            inpStr = inpStr.substring(1)+inpStr.charAt(0);
        }
        return opArray;
    }
}
