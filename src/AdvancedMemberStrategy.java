public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double BooksPrice) {
        
        System.out.println("高级会员享有20%的折扣！");
        return BooksPrice * 0.8;
    }
}