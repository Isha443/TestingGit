package impl;
import Encap.StdEncap;
import interf.Stdinter;
public class Stdimpl implements Stdinter {
  @Override
    public void add(StdEncap stdencap){
      int result;
      result = stdencap.getNum1() + stdencap.getNum2();
      System.out.println("Addition="+result);

  }
  @Override
    public int subtract(StdEncap stdencap){
      int result;
      result = stdencap.getNum1() - stdencap.getNum2();
      return result;
  }
}
