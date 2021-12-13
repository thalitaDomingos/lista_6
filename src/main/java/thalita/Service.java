package thalita;

import java.util.ArrayList;
import java.util.List;

public class Service
{
    public static List<Jogo> getListByPlatform(List<Jogo> games, Platform platform){
        List<Jogo> gamesByPlatform = new ArrayList<>();

        games.stream().filter((game ->
                game.getPlatform().equals(platform.name()))).
                forEach(gamesByPlatform::add);

        return gamesByPlatform;
    }

    public static List<Jogo> getByPuBlisher(List<Jogo> games ,
                                            Publisher publisher){
        List<Jogo> gamesByPublisher = new ArrayList<>();

        games.stream().filter((game ->
                        game.getPublisher().replaceAll("\\s+", "").equals(publisher.name()))).
                forEach(gamesByPublisher::add);

        return gamesByPublisher;
    }
}