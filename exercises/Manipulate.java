class Manipulate {

public static void main(String[] args){

  String str = "http://www.academiadecodigo.org";
  String domain = ""; // www.academiadecodigo.org
  String name = "";   // < Academia de Codigo_ >

  domain = str.replaceAll("http://", "");

  name = str.replaceAll("http://www.", "< ");
  name = name.replaceAll(".org", "_ >");
  name = name.replaceFirst("co", " Co");
  name = name.replaceFirst("mia", "mia ");
  name = name.replaceFirst("a", "A");

    System.out.println("I am a Code Cadet at "+ name + " " + domain);

  //  System.out.println(name);
  //  System.out.println(domain);
}
}
