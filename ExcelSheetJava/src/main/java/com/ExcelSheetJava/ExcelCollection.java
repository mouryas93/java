package com.ExcelSheetJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCollection {

	public static void main(String args[]) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Mourya Raj\\Desktop\\new1.xlsx"));
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet1 = workbook1.getSheetAt(0);
		Iterator<Row> rowIterator = spreadsheet1.iterator();
		while (rowIterator.hasNext()) {
			XSSFRow row = (XSSFRow) rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				al.add(cell.getStringCellValue());
			}
		}
		fis.close();
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		workbook1.close();
	}
}
