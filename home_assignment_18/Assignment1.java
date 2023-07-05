package home_assignment_18;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment1 {
    public static void main(String[] args) throws IOException {

        String file = "Zadatak1.xlsx";

        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        inputStream.close();

        XSSFSheet sheet = workbook.getSheet("Brojevi");
        XSSFSheet sheet1 = workbook.getSheet("Prosek");
        if (sheet1 == null){
            sheet1 = workbook.createSheet("Prosek");
        }

        int ukupnaVrednostReda;
        int brojRedova = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < brojRedova; i++){
            XSSFRow row = sheet.getRow(i);
            ukupnaVrednostReda = 0;
            int brojCelija = row.getPhysicalNumberOfCells();
            for (int j = 0; j < brojCelija; j++){
                XSSFCell cell = row.getCell(j);
                ukupnaVrednostReda += cell.getNumericCellValue();
            }
            double prosek = (double) ukupnaVrednostReda / brojCelija;
            sheet1.createRow(i).createCell(0).setCellValue(ukupnaVrednostReda + "/" + brojCelija);
            sheet1.getRow(i).createCell(1).setCellValue(prosek);
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();


    }
}
