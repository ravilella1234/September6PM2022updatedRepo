package excelDataDriven;

public class MajorMinorProgram 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI excelAPI= new ExcelAPI("D:\\Java workspace\\TestingData2.xlsx");

		for(int i=1;i<excelAPI.getRowCount("People");i++) {

		Float age = Float.parseFloat(excelAPI.getCellData("People", i, 1));
		if(age >= 18) {
		excelAPI.setCellData("People", i, 2,"MAJOR");
		System.out.println("AGE IS:: "+age+" above 18, so He/She is a MAJOR");
		}
		else {
		excelAPI.setCellData("People",i,2,"MINOR");
		System.out.println("AGE IS:: "+age+" under 18, so He/She is a MINOR");
		}
		}

	}

}
