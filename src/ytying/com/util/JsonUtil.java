package ytying.com.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by UKfire on 16/2/7.
 */
public class JsonUtil {

    /**
     * String转JsonObject
     */
    public static JSONObject string2JsonObject(String str) {

        JSONObject jobj = JSON.parseObject(str);
        if (jobj == null)
            jobj = new JSONObject();
        return jobj;
    }

    /**
     * String转JsonArray
     */
    public static JSONArray string2JArray(String str) {
        JSONArray jobj = JSON.parseArray(str);
        if (jobj == null)
            jobj = new JSONArray();
        return jobj;
    }

    /**
     * String转T
     */
    public static <T> T Json2T(String str, Class<T> classOfT, T def) {
        if (null == str) {
            return def;
        }
        try {
            return JSON.parseObject(str, classOfT);
        } catch (Exception e) {
            e.printStackTrace();
            return def;
        }
    }

    /**
     * string转List<T>
     */
    public static <T> List<T> string2List(String str, Class<T> classOfT) {
        if (null == str) {
            return new ArrayList<T>();
        }
        try {
            List list = JSON.parseArray(str, classOfT);
            if (null == list)
                list = new ArrayList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<T>();
        }
    }


    /**
     * Object转String
     */
    public static String Object2Json(Object o) {
        try {
            String s = JSON.toJSONString(o);
            if (s == null)
                s = new String();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return new String();
        }
    }

    /**
     * List转String
     */
    public static String list2JsonSerial(List l) {
        if (null == l) {
            return new String();
        }
        try {
            String s = JSON.toJSONString(l, SerializerFeature.WriteClassName);
            if (null == s)
                s = new String();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return new String();
        }
    }

    /**
     * Collection转JSONArray
     */
    public static JSONArray Collection2JsonArray(Collection collection) {
        try {
            JSONArray jarray = (JSONArray) JSON.toJSON(collection);
            if (jarray == null)
                jarray = new JSONArray();
            return jarray;
        } catch (Exception e) {
            return new JSONArray();
        }
    }

}
