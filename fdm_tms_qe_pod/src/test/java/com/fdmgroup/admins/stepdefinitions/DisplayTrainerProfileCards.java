package com.fdmgroup.admins.stepdefinitions;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fdmgroup.global.utilities.ExcelUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DisplayTrainerProfileCards {
	
	@When("Check all the trainer profile cards for whether trainers are active using APACHE POI")
	public void check_all_the_trainer_profile_cards_for_whether_trainers_are_active_using_apache_poi() throws IOException {
		
//		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestSets_TMS883\\TrainerArchives_TMS883.xlsx");
//		XSSFWorkbook trainerArchives = new XSSFWorkbook(file);
//		XSSFSheet torontoTrainers = trainerArchives.getSheet("Toronto Trainers");
//		
		String xlworkbook = "src\\TestSets_TMS883\\TrainerArchives_TMS883.xlsx";
		String xlsheet = "TorontoTrainers";
		int totalRows = ExcelUtilities.getRowCount(xlworkbook,xlsheet);
		int totalCells = ExcelUtilities.getCellCount(xlworkbook,xlsheet,totalRows);

		
		for (int rownum=0; rownum<=totalRows; rownum++) {

			       
			if (rownum==0) {
				ExcelUtilities.setCellData(xlworkbook, xlsheet, rownum, totalCells, "Invitation" );
				 for (int cellnumNew=0; cellnumNew<totalCells+1; cellnumNew++) {
					 ExcelUtilities.fillYellowColor(xlworkbook, xlsheet, rownum, cellnumNew);
				 }
			}
			
			
			
					for (int cellnum=0; cellnum<totalCells; cellnum++) {
						 System.out.println("\t [" + rownum + "]["+ cellnum  +"] : "+ ExcelUtilities.getCellData(xlworkbook, xlsheet, rownum, cellnum)        );
						 
						 
						 if (rownum>0) {
							 if (  (ExcelUtilities.getCellData(xlworkbook, xlsheet, rownum, 2).equalsIgnoreCase("Y"))) {
								 
								 ExcelUtilities.setCellData(xlworkbook, xlsheet, rownum, totalCells, "SendInvite" );
								 
								 for (int cellnumNew=0; cellnumNew<totalCells+1; cellnumNew++) {
									 ExcelUtilities.fillGreenColor(xlworkbook, xlsheet, rownum, cellnumNew);
								 }
								
								 
							 }
							 else {
								 System.out.println("Else Loop");
								 ExcelUtilities.setCellData(xlworkbook, xlsheet, rownum, totalCells, "No Invite" );
								 for (int cellnumNew=0; cellnumNew<totalCells+1; cellnumNew++){
									
									 ExcelUtilities.fillRedColor(xlworkbook, xlsheet, rownum, cellnumNew);
								 }
							 
						 }
						 
						
						 }
					}
		}
}
		
	

	
	@When("Clicks on the Trainer from the Academy Directory dropdown")
	public void clicks_on_the_trainer_from_the_academy_directory_dropdown() {

	}

	@Then("User should be able to see all the Trainer Profile Cards")
	public void user_should_be_able_to_see_all_the_trainer_profile_cards() {

	}

}
