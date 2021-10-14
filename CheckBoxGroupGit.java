import java.awt.*;
class CheckBoxGroupGit{
CheckBoxGroupGit(){

Frame f= new Frame("Anuj");

CheckboxGroup cbg =new CheckboxGroup();

Checkbox c1=new Checkbox("Male",cbg,true);

Checkbox c2=new Checkbox("Female",cbg,false);

f.add(c1);
f.add(c2);

f.setLayout(new FlowLayout());
f.setVisible(true);
f.setSize(500,500);
}
public static void main (String args[]){
new CheckBoxGroupGit();
}
}