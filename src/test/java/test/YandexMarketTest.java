package test;

import PageObjects.NotebookPage;
import PageObjects.StartPage;
import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YandexMarketTest extends BaseTest {

    private StartPage startPage = new StartPage();
    private NotebookPage notebookPage = new NotebookPage();

    @Test
    public void testSearchOption() {

        Assert.assertTrue(
                startPage.startPageIsOpen(),
                "Yandex market isn't open");

        startPage.openCatalog();
        startPage.catalogForm.selectSectionComputer();
        startPage.computerForm.selectNotebookSection();

        Assert.assertTrue(notebookPage.notebookPageIsOpen(), "Notebook page isn't open");

        notebookPage.chooseBrand();
        notebookPage.setPrice();

        Assert.assertTrue(
                notebookPage.nameIsCorrect(),
                "Products brand name isn't correct");
        Assert.assertTrue(
                notebookPage.priceIsCorrect(),
                "Products price isn't correct");
    }
}
