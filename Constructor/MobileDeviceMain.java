package Constructor;public class MobileDeviceMain {    public static void main(String[] args) {        MobileDevice m1 = new MobileDevice();        m1.setCompany("Samsung");        m1.setModelName("Galaxy M42");        m1.setModelNo(1000);        m1.setPrice(28000);        System.out.println("Company : "+m1.getCompany()+"... ModelName : "+m1.getModelName()+"ModelNo : "+m1.getModelNo()+"... Price : "+m1.getPrice());      MobileDevice m2=new MobileDevice();        m2.printDetail();    }}