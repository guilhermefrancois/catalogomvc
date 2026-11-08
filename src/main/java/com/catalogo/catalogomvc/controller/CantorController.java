
package com.catalogo.catalogomvc.controller;

import com.catalogo.catalogomvc.repository.catalogoRepository;
import com.catalogo.catalogomvc.model.Cantor;
import com.catalogo.catalogomvc.model.Album;
import com.catalogo.catalogomvc.model.Musica;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CantorController {

    private final catalogoRepository repository;

    public CantorController(catalogoRepository repository) {
        this.repository = repository;
    }

    // Página inicial: lista de cantores
    @GetMapping("/")
    public String listarCantores(Model model) {
        model.addAttribute("cantores", repository.listarCantores());
        return "cantores";
    }

    // Lista os álbuns de um cantor
    @GetMapping("/cantores/{id}/albuns")
    public String listarAlbuns(@PathVariable int id, Model model) {

        List<Album> albuns = repository.listarAlbunsPorCantor(id);

        Cantor cantor = null;

        for (Cantor c : repository.listarCantores()) {
            if (c.getId() == id) {
                cantor = c;
                break;
            }
        }

        model.addAttribute("cantor", cantor);
        model.addAttribute("albuns", albuns);

        return "albuns";
    }

    // Lista as músicas de um álbum
    @GetMapping("/albuns/{id}/musicas")
    public String listarMusicas(@PathVariable int id, Model model) {

        List<Musica> musicas = repository.listarMusicasPorAlbum(id);

        model.addAttribute("musicas", musicas);

        return "musicas";
    }
}
