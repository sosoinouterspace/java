
package com.mycompany.listaLigada;


public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int posicao;
    private int tamanho;
    private Elemento proximo;
            
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
    
    public void adicionar (String novoValor){
        Elemento novoElemento = new Elemento (novoValor);
        if (this.primeiro == null && ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
 
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
            
        }
        this.tamanho++;
    }
     public void remover (String valorProcurado){
         Elemento anterior = null;
         Elemento atual = this.primeiro;
         
          for (int i = 0; i < this.getTamanho();i++){
            if (atual.getValor().equalsIgnoreCase(valorProcurado));
                if (this.tamanho == 1){
                if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
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
      public Elemento get (int posicao){
        Elemento atual = this.primeiro;
        for (int i = 0; i <= posicao;i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
                
            }
        }
        return atual;
     }

   
    public int getPosicao() {
        return posicao;
    }

 
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

   
    public Elemento getProximo() {
        return proximo;
    }

  
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
      
}
