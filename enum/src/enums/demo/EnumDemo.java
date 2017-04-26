package enums.demo;

/**
 * Created by Auser on 2017/4/25.
 */
public enum EnumDemo {
    ONGOING(0, "进行中"),
    TIMEOUT(1, "超时"),
    END(2, "已结束"),
    NOTSTARTED(3,"未开始"),
    ERROR(99,"错误");
    private int statusCode;
    private String statusName;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    EnumDemo(int statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;
    }

    /**
     *
     * @param code
     * @return
     */
    public static EnumDemo getEnumStatusCode(int code ){
        for (EnumDemo enumDemo :EnumDemo.values()){
            if(enumDemo.statusCode == code){
                return enumDemo;
            }
        }
        return EnumDemo.ERROR;
    };
}
