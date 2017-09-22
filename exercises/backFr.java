public class backFr{

public static void main(String[] args) {

    frontBack("Robocop");

    //receive command line argument if available
    if(args.length>0){
      frontBack(args[0]);
    }
}

private static void frontBack(String str) {

    int nameSize = str.length()-1;
    char firstC = str.charAt(0);
    char lastC = str.charAt(nameSize);
    String name = str.substring(1, nameSize);

      System.out.println(lastC + name + firstC);

    // print result here

}

}
