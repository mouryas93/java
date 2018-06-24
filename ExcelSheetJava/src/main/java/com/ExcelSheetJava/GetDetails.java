package com.ExcelSheetJava;

import java.io.File;
import java.io.FileInputStream;
import java.util.Comparator;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDetails extends Details {

	public GetDetails(String name, String description, String id) {
		super(name, description, id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		TreeSet<GetDetails> set = new TreeSet<GetDetails>(new UserComparator());
		File f = new File("C:\\Users\\Mourya Raj\\Desktop\\Customer Detail.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet = workbook.getSheetAt(0);
		Row row;
		row = spreadsheet.getRow(1);
		GetDetails user1 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user1);
		row = spreadsheet.getRow(2);
		GetDetails user2 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user2);
		row = spreadsheet.getRow(3);
		GetDetails user3 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user3);
		row = spreadsheet.getRow(4);
		GetDetails user4 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user4);
		row = spreadsheet.getRow(5);
		GetDetails user5 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user5);
		row = spreadsheet.getRow(6);
		GetDetails user6 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user6);
		row = spreadsheet.getRow(7);
		GetDetails user7 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user7);
		row = spreadsheet.getRow(8);
		GetDetails user8 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user8);
		row = spreadsheet.getRow(9);
		GetDetails user9 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user9);
		row = spreadsheet.getRow(10);
		GetDetails user10 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user10);
		row = spreadsheet.getRow(11);
		GetDetails user11 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user11);
		row = spreadsheet.getRow(12);
		GetDetails user12 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user12);
		row = spreadsheet.getRow(13);
		GetDetails user13 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user13);
		row = spreadsheet.getRow(14);
		GetDetails user14 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user14);
		row = spreadsheet.getRow(15);
		GetDetails user15 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user15);
		row = spreadsheet.getRow(16);
		GetDetails user16 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user16);
		row = spreadsheet.getRow(17);
		GetDetails user17 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user17);
		row = spreadsheet.getRow(18);
		GetDetails user18 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user18);
		row = spreadsheet.getRow(19);
		GetDetails user19 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user19);
		row = spreadsheet.getRow(20);
		GetDetails user20 = new GetDetails(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
		set.add(user20);
		for (GetDetails i : set) {
			System.out.println(i);
		}
		workbook.close();
		fis.close();
	}
}

class UserComparator implements Comparator<GetDetails> {
	public int compare(GetDetails user1, GetDetails user2) {
		return user1.getName().compareTo(user2.getName());
	}
}
