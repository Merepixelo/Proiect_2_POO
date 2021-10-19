package Units;

public class Kryptmann {

    private String nume="Kryptmann";
    protected String title="Aspiring Inqusitor";

    private int unit_id=4;

    protected String imagePath = "C://proj2_poo//Imagini_unitati//Kryptmann.png";

    public int start_level=1;
    public int currect_level=0;
    public int max_level=100;

    protected int grt_rate=5;

    private int base_atk=50;
    private int base_def=50;
    private int base_hp=50;

    public int current_atk=base_atk;
    public int current_def=base_def;
    public int current_hp=base_hp;


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
        if(this.currect_level<this.max_level){
            this.currect_level+=1;
            System.out.println("Level reached..."+this.currect_level);
            this.current_hp=this.current_hp+(this.grt_rate*100);
            this.current_atk=this.current_atk+(this.grt_rate*100);
            this.current_def=this.current_def+(this.grt_rate*100);
        }
        else System.out.println("Max level reached...");

    }

}
