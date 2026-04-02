package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFromFile {

    private static String testData = System.getProperty("user.dir") + "/src/test/java/TestData/TestData.xlsx";

//    private static String testData ="C:\\Users\\Sherley\\IdeaProjects\\SeleniumJavaTest1\\src\\test\\java\\TestData\\TestData.xlsx";

    public static DataFormatter dataFormatter = new DataFormatter();

    static FileInputStream fs;

    //  fs = new FileInputStream (testData)

    static {
        try {
            fs = new FileInputStream(testData);
            System.out.println(testData);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fs);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }

    static XSSFSheet sheet = workbook.getSheet("login");

    public static String email = sheet.getRow(1).getCell(0).getStringCellValue();

    public static String password = dataFormatter.formatCellValue(sheet.getRow(1).getCell(1));

    static XSSFSheet secondSheet = workbook.getSheet("dashboard");

    public static String firstName = secondSheet.getRow(1).getCell(0).getStringCellValue();

    public static String emailAddress = secondSheet.getRow(1).getCell(1).getStringCellValue();

    public static int age = (int) secondSheet.getRow(1).getCell(2).getNumericCellValue();

    public static String comments = secondSheet.getRow(1).getCell(3).getStringCellValue();
//
//    public static String country = secondSheet.getRow(1).getCell(4).getStringCellValue();
//}
}
