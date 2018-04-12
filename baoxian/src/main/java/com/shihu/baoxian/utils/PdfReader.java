package com.shihu.baoxian.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.io.RandomAccessBuffer;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReader {
    public PdfReader() {
    }

    public static String getTextFromPDF(File pdfFilePath) {
        String result = null;
        FileInputStream is = null;
        PDDocument document = null;

        try {
            is = new FileInputStream(pdfFilePath);
            PDFParser parser = new PDFParser(new RandomAccessBuffer(is));
            parser.parse();
            document = parser.getPDDocument();
            PDFTextStripper stripper = new PDFTextStripper();
            result = stripper.getText(document);
        } catch (FileNotFoundException var21) {
            var21.printStackTrace();
        } catch (IOException var22) {
            var22.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var20) {
                    var20.printStackTrace();
                }
            }

            if (document != null) {
                try {
                    document.close();
                } catch (IOException var19) {
                    var19.printStackTrace();
                }
            }

        }

        return result;
    }

}
