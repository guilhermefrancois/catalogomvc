package com.catalogo.catalogomvc.repository;

import com.catalogo.catalogomvc.model.Cantor;
import com.catalogo.catalogomvc.model.Album;
import com.catalogo.catalogomvc.model.Musica;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class catalogoRepository {

    private List<Cantor> cantores = new ArrayList<>();
    private List<Album> albuns = new ArrayList<>();
    private List<Musica> musicas = new ArrayList<>();

    public catalogoRepository() {

        // Cantores
        cantores.add(new Cantor(1, "ASAP ROCKY", "Americano"));
        cantores.add(new Cantor(2, "Metro Boomin", "Americano"));
        cantores.add(new Cantor(3, "Lil Tecca", "Americano"));

        // Álbuns
        albuns.add(new Album(1, "LIVE LOVE ASAP", 2011, 1));
        albuns.add(new Album(2, "HEROES & VILLAINS", 2022, 2));
        albuns.add(new Album(3, "PLAN A", 2023, 3));

        // Músicas - A$AP Rocky (LIVE.LOVE.A$AP - Álbum Completo)
        musicas.add(new Musica(1, "Palace", "https://youtu.be/mYvn2PamB4M?si=xbu_cqzfToqOWLXt", 1));
        musicas.add(new Musica(2, "Peso", "https://www.youtube.com/watch?v=ob3ktDxAjWI", 1));
        musicas.add(new Musica(3, "Bass", "https://www.youtube.com/watch?v=0k1CuAHPidw", 1));
        musicas.add(new Musica(4, "Wassup", "https://youtu.be/wctnQQ-RLek?si=8fdl1IMHsWio2XCo", 1));
        musicas.add(new Musica(5, "Brand New Guy", "https://youtu.be/nm_rtM2HgI4?si=-jGI-89gDKG4DtGL", 1));
        musicas.add(new Musica(6, "Purple Swag", "https://youtu.be/bC3i2YgkjgU", 1));
        musicas.add(new Musica(7, "Get Lit", "https://youtu.be/zKKf9ON9gWY?si=9Ac42Xep5Y6u56p3", 1));
        musicas.add(new Musica(8, "Trilla", "https://youtu.be/Ti6RIapDqkU?si=j3MNOzuAw2sa2i1O", 1));
        musicas.add(new Musica(9, "Keep It G", "https://youtu.be/DSoxG9M1HOE?si=rD6ToDEXmnGfsIf_", 1));
        musicas.add(new Musica(10, "Houston Old Head", "https://youtu.be/9afVR2qO730?si=PzVYPuknF0qQkZ4A", 1));
        musicas.add(new Musica(11, "Acid Drip", "https://youtu.be/Fh53dUo7sG4?si=0IMPzAR7QACQ_-bA", 1));
        musicas.add(new Musica(12, "Leaf", "https://youtu.be/Bzn4JYsY6ZE?si=rUjA2U15y83HOKz_", 1));
        musicas.add(new Musica(13, "Roll One Up", "https://youtu.be/MQjJd-TR8m4?si=fG5UL3m4npwPUsa9", 1));
        musicas.add(new Musica(14, "Demons", "https://youtu.be/LiQPQZ6pkU0?si=d72-XhyG-9tDOk-b", 1));
        musicas.add(new Musica(15, "Sandman", "https://youtu.be/JUC4K6tf5c0", 1));

        // Músicas - Metro Boomin (HEROES & VILLAINS - Álbum Completo)
        musicas.add(new Musica(16, "On Time", "https://youtu.be/uI5mZvn0m-A?si=QP9epnWASK9ipzs0", 2));
        musicas.add(new Musica(17, "Superhero (Heroes & Villains)", "https://youtu.be/074r1TFfo0M?si=t2n2RZw-Tc4mv3zt", 2));
        musicas.add(new Musica(18, "Too Many Nights", "https://youtu.be/CmSRd6S9Gx4?si=J-oxod4qGozlwCFZ", 2));
        musicas.add(new Musica(19, "Raindrops (Insane)", "https://youtu.be/ZBRuPESPiog?si=BvIY1aFKuJtHe_ca", 2));
        musicas.add(new Musica(20, "Umbrella", "https://youtu.be/UK3tsWrMIzM?si=j2LRxBr_ganWr1_u", 2));
        musicas.add(new Musica(21, "Trance", "https://youtu.be/gHb6AEwNFBU?si=2EW1G5ktd1rBghS2", 2));
        musicas.add(new Musica(22, "Around Me", "https://youtu.be/XH5YTvux33k?si=R9On0E1pjkzB1N2S", 2));
        musicas.add(new Musica(23, "Metro Spider", "https://youtu.be/A7KEdBtv7xQ?si=NqhpoEj-GnIf73tL", 2));
        musicas.add(new Musica(24, "I Can't Save You (Interlude)", "https://youtu.be/libQAbt3XyM?si=AhdKgmw2A91bvf7p", 2));
        musicas.add(new Musica(25, "Creepin'", "https://youtu.be/VYsr8v1jMHI?si=Jl-aw45B5-giPb5V", 2));
        musicas.add(new Musica(26, "Niagara Falls (Foot or 2)", "https://youtu.be/SFMCCPX5TM4?si=UQYzZIxTswlGrS8M", 2));
        musicas.add(new Musica(27, "Walk Em Down (Don't Kill Civilians)", "https://youtu.be/JEENkakFH3I?si=I3cT-VWbzm_0mWui", 2));
        musicas.add(new Musica(28, "Lock On Me", "https://youtu.be/N67Ilea325o?si=JI7QoLIdt6jTGS-k", 2));
        musicas.add(new Musica(29, "Feel The Fiyaaaah", "https://youtu.be/35V_5zP4vQk?si=vWf-8Od1vcGKbwlE", 2));
        musicas.add(new Musica(30, "All The Money", "https://youtu.be/571-qW7vIzs?si=mXz5LOGZKHoNx684", 2));

        // Músicas - Lil Tecca (PLAN A - Álbum Completo)
        musicas.add(new Musica(31, "TASTE", "https://youtu.be/151SppD5qwg?si=dY_fUDYFMnzgXsiX", 3));
        musicas.add(new Musica(32, "BAD TIME", "https://youtu.be/3ipRhv9htms?si=N8fZ4h_1cdg8gdLO", 3));
        musicas.add(new Musica(33, "120", "https://youtu.be/9l6kykW6LLs?si=HQhu9u-VmWeP4yDy", 3));
        musicas.add(new Musica(34, "I CANT LET GO", "https://youtu.be/jKCx44MH-b8?si=AlCfz_Rmz1YGiuac", 3));
        musicas.add(new Musica(35, "VOGUE", "https://youtu.be/rV1sZaEa0UQ?si=QpUQfAeOeB4sriHr", 3));
        musicas.add(new Musica(36, "24HRS", "https://youtu.be/6U4xq6TeXfE?si=_BBYVkyOjYPRphlB", 3));
        musicas.add(new Musica(37, "NUMBER 2", "https://youtu.be/YWCR8W5e4z8?si=M66ynnqgRYGL6UaN", 3));
        musicas.add(new Musica(38, "NEVER LAST", "https://youtu.be/OhA7PDxJx1M?si=3lha-v6Gch9sFML7", 3));
        musicas.add(new Musica(39, "HOME BODY", "https://youtu.be/m9MWMmQg-6g?si=UAAlv2TPZrBqo2cr", 3));
        musicas.add(new Musica(40, "SELF2SELF", "https://youtu.be/urp7oAv3tCE?si=Ax8M3Hw1PnJ37S30", 3));
        musicas.add(new Musica(41, "SEPARETE WAYS", "https://youtu.be/NfABFGRXJoc?si=dtqh09d_QflDxMHU", 3));
        musicas.add(new Musica(42, "TIME & A PLACE", "https://youtu.be/gw1HIjVOYqI?si=QWg8AgpGlPG1UdIQ", 3));
        musicas.add(new Musica(43, "4U", "https://youtu.be/wGkPrta6wGA?si=WBzBTr1tPdGjSnPY", 3));
        musicas.add(new Musica(44, "FLOWERS", "https://youtu.be/gwtQ_THfh5k?si=EKqtPzuI988dJYYl", 3));
        musicas.add(new Musica(45, "COLD GIRLS", "https://youtu.be/20gPt46vJkc?si=yEacet-uTiSAKT5F", 3));
        musicas.add(new Musica(46, "MAMA", "https://youtu.be/XLbveQt4rcw?si=9MgBS95ihmJcGz27", 3));
        musicas.add(new Musica(47, "D1", "https://youtu.be/6z3zgYI_GyU?si=ovCN6jBpsS8hA-zn", 3));
        musicas.add(new Musica(48, "ALL THE TIME", "https://youtu.be/Dz8-yTGWSqc?si=msEmWeKtxS23jNjL", 3));
    }

    public List<Cantor> listarCantores() {
        return cantores;
    }

    public List<Album> listarAlbunsPorCantor(int cantorId) {
        List<Album> resultado = new ArrayList<>();

        for (Album album : albuns) {
            if (album.getCantorId() == cantorId) {
                resultado.add(album);
            }
        }

        return resultado;
    }

    public List<Musica> listarMusicasPorAlbum(int albumId) {
        List<Musica> resultado = new ArrayList<>();

        for (Musica musica : musicas) {
            if (musica.getAlbumId() == albumId) {
                resultado.add(musica);
            }
        }

        return resultado;
    }
}