import java.awt.*;
class MenuGit{
MenuGit(){

Frame f =new Frame("Anuj");

MenuBar mb =new MenuBar();
Menu m=new Menu("Menu");
MenuItem i1=new MenuItem("Pizza");
MenuItem i2=new MenuItem("Fries");
MenuItem i3=new MenuItem("Burger");

m.add(i1);
m.add(i2);
m.add(i3);

mb.add(m);

f.setMenuBar(mb);
f.setVisible(true);
f.setSize(500,500);
f.setLayout(new FlowLayout());
}
public static void main (String args []){
new MenuGit();
}
}