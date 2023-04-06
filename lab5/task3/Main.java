import Streams.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import java.util.Objects;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.*;


class CityHighPopulation{

   public static void main(String[] args) {
      CountryDao countryDao = InMemoryWorldDao.getInstance();
       List<City> CityHighPopulation = countryDao.findAllCountries()
                .stream()
                .map( country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
      CityHighPopulation.forEach(System.out::println);
   }
}

class CapitalCityHighPopulation {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        
		Optional<City> CityHighPopulation = countryDao.findAllCountries()
            .stream()
            .map(Country::getCapital)
            .map(cityDao::findCityById)
            .filter(Objects::nonNull)
            .max(Comparator.comparing(City::getPopulation));
				
		 CityHighPopulation.ifPresent(System.out::println);
		
    }
}


// class CityHighPopulationInContinent {

//     public static void main(String[] args) {
//         CountryDao countryDao = InMemoryWorldDao.getInstance();
		
//         Map<String,List<Country>> CityHighPopulation = countryDao.findAllCountries()
// 		.stream()
// 		.collect(Collectors.groupingBy(Country::getContinent));
		
// 		for(List<Country> countries : CityHighPopulation.values()){
// 		List<City> city = (countries
// 			.stream()
// 			.map(c -> c.getCities()			
// 			.stream()
// 			.max(Comparator.comparingInt(City::getPopulation)))	
// 			.filter(Optional::isPresent)
// 			.map(Optional::get)
// 			.max(Comparator.comparingInt(City::getPopulation))
// 			.stream()
// 			.peek(System.out::println)
// 			.collect(Collectors.toList()));
// 		}
//     }
// }
