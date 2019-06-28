package com.shihu.baoxian.utils;

import java.io.File;

public class BxPdf {
    public BxPdf() {
    }

    public static String getPdfName(File file) {
        String str = PdfReader.getTextFromPDF(file);
        String[] strs = str.split("\n");
        String dh = null;
        String cjh = null;

        for(int i = 0; i < strs.length; ++i) {
            if (strs[i].indexOf("保险单号") >= 0) {
                str = strs[i].split(" ")[1].replace("\r", "");
                dh = str;
                System.out.println(dh);
            } else if (strs[i].indexOf("车架号") >= 0) {
                str = strs[i].split(" ")[3].replace("\r", "");
                if (str.length() < 16) {
                    str = strs[20].split(" ")[0];
                    if (str.length() < 16) {
                        str = strs[21].split(" ")[0];
                        if(str.length() < 16){
                            str = strs[22];
                            str = str.split(" ")[0].split("/")[1];
                            cjh = str;
                        }else {
                            cjh = str;
                        }
                    } else {
                        cjh = str;
                    }
                } else {
                    cjh = str;
                }

                cjh = cjh.split("\\/")[0];
                System.out.println(cjh);
            }
            
        }

        if (dh != null && cjh != null) {
            return cjh + "_" + dh + ".pdf";
        } else {
            return null;
        }
    }

}
