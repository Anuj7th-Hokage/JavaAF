package Constructor;public class ChairMain {    public static void main(String[] args) {        Chair c1 = new Chair();        c1.setChairNo(15);        c1.setChairType("Steel");        c1.setColor("Black");        c1.setFoaldable(true);        System.out.println("ChairNo : " +c1.getChairNo());        System.out.println("Chair Type : " +c1.getChairType());        System.out.println("Chair Color : " +c1.getColor());        System.out.println("Foaldable : " +c1.getFoaldable());        Chair c2=new Chair();        c2.printDetail();    }}