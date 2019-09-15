public class VendingMachine {
    /*
Design a vending Machine
Customer can
1. review display of all goods
2. put money into VendingMachine / Swipe creditCard
3. Buy product
4. choose proceed or stop
5. get good and restMoney

------------------------------------------------------------------------------------------
Class: Customer
Data: customerId, name, phoneNumber, givenoney
Behaviour:
reviewAllGoods() {
      VendingMachine.disPlayAllGoods();
      // display goods to customer
}
buyGood(Good good, Money givenMoney){
    //get good from vendingMachine
       VendingMachine.sell(good, givenMoney);
}


getRestMoney(){
      Integer restMoney = VendingMachine.returnRestMoney(money);
}
-----------------------------------------------------------------------------------------------
Class: Good
Data: goodId, price, kind
Behaviour:


isEnoughPrice(Money givenMoney) {
    if (givenMoney >= price) {
        return true;
    } else {
        return false;
    }
}

-------------------------------------------------------------------------------------------------
Class: VendingMachine
Data: Map<Good, Integer > map, totalMoney
// Good is Key, numbers of good is value
Behaviour:

disPlayAllGoods() {
    print map.keySet();// display all goods to customer
}

sell(Good good, Money givenMoney){
    if(map.containsKey(good.goodId) && good.isEnoughPrice(givenMoney)) {
        map.put(good, map.get(good)-1);
        return good;
    } else {
        return null;
    }

}

returnRestMoney(Money givenMoney) {
    int restMoney = 0;
    if (!good.isEnoughPrice(givenMoney)) {
        restMoney = givenMoney;
        return restMoney;
    }
    if (restMoney == good.price) {
        restMoney = 0;
    } else {
        restMoney = givenMoney - good.price;
    }
    return restMoney;

}

--------------------------------------------------------------------------------------------

    * */
}
