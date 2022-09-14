package PageObjects;

public class CatalogForm extends Form {

    private final static String COMPUTER_BUTTON =
            "//li[contains(@data-zone-name, 'category')]//a[contains(@href, '--kompiuternaia')]";
    //*[contains(@class, '_1hPrb cia-cs')]//*[contains(@href, 'kompiuternaia')]

    public void selectSectionComputer() {
        button.mouseMoveToElement(COMPUTER_BUTTON);
    }
}
