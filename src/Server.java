public class Server {
    private static Server server;

    private String location;
    private int max_players;

    private Server(){
        location="Germany";
        max_players=400;
    }
    public static Server getInstance(){
        if (server == null){
            server = new Server();
        }
        return server;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMax_players(int max_players) {
        this.max_players = max_players;
    }

    public void display(){
        System.out.println("Servers location: "+location);
        System.out.println("Servers max players: "+max_players);
    }



}
