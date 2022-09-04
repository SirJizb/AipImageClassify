package txsb;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.imageclassify.AipImageClassify;

public class Sample {
    //����APPID/AK/SK
    public static final String APP_ID = "25053689";
    public static final String API_KEY = "��� Api Key";
    public static final String SECRET_KEY = "��� Secret Key";

    public static void main(String[] args) {
        // ��ʼ��һ��AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // ��ѡ�������������Ӳ���
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
        client.setHttpProxy("proxy_host", proxy_port);  // ����http����
        client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

        // ���ýӿ�
        String path = "test.jpg";
        JSONObject res = client.objectDetect(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
        
    }
}
