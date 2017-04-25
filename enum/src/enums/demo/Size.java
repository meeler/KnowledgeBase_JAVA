package enums.demo;

/**
 * Created by Auser on 2017/4/25.
 */
public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");
    private String abb;

    public String getAbb() {
        return abb;
    }

    public void setAbb(String abb) {
        this.abb = abb;
    }

    private Size(String abb) {
        this.abb = abb;
    }

}
