
public enum Holidays {
    NONE ("There is no holiday today"),
    New_Year (", we wish you a Happy New Year!!!"),
    March8 (", congratulations on 8th March!!!"),
    February23 (", congratulations on 23rd February!!!");

    private String title;

    Holidays(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
