/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Gomathy
 */








/*<applet code="Registeration" height=1200 width=1000>
  </applet>*/
class Registration extends Frame implements ItemListener,ActionListener {

    /**
     * @param args the command line arguments
     */
  
   
        // TODO code application logic here
    String s=" ";
     String msg="";   
    MenuBar mbF;
    Menu mFile;
    MenuItem mItem1,mItem2,mItem3,mItem4;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    TextField field1,field2,field3,field4,field5,field6,field7;
    TextArea ta1;
    CheckboxGroup cbg1;
    Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
    Button b1,b2,b3;
    Frame fr;
    

        
        Registration()
        {
        
  fr=new Frame("Registration Page:");      
     mbF=new MenuBar();
        mFile=new Menu("File");
        mItem1=new MenuItem("Save");
         mItem2=new MenuItem("Print");
          mItem3=new MenuItem("Close");
        mFile.add(mItem1);
        mFile.add(mItem2);
        mFile.add(mItem3);
        mbF.add(mFile);
        l1=new Label("---Registration---\t\t");
        l1.setFont(new Font("Arial",1,35));
        l1.setForeground(Color.black);
        l2=new Label("\nName:");
        field1=new TextField(35);
        l3=new Label("\tIc No:");
        field2=new TextField(35);
        l4=new Label("\tGender:          \t");
        cbg1=new CheckboxGroup();
        cb1=new Checkbox("Male\t\t\t\t\t",cbg1,false);
        cb2=new Checkbox("Female\t\t\t\t\t\t",cbg1,false);
        l5=new Label("Hobbies");
        cb3=new Checkbox("Playing",true);
        cb4=new Checkbox("Gardening");
        cb5=new Checkbox("Reading");
       
        l6=new Label("Address");
        ta1=new TextArea(3,30);
        l7=new Label("Ph No:");
        field4=new TextField(30);
        field4.addActionListener(this);
        l8=new Label("\nBirthDate:");
        l9=new Label("Day");
        field5=new TextField(1);
        l10=new Label("Month");
        field6=new TextField(1);
        l11=new Label("Year");
        field7=new TextField(1);
        cb6=new Checkbox("I agree...\t\t\t\t\t\t");
        b1=new Button("\nClear");
        b1.addActionListener(this);
        b1.setFont(new Font("Arial",1,15));
        b2=new Button("Submit");
        b2.addActionListener(this);
        b2.setFont(new Font("Arial",1,15));
        b3=new Button("Exit");
        b3.setFont(new Font("Arial",1,15)); 
       
      
          fr.add(l1);
        
        fr.add(l2);
        fr.add(field1);
        
         fr.add(l3);
        fr.add(field2);
        
        fr.add(l4);
        fr.add(cb1);
        fr.add(cb2);
        
        fr.add(l5);
        fr.add(cb3);
         fr.add(cb4);
          fr.add(cb5);
          
         fr.add(l6);
         fr.add(ta1);
          
          fr.add(l7);
          fr.add(field4);
         fr.add(l8);
          fr.add(l9);
          fr.add(field5);
          fr.add(l10);
        fr.add(field6);
        fr.add(l11);
        fr.add(field7);
        fr.add(cb6);
        fr.add(b1);
        
        fr.add(b2);
        
       fr.add(b3);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        
        fr.setMenuBar(mbF);
        fr.setBackground(Color.cyan);
        
        fr.setSize(360,500);
        fr.setVisible(true);
        fr.setLayout(new FlowLayout());
        fr.addWindowListener(new WindowAdapter()
                {
                  public void windowClosing(WindowEvent e)
                  {
                      System.exit(0);
                  }
                });  


       
       }
        public String action()
        {
            return msg;
        }
         
          @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
            repaint();
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     msg+="clicked";
     
    }
  
      

   
        
    
}


/*<applet code="HelloWorld" width=1000 height=1250>
</applet>*/
public class JavaApplication1 extends Applet implements MouseListener,MouseMotionListener,Runnable,ItemListener,KeyListener,ActionListener{

    /**
     * @param args the command line arguments
     */
   
    String msg="";
    String msg1="";
    String s="";
    String s1="";
    String s2="";
    int x=900,y=90;
  
   Label l5=new Label("Hobbies");
    
      Checkbox cb3=new Checkbox("Stay",true);
         Checkbox cb4=new Checkbox("Form");
         Label l14=new Label("||  Gender");
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox cb1=new Checkbox("Male\t\t\t\t\t",cbg1,false);
        Checkbox cb2=new Checkbox("Female\t\t\t\t\t\t",cbg1,false);
        Choice c1;
        TextField namet;
        TextField passt;
        Image im;
     //Frame fm;
     //Applet fa;
    @Override
    public void init()
        {
      
        Button b1=new Button("form");
       
        Button b2=new Button("welcome");
        setBackground(Color.black);
        setForeground(Color.magenta);
     
        Label l1=new Label("Welcome To Applet Application");
      l1.setFont(new Font("Arial",3,35));
        l1.setForeground(Color.magenta);
        //b1.addMouseListener(this);
          addMouseListener(this);
         addMouseMotionListener(this);
         add(b2);
        b2.addKeyListener(this);
        add(l1);
        
        add(b1);
        b1.addActionListener(this);
        
        cb3.addItemListener(this);
      
        cb4.addItemListener(this);
        add(l5);
        l5.setFont(new Font("Arial",1,15));
        add(cb3);
        cb3.setFont(new Font("Arial",1,15));
        add(cb4);
        cb4.setFont(new Font("Arial",1,15));
        add(l14);
        l14.setFont(new Font("Arial",1,15));
        add(cb1);
        cb1.setFont(new Font("Arial",1,15));
        add(cb2);
        cb2.setFont(new Font("Arial",1,15));
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        c1=new Choice();
       //setForeground(Color.red);
        c1.add("Delhi");
        c1.add("Mumbai");
        c1.add("Chennai");
         add(c1);
         c1.addItemListener(this);
         Label name=new Label("Name: ",Label.RIGHT);
         Label pass=new Label("Password: ",Label.RIGHT);
         name.setFont(new Font("Arial",1,25));
         pass.setFont(new Font("Arial",1,25));
         namet=new TextField(12);
         passt=new TextField(8);
          namet.setFont(new Font("Arial",1,20));
         passt.setFont(new Font("Arial",1,20));
         passt.setEchoChar('*');
         add(name);
         
         add(namet);
         add(pass);
         add(passt);
         namet.addActionListener(this);
         passt.addActionListener(this);
          im=getImage(getDocumentBase(),"com.jpg");
          
         
       
   
                
                  
        
         
    /*     Label one=new Label("Test it!!!");
         Label two=new Label("Feel it !!!");
         Label three=new Label("Enjoy it !!!");
         add(one);
         add(two);
         add(three);*/
        
       
         }
 
    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        s1="choosen label "+e.getSource();
        
        repaint();
    }
      @Override
	public void paint(Graphics g)
        {
               Dimension d=this.getSize();
                Font f=new Font("arial",3,25);
                 g.setFont(f);
		//g.drawString("Welcome To Applet Application", 800,50);
                g.drawString(msg, x, y);
                 Font f1=new Font("arial",3,20);
                g.setFont(f1);
                g.drawString("Hai,Hello this is your application "+msg+" !!!", x-150, y+50);
                g.drawLine(200,200 , 1700, 200);
                g.drawRect(1, 1, d.width-2, d.height-2);
                 g.drawImage(im,10,400,this);
                 int xpoints[]={700,500,500};
                 int ypoints[]={700,750,600};
                 int num=3;
                 g.drawPolygon(xpoints,ypoints,num);
                g.drawArc(10,400,100,100,0,-90);
                 g.drawArc(10,500,100,100,0,-270);
                 g.drawArc(10,400,100,100,0,90);
                 g.setColor(Color.blue);
                 int xpoint[]={950,1000,1000,900,950};
                 int ypoint[]={600,750,850,700,600};
                 int num1=5;
                 g.fillPolygon(xpoint,ypoint,num1);
                 g.drawOval(150, 400, 60, 60);
                 g.fillOval(200,450,100,100);
                 g.fillOval(1700, 600, 100, 100);
                 g.setColor(Color.orange);
                   g.drawOval(1650, 400, 60, 60);
                 g.drawOval(500, 450, 100, 150);
                 g.fillOval(700,500,120,190);
                 g.setColor(Color.magenta);
                  g.fillOval(1400,500,120,190);
                 Font f2=new Font("arial",3,14);
                g.setFont(f2);
                g.drawString("Name: "+namet.getText(),x-200,y+130);
                g.drawString("Selected Text:  "+namet.getSelectedText(),x-200,y+145);
                g.drawString("Password: "+passt.getText(), x-200, y+160);
                g.drawString(msg,90,2000);
                g.drawString(msg, x-200, y+250);
                g.drawString(s1,x-200,y+180);
                s="Current Status";
                 g.drawString(s, x-200, y+200);
                s = "Stay "+cb3.getState();
                g.drawString(s, x-200, y+220);
                s = "Form "+cb4.getState();
                g.drawString(s, x-200, y+240);
                 s2="Current selection: ";
        s2+=cbg1.getSelectedCheckbox().getLabel();
                g.drawString("For radio button ", x-200, y+260);
               
                   g.drawString(s2, x-200, y+280);
                   msg1="Current place: ";
                   msg1+=c1.getSelectedItem();
                   g.drawString(msg1, x-200, y+300);
                  
                  
                
                
                  
               
	}
    
    @Override
    public void mouseClicked(MouseEvent e) {
          /*fm=new SampleFrame("A Frame Window");
        fm.setSize(250,200);
        fm.setVisible(true);
        setBackground(Color.black);
        setForeground(Color.magenta);
    
        
                fa=new FormApplet();
                 fa.setBounds(100, 100, 500, 500);
        fa.setVisible(true);*/
        throw new UnsupportedOperationException("Not supported yet");
  


    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.lightGray);
        //setForeground(Color.orange);
        
       showStatus("Mouse is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
                setForeground(Color.magenta);
         setBackground(Color.black);
       showStatus("Mouse is Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyTyped(KeyEvent e) {
               setForeground(Color.blue);
       msg+=e.getKeyChar();
       repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
               setForeground(Color.blue);
       showStatus("Key Down");
    }

    @Override
    public void keyReleased(KeyEvent e) {
               setForeground(Color.magenta);
       showStatus("key up");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        repaint();
        Registration r=new Registration();
        showStatus("Button clicked");
       
    }

   

   

  

   
    
}
