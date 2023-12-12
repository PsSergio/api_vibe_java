package com.vibe.api.controller;

import com.vibe.api.model.ProdutoModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("produto/")
@CrossOrigin(origins = "https://pssergio.github.io", maxAge = 3600)

public class ProdutoController {

    private List<ProdutoModel> listaProdutos = new ArrayList<>();

    @GetMapping("all")
    public List<ProdutoModel> buscaTodosOsProdutos(){

        listaProdutos.sort(Comparator.comparing(ProdutoModel::getCodigoProduto));
        return listaProdutos;

    }

    @GetMapping("qtd")
    public Integer quantidadeDeProdutos(){
        return listaProdutos.size();

    }

    @PostMapping("add")
    public void addProduto(@RequestBody ProdutoModel _produto){
        listaProdutos.add(_produto);
    }

    @PostMapping("addList")
    public void addProdutosLista(@RequestBody List<ProdutoModel> listProduto){
        listaProdutos.addAll(listProduto);
    }

    @DeleteMapping("delete")
    public String deletaProduto(@RequestParam Integer codigoProduto){
        ProdutoModel produto = achaIndiceProduto(codigoProduto);
        if(produto != null){
            listaProdutos.remove(produto);
            return "Produto Deletado!";
        }
        return "Produto não encontrado!";

    }

    @GetMapping("find")
    public ResponseEntity<Object> achaProduto(@RequestParam Integer codigoProduto) {
        ProdutoModel produto = achaIndiceProduto(codigoProduto);
        if(produto != null){
            return new ResponseEntity<>(produto, HttpStatus.OK);
        }
        return new ResponseEntity<>("Produto não encontrado!", HttpStatus.OK);

    }

    public ProdutoModel achaIndiceProduto(Integer codigoProduto) {

        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getCodigoProduto() == codigoProduto) {
                return listaProdutos.get(i);
            }
        }
        return null;

    }

    @PutMapping("atualiza")
    public ProdutoModel atualizaProduto(@RequestBody ProdutoModel produtoBefore) {
        ProdutoModel produtoAfter = achaIndiceProduto(produtoBefore.getCodigoProduto());

        if(produtoAfter != null){
            listaProdutos.remove(produtoAfter);
            listaProdutos.add(produtoBefore);
            return produtoBefore;
        }
        return null;
    }
}


