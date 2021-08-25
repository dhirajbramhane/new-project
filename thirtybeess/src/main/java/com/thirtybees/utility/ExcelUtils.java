package com.thirtybees.utility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	static DataFormatter df = new DataFormatter();
	 static FileInputStream file;
	 static Workbook wb;
	 
	 static String cellValue;
	 
	public  static void getAllDataAsDP(String filepath, String sheetname, int parameter) {
		
		try {
			file = new FileInputStream(filepath);
			wb = WorkbookFactory.create(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet(sheetname);
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(rows).getLastCellNum();
		String[][] data = new String[rows][parameter];
		for (int i = 0; i < rows; i++) {
			int col = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < rows; j++) {
				Cell c = sh.getRow(i).getCell(j);
				String value = df.formatCellValue(c);
				data[i][j] = value;
				System.out.println(value);
			}
		}
	}

	public ArrayList<String> getAllData(String filepath, String sheetname) {
		ArrayList<String> data=new ArrayList<String>();
		
		try {
			file = new FileInputStream(filepath);
			wb = WorkbookFactory.create(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet(sheetname);
		int rows = sh.getLastRowNum();
		int col = sh.getRow(rows).getLastCellNum();
		for (int i = 0; i < rows; i++) {
			int cols = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < rows; j++) {
				Cell c = sh.getRow(i).getCell(j);
				cellValue = df.formatCellValue(c);
				data.add(cellValue);
			}
			}
		return data;
		}
	

	public static  String getData(String filepath, String sheetname, int row, int cell) {
		DataFormatter df = new DataFormatter();
		try {
			file = new FileInputStream(filepath);
			wb = WorkbookFactory.create(file);
		} catch (Exception e) {
			e.printStackTrace();

		}
		Sheet sh = wb.getSheet(sheetname);
		Cell data = sh.getRow(row).getCell(cell);
		return df.formatCellValue(data);

	}

	public static  ArrayList<String> getDataFromRow(String filepath, String sheetname, int row) {
		 ArrayList<String> list= new ArrayList<String>();
		
		DataFormatter df = new DataFormatter();
		try {
			file = new FileInputStream(filepath);
			wb = WorkbookFactory.create(file);
		} catch (Exception e) {
			e.printStackTrace();

		}
		Sheet sh = wb.getSheet(sheetname);
		int col = sh.getRow(row).getLastCellNum();
		for (int j = 1; j <col; j++) {
			Cell c = sh.getRow(row).getCell(j);
			String data = df.formatCellValue(c);
		list.add(data);	
		}
		
          return list;
	}

	
}
