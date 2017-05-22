public class Price {
    //持有一个具体的策略对象
    private MemberStrategy strategy;    
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }
    
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    public double calcPrice(double BooksPrice){
        return this.strategy.calcPrice(BooksPrice);
    }
}