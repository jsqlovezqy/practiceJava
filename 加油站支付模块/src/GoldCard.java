public class GoldCard extends Card{
    public GoldCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("原价" + money);
        System.out.println("优惠后" + money * 0.8);
        setMoney(getMoney() - money * 0.8);
        if (money * 0.8>=200){
            System.out.println("恭喜您获得洗车券一张");
        }else{
            System.out.println("消费金额不满200元，不能免费洗车");
        }

    }
}
