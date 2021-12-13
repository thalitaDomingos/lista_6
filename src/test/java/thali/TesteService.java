package thali;

import thalita.Jogo;
import thalita.Platform;
import thalita.Publisher;
import thalita.CSV;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import thalita.Service;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TesteService {

    private static List<Jogo> gameList;

    @BeforeClass
    public static void initClass() throws URISyntaxException
    {
        Path caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        gameList = CSV.readGameCsv(caminho);
    }

    @Test
    public void testeGamesPS4()
    {
        List<Jogo> ps4Games = Service.getListByPlatform(gameList, Platform.PS4);
        Assert.assertEquals(5,ps4Games.size());
    }

    @Test
    public void testeNintendo()
    {
        List<Jogo> x360Games = Service.getListByPlatform(gameList, Platform.X360);
        Assert.assertEquals(16,x360Games.size());
    }

    @Test
    public void testeGameActivision()
    {
        List<Jogo> activisionGames = Service.getByPuBlisher(gameList, Publisher.Activision);
        Assert.assertEquals(14,activisionGames.size());
    }
}
