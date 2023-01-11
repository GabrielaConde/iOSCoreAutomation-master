package config.initPages;

import config.InitTest;
import config.pages.ScrollsPage;
import config.pages.bpage.BpageCommentsPage;
import config.pages.bpage.BpageEmbedsPage;
import config.pages.bpage.BpagePage;
import config.pages.bpage.BpageShoppingButtonPage;
import org.testng.annotations.BeforeClass;

public class BpageInit extends InitTest {

    protected BpagePage nativeBpage;
    protected BpageShoppingButtonPage amazonButton;
    protected BpageEmbedsPage embeds;
    protected BpageCommentsPage nativeComments;
    protected BpagePage fallbackBpage;
    protected BpageCommentsPage fallbackComments;
    protected BpageCommentsPage addYours;
    protected ScrollsPage scroll;


    @BeforeClass
    public void initializePages() {
        nativeBpage = new BpagePage();
        amazonButton = new BpageShoppingButtonPage();
        embeds = new BpageEmbedsPage();
        nativeComments = new BpageCommentsPage();
        fallbackBpage = new BpagePage();
        fallbackComments = new BpageCommentsPage();
        addYours = new BpageCommentsPage();
        scroll = new ScrollsPage();
    }
}
