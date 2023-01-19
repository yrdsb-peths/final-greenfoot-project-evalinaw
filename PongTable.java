import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongTable extends World
{
    int dx = 10;
    int dy = 0;
    Human human = new Human();
    Enemy enemy = new Enemy();
    PingPong pingPong = new PingPong();
    Score1 s1 = new Score1();
    Score2 s2 = new Score2();
    GreenfootImage read1 = new GreenfootImage(100,30);
    GreenfootImage read2 = new GreenfootImage(100,30);
    int p = 0;
    int c = 0;
    String pScore = String.valueOf(p);
    String cScore = String.valueOf(c);
    
    
    public PongTable()
    {    
        super(550, 400, 1);
        addObject(human, 50, getHeight()/2);
        addObject(enemy, getWidth()-50 , getHeight()/2);
        addObject(pingPong, getWidth()/2, getHeight()/2);
        read1.drawString(pScore,2,20);
        s1.setImage(read1);
        addObject(s1,175,50);
        read2.drawString(cScore, 2, 20);
        s2.setImage(read2);
        addObject(s2,455,50);
        Greenfoot.setSpeed(45);
    }
    public void act(){
        //human.setLocation(human.getX(),Greenfoot.getMouseInfo().getY());
        if(Greenfoot.isKeyDown("up")){
            human.setLocation(human.getX(), human.getY() - 5);
        }
        if(Greenfoot.isKeyDown("down")){
            human.setLocation(human.getX(), human.getY() + 5);
        }
        pingPong.setLocation(pingPong.getX() + dx, pingPong.getY() + dy);
        if(pingPong.getY() < enemy.getY() + 5 && pingPong.getY() > enemy.getY() - 5){
            enemy.setLocation(enemy.getX(), pingPong.getY());
        }
        else{
            if(pingPong.getY() > enemy.getY()){
                enemy.setLocation(enemy.getX(),enemy.getY() + 5);
            }
            else{
                enemy.setLocation(enemy.getX(),enemy.getY() - 5);
            }
        }
        if(pingPong.getY() >= enemy.getY() - 25 && pingPong.getY() <= enemy.getY() + 25 && pingPong.getX() + dx >= enemy.getX()){
            dx = -dx;
            dy = (pingPong.getY() - enemy.getY())/2;
            Greenfoot.playSound("beep.mp3");
        }
        if(pingPong.getY() >= human.getY() - 25 && pingPong.getY() <= human.getY() + 25 && pingPong.getX() + dx <= human.getX()){
            dx = -dx;
            dy = (pingPong.getY() - human.getY())/2;
            Greenfoot.playSound("beep.mp3");
        }
        if(pingPong.getY() <= 5){
            pingPong.setLocation(pingPong.getX(),6);
            dy = - dy;
        }
        if(pingPong.getY() >= this.getHeight() - 5 ){
            pingPong.setLocation(pingPong.getX(),this.getHeight() -6);
            dy = -dy;
        }
        else if(pingPong.getX() <= 5 || pingPong.getX() >= this.getWidth() -5){
                if(pingPong.getX() <= 5){
                c++;
                cScore = String.valueOf(c);
                read2.clear();
                read2.drawString(cScore,2,20);
                s2.setImage(read2);
            }
            else if( pingPong.getX() >= this.getWidth() -5){
                p++;
                pScore = String.valueOf(p);
                read1.clear();
                read1.drawString(pScore,2,20);
                s1.setImage(read1);
            }
            if(p == 3 || c == 3){
                Greenfoot.stop();
            }
            pingPong.setLocation(getWidth()/2, getHeight()/2);
            human.setLocation(50, getHeight()/2);
            enemy.setLocation(getWidth()-50 , getHeight()/2);
            dy = 0;
            
                
        }
    }
}