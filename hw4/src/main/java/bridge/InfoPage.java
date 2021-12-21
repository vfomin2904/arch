package bridge;

public class InfoPage implements WebPage {
    private final Theme theme;

    public InfoPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void getContent() {
        System.out.println("Info page in " + theme.getColor());
    }
}
