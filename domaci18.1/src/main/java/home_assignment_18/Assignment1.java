package home_assignment_18;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) throws IOException {

        String file = "Names.xlsx";
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        inputStream.close();
        XSSFSheet sheet = workbook.getSheetAt(0);

        ArrayList<String> names = new ArrayList<>();

        int numberOfRows = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < numberOfRows; i++){
            XSSFRow row = sheet.getRow(i);
            XSSFCell cell = row.getCell(0);
            String name = cell.getStringCellValue();
            names.add(name);
        }
        System.out.println(names);

        Faker faker = new Faker();

        for (int i = 0; i < 5; i++){
            names.add(faker.name().firstName());
        }

        XSSFSheet sheet1 = workbook.getSheet("10 names");
        if (sheet1 == null){
            sheet1 = workbook.createSheet("10 names");
        }

        for (int i = 0; i < names.size(); i++){
            XSSFRow row = sheet1.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(names.get(i));
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
    }
}