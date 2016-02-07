package ytying.com.domin;

/**
 * Created by UKfire on 16/2/7.
 */
public class Response {
    private int retCode;
    private String retMsg;
    private String data;

    public boolean isSucc(){
        if(retCode == 1)
            return true;
        else
            return false;
    }

    public int getRetCode() {
        return retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }
}
