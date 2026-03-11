// 口座クラス
class Account {

    // メンバ変数
    String name;     //口座名義
    int    balance;  //残高

    // 値の設定メソッド
    void setData(String pName, int pBalance) {
        name = pName:
        balance = pBalance;
    }

    // 入金処理コメソッド
    void deposit(int pMoney) {
        balance += pMoney;
    }

    //払い出し口メソッド
    int withdraw(int pMoney) {
        if ( balance >= pMoney ) {
             balance -= pMoney;
             return pMoney;
        } else {
             return 0;
        }

    // 値の表示メソッド
    void display() {
        System.out.print("口座名義：" + name);
        System.out.println（"\t残高：" + balance + "円\n")
    }
}














