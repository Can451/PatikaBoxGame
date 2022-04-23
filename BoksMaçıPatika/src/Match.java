public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
    if (checkWeight()){

        while (this.f1.health>0&&this.f2.health>0){
            System.out.println("------------------------");

            if(f1.isStart()){
                this.f2.health=this.f1.hit(f2);
            }
            if (isWin()){
                break;
            }
            if (f2.isStart()){
                this.f1.health=this.f2.hit(f1);
            }

            if (isWin()){
                break;
            }


        }
        System.out.println(this.f2.name+" "+this.f2.health+" kalan can");
        System.out.println(this.f1.name+" "+this.f1.health+" kalan can");

    }
    else {
        System.out.println("Siklet farkı var");
    }


    }
    public boolean checkWeight() {
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" kazandı");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" kazandı");
            return true;
        }
        return false;
    }


    }




