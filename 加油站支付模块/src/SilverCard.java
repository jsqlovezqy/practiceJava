public class SilverCard extends Card{
    public SilverCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("原价" + money);
        System.out.println("优惠后" + money * 0.9);
        setMoney(getMoney() - money * 0.9);
    }
}
