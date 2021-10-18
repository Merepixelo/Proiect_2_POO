package Units;

public class Rylanor {

    private String nume="Rylanor (Dreadnoght)";
    protected String title="The Ancient of Rites";

    private double unit_numer=1.0;

    public int currect_level=1;

    protected int grt_rate=5;

    private int base_atk=1500;
    private int base_def=900;
    private int base_hp=7000;

    public int current_atk=0;
    public int current_def=0;
    public int current_hp=0;

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
}
