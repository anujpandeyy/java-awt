import java.awt.*;
class ScrollBarGit{
ScrollBarGit(){

Frame f =new Frame("Anuj");

Scrollbar s=new Scrollbar();

f.add(s);

f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout()); 
}
public static void main (String args[]){
new ScrollBarGit();
}
}