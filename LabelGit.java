import java.awt.*;
class LabelGit{

LabelGit() {
Frame f=new Frame("");

Label l = new Label("Anuj");
Label l1 = new Label("Pandey");

f.add(l);
f.add(l1);

f.setLayout(new FlowLayout());
f.setSize(500,500);
f.setVisible(true);
}
public static void main (String args[]){
new LabelGit();
}
}