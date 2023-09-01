package per.zpp.domain;

public class ReturnObj {
    private String code;
    private String message;
    private Object retData ;
    private Long count;

    public ReturnObj() {
    }

    public ReturnObj(Long count, Object retData) {
        this.retData = retData;
        this.count = count;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRetData() {
        return retData;
    }

    public void setRetData(Object retData) {
        this.retData = retData;
    }
}
