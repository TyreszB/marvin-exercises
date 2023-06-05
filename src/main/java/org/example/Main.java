package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isNumeric("20"));
        System.out.println(StringUtils.isNumeric("tyresz"));
        System.out.println(StringUtils.isNumeric("96"));
        System.out.println(StringUtils.swapCase("How Are You Today?"));
        System.out.println(StringUtils.reverse("How Are You Today?"));

    }
}