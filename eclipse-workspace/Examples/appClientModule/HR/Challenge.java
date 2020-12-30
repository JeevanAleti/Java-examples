package HR;

class Challenge {
  public static String markdownParser( String markdown ) {
    String s = null;
    int len = markdown.length();
    
    String dat[] = markdown.split(" ");
    String hases = ""+dat[0];
    String valu = "";
    int hasc= 0;
    for(int i=0; i<dat[0].length();i++)
    {
      if(hases.charAt(i) == '#')
      {
        hasc++;
      }
    }
    if(dat.length<2)
    {
      return "#Invalid";
      
    }
    
    for(int i=1; i<dat.length; i++){
      if(i==1){
        valu += dat[i];
        System.out.println(valu);
      }
      else{
        valu += " "+dat[i];
        System.out.println(valu);
      }
    }
    s = "<h"+hasc+">"+valu+"</h"+hasc+">";
    return s;
    
  }
}