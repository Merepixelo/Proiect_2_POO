package Units;

public class Dony {
    private String nume="Dony Salvadore";
    protected String title="Deadeye Drunk";

    protected String imagePath = "C://proj2_poo//Imagini_unitati//Salvadore.png";

    private int unit_id=2;

    protected int grt_rate=5;

    public int currect_level=1;

    private int base_atk=1000;
    private int base_def=600;
    private int base_hp=5000;

    public int current_atk=base_atk;
    public int current_def=base_def;
    public int current_hp=base_hp;

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
