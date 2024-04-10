package com.fdmgroup.courseowners.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;
public class CourseOwnerPage extends BrowserUtilities{
	@FindBy(xpath = "//h5[contains(text(),'OOD')]")
	private WebElement OODStream;
	@FindBy(xpath = "//h5[contains(text(),'Botium')]")
	private WebElement BotiumStream;
	@FindBy(xpath = "//h5[contains(text(),'Business Analysis')]")
	private WebElement BusinessAnalysisStream;
	@FindBy(xpath = "//h5[contains(text(),'Excel')]")
	private WebElement ExcelStream;
	@FindBy(xpath = "//h5[normalize-space()='Proskills']")
	private WebElement ProskillsStream;
	@FindBy(xpath = "//h5[contains(text(),'Git')]")
	private WebElement GitStream;
	
	@FindBy(xpath = "//div[position()=1]//button")
	private WebElement buttonProskill;
	public void clickProskillMaterialButton() {
		buttonProskill.click();
	}
	
	@FindBy(xpath = "//div[position()=2]//button")
	private WebElement buttonExcel;
	public void clickExcelMaterialButton() {
		buttonExcel.click();
	}
	
	@FindBy(xpath = "//div[position()=3]//button")
	private WebElement buttonBusinessAnalysis;
	public void clickBusinessAnalysisMaterialButton() {
		buttonBusinessAnalysis.click();
	}
	
	@FindBy(xpath = "//div[position()=4]//button")
	private WebElement buttonOOD;
	public void clickOODMaterialButton() {
		buttonOOD.click();
	}

	@FindBy(xpath = "//div[position()=5]//button")
	private WebElement buttonBotium;
	public void clickBotiumMaterialButton() {
		buttonBotium.click();
	}
	
	@FindBy(xpath = "//div[position()=6]//button")
	private WebElement buttonGit;
	public void clickGitMaterialButton() {
		buttonGit.click();
	}	

	@FindBy(xpath ="//*[contains(text(),'File Name')]")
	private WebElement fileNameColumn;
	public String getFileName() {
		return fileNameColumn.getText();
	}
	@FindBy(xpath ="//*[contains(text(),'Date Modified')]")
	private WebElement dateModifiedColumn;
	public String getDateModified() {
		return dateModifiedColumn.getText();
	}
	@FindBy(xpath ="//*[contains(text(),'Size')]")
	private WebElement sizeColumn;
	public String getSize() {
		return sizeColumn.getText();
	}
	@FindBy(xpath ="//mat-icon[text()='remove_red_eye']")
	private WebElement viewIcon;
	public String getView() {
		return viewIcon.getText();
	}
	@FindBy(xpath ="//mat-icon[text()='download']")
	private WebElement downloadIcon;
	public String getDownloadIcon() {
		return downloadIcon.getText();
	}
	@FindBy(xpath ="//mat-icon[text()='delete']")
	private WebElement deleteIcon;
	public String getDeleteIcon() {
		return deleteIcon.getText();
	}
	@FindBy(xpath ="//mat-icon[text()='inbox']")
	private WebElement archiveUnarchiveIcon;
	public String getArchiveUnarchive() {
		return archiveUnarchiveIcon.getText();
	}
	
	@FindBy(xpath = "//select[@id='filter']")
	private WebElement selectElement;
	public void getFilter() {
	selectElement.click();
	}
	
	@FindBy(xpath = "//option[text()='Archived Materials']")
	private WebElement archivedMaterialsToSelect;
	public void getArchivedMaterials() {
		archivedMaterialsToSelect.click();
	}

	@FindBy(xpath = "//option[text()='Current Materials']")
	private WebElement currentMaterialsToSelect;
	public void getCurrentMaterials() {
		currentMaterialsToSelect.click();
	}

	@FindBy(xpath = "//option[text()='All Materials']")
	private WebElement allMaterialsToSelect;
	public void getAllMaterials() {
		allMaterialsToSelect.click();
	}
	
	

    public void uncheckAllMaterialsPlaceholder() {
        if (allMaterialsToSelect.isSelected()) {
            allMaterialsToSelect.click();
        }
    }

    public void uncheckCurrentMaterialsPlaceholder() {
        if (currentMaterialsToSelect.isSelected()) {
            currentMaterialsToSelect.click();
        }
    }

    public void uncheckArchivedMaterialsPlaceholder() {
        if (archivedMaterialsToSelect.isSelected()) {
            archivedMaterialsToSelect.click();
        }
    }


	
	@FindBy(xpath = "//select[@id='bulk-action']")
	private WebElement selectBulkElement;
	public void getBulkElementFilter() {
		selectBulkElement.click();
	}
	
    // Locate and click the desired option by its visible text
   
	@FindBy(xpath = "//option[text()='Download']")
	private WebElement downloadItemToSelect;
	public void getDownloadItem() {
		downloadItemToSelect.click();
	}

	@FindBy(xpath = "//option[text()='Delete']")
	private WebElement deleteItemToSelect;
	public void getDeleteItem() {
		deleteItemToSelect.click();
	}

	@FindBy(xpath = "//option[text()='Archive']")
	private WebElement archiveItemToSelect;
	public void getArchiveItem() {
		archiveItemToSelect.click();
	}

	@FindBy(xpath = "//option[text()='Unarchive']")
	private WebElement unArchiveItemToSelect;
	public void getUnArchiveItem() {
		unArchiveItemToSelect.click();
	}
	

    public void uncheckDownloadPlaceholder() {
        if (downloadItemToSelect.isSelected()) {
        	downloadItemToSelect.click();
        }
    }

    public void uncheckDeletePlaceholder() {
        if (deleteItemToSelect.isSelected()) {
        	deleteItemToSelect.click();
        }
    }

    public void uncheckArchivePlaceholder() {
        if (archiveItemToSelect.isSelected()) {
        	archiveItemToSelect.click();
        }
    }

	public CourseOwnerPage() {
		PageFactory.initElements(driver, this);
	}
	public String getOOD() {
		return OODStream.getText();
	}

	public String getBotium() {
		return BotiumStream.getText();
	}

	public String getBusinessAnalysis() {
		return BusinessAnalysisStream.getText();
	}

	public String getExcel() {
		return ExcelStream.getText();
	}

	public String getProskills() {
		return ProskillsStream.getText();
	}

	public String getGit() {
		return GitStream.getText();
	}


	public void openUrl(String url) {
		driverGet(ConfigurationReader.getProperty("myCoursesURL", "browser"));
	}
}

