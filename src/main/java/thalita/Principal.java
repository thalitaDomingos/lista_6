package thalita;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URISyntaxException;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Path caminho = null;
        try {
            caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        List<Jogo> gameList = CSV.readGameCsv(caminho);

        int numLines = gameList.size();
        System.out.println("Numero de linhas: " + numLines);
        System.out.println(" ");

        List<Jogo> DSGames = Service.getListByPlatform(gameList, Platform.DS);
        System.out.println("Numero de jogos de DS: " + DSGames.size());

        List<Jogo> GBGames = Service.getListByPlatform(gameList, Platform.GB);
        System.out.println("Numero de jogos de GB: " + GBGames.size());

        List<Jogo> GBAGames = Service.getListByPlatform(gameList, Platform.GBA);
        System.out.println("Numero de jogos de GBA: " + GBAGames.size());

        List<Jogo> N64Games = Service.getListByPlatform(gameList, Platform.N64);
        System.out.println("Numero de jogos de N64: " + N64Games.size());

        List<Jogo> NESGames = Service.getListByPlatform(gameList, Platform.NES);
        System.out.println("Numero de jogos de NES: " + NESGames.size());

        List<Jogo> PS2Games = Service.getListByPlatform(gameList, Platform.PS2);
        System.out.println("Numero de jogos de PS2: " + PS2Games.size());

        List<Jogo> PS3Games = Service.getListByPlatform(gameList, Platform.PS3);
        System.out.println("Numero de jogos de PS3: " + PS3Games.size());

        List<Jogo> PSGames = Service.getListByPlatform(gameList, Platform.PS);
        System.out.println("Numero de jogos de PS: " + PSGames.size());

        List<Jogo> PSPGames = Service.getListByPlatform(gameList, Platform.PSP);
        System.out.println("Numero de jogos de PSP: " + PSPGames.size());

        List<Jogo> SNESGames = Service.getListByPlatform(gameList, Platform.SNES);
        System.out.println("Numero de jogos de SNES: " + SNESGames.size());

        List<Jogo> WiiGames = Service.getListByPlatform(gameList, Platform.Wii);
        System.out.println("Numero de jogos de Wii: " + WiiGames.size());

        List<Jogo> X360Games = Service.getListByPlatform(gameList, Platform.X360);
        System.out.println("Numero de jogos de X360: " + X360Games.size());

        List<Jogo> XBGames = Service.getListByPlatform(gameList, Platform.XB);
        System.out.println("Numero de jogos de XB: " + XBGames.size());
        System.out.println(" ");

        List<Jogo> ps4Games = Service.getListByPlatform(gameList, Platform.PS4);
        System.out.println("Numero de jogos de PS4: " + ps4Games.size());
        ps4Games.forEach(e -> System.out.println(e.getName())); // imprimindo os jogos de PS4
        System.out.println(" ");

        List<Jogo> pcGames = Service.getListByPlatform(gameList, Platform.PC);
        System.out.println("Numero de jogos de PC: " + pcGames.size());
        pcGames.forEach(e -> System.out.println(e.getName())); // imprimindo os jogos de PC
        System.out.println(" ");

        List<Jogo> nintendoGames = Service.getByPuBlisher(gameList, Publisher.Nintendo);
        System.out.println("Numero de jogos da Nintendo: " + nintendoGames.size());
        nintendoGames.forEach(e -> System.out.println(e.getName())); // imprimindo os jogos da nintendo
    }
}