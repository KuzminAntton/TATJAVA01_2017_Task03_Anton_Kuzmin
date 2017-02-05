package com.epam.task3.controller;

public class NewsValidator {
    public static boolean newsValidate(String news) {
        boolean res = false;
        if(news.split(",").length == 3) {
            res = true;
        }
        return res;
    }
}
