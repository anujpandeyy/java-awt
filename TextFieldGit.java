import java.awt.*;
class TextFieldGit{
TextFieldGit(){

Frame f=new Frame("Anuj");

TextField t1=new TextField (5);
TextField t2=new TextField (10);

f.add(t1);
f.add(t2);

f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());

}

public static void main (String args[]){
new TextFieldGit();
}
} 