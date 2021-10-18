package Units;

public class Kryptmann {

    private String nume="Kryptmann";
    protected String title="Aspiring Inqusitor";

    private double unit_numer=4.0;

    protected int grt_rate=5;

    public int currect_level=1;

    private int base_atk=700;
    private int base_def=990;
    private int base_hp=4000;

    public int current_atk=0;
    public int current_def=0;
    public int current_hp=0;

    private int max_atk=0;
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
}
