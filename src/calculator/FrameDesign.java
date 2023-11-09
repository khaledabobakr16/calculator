
package calculator;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import static javax.swing.text.StyleConstants.Bold;
public class FrameDesign extends JFrame implements ActionListener
{
    ArrayList<String>Arr=new ArrayList<String>(100);
    private JTextArea history_txt=new JTextArea("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n    Enter arithmetic operations to display");
    JScrollPane Scroll=new JScrollPane(history_txt);
    private PanelDesign panel=new PanelDesign();
    private PanelDesign panel_history=new PanelDesign();
    private Image icon = Toolkit.getDefaultToolkit().getImage("src\\icons\\icon3.png");
    Icon backarrow = new ImageIcon("src\\icons\\back-arrow.png");
    Icon icondark = new ImageIcon("src\\icons\\Dark.png");
    Icon iconlight = new ImageIcon("src\\icons\\night-mode.png");
    Icon icon_history_light = new ImageIcon("src\\icons\\history.png");
    Icon icon_history_dark = new ImageIcon("src\\icons\\history_dark.png");
    private JLabel Programmed_by=new JLabel("Programmed by :Thebes Academy Students");
    private JLabel Version=new JLabel("V 1.0.0");
    private JLabel Display_Result=new JLabel("",SwingConstants.RIGHT);
    private JLabel Display_Result_2=new JLabel("",SwingConstants.RIGHT);
    private JButton button_CE=new JButton("CE");
    private JButton button_C=new JButton("C");
    private JButton button_m=new JButton("%");
    private JButton button_equal=new JButton("=");
    private JButton button_clear=new JButton("clear");
    private JButton button_on=new JButton("ON");
    private JButton button_=new JButton("+\\-");
    private JButton button_0=new JButton("0");
    private JButton button__=new JButton(".");
    private JButton button_asin=new JButton("asin (x)");  
    private JButton button_acos=new JButton("acos (x)");  
    private JButton button_ln=new JButton("ln(x)");  
    private JButton button_w=new JButton("⅓");  
    private JButton button_x=new JButton("⅕"); 
    private JButton button_multiplay=new JButton("×"); 
    private JButton button_divided=new JButton("/"); 
    private JButton button_sub=new JButton("-");  
    private JButton button_sum=new JButton("+");  
    private JButton button_sin=new JButton("sin (x)"); 
    private JButton button_cos=new JButton("cos (x)"); 
    private JButton button_tan=new JButton("tan (x)"); 
    private JButton button_round=new JButton("round (x)"); 
    private JButton button_rint=new JButton("rint (x)"); 
    private JButton button_sinh=new JButton("sinh(x)"); 
    private JButton button_cosh=new JButton("cosh(x)"); 
    private JButton button_tanh=new JButton("tanh(x)"); 
    private JButton button_log2=new JButton("log₂ (x)"); 
    private JButton button_log=new JButton("log(x)"); 
    private JButton button_expx=new JButton("𝑒ˣ"); 
    private JButton button_abs=new JButton("Abs"); 
    private JButton button_sqrt=new JButton("√x"); 
    private JButton button_sqrt3=new JButton("∛x"); 
    private JButton button_sqrt_2=new JButton("√2"); 
    private JButton button_pi=new JButton("π"); 
    private JButton button_sqrt_3=new JButton("√3"); 
    private JButton button_H=new JButton("½");//Alt+0189 
    private JButton button_E=new JButton("¼"); //Alt+0188
    private JButton button_exp=new JButton("e"); 
    private JButton button_fact=new JButton("x!");
    private JButton button_pow2=new JButton("x²");//Alt 253
    private JButton button_pow3=new JButton("x³"); //Alt 0179
    private JButton button_k0=new JButton("κₒ");
    private JButton button_7=new JButton("7");
    private JButton button_8=new JButton("8");
    private JButton button_9=new JButton("9");
    private JButton button_phi=new JButton("φ");
    private JButton button_4=new JButton("4");
    private JButton button_5=new JButton("5");
    private JButton button_6=new JButton("6");
    private JButton button_G=new JButton("G");
    private JButton button_1=new JButton("1");
    private JButton button_2=new JButton("2");
    private JButton button_3=new JButton("3");
    private JButton button_GO=new JButton("λ");
    private JButton btn_58=new JButton("ln");
    private JButton DarkMode_btn=new JButton(icondark);
    private JButton lightMode_btn=new JButton(iconlight);
    private JButton history_light=new JButton(icon_history_light);
    private JButton history_dark=new JButton(icon_history_dark);
    //-------------attributes------------//
    double number1=0;
    double number2=0;
    double result;
    char operation='c';
    int click_button_history=0;
    //----------------------------------//
    public FrameDesign()//constractor
    {
        Frame();
        Frame1();
    }  
    //--------------Methods--------------//
     public void Frame()
    {
        this.setIconImage(icon);
        this.setTitle("Calculator");
        this.setSize(335,635);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(550,30);
        this.setResizable(false);
        this.setLayout(null);
        panel.setLayout(null);
        panel.setSize(335,635);   
        panel.setBackground(new Color(220,0,55,5));
        panel.setBackground(Color.white);
        Programmed_by.setFont(new Font("",Font.BOLD,9));
        Programmed_by.setForeground(Color.white);              
        Programmed_by.setBounds(55,550,300,20);
        Version.setFont(new Font("",Font.BOLD,9));
        Version.setForeground(Color.red);              
        Version.setBounds(280,570,300,20);
        this.add(panel);
        panel.add(Programmed_by);
        panel.add(Version);
        Display_Result_2.setSize(300,110);
        Display_Result_2.setFont(new Font("",Font.ITALIC,15));
        Display_Result_2.setForeground(Color.lightGray);
        panel.add(Display_Result_2);
        Display_Result.setSize(300,210);
        Display_Result.setFont(new Font("Verdana",Font.BOLD,20));
        panel.add(Display_Result);
        //-----------Set Actionevent For Buttons----------//
        button_0.addActionListener(this);
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_7.addActionListener(this);
        button_8.addActionListener(this);
        button_9.addActionListener(this);
        //----------------------------------//
        button_.addActionListener(this);
        button__.addActionListener(this);
        button_CE.addActionListener(this);
        button_C.addActionListener(this);
        button_clear.addActionListener(this);
        //-------------const------------//
        button_pi.addActionListener(this);
        button_exp.addActionListener(this);
        button_phi.addActionListener(this);
        button_k0.addActionListener(this);
        button_G.addActionListener(this);
        button_GO.addActionListener(this);
        //--------------angels----------//
        button_sin.addActionListener(this);
        button_cos.addActionListener(this);
        button_tan.addActionListener(this);
        button_sinh.addActionListener(this);
        button_cosh.addActionListener(this);
        button_tanh.addActionListener(this);
        button_asin.addActionListener(this);
        button_acos.addActionListener(this);
        button_round.addActionListener(this);
        button_rint.addActionListener(this);
        //----------------------------------//
        button_abs.addActionListener(this);
        button_log.addActionListener(this);
        button_log2.addActionListener(this);
        button_ln.addActionListener(this);
        button_expx.addActionListener(this);
        //-------------------------------------//
        button_sqrt.addActionListener(this);
        button_sqrt3.addActionListener(this);
        button_sqrt_2.addActionListener(this);
        button_sqrt_3.addActionListener(this);
        //------------------------------------//
        button_H.addActionListener(this);
        button_E.addActionListener(this);
        button_x.addActionListener(this);
        button_w.addActionListener(this);
        //----------------------------------//
        button_fact.addActionListener(this);
        //----------------------------------//
        button_pow2.addActionListener(this);
        button_pow3.addActionListener(this);
        //-----------------------------------//
        button_sum.addActionListener(this);
        button_sub.addActionListener(this);
        button_divided.addActionListener(this);
        button_multiplay.addActionListener(this);
        button_equal.addActionListener(this);
        button_m.addActionListener(this);
        history_light.addActionListener(this);
        history_dark.addActionListener(this);
        }
    public void Frame1()
    {
        
        
        button_CE.setBounds(5,150,60,30);
        button_CE.setBorder(new LineBorder(Color.BLACK));
        button_CE.setBackground(new Color(25,25,112));
        button_CE.setForeground(Color.white);
        button_CE.setFont(new Font("",Font.BOLD,13));
        panel.add(button_CE);
        button_C.setBounds(68,150,60,30);
        button_C.setBackground(new Color(25,25,112));
        button_C.setBorder(new LineBorder(Color.BLACK));
        button_C.setForeground(Color.white);
        button_C.setFont(new Font("",Font.BOLD,13));
        panel.add(button_C);
        button_m.setBounds(130,150,60,30);
        button_m.setBackground(new Color(25,25,112));
        button_m.setBorder(new LineBorder(Color.BLACK));
        button_m.setForeground(Color.white);
        button_m.setFont(new Font("",Font.BOLD,13));
        panel.add(button_m);
        button_equal.setBounds(192,500,122,30);
        button_equal.setBackground(Color.white);
        button_equal.setBorder(new LineBorder(Color.BLACK));
        button_equal.setFont(new Font("Verdana",Font.BOLD,17));
        button_equal.setForeground(new Color(25,25,112));
        panel.add(button_equal);
        button_clear.setBounds(192,150,60,30);
        button_clear.setBackground(new Color(25,25,112));
        button_clear.setBorder(new LineBorder(Color.BLACK));
        button_clear.setForeground(Color.white);
        button_clear.setFont(new Font("",Font.BOLD,13));
        panel.add(button_clear);
        button_on.setBounds(254,150,60,30);
        button_on.setBackground(new Color(25,25,112));
        button_on.setBorder(new LineBorder(Color.BLACK));
        button_on.setForeground(Color.white);
        button_on.setFont(new Font("",Font.BOLD,13));
        panel.add(button_on);
        button_.setBounds(5,500,60,30);
        button_.setBorder(new LineBorder(Color.BLACK));
        button_.setBackground(Color.white);
        button_.setForeground(new Color(25,25,112));
        button_.setFont(new Font("",Font.BOLD,15));
        panel.add(button_);
        button_0.setBounds(68,500,60,30);
        button_0.setBorder(new LineBorder(Color.black));
        button_0.setBackground(Color.white);
        button_0.setForeground(new Color(25,25,112));
        button_0.setFont(new Font("",Font.BOLD,15));
        panel.add(button_0);
        button__.setBounds(130,500,60,30);
        button__.setBorder(new LineBorder(Color.BLACK));
        button__.setBackground(Color.white);
        button__.setForeground(new Color(25,25,112));
        button__.setFont(new Font("",Font.BOLD,17));
        panel.add(button__);
        button_asin.setBounds(192,185,60,30);
        button_asin.setBorder(new LineBorder(Color.BLACK));
        button_asin.setBackground(new Color(25,25,112));
        button_asin.setForeground(Color.white);
        button_asin.setFont(new Font("",Font.BOLD,13));
        panel.add(button_asin);
        button_acos.setBounds(192,220,60,30);
        button_acos.setBorder(new LineBorder(Color.BLACK));
        button_acos.setBackground(new Color(25,25,112));
        button_acos.setForeground(Color.white);
        button_acos.setFont(new Font("",Font.BOLD,13));
        panel.add(button_acos);
        button_ln.setBounds(192,255,60,30);
        button_ln.setBorder(new LineBorder(Color.BLACK));
        button_ln.setBackground(Color.white);
        button_ln.setForeground(new Color(25,25,112));
        button_ln.setFont(new Font("",Font.BOLD,13));
        panel.add(button_ln);
        button_w.setBounds(192,290,60,30);
        button_w.setBorder(new LineBorder(Color.BLACK));
        button_w.setBackground(Color.white);
        button_w.setForeground(new Color(25,25,112));
        button_w.setFont(new Font("",Font.BOLD,17));
        panel.add(button_w);
        button_x.setBounds(192,325,60,30);
        button_x.setBorder(new LineBorder(Color.BLACK));
        button_x.setBackground(Color.white);
        button_x.setForeground(new Color(25,25,112));
        button_x.setFont(new Font("",Font.BOLD,20));
        panel.add(button_x);
        button_multiplay.setBounds(192,395,60,30);
        button_multiplay.setBorder(new LineBorder(Color.BLACK));
        button_multiplay.setBackground(Color.white);
        button_multiplay.setFont(new Font("",Font.ITALIC,20));
        button_multiplay.setForeground(new Color(25,25,112));
        panel.add(button_multiplay);
        button_divided.setBounds(192,360,60,30);
        button_divided.setBorder(new LineBorder(Color.BLACK));
        button_divided.setBackground(Color.white);
        button_divided.setForeground(new Color(25,25,112));
        button_divided.setFont(new Font("",Font.BOLD,16));
        panel.add(button_divided);
        button_sub.setBounds(192,430,60,30);
        button_sub.setBorder(new LineBorder(Color.BLACK));
        button_sub.setBackground(Color.white);
        button_sub.setFont(new Font("",Font.ITALIC,25));
        button_sub.setForeground(new Color(25,25,112));
        panel.add(button_sub);
        button_sum.setBounds(192,465,60,30);
        button_sum.setBorder(new LineBorder(Color.BLACK));
        button_sum.setBackground(Color.white);
        button_sum.setFont(new Font("",Font.ITALIC,20));
        button_sum.setForeground(new Color(25,25,112));
        panel.add(button_sum);
        button_sin.setBounds(5,185,60,30);
        button_sin.setBorder(new LineBorder(Color.BLACK));
        button_sin.setBackground(new Color(25,25,112));
        button_sin.setForeground(Color.white);
        button_sin.setFont(new Font("",Font.BOLD,13));
        panel.add(button_sin);
        button_cos.setBounds(68,185,60,30);
        button_cos.setBorder(new LineBorder(Color.BLACK));
        button_cos.setBackground(new Color(25,25,112));
        button_cos.setForeground(Color.white);
        button_cos.setFont(new Font("",Font.BOLD,13));
        panel.add(button_cos);
        button_tan.setBounds(130,185,60,30);
        button_tan.setBorder(new LineBorder(Color.BLACK));
        button_tan.setBackground(new Color(25,25,112));
        button_tan.setForeground(Color.white);
        button_tan.setFont(new Font("",Font.BOLD,13));
        panel.add(button_tan);
        button_round.setBounds(254,185,60,30);
        button_round.setBorder(new LineBorder(Color.BLACK));
        button_round.setBackground(new Color(25,25,112));
        button_round.setForeground(Color.white);
        button_tan.setFont(new Font("",Font.BOLD,13));
        panel.add(button_round);
        button_rint.setBounds(254,220,60,30);
        button_rint.setBorder(new LineBorder(Color.BLACK));
        button_rint.setBackground(new Color(25,25,112));
        button_rint.setForeground(Color.white);
        button_rint.setFont(new Font("",Font.BOLD,13));
        panel.add(button_rint);
        button_sinh.setBounds(5,220,60,30);
        button_sinh.setBorder(new LineBorder(Color.BLACK));
        button_sinh.setBackground(new Color(25,25,112));
        button_sinh.setForeground(Color.white);
        button_sinh.setFont(new Font("",Font.BOLD,13));
        panel.add(button_sinh);
        button_cosh.setBounds(68,220,60,30);
        button_cosh.setBorder(new LineBorder(Color.BLACK));
        button_cosh.setBackground(new Color(25,25,112));
        button_cosh.setForeground(Color.white);
        button_cosh.setFont(new Font("",Font.BOLD,13));
        panel.add(button_cosh);
        button_tanh.setBounds(130,220,60,30);
        button_tanh.setBorder(new LineBorder(Color.BLACK));
        button_tanh.setBackground(new Color(25,25,112));
        button_tanh.setFont(new Font("",Font.BOLD,13));
        button_tanh.setForeground(Color.white);
        panel.add(button_tanh);
        button_log2.setBounds(130,255,60,30);
        button_log2.setBorder(new LineBorder(Color.BLACK));
        button_log2.setBackground(Color.white);
        button_log2.setForeground(new Color(25,25,112));
        button_log2.setFont(new Font("",Font.BOLD,13));
        panel.add(button_log2);
        button_log.setBounds(68,255,60,30);
        button_log.setBorder(new LineBorder(Color.BLACK));
        button_log.setBackground(Color.white);
        button_log.setForeground(new Color(25,25,112));
        button_log.setFont(new Font("",Font.BOLD,13));
        panel.add(button_log);
        button_expx.setBounds(254,255,60,30);
        button_expx.setBorder(new LineBorder(Color.BLACK));
        button_expx.setBackground(Color.white);
        button_expx.setForeground(new Color(25,25,112));
        button_expx.setFont(new Font("",Font.BOLD,15));
        panel.add(button_expx);
        button_abs.setBounds(5,255,60,30);
        button_abs.setBorder(new LineBorder(Color.BLACK));
        button_abs.setBackground(Color.white);
        button_abs.setForeground(new Color(25,25,112));
        button_abs.setFont(new Font("",Font.BOLD,13));
        panel.add(button_abs);
        button_sqrt.setBounds(5,290,60,30);
        button_sqrt.setFont(new Font("Verdana",Font.BOLD,10));
        button_sqrt.setBorder(new LineBorder(Color.BLACK));
        button_sqrt.setBackground(Color.white);
        button_sqrt.setForeground(new Color(25,25,112));
        button_sqrt.setFont(new Font("",Font.BOLD,15));
        panel.add(button_sqrt);
        button_sqrt3.setBounds(68,290,60,30);
        button_sqrt3.setBorder(new LineBorder(Color.BLACK));
        button_sqrt3.setBackground(Color.white);
        button_sqrt3.setForeground(new Color(25,25,112));
        button_sqrt3.setFont(new Font("",Font.BOLD,15));
        panel.add(button_sqrt3);
        button_sqrt_2.setBounds(68,325,60,30);
        button_sqrt_2.setBorder(new LineBorder(Color.BLACK));
        button_sqrt_2.setBackground(Color.white);
        button_sqrt_2.setForeground(new Color(25,25,112));
        button_sqrt_2.setFont(new Font("",Font.BOLD,15));
        panel.add(button_sqrt_2);
        button_pi.setBounds(254,290,60,30);
        button_pi.setBorder(new LineBorder(Color.black));
        button_pi.setBackground(Color.white);
        button_pi.setForeground(new Color(25,25,112));
        button_pi.setFont(new Font("",Font.BOLD,14));
        panel.add(button_pi);
        button_sqrt_3.setBounds(5,325,60,30);
        button_sqrt_3.setBorder(new LineBorder(Color.BLACK));
        button_sqrt_3.setBackground(Color.white);
        button_sqrt_3.setForeground(new Color(25,25,112));
        button_sqrt_3.setFont(new Font("",Font.BOLD,15));
        panel.add(button_sqrt_3);
        button_H.setBounds(130,290,60,30);
        button_H.setBorder(new LineBorder(Color.BLACK));
        button_H.setBackground(Color.white);
        button_H.setForeground(new Color(25,25,112));
        button_H.setFont(new Font("",Font.BOLD,19));
        panel.add(button_H);
        button_E.setBounds(130,325,60,30);
        button_E.setBorder(new LineBorder(Color.BLACK));
        button_E.setBackground(Color.white);
        button_E.setForeground(new Color(25,25,112));
        button_E.setFont(new Font("",Font.BOLD,19));
        panel.add(button_E);
        button_exp.setBounds(254,325,60,30);
        button_exp.setBorder(new LineBorder(Color.BLACK));
        button_exp.setBackground(Color.white);
        button_exp.setForeground(new Color(25,25,112));
        button_exp.setFont(new Font("",Font.BOLD,15));
        panel.add(button_exp);
        button_fact.setBounds(5,360,60,30);
        button_fact.setBorder(new LineBorder(Color.BLACK));
        button_fact.setBackground(Color.white);
        button_fact.setForeground(new Color(25,25,112));
        button_fact.setFont(new Font("",Font.BOLD,15));
        panel.add(button_fact);
        button_pow2.setBounds(68,360,60,30);
        button_pow2.setBorder(new LineBorder(Color.BLACK));
        button_pow2.setBackground(Color.white);
        button_pow2.setForeground(new Color(25,25,112));
        button_pow2.setFont(new Font("",Font.BOLD,15));
        panel.add(button_pow2);
        button_pow3.setBounds(130,360,60,30);
        button_pow3.setBorder(new LineBorder(Color.BLACK));
        button_pow3.setBackground(Color.white);
        button_pow3.setForeground(new Color(25,25,112));
        button_pow3.setFont(new Font("",Font.BOLD,15));
        panel.add(button_pow3);
        button_k0.setBounds(254,360,60,30);
        button_k0.setBorder(new LineBorder(Color.BLACK));
        button_k0.setBackground(Color.white);
        button_k0.setForeground(new Color(25,25,112));
        button_k0.setFont(new Font("",Font.BOLD,15));
        panel.add(button_k0);
        button_7.setBounds(5,395,60,30);
        button_7.setBorder(new LineBorder(Color.BLACK));
        button_7.setBackground(Color.white);
        button_7.setForeground(new Color(25,25,112));
        button_7.setFont(new Font("",Font.BOLD,15));
        panel.add(button_7);
        button_8.setBounds(68,395,60,30);
        button_8.setBorder(new LineBorder(Color.BLACK));
        button_8.setBackground(Color.white);
        button_8.setForeground(new Color(25,25,112));
        button_8.setFont(new Font("",Font.BOLD,15));
        panel.add(button_8);
        button_9.setBounds(130,395,60,30);
        button_9.setBorder(new LineBorder(Color.BLACK));
        button_9.setBackground(Color.white);
        button_9.setFont(new Font("",Font.BOLD,15));
        button_9.setForeground(new Color(25,25,112));
        panel.add(button_9);
        button_phi.setBounds(254,395,60,30);
        button_phi.setBorder(new LineBorder(Color.BLACK));
        button_phi.setBackground(Color.white);
        button_phi.setForeground(new Color(25,25,112));
        button_phi.setFont(new Font("",Font.BOLD,15));
        panel.add(button_phi);
        button_4.setBounds(5,430,60,30);
        button_4.setBorder(new LineBorder(Color.BLACK));
        button_4.setBackground(Color.white);
        button_4.setForeground(new Color(25,25,112));
        button_4.setFont(new Font("",Font.BOLD,15));
        panel.add(button_4);
        button_5.setBounds(68,430,60,30);
        button_5.setBorder(new LineBorder(Color.BLACK));
        button_5.setBackground(Color.white);
        button_5.setForeground(new Color(25,25,112));
        button_5.setFont(new Font("",Font.BOLD,15));
        panel.add(button_5);
        button_6.setBounds(130,430,60,30);
        button_6.setBorder(new LineBorder(Color.BLACK));
        button_6.setBackground(Color.white);
        button_6.setForeground(new Color(25,25,112));
        button_6.setFont(new Font("",Font.BOLD,15));
        panel.add(button_6);
        button_G.setBounds(254,430,60,30);
        button_G.setBorder(new LineBorder(Color.BLACK));
        button_G.setBackground(Color.white);
        button_G.setForeground(new Color(25,25,112));
        button_G.setFont(new Font("",Font.BOLD,15));
        panel.add(button_G);
        button_1.setBounds(5,465,60,30);
        button_1.setBorder(new LineBorder(Color.BLACK));
        button_1.setBackground(Color.white);
        button_1.setForeground(new Color(25,25,112));
        button_1.setFont(new Font("",Font.BOLD,15));
        panel.add(button_1);
        button_2.setBounds(68,465,60,30);
        button_2.setBorder(new LineBorder(Color.BLACK));
        button_2.setBackground(Color.white);
        button_2.setFont(new Font("",Font.BOLD,15));
        button_2.setForeground(new Color(25,25,112));
        panel.add(button_2);
        button_3.setBounds(68,465,60,30);
        button_3.setBorder(new LineBorder(Color.BLACK));
        button_3.setBackground(Color.white);
        button_3.setForeground(new Color(25,25,112));
        button_3.setFont(new Font("",Font.BOLD,15));
        panel.add(button_3);
        button_3.setBounds(130,465,60,30);
        button_3.setBorder(new LineBorder(Color.BLACK));
        button_3.setBackground(Color.white);
        button_3.setForeground(new Color(25,25,112));
        panel.add(button_3);
        button_GO.setBounds(254,465,60,30);
        button_GO.setBorder(new LineBorder(Color.BLACK));
        button_GO.setBackground(Color.white);
        button_GO.setForeground(new Color(25,25,112));
        button_GO.setFont(new Font("",Font.BOLD,15));
        panel.add(button_GO);
        DarkMode_btn.setBounds(5,10,16,16);
        DarkMode_btn.setBorder(new LineBorder(Color.white));
        DarkMode_btn.setBackground(Color.white);
        panel.add(DarkMode_btn);
        button_on.addActionListener(this);
        DarkMode_btn.addActionListener(this);
        lightMode_btn.addActionListener(this);
        history_dark.setBounds(0,0,0,0);
        
        history_light.setBounds(295,10,17,17);
        history_light.setBorder(new LineBorder(Color.white));
        history_light.setBackground(Color.white);
        panel.add(history_light);
        
    }
    
    public void HistoryPanel(int x,int y ,int z)
     {
        this.setSize(635,635);
        Scroll.setBackground(new Color(25,25,112));
        history_txt.setBackground(new Color(x,y,z));
        history_txt.setEditable(false); 
        history_txt.setForeground(Color.white);
        history_txt.setFont(new Font("",Font.BOLD,13));
        Scroll.setBounds(330,0,290,630);
        Scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(Scroll);
           
      }
     public String print_history()
     {
         String data=new String();
         history_txt.setFont(new Font("",Font.BOLD,13));
         for (int i=0;i<Arr.size();i++)
         {
             data+="\n "+Arr.get(i)+"\nــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ";
         }
         return data;
     }
    //-----------------events------------------//
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //------ON AND OFF BUTTON----------//
        if(e.getSource()==button_on)
        {
            if((button_on.getText()=="ON"))
            {
            Display_Result.setText("0");
            button_on.setText("OFF");
            history_txt.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n    Enter arithmetic operations to display");
            }
            else if(button_on.getText()=="OFF")
            {
            button_on.setText("ON");
            Display_Result.setText("");
            Display_Result_2.setText("");
            history_txt.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n              Please open the calculator");
            }
        }
        //----------DarkModde button--------//
        if (e.getSource()==DarkMode_btn)//
        {
            
           this.setSize(335,635);
           click_button_history=0;
           (PanelDesign.x)=1;
           Display_Result.setForeground(Color.white);
           panel.setBackground( Color.black);
           DarkMode_btn.setBackground(new Color(24,25,26));
           DarkMode_btn.setBorder(new LineBorder(new Color(24,25,26)));
           //change color button to dark mode
           button_on.setBackground(new Color(23,25,26));
           button_CE.setBackground(new Color(23,25,26));
           button_C.setBackground(new Color(23,25,26));
           button_m.setBackground(new Color(23,25,26));
           button_equal.setBackground(new Color(23,25,26));
           button_clear.setBackground(new Color(23,25,26));
           button_.setBackground(new Color(23,25,26));
           button_0.setBackground(new Color(23,25,26));
           button__.setBackground(new Color(23,25,26));
           button_asin.setBackground(new Color(23,25,26));
           button_acos.setBackground(new Color(23,25,26));
           button_ln.setBackground(new Color(23,25,26));
           button_w.setBackground(new Color(23,25,26));
           button_x.setBackground(new Color(23,25,26));
           button_multiplay.setBackground(new Color(23,25,26));
           button_divided.setBackground(new Color(23,25,26));
           button_sub.setBackground(new Color(23,25,26));
           button_sum.setBackground(new Color(23,25,26));
           button_sin.setBackground(new Color(23,25,26));
           button_cos.setBackground(new Color(23,25,26));
           button_tan.setBackground(new Color(23,25,26));
           button_round.setBackground(new Color(23,25,26));
           button_rint.setBackground(new Color(23,25,26));
           button_sinh.setBackground(new Color(23,25,26));
           button_cosh.setBackground(new Color(23,25,26));
           button_tanh.setBackground(new Color(23,25,26));
           button_log2.setBackground(new Color(23,25,26));
           button_log.setBackground(new Color(23,25,26));
           button_expx.setBackground(new Color(23,25,26));
           button_abs.setBackground(new Color(23,25,26));
           button_sqrt.setBackground(new Color(23,25,26));
           button_sqrt3.setBackground(new Color(23,25,26));
           button_sqrt_2.setBackground(new Color(23,25,26));
           button_pi.setBackground(new Color(23,25,26));
           button_sqrt_3.setBackground(new Color(23,25,26));
           button_H.setBackground(new Color(23,25,26));
           button_E.setBackground(new Color(23,25,26));
           button_exp.setBackground(new Color(23,25,26));
           button_fact.setBackground(new Color(23,25,26));
           button_pow2.setBackground(new Color(23,25,26));
           button_pow3.setBackground(new Color(23,25,26));
           button_k0.setBackground(new Color(23,25,26));
           button_7.setBackground(new Color(23,25,26));
           button_8.setBackground(new Color(23,25,26));
           button_9.setBackground(new Color(23,25,26));
           button_phi.setBackground(new Color(23,25,26));
           button_4.setBackground(new Color(23,25,26));
           button_5.setBackground(new Color(23,25,26));
           button_6.setBackground(new Color(23,25,26));
           button_G.setBackground(new Color(23,25,26));
           button_1.setBackground(new Color(23,25,26));
           button_2.setBackground(new Color(23,25,26));
           button_3.setBackground(new Color(23,25,26));
           button_3.setBackground(new Color(23,25,26));
           button_GO.setBackground(new Color(23,25,26));
           btn_58.setBackground(new Color(23,25,26));
           button_log2.setBackground(new Color(23,25,26));
            //-----------convert from dark to light
            DarkMode_btn.setBounds(0,0,0,0);
            lightMode_btn.setBounds(5,10,16,16);
            lightMode_btn.setBorder(new LineBorder(new Color(23,24,26)));
            lightMode_btn.setBackground(new Color(23,24,26));
            panel.add(lightMode_btn);
            //--------------history btn in dark
            history_light.setBounds(0,0,0,0);
            history_dark.setBounds(295,10,17,17);
            history_dark.setBorder(new LineBorder(Color.black));
            history_dark.setBackground(Color.black);
            panel.add(history_dark);
           //-------------Chanage color font in button----------//
            button_.setForeground(Color.white);
            button_on.setForeground(Color.white);
            button_0.setForeground(Color.white);
            button__.setForeground(Color.white);
            button_asin.setForeground(Color.white);
            button_acos.setForeground(Color.white);
            button_ln.setForeground(Color.white);
            button_w.setForeground(Color.white);
            button_x.setForeground(Color.white);
            button_multiplay.setForeground(Color.white);
            button_divided.setForeground(Color.white);
            button_sub.setForeground(Color.white);
            button_sum.setForeground(Color.white);
            button_sin.setForeground(Color.white);
            button_cos.setForeground(Color.white);
            button_tan.setForeground(Color.white);
            button_round.setForeground(Color.white);
            button_rint.setForeground(Color.white);
            button_sinh.setForeground(Color.white);
            button_cosh.setForeground(Color.white);
            button_tanh.setForeground(Color.white);
            button_log2.setForeground(Color.white);
            button_log.setForeground(Color.white);
            button_expx.setForeground(Color.white);
            button_abs.setForeground(Color.white);
            button_sqrt.setForeground(Color.white);
            button_sqrt3.setForeground(Color.white);
            button_sqrt_2.setForeground(Color.white);
            button_pi.setForeground(Color.white);
            button_sqrt_3.setForeground(Color.white);
            button_H.setForeground(Color.white);
            button_E.setForeground(Color.white);
            button_exp.setForeground(Color.white);
            button_fact.setForeground(Color.white);
            button_pow2.setForeground(Color.white);
            button_pow3.setForeground(Color.white);
            button_k0.setForeground(Color.white);
            button_7.setForeground(Color.white);
            button_8.setForeground(Color.white);
            button_9.setForeground(Color.white);
            button_phi.setForeground(Color.white);
            button_4.setForeground(Color.white);
            button_5.setForeground(Color.white);
            button_6.setForeground(Color.white);
            button_G.setForeground(Color.white);
            button_1.setForeground(Color.white);
            button_2.setForeground(Color.white);
            button_3.setForeground(Color.white);
            button_3.setForeground(Color.white);
            button_GO.setForeground(Color.white);
            btn_58.setForeground(Color.white);
            button_equal.setForeground(Color.white);
        }
        //------------light_mode_button------//
        if(e.getSource()==lightMode_btn)
         {
           PanelDesign.x=0;
           click_button_history=0;
           this.setSize(335,635);
           Display_Result.setForeground(Color.black);
           lightMode_btn.setBounds(0,0,0,0);
           panel.setBackground( Color.white);
           DarkMode_btn.setBackground(new Color(24,25,26));
           DarkMode_btn.setBorder(new LineBorder(new Color(24,25,26)));
           Frame1();
           button_on.addActionListener(this);         
         }
        //history_button in light_mode------------///
       if(e.getSource()==history_light)
       {
           if(click_button_history==0)
           {
            HistoryPanel(25,25,112);
           click_button_history=1;
           }
           else if(click_button_history==1)
           {
               this.setSize(335,635);
               click_button_history=0;
           }
           
           
       }
       //----------------history_button in dark_mode-------------//
       if(e.getSource()==history_dark)
       {
           if(click_button_history==0)
           {
           HistoryPanel(0,0,0);
           click_button_history=1;
           }
           else if(click_button_history==1)
           {
               this.setSize(335,635);
               click_button_history=0;
           }
             
       }
       //---------- event Buttons from 0 to 9---------//
       if (e.getSource()==button_0)
       {
           if(button_on.getText()=="OFF")
           {
           if(Display_Result.getText()!="0")
            {
            Display_Result.setText(Display_Result.getText()+"0");
            }
           }
       }
       if (e.getSource()==button_1)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
            Display_Result.setText("1");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"1");
            }
       }
       }
       if (e.getSource()==button_2)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("2");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"2");
            }
           }
       }
        if (e.getSource()==button_3)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("3");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"3");
            }
           }
       }
      if (e.getSource()==button_4)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("4");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"4");
            }
           }
       }
      if (e.getSource()==button_5)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("5");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"5");
            }
           }
       }
       if (e.getSource()==button_6)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("6");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"6");
            }
           }
       }
        if (e.getSource()==button_7)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("7");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"7");
            }
           }
       }
         if (e.getSource()==button_8)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("8");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"8");
            }
           }
       }
          if (e.getSource()==button_9)
       {
       if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0")
            {
                 Display_Result.setText("9");
            }
            else
            {
             Display_Result.setText(Display_Result.getText()+"9");
            }
           }
       }
       //---------------subtract button------------//
      if (e.getSource()==button_)
       {
       if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()!="0"&&Display_Result.getText().indexOf('-')<0)
            {
             Display_Result.setText("-"+Display_Result.getText());
            }
           }
       }
      //---------------dot button------------//
       if (e.getSource()==button__)
       {
       if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()=="0"&&Display_Result.getText().indexOf('.')<0)
            {
             Display_Result.setText(Display_Result.getText()+".");
            }
            else if (Display_Result.getText()!="0"&&Display_Result.getText().indexOf('.')<0)
            {
                Display_Result.setText(Display_Result.getText()+".");
            }
           }
       }
       //---------------CE button------------//
       if (e.getSource()==button_CE)
       {
       if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()!="0")
            {
             Display_Result.setText("0");
            }
           }
       }
       //---------------C button------------//
       if (e.getSource()==button_C)
       {
       if(button_on.getText()=="OFF")
           {
            if(Display_Result.getText()!="0"||Display_Result_2.getText()!=" ")
            {
             Display_Result.setText("0");
             Display_Result_2.setText(" ");
            }
           }
       }
       //------------button_clear----------//
       if (e.getSource()==button_clear)
       {
            if(button_on.getText()=="OFF")
             {
                if(Display_Result.getText()!="0")
                {
                if(Display_Result.getText().length()==1)
                {
                    Display_Result.setText("0");
                }
                else
                {
                String txt=Display_Result.getText();
                String new_txt=txt.substring(0, txt.length()-1);
                Display_Result.setText(new_txt);
                }
            }
           }
       }
       //-------------button_pi------------//
       if(e.getSource()==button_pi)
       {
           if(button_on.getText()=="OFF")
           {
             if(Display_Result.getText()=="0")
            {
                Display_Result_2.setText("π=");
                Display_Result.setText("3.14159");
            }
            else if(Display_Result.getText()!="3.14159"&&Display_Result.getText().indexOf('.')<0)
             {
                 Display_Result.setText(Display_Result.getText()+"3.14159");
             }
           }
       }
       //-------------button_exp---------------//
       if(e.getSource()==button_exp)
            {
             if(button_on.getText()=="OFF")
             {
                 if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("e=");
                Display_Result.setText("2.71828");
                }
                else if(Display_Result.getText()!="2.71828"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"2.71828");
                 }
             }
       }  
       //------------button_G-------------//
      if(e.getSource()==button_G)
       {
           if(button_on.getText()=="OFF")
           {
             if(Display_Result.getText()=="0")
            {
                Display_Result_2.setText("G=");
                Display_Result.setText("0.91596");
            }
             else if(Display_Result.getText()!="0.91596"&&Display_Result.getText().indexOf('.')<0)
             {
                 Display_Result.setText(Display_Result.getText()+"0.91596");
             }
           }
       } 
      //-----------------button_phi-------------//
       if(e.getSource()==button_phi)
       {
           if(button_on.getText()=="OFF")
            {
                if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("φ=");
                Display_Result.setText("1.61803");
                }
                else if(Display_Result.getText()!="1.61803"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"1.61803");
                }
           }
       }   
       //----------button_k0---------------//
       if(e.getSource()==button_k0)
       {
           if(button_on.getText()=="OFF")
           {
             if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("κ0=");
                Display_Result.setText("2.68545");
                }
             else if(Display_Result.getText()!="2.68545"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"2.68545");
                }
           }
       }   
       //-------------button_GO------------------//
      if(e.getSource()==button_GO)
       {
           if(button_on.getText()=="OFF")
           {
             if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("λ=");
                Display_Result.setText("0.62432");
                }
             else if(Display_Result.getText()!="0.62432"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"0.62432");
                }
             
           }
       } 
      //--------------button_sin------------------//
        if(e.getSource()==button_sin)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
            {
            double num=Double.parseDouble(Display_Result.getText());
            double result=Math.sin(num);
            String r=Double.toString(result);
            Display_Result_2.setText("sin("+num+")=");
            Display_Result.setText(r);
            }
            else
            {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.sin(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
            }
           }
       }
        //-------------button_cos-------//
       if(e.getSource()==button_cos)
       {
           if(button_on.getText()=="OFF")
            {
             if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                     double num=Double.parseDouble(Display_Result.getText());
                     double result=Math.cos(num);
                     String r=Double.toString(result);
                     Display_Result_2.setText("cos("+num+")=");
                     Display_Result.setText(r);
                }
            else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.cos(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //------------button_tan--------------//
       if(e.getSource()==button_tan)
       {
           if(button_on.getText()=="OFF")
            {
             if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                     double num=Double.parseDouble(Display_Result.getText());
                     double result=Math.tan(num);
                     String r=Double.toString(result);
                     Display_Result_2.setText("tan("+num+")=");
                     Display_Result.setText(r);
                }
            else
            {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.tan(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
            }
           }  
       }
       //------------button_sinh------------//
        if(e.getSource()==button_sinh)
        {
           if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                    double num=Double.parseDouble(Display_Result.getText());
                    double result=Math.sinh(num);
                    String r=Double.toString(result);
                    Display_Result_2.setText("sinh("+num+")=");
                    Display_Result.setText(r);
                }
            else
            {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.sinh(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
            }
           }
       }
       //------------button_cosh-----------------//
       if(e.getSource()==button_cosh)
       {
           if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                     double num=Double.parseDouble(Display_Result.getText());
                     double result=Math.cosh(num);
                     String r=Double.toString(result);
                     Display_Result_2.setText("cosh("+num+")=");
                     Display_Result.setText(r);
                }
                 else
                 {
                     double num=Double.parseDouble(Display_Result.getText());
                     double result=Math.cosh(num);
                     String r=Double.toString(result);
                     Display_Result.setText(r);
                }
           }
           
       }
       //---------------button_tanh----------------//
       if(e.getSource()==button_tanh)
        {
           if(button_on.getText()=="OFF")
            {
             if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                 double num=Double.parseDouble(Display_Result.getText());
                 double result=Math.tanh(num);
                 String r=Double.toString(result);
                 Display_Result_2.setText("sin("+num+")=");
                 Display_Result.setText(r);
                }
             else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.tanh(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
        }
       //-------------button_asin--------------//
       if(e.getSource()==button_asin)
       {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                    double num=Double.parseDouble(Display_Result.getText());
                    double result=Math.asin(num);
                    String r=Double.toString(result);
                    Display_Result_2.setText("asin("+num+")=");
                    Display_Result.setText(r);
                }
            else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.asin(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //-----------button_acos--------------//
      if(e.getSource()==button_acos)
      {
            if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                     double num=Double.parseDouble(Display_Result.getText());
                     double result=Math.acos(num);
                     String r=Double.toString(result);
                     Display_Result_2.setText("sin("+num+")=");
                     Display_Result.setText(r);
                }
            else
            {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.acos(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
            }
           }
       }   
      //-------------button_abs-------------//
      if(e.getSource()==button_abs)
       {
            if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                 double num=Double.parseDouble(Display_Result.getText());
                 double result=Math.abs(num);
                 String r=Double.toString(result);
                 Display_Result_2.setText("|"+num+"|=");
                 Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.abs(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
            }
       }
      //-------------button_log----------------//
       if(e.getSource()==button_log)
       {
           if(button_on.getText()=="OFF")
           {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                    double num=Double.parseDouble(Display_Result.getText());
                    double result=Math.log10(num);
                    String r=Double.toString(result);
                    Display_Result_2.setText("log("+num+")=");
                    Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.log10(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //--------------button_log2--------------//
       if(e.getSource()==button_log2)
       {
       if(button_on.getText()=="OFF")
           {
            if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
            {
            double num=Double.parseDouble(Display_Result.getText());
            double result=(Math.log(num) / Math.log(2));
            String r=Double.toString(result);
            Display_Result_2.setText("log₂("+num+")=");
            Display_Result.setText(r);
            }
            else
            {
                double num=Double.parseDouble(Display_Result.getText());
                double result=(Math.log(num) / Math.log(2));
                String r=Double.toString(result);
                Display_Result.setText(r);
            }
           }
       }
       //-------------button_round-----------------//
       if(e.getSource()==button_round)
       {
            if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                    double num=Double.parseDouble(Display_Result.getText());
                    double result=Math.round(num);
                    String r=Double.toString(result);
                    Display_Result_2.setText("round("+num+")=");
                    Display_Result.setText(r);
                }
            else
            {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.round(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
            }
           }
       }
       //---------------button_rint-------------------//
       if(e.getSource()==button_rint)
       {
            if(button_on.getText()=="OFF")
             {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.rint(num);
                String r=Double.toString(result);
                Display_Result_2.setText("rint("+num+")=");
                Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.rint(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //--------------button_ln-------------//
       if(e.getSource()==button_ln)
       {
          if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.log(num)/Math.log(2.71828);//convert from log to ln 
                String r=Double.toString(result);
                Display_Result_2.setText("ln("+num+")=");
                Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.log(num)/Math.log(2.71828);//convert from log to ln 
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //---------------button_expx-----------------//
       if(e.getSource()==button_expx)
       {
            if(button_on.getText()=="OFF")
            {
                 if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                  {
                    double num=Double.parseDouble(Display_Result.getText());
                    double result=Math.exp(num);
                    String r=Double.toString(result);
                    Display_Result_2.setText("exp("+num+")=");
                    Display_Result.setText(r);
                  }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.exp(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //-----------------button_sqrt-------------------------//
       if(e.getSource()==button_sqrt)
       {
            if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.sqrt(num);
                String r=Double.toString(result);
                Display_Result_2.setText("√("+num+")=");
                Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.sqrt(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //-------------------------button_sqrt3-------------------//
       if(e.getSource()==button_sqrt3)
        {
            if(button_on.getText()=="OFF")
            {
                 if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=(double)Math.cbrt(num);
                String r=Double.toString(result);
                Display_Result_2.setText("cbrt("+num+")=");
                Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.sqrt(num);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
       }
       //------button_sqrt_2-----------//
      if(e.getSource()==button_sqrt_2)
       {
          if(button_on.getText()=="OFF")
            {
                double result=(double)Math.sqrt(2);
                String r=Double.toString(result);
                if(Display_Result.getText()=="0")
                {
                    Display_Result_2.setText("√("+2+")=");
                    Display_Result.setText(r);
                }
                else
                {
                    Display_Result.setText(r);
                }
           }
       }
      //--------button_sqrt_3-------------//
       if(e.getSource()==button_sqrt_3)
       {
          if(button_on.getText()=="OFF")
          {
            double result=(double)Math.sqrt(3);
            String r=Double.toString(result);
            if(Display_Result.getText()=="0")
            {
                 Display_Result_2.setText("√("+3+")=");
                 Display_Result.setText(r);
            }
            else
                {
                Display_Result.setText(r);
                }
           }
       }
       ///--------------button_1/2---------------//
       if(e.getSource()==button_H)
       {
             if(button_on.getText()=="OFF")
             {
                if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("½=");
                Display_Result.setText("0.5");
                }
                 else if(Display_Result.getText()!="0.5"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"0.5");
                }
             }
       }
      //------------button_1/3-----------//
      if(e.getSource()==button_w)
       {
            if(button_on.getText()=="OFF")
            {
             if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("1/3=");
                Display_Result.setText("0.3333333333");
                }
                else if(Display_Result.getText()!="0.3333333333"&&Display_Result.getText().indexOf('.')<0)
                 {
                 Display_Result.setText(Display_Result.getText()+"0.3333333333");
                 }
            }
        }
      //---------button_1/5-------------//
      if(e.getSource()==button_x)
        {
            if(button_on.getText()=="OFF")
            {
             if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("1/5=");
                Display_Result.setText("0.2");
                }
                else if(Display_Result.getText()!="0.2"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"0.2");
                }
            }
        }
      //------------button_1/4------//
       if(e.getSource()==button_E)
       {
            if(button_on.getText()=="OFF")
            {
                if(Display_Result.getText()=="0")
                {
                Display_Result_2.setText("¼=");
                Display_Result.setText("0.25");
                }
                else if(Display_Result.getText()!="0.25"&&Display_Result.getText().indexOf('.')<0)
                {
                 Display_Result.setText(Display_Result.getText()+"0.25");
                }
            }
       }
       //-----------button_fact-----------//
      if(e.getSource()==button_fact)
       {
          if(button_on.getText()=="OFF")
           {
            if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
            {
              int fact=1;
              int num=Integer.parseInt(Display_Result.getText());
              for(int i=1;i<=num;i++)
              {    
              fact=fact*i;    
              }
              String Result=Integer.toString(fact);
              Display_Result_2.setText(num+"!=");
              Display_Result.setText(Result);
            }
            else
            {
              int fact=1;
              int num=Integer.parseInt(Display_Result.getText());
              for(int i=1;i<=num;i++)
              {    
              fact=fact*i;    
              }
              String Result=Integer.toString(fact);
              Display_Result.setText(Result);
            }
           }
       }
      //-----------------button_pow2--------------//
      if(e.getSource()==button_pow2)
      {
           if(button_on.getText()=="OFF")
            {
                if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.pow(num,2);
                String r=Double.toString(result);
                Display_Result_2.setText("("+num+")"+"power(2)=");
                Display_Result.setText(r);
                }
                else
                {
                double num=Double.parseDouble(Display_Result.getText());
                double result=Math.pow(num,2);
                String r=Double.toString(result);
                Display_Result.setText(r);
                }
           }
      }
      //------------button_pow3-------------//
       if(e.getSource()==button_pow3)
      {
           if(button_on.getText()=="OFF")
           {
            if(Display_Result_2.getText().indexOf('+')<0&&Display_Result_2.getText().indexOf('*')<0&&Display_Result_2.getText().indexOf('-')<0&&Display_Result_2.getText().indexOf('/')<0&&Display_Result_2.getText().indexOf('%')<0)
            {
            double num=Double.parseDouble(Display_Result.getText());
            double result=Math.pow(num,3);
            String r=Double.toString(result);
            Display_Result_2.setText("("+num+")"+"power(3)=");
            Display_Result.setText(r);
            }
            else
            {
            double num=Double.parseDouble(Display_Result.getText());
            double result=Math.pow(num,3);
            String r=Double.toString(result);
            Display_Result.setText(r);
            }
           }
      }
       //-----------------------operation_buttons------------------//
       //-------------button_sum------//
       if(e.getSource()==button_sum)
       {
           if(button_on.getText()=="OFF")
           {
           operation='+';
           number1=Double.parseDouble(Display_Result.getText());
           Display_Result_2.setText(number1+"+");
           Display_Result.setText("");
           System.out.print(number1);
           }
       }
       //-----------button_sub-----------//
       if(e.getSource()==button_sub)
       {
           if(button_on.getText()=="OFF")
           {
           operation='-';
           number1=Double.parseDouble(Display_Result.getText());
           Display_Result_2.setText(number1+"-");
           Display_Result.setText("");
           }
       }
       //-----------button_divided-----------//
       if(e.getSource()==button_divided)
       {
           if(button_on.getText()=="OFF")
           {
           operation='/';
           number1=Double.parseDouble(Display_Result.getText());
           Display_Result_2.setText(number1+"/");
           Display_Result.setText("");
           }
       }
       //---------------button_multiplay------------//
       if(e.getSource()==button_multiplay)
       {
           if(button_on.getText()=="OFF")
           {
           operation='*';
           number1=Double.parseDouble(Display_Result.getText());
           Display_Result_2.setText(number1+"×");
           Display_Result.setText("");
           }
       }
       //--------button_%-------------//
       if(e.getSource()==button_m)
       {
           if(button_on.getText()=="OFF")
           {
           operation='%';
           number1=Double.parseDouble(Display_Result.getText());
           Display_Result_2.setText(number1+"%");
           Display_Result.setText("");
           }
       }
       //----------------------button_equal-------------------//
       if(e.getSource()==button_equal)
       {
           
           number2=Double.parseDouble(Display_Result.getText());
           if(button_on.getText()=="OFF")
           {
                if(number1!=0&&number2!=0)
                {
                 switch(operation)
                 {
                 case '+':
                    {
                        Display_Result_2.setText(number1+"+"+number2+"=");
                        result=number1+number2;
                    }break;
                 case '-':
                    {
                        Display_Result_2.setText(number1+"-"+number2+"=");
                        result=number1-number2;
                    }break;
                 case '*':
                    {
                        Display_Result_2.setText(number1+"×"+number2+"=");
                        result=number1*number2;
                    }break;
                 case '/':
                    {
                         Display_Result_2.setText(number1+"/"+number2+"=");
                         result=number1/number2;
                    }break;
                 case '%':
                    {
                         Display_Result_2.setText(number1+"%"+number2+"=");
                         result=number1%number2;
                    }break;
            }
            //-------PRINT RESULT------//
           String r=Double.toString(result);
           Display_Result.setText(r);
           //-------PRINT RESULT IN History text------//
           Arr.add(Display_Result_2.getText()+Display_Result.getText());
           history_txt.setText(print_history());
           }
           }
       }
    }
 }
