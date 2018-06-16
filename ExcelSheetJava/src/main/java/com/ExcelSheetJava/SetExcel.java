package com.ExcelSheetJava;


import java.util.*;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetExcel extends Customer {
	private static String[] Details = { "ID", "Name", "Email", "Company", "Location", "Salary" };
	private static List<Customer> customer = new ArrayList<Customer>();

	public static void main(String args[]) {
		Customer cs = new Customer();
		cs.InsertData();
		customer.add(cs);
		Workbook wb = new XSSFWorkbook();

		

		Sheet sheet = wb.createSheet("Customer");

		Font font = wb.createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 15);
		font.setColor(IndexedColors.RED.getIndex());

		CellStyle cellstyle = wb.createCellStyle();
		cellstyle.setFont(font);

		Row row = sheet.createRow(0);

		for (int i = 0; i < Details.length; i++) {
			Cell cell = row.createCell(i);
			cell.setCellValue(Details[i]);
			cell.setCellStyle(cellstyle);
		}

		int rowNum = 1;
		for (int i = 0; i < 1; i++) {
			Row r = sheet.createRow(rowNum++);
			r.createCell(0).setCellValue(cs.getID());
			r.createCell(1).setCellValue(cs.getName());
			r.createCell(2).setCellValue(cs.getEmail());
			r.createCell(3).setCellValue(cs.getCompany());
			r.createCell(4).setCellValue(cs.getLocation());
			r.createCell(5).setCellValue(cs.getSalary());
		}

		for (int i = 0; i < Details.length; i++) {
			sheet.autoSizeColumn(i);
		}
		try {
			FileOutputStream out = new FileOutputStream("C:\\Users\\Mourya Raj\\Desktop\\Customer Detail.xlsx");
			System.out.println("Output generated");
			wb.write(out);
			out.close();
			wb.close();

		} catch (Exception e) {
			System.out.println("error at generating output");
		}
		try {
			FileInputStream file = new FileInputStream(
					new File("C:\\Users\\Mourya Raj\\Desktop\\Customer Detail.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			
			XSSFSheet sheet1 = workbook.getSheetAt(0);

			
			Iterator<Row> rowIterator = sheet1.iterator();
			while (rowIterator.hasNext()) {
				Row row1 = rowIterator.next();
				
				Iterator<Cell> cellIterator = row1.cellIterator();
				

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
				
					switch (cell.getCellTypeEnum()) {
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					}
				}
				System.out.println("");
			}
			file.close();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
