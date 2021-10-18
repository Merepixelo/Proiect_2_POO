package Units;


import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rylanor {

    private String nume="Rylanor the Unyielding";
    protected String title="Ancient of Rites";

    protected String imagePath = "C://proj2_poo//Imagini_unitati//Rylanor.png";

    private int unit_id=1;

    public int currect_level=1;

    protected int grt_rate=5;

    private int base_atk=1500;
    private int base_def=900;
    private int base_hp=7000;

    public int current_atk=base_atk;
    public int current_def=base_def;
    public int current_hp=base_hp;

    private int max_atk=3000;
    private int max_def=0;
    private int max_hp=0;

//Getteri
    public String getNume(){
        return nume;
    }
    public String getTitle(){
        return title;
    }

    public int getCurrect_level(){
        return  currect_level;
    }
    public int getCurrent_atk(){
        return current_atk;
    }
    public int getBase_def(){
        return current_def;
    }
    public  int getCurrent_hp(){
        return current_hp;
    }
//Setteri
    public void setCurrect_level(int currect_level) {
        this.currect_level = currect_level;
    }
    public  void setCurrent_atk(){
        this.current_atk=base_atk+(currect_level*grt_rate);
    }

    public  void setCurrent_def(){
        this.current_def=base_def+(currect_level*grt_rate);
    }

    public  void setCurrent_hp(){
        this.current_hp=base_hp+(currect_level*grt_rate);
    }

    public void LoadImageApp() {
        try {
            BufferedImage img= ImageIO.read(new File("C://proj2_poo//Imagini_unitati//Rylanor.png"));
        } catch (IOException e) {
        }
    }

}
/*
public void DisplayImage() throws IOException{

    BufferedImage img= ImageIO.read(new File("C://proj2_poo//Imagini_unitati//Rylanor.png"));
    ImageIcon icon=new ImageIcon(img);
    JFrame frame=new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setSize(200,300);
    JLabel lbl=new JLabel();
    lbl.setIcon(icon);
    frame.add(lbl);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 */