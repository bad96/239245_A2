//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #239245
//Name: #Muhammad Badrul Amin Bin Abdul Razak
package com.uum._a2.Assignment2;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Badrul
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Find find = new Find();
        String[] listJavaFile = find.listJavaFile;

        OpenJava open = new OpenJava();
        JSONObject listdetail = open.json;
        open.info(listJavaFile);
        //System.out.println(json.toString());

        FindKeywords key = new FindKeywords();
        key.CountKeyword(listJavaFile);
        JSONObject keyword = key.json;

        FindLine line = new FindLine();
        line.Hawau(listJavaFile);
        JSONObject noLine = line.json;
        //key.Hawau(listJavaFile); 

        CombineJson com = new CombineJson();
        com.combinejson(listdetail, keyword, noLine);
    }
}
