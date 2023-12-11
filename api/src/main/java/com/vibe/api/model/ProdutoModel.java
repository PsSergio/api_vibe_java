package com.vibe.api.model;

public class ProdutoModel {

    private Integer codigoProduto;

    private String descProduto;

    private String subDescProduto;

    private CategoriaModel categoria;

    private ImageModel images;

    private Float precoProduto;
    public Integer getCodigoProduto(){
        return codigoProduto;

    }

    public Float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Float precoProduto) {
        this.precoProduto = precoProduto;
    }



    public ImageModel getImages() {
        return images;
    }

    public void setImages(ImageModel images) {
        this.images = images;
    }

    public String getSubDescProduto() {
        return subDescProduto;
    }

    public void setSubDescProduto(String subDescProduto) {
        this.subDescProduto = subDescProduto;
    }

    public void setCodigoProduto(Integer cod){
        codigoProduto = cod;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }
}