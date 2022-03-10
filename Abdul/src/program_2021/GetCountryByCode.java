package program_2021;

import java.util.Locale;

public class GetCountryByCode {

	public static void main(String[] args) {
		Locale loc = new Locale("","IN");
		System.out.println(loc.getDisplayCountry());
	}

}
