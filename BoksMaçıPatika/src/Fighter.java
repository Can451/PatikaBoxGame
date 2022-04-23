public class Fighter {


    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;


    Fighter(String name,int damage,int health,int weight,int dodge,int start){

        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0&&dodge<=100){
            this.dodge=0;
        }
        this.dodge=dodge;
        this.start=start;

    }
    int hit(Fighter foe){
        System.out.println(this.name+"=>"+ foe.name+" "+ this.damage+ "Hasar vurdu");
        if (foe.isDodge()){
            System.out.println(foe.name+" Blokladı");
            return foe.health;
        }
        if (foe.health-this.damage<0) return 0;

        return foe.health - this.damage;
    }

    boolean isDodge(){
        double random = Math.random()*100;
        return random<= this.dodge;

    }
    boolean isStart(){

        double random = Math.random()*100;
        return random >= this.start;
    }


}
