import org.junit.Test;

public class PriceTest {
	@Test
	
	 	public void  AdvancedMemberStrategy(){
	        Price price = new Price(new AdvancedMemberStrategy());
	        //计算价格
	        double calcPrice = price.calcPrice(300);
	        System.out.println("图书的最终价格为：" + calcPrice);
	    }
	@Test
	public void  IntermediateMemberStrategy(){
        Price price = new Price(new IntermediateMemberStrategy());
        //计算价格
        double calcPrice = price.calcPrice(300);
        System.out.println("图书的最终价格为：" + calcPrice);
    }
	@Test
	public void  PrimaryMemberStrategy(){
        Price price = new Price(new PrimaryMemberStrategy());
        //计算价格
        double calcPrice = price.calcPrice(300);
        System.out.println("图书的最终价格为：" + calcPrice);
    }

}
