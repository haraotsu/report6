package jp.ac.uryukyu.ie.e165722;

public class Hero extends LivingThing{
    public Hero(String name, int hitPoint, int attack){
        super(name,hitPoint,attack);
    }


    @Override
    public void attack(LivingThing opponent){
        if(opponent.isDead() == false) {
            int damage = (int) (Math.random() * opponent.getattack());
            int odds = (int)(Math.random()*10);
            if(odds <= 1){
                damage = damage * 2;
                if (damage == 0) {
                    System.out.printf("%sの攻撃！%sは攻撃を回避した\n", opponent.getName(), name);
                } else {
                    System.out.printf("%sの攻撃！痛恨の一撃！%sに%dのダメージを与えた！！\n", opponent.getName(), name, damage);
                    wounded(damage);
                }

            }else {
                if (damage == 0) {
                    System.out.printf("%sの攻撃！%sは攻撃を回避した\n", opponent.getName(),name);
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", opponent.getName(),name,damage);
                    wounded(damage);
                }
            }
        }
    }

}