package by.http.hw.oop.goverment;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		City moscow = new City("Moscow");
		City lida = new City("Lida");
		City slutsk = new City("Slutsk");
		City minsk = new City("Minsk");
		City citadel = new City("Citadel");
		City respawn = new City("Respawn");
		City nexus = new City("Nexus");
		City normandysr1 = new City("Normandy SR1");
		City normandysr2 = new City("Normandy SR2");
		City zodino = new City("Zodino");
		City orsha = new City("Orsha");
		City mir = new City("Mir");
		
		Borough moscowhBorough  = new Borough (moscow, 13.35);
		Borough lidaBorough = new Borough (mir, 87.45);
		Borough slutskBorough  = new Borough (slutsk, 75.95);
		Borough orshaBorough  = new Borough (orsha, 14.45);
		Borough citadelBorough  = new Borough ( citadel, 46.76);
		Borough respawnBorough  = new Borough (respawn, 29.79);
		Borough nexusBorough  = new Borough (nexus, 75.78);
		Borough normandysr1Borough  = new Borough (normandysr1, 45.48);
		Borough normandysr2Borough  = new Borough (normandysr2, 76.78);
		Borough zodinoBorough  = new Borough (zodino, 67.78);
		Borough orshaBorough1  = new Borough (orsha, 44.22);
		Borough mirBorough  = new Borough (mir, 43.32);
		
		List<Borough> minskAndEtc = new ArrayList<Borough>();
		minskAndEtc.add(nexusBorough);
		minskAndEtc.add(respawnBorough);
		
		List<Borough> gomelAndEtc = new ArrayList<Borough>();
		gomelAndEtc.add(slutskBorough);
		gomelAndEtc.add(mirBorough);
		
		List<Borough> grodnoAndEtc = new ArrayList<Borough>();
		grodnoAndEtc.add(normandysr1Borough);
		grodnoAndEtc.add(moscowhBorough);
		
		List<Borough> brestAndEtc = new ArrayList<Borough>();
		brestAndEtc.add(normandysr2Borough);
		brestAndEtc.add(zodinoBorough);
		
		List<Borough> vitebskAndEtc = new ArrayList<Borough>();
		vitebskAndEtc.add(orshaBorough1);
		vitebskAndEtc.add(mirBorough);
		
		List<Borough> mogilevAndEtc = new ArrayList<Borough>();
		mogilevAndEtc.add(lidaBorough);
		mogilevAndEtc.add(respawnBorough);
		
		Province minskProvince = new Province (orsha, minskAndEtc);
		Province gomelProvince = new Province (normandysr1, gomelAndEtc);
		Province grodnoProvince = new Province (nexus, grodnoAndEtc);
		Province brestProvince = new Province (respawn, brestAndEtc);
		Province vitebskProvince = new Province (zodino, vitebskAndEtc);
		Province mogilevProvince = new Province (normandysr2, mogilevAndEtc);
		
		List<Province> provinceList = new ArrayList<Province>();
		provinceList.add(brestProvince);
		provinceList.add(vitebskProvince);
		provinceList.add(gomelProvince);
		provinceList.add(grodnoProvince);
		provinceList.add(mogilevProvince);
		provinceList.add(minskProvince);
		
		State state = new State(orsha, provinceList );
		StateLogic sl = new StateLogic();
		
		System.out.println(state.getCapital());
		System.out.println(sl.numberOfProvinces(provinceList));
		System.out.println(sl.stateSquareCalculation(provinceList));
		
		
		System.out.println("Province centers: ");
		for (Province pr : provinceList) {
			System.out.println(pr.getProvinceCentre());
		}
		
	}

}
