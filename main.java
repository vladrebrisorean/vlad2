package AnimalRescuer;

public class main {

    public static void main(String[] args) {

     Animal Laila = new Animal();
     Laila.name = "Laila";
     Laila.SetA("Joacaaaa");
     Laila.sanatate = 10;
     System.out.println("Fetita mea se numeste: " + Laila.name +" si este sanatoasa de nota " + Laila.sanatate );
     System.out.println("Activitatea preferata este: " +Laila.activitate);
     Laila.varsta = 3;
     Laila.spirit = 10;
     Laila.SetM("Bobitele");
     System.out.println("Laila are: " + Laila.varsta +" ani, iar starea ei de spirit este de nota: "+ Laila.spirit +" iar mancarea preferata sunt " + Laila.mancare);


    Adopter Vlad = new Adopter();
    Vlad.gold = 222;
    System.out.println(Vlad.gold);
    Vlad.name = "Vlad";
    System.out.println(Vlad.name);

    AnimalFood Canapea = new AnimalFood();
    Canapea.name = "Viscas";
    Canapea.price = 66;
    Canapea.quant = 12;
    Canapea.stoc = 100;
    System.out.println("Noua mancare de animale se numeste: " + Canapea.name + ", Costa: " + Canapea.price + " iar in stoc sunt: " + Canapea.stoc + " bucati");

    Recreation Joaca  = new Recreation();
    Joaca.name = "Joaca";
    System.out.println(Joaca.name);
    Joaca.SetName("Acum doarme");
    System.out.println(Joaca.name);

    VetMD Medic = new VetMD();
    Medic.SetName("Cel mai bun doctor");
    Medic.SetS("Oftalmolog");
    System.out.println(Medic.nume + "\n" + Medic.specialziare);

}
}
