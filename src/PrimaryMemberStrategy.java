public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double BooksPrice) {
        
        System.out.println("初级会员不享有折扣！");
        return BooksPrice;
    }

}