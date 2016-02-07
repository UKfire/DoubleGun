package ytying.com.main;

import com.alibaba.fastjson.JSONArray;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import ytying.com.domin.OneDayMarket;
import ytying.com.domin.Response;
import ytying.com.domin.Stock;
import ytying.com.network.HttpUtil;
import ytying.com.network.NetWork;
import ytying.com.util.JsonUtil;

import java.util.List;

/**
 * Created by UKfire on 16/2/7.
 */
public class Main {

    public static void main(String[] args) {
        Response response = NetWork.getSec();
        List<Stock> stockList = JsonUtil.string2List(response.getData(),Stock.class);
        for(Stock s : stockList){

            Response re = NetWork.getMarket(s.getSecID());

            if(re.isSucc()){
                List<OneDayMarket> list = JsonUtil.string2List(re.getData(),OneDayMarket.class);

                if(list.get(0).getClosePrice() - list.get(1).getClosePrice() > 0){
                    if((list.get(0).getClosePrice() - list.get(1).getClosePrice()) / list.get(1).getClosePrice() >= 0.05){
                        System.out.println(s.getSecShortName());
                    }
                }else{
                    continue;
                }
            }else{
                continue;
            }

        }
    }

}
