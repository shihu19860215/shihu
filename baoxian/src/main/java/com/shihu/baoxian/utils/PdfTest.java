package com.shihu.baoxian.utils;

import java.io.File;

public class PdfTest {
    public PdfTest() {
    }

    public static void main(String[] args) {
    	System.out.println("start....");
        File[] var4;
        int var3 = (var4 = (new File("d:/pdf/")).listFiles()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
        	try{
	            File file = var4[var2];
	            String name = BxPdf.getPdfName(file);
	            if (name != null) {
	                File newFile = new File("d:/pdf/" + name);
	                if (!newFile.exists()) {
	                    file.renameTo(newFile);
	                }
	            }
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        }
    	System.out.println("end....");

    }

}
