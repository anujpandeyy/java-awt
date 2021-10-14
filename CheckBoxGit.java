import java.awt.*;
class CheckBoxGit{
CheckBoxGit(){
Frame f =new Frame("Anuj");

Checkbox c1=new Checkbox("C");

Checkbox c2=new Checkbox("C++");


f.add(c1);
f.add(c2);

f.setLayout(new FlowLayout());
f.setSize(500,500);
f.setVisible(true);

}
public static void main (String args[]){
new CheckBoxGit();
}
}