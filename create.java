// アプリケーションクラス　オブジェクトの生成とメッセージ送信
class Create {

    public static void main（String args[）{
        // ロ座オブジェクトの生成
        Account obj= new Account();

        // 値の設定メソッド呼び出し
        obj.setData（"鈴木一郎”，100000);

        // ロ座情報の表示メソッド呼び出し
        obj.display();

        // 入金処理
        obj.deposit(20000);

        // 口座情報の表示メソッド呼び出し
        system.out.println("—入金後—");
        obj.display();

        // 払い出し処理
        int money = obj.withdraw(5000);

        // 引き出し金額の表示
        System.out.println("引き出した金額は" + money + "円です。\n");

        // ロ座情報の表示メソッド呼び出し
        System.out.println("—払い出し後—");
        obj.display();
}




