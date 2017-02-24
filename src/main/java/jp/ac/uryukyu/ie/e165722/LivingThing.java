package jp.ac.uryukyu.ie.e165722;

/**
 * リビングシングクラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */

public class LivingThing {
    String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    public LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);

    }



    public int gethitPoint(){
        return hitPoint;
    }


    public int getattack(){
        return attack;
    }


    public void setDead(boolean dead){
        this.dead = dead;
    }



    public boolean isDead() {
        return dead;
    }


    public String getName(){
        return name;
    }


    public void attack(LivingThing opponent){
        if(dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, getName(), damage);
            wounded(damage);
        }
    }




    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}
