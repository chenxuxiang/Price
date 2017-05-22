public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double BooksPrice) {

        System.out.println("中级会员享有10%的折扣！");
        return BooksPrice * 0.9;
    }

}