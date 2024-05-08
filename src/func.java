class func {


    public static void main(String[] args) {

       int a=20,b=10;
        Func(a,b);
        System.out.println(a+ " "+b);

//        System.out.println(a);


    }

 static void Func(int a, int b) {
        int temp = a;
        a = b;
        b = temp;



 }


}
