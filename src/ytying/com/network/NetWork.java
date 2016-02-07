package ytying.com.network;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import ytying.com.domin.Response;
import ytying.com.util.JsonUtil;

import java.io.IOException;

/**
 * Created by UKfire on 16/2/7.
 */
public class NetWork {

    //创建http client
    private static CloseableHttpClient httpClient = HttpUtil.createHttpsClient();

    private static final String ACCESS_TOKEN = "c103485dc39187b6283ec0f8b77847ae203a839bdf94ad682ffad6b1687de2e1";

    private static final String GETMARKET = "https://api.wmcloud.com:443/data/v1/api/equity/getMktEqudCCXE.json?field=&secID=";
    private static final String GETSEC = "https://api.wmcloud.com:443/data/v1/api/master/getSecTypeRegionRel.json?field=&typeID=&secID=&ticker=";

    public static Response getSec(){
        String body = "";
        Response response = null;

        //根据api store页面上实际的api url来发送get请求，获取数据
        String url = GETSEC;
        HttpGet httpGet = new HttpGet(url);
        //在header里加入 Bearer {token}，添加认证的token，并执行get请求获取json数据
        httpGet.addHeader("Authorization", "Bearer " + ACCESS_TOKEN);
        CloseableHttpResponse res = null;
        try {
            res = httpClient.execute(httpGet);
            HttpEntity entity = res.getEntity();
            body = EntityUtils.toString(entity);
            response = JsonUtil.Json2T(body, Response.class, new Response());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static Response getMarket(String secID) {

        String body = "";
        Response response = null;

        //根据api store页面上实际的api url来发送get请求，获取数据
        String url = GETMARKET + secID + "&startDate=&endDate=";
        HttpGet httpGet = new HttpGet(url);
        //在header里加入 Bearer {token}，添加认证的token，并执行get请求获取json数据
        httpGet.addHeader("Authorization", "Bearer " + ACCESS_TOKEN);
        CloseableHttpResponse res = null;
        try {
            res = httpClient.execute(httpGet);
            HttpEntity entity = res.getEntity();
            body = EntityUtils.toString(entity);
            response = JsonUtil.Json2T(body, Response.class, new Response());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }



}
