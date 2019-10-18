
public class glavnaKlasa {

	public static void main(String[] args) {
		
		Car automobil= new Car ();
		
		automobil.boja="crvena";
		automobil.cena=200;
		automobil.kubikaza=1.3;
		automobil.marka="golf";
		automobil.model="dvojka";
		automobil.daljinskoZakljucavanje= false;
		
		System.out.println("napravih auto marke " + automobil.marka);
		System.out.println("model " +automobil.model);
		System.out.println("boje " + automobil.boja);
		System.out.println("koji kosta "+ automobil.cena);
		System.out.println("daljinsko " + automobil.daljinskoZakljucavanje);
		
		Car automobil2=new Car();
		
		automobil2.marka=" zastava";
		automobil2.model="stojadin";
		
		System.out.println("Najbolji auto je "+automobil2.marka + "  "+automobil2.model);
		
		
		
		
		
		
		
		
		
		
				
				
		
		

	}

}
