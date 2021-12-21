package bridge;

public class AboutPage implements WebPage {

    private final Theme theme;

    public AboutPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void getContent() {
        System.out.println("About page in " + theme.getColor());
    }
}
