import java.awt.*;
class ButtonGit{
ButtonGit(){

Frame f=new Frame("");

Button b1= new Button("Hello");

Button b2= new Button("World");

f.add(b1);
f.add(b2);

f.setLayout(new FlowLayout());
f.setSize(500,500);
f.setVisible(true);

}
public static void main(String args[]){
new ButtonGit();
}
}
