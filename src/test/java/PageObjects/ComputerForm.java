package PageObjects;

public class ComputerForm extends Form {

    private final static String NOTEBOOK_BUTTON =
            "//ul[contains(@data-autotest-id, 'subItems')]//a[contains(@href, 'catalog--noutbuki')]";
    //*[contains(@class, '_3xCDQ')]//*[contains(@href, 'noutbuki') and contains(text(), 'Ноутбуки')]

    public void selectNotebookSection() {
        button.clickButton(NOTEBOOK_BUTTON);
    }
}
