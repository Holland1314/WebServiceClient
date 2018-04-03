package example.webservice;

/**
 * Created by shileichao on 2018/4/3.
 */
public class WsClient {
    public static void main(String[] args) {
        //创建一个用户产生WebService'Impl的实例工厂
        WebServiceImplService factory = new WebServiceImplService();
        //通过工厂生成一个webServiceImpl实例
        WebServiceImpl wsimpl = factory.getWebServiceImplPort();
        //调用WebServiceImpl的sayHello方法
        String result=wsimpl.sayHello("车联天下");
        System.out.println("=======================================");
        System.out.println("调用WebService SayHello方法的返回结果是："+result);


    }
}
