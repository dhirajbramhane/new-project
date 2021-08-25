package com.thirtybees.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	static DataFormatter df = new DataFormatter();
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;
	static String cellValue;

	public static ArrayList<String> getAllData(String filePath, String sheetName) {
		ArrayList<String> data=new ArrayList<String>();
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rows = sh.getLastRowNum(); // get last row on sheet
		for (int i = 0; i <= rows; i++) {
			int col = sh.getRow(rows).getLastCellNum();
			for (int j = 0; j < col; j++) {
				Cell c = sh.getRow(i).getCell(j);
				cellValue = df.formatCellValue(c);
				data.add(cellValue);
			}
		}
		return data;
	}

	public static ArrayList<String> readAnyRowFromExcel(String filePath, String sheetName, int rowNum) {
		ArrayList<String> expList = new ArrayList<String>();
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int col = sh.getRow(rowNum).getLastCellNum();
		for (int j = 0; j < col; j++) {
			Cell c = sh.getRow(rowNum).getCell(j);
			cellValue = df.formatCellValue(c);
			expList.add(cellValue);
		}
		return expList;
	}

	public static ArrayList<String> readAnyColFromExcel(String filePath, String sheetName, int colNum) {
		ArrayList<String> expList = new ArrayList<String>();
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rows = sh.getLastRowNum();
		for (int i = 1; i <= rows; i++) { //i=1 not i=0 because we don't need header data
			Cell c = sh.getRow(i).getCell(colNum);
			cellValue = df.formatCellValue(c);
			expList.add(cellValue);
		}
		return expList;
	}

	// data provider
	public static String[][] getAllDataAsDP(String filePath, String sheetName) {
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sh = wb.getSheet(sheetName);
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(rows).getLastCellNum();

		String data[][] = new String[rows][cols];
		for (int i = 0; i <= rows; i++) {
			int col = sh.getRow(i).getLastCellNum();

			for (int j = 0; j <= col; j++) {
				Cell c = sh.getRow(i).getCell(j);
				cellValue = df.formatCellValue(c);
				data[i][j] = cellValue;
			}

		}
		return data;
	}

	// read perticular cell
	public static String readCell(String filePath, String sheetName, int rowNum, int colNum) {
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Cell c = sh.getRow(rowNum).getCell(colNum);
		return cellValue = df.formatCellValue(c);
	}

	// write to perticular cell
	public static void writeCell(String filePath, String sheetName, int rowNum, int colNum, Date text) {
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sh.getRow(rowNum).createCell(colNum).setCellValue(text);// 1st create cell then setcellvalue

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filePath);
			wb.write(fos);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
