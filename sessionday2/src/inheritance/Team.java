package inheritance;

public class Team {
    Player player; //instance non primitve variable
                        //202020
    public Team(Player player) {
        this.player = player;//202020
    }

    void display(){
        player.playerProfile();
    }

    public static void main(String[] args) {
        Player p=new Player();
        Team team=new Team(p);
        team.display();
    }
}









