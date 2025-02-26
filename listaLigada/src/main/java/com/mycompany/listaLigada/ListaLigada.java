
package com.mycompany.listaLigada;


public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho; 
    
    
    public ListaLigada(){
        this.tamanho = 0;
    }

    
    public Elemento getPrimeiro() {
        return primeiro;
    }

   
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionarComeco(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;           
        }
         else{
            novoElemento.setProximo(this.primeiro);
            this.primeiro = novoElemento;  
        }
        this.tamanho++;
    }
    
    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;           
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;  
        }
        this.tamanho++;
    }
    public void remover (String valorProximo) {
        Elemento anterior = null;
        Elemento atual =  this.primeiro;
        for(int i=0;i< this.getTamanho(); i++){
            if(atual.getValor().equalsIgnoreCase(valorProximo)){
                if (this.tamanho == 1 ){
                    this.primeiro = null;
                    this.ultimo = null;
                 
                    atual.setProximo(null);
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                    
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                    
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break; 
              
                
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    
    public Elemento get( int posicao){
        Elemento atual= this.primeiro;
        for(int i=0; i<posicao; i++){
            if(atual.getProximo()!=null)
                atual = atual.getProximo();
        }
        return atual;
    } 
}



