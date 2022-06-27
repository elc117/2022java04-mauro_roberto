public class Vegetal {
    protected String    Cor;
    protected Bool      Comestivel;
    protected String    Habitat;

    public vegetal(){
        Cor = null;
        Comestivel = null;
        Habitat = null;
    }

    public setCor(String cor){
        Cor = cor;
    }
    public setComestivel(Bool a){
        Comestivel = a;
    }
    public setHabitat(String hab){
        Habitat = hab;
    }
    public String getCor(){
        return Cor;
    }
    public Bool getComestivel(){
        return Comestivel;
    }
    public String getHabitat(){
        return Habitat;
    }
}