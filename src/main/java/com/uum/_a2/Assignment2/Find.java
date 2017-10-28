/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.Assignment2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Badrul
 */
public class Find {

    public String[] listJavaFile;

    public Find() {
        Collection<File> all = new ArrayList<>();
        //addTree(new File("C:\\Users\\Badrul\\Documents\\NetBeansProjects\\Assignment2\\test"), all);
        addTree(new File(System.getProperty("user.dir") + File.separator + "test"), all);
        //Change File Directory Here
        Collection<File> a = all;
        listJavaFile = filterJava(a);
    }

    static void addTree(File file, Collection<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
                addTree(child, all);
            }
        }
    }

    static String[] filterJava(Collection<File> listAllFileName) {
        LinkedList<String> fb = new LinkedList();
        Iterator<File> a = listAllFileName.iterator();
        File c;
        while (a.hasNext()) {
            c = a.next();
            if (c.getName().endsWith(".java")) {
                fb.add(c.getAbsolutePath());
            }
        }
        String[] listJavaFile = new String[fb.size()];
        for (int i = 0; i < fb.size(); i++) {
            listJavaFile[i] = fb.get(i);
        }
        return listJavaFile;
    }
}