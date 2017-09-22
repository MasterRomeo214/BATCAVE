class notString {

public static void main(String[] args) {

    notString("semicolon");
    notString("not semicolon");

    //receive command line argument if available
    if(args.length>0){
      notString(args[0]);
    }

}

private static void notString(String str) {

    String n = "not";

      if (str.substring(0, 3).equals(n)){
        System.out.println(str);
      }else{
        System.out.println((n) +" "+ (str));
      }
}
    // print result here

}
