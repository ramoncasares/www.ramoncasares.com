// applet.java

/*
<APPLET
 CODE = "applet.class"
 WIDTH = 100
 HEIGHT = 100
 ARCHIVE = "RLisp.jar"
</APPLET>
*/

public class applet extends java.applet.Applet {

 String[] title = { "RLisp" };

 public void init() {
  RLispConsole.main(title);
 }

}
