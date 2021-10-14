import java.awt.*;
class TextAreaGit{
TextAreaGit(){

Frame f=new Frame("Anuj");

TextArea t1=new TextArea("idk bro");

f.add(t1);

f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());

}
public static void main (String args[]){
new TextAreaGit();
}
}