class Addamount{
    int Amount=50;
    public Addamount(){

    }
    public Addamount(int a){
        Amount=a+Amount;
    }
    public void displayAmount(){
        System.out.println(Amount);

    }
}

class Ansy{
    public static void main(String[] args) {
        Addamount a= new Addamount();
        Addamount b=new Addamount(40);
        a.displayAmount();
        b.displayAmount();
    }
}
