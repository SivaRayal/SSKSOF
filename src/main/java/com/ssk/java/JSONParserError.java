package com.ssk.java;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

public class JSONParserError {
    public static void main(String[] args) {
        System.out.println(getFinalAmount());
    }
    public static String getFinalAmount() {
        String finalAmount = "";
        JSONParser parser = new JSONParser();
        try {
//            File file = new File(".");
//            for(String fileNames : file.list()) System.out.println(fileNames);
            Object obj = parser.parse(new FileReader("src/main/resources/currencyConverter.json"));
            JSONObject jsonObject = (JSONObject)obj;
            finalAmount = (String)jsonObject.get("new_amount");
            return finalAmount;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return finalAmount;
    }
}
