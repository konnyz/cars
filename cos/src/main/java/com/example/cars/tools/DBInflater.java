package com.example.cars.tools;

import com.example.cars.model.car;
import com.example.cars.model.brand;
import com.example.cars.model.carHistory;
import  com.example.cars.model.dealer;
import com.example.cars.repositories.carsRepository;
import com.example.cars.repositories.brandRespository;
import com.example.cars.repositories.dealerRespository;
import com.example.cars.repositories.carHistoryRespository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(com.example.cars.repositories.brandRespository brandRespository, com.example.cars.repositories.carsRepository carsRepository, com.example.cars.repositories.dealerRespository dealerRespository, com.example.cars.repositories.carHistoryRespository carHistoryRespository) {
        this.brandRespository = brandRespository;
        this.carsRepository = carsRepository;
        this.dealerRespository = dealerRespository;
        this.carHistoryRespository = carHistoryRespository;
    }



    private brandRespository brandRespository;
    private carsRepository carsRepository;
    private dealerRespository dealerRespository;
    private carHistoryRespository carHistoryRespository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        dealer kamilPorc = new dealer("Kamil","Porc","Krakow","Mickiewicza","12");
        dealerRespository.save(kamilPorc);
        brand audi = new brand("1909","August Horch"," Niemcy","Audi");
        brandRespository.save(audi);


        dealer MateuszMiklas = new dealer("Mateusz","Miklas","Warszawa","Kopernika","15/3");
        dealerRespository.save(MateuszMiklas);
        brand BMW = new brand("1916"," Karl Rapp","Niemcy","BMW");
        brandRespository.save(BMW);


        dealer rafalKozlowski = new dealer("Rafal","Kozlowski","Poznan","Grunwaldzka","8");
        dealerRespository.save(rafalKozlowski);
        brand honda = new brand ("1948","Sōichirō Honda","Japonia","Honda");
        brandRespository.save(honda);


        dealer LukaszPrawda = new dealer("Lukasz","Prawda","Katowice","Sokolska","12");
        dealerRespository.save(LukaszPrawda);
        brand peugeot = new brand("1896","Armand Peugeot","Francja","Peugeot");
        brandRespository.save(peugeot);


        dealer TomaszKowalski = new dealer("Tomasz","Kowalski","Gdansk","Portowa","15");
        dealerRespository.save(TomaszKowalski);
        brand ford = new brand("1903","Henry Ford","USA","Ford");
        brandRespository.save(ford);


        car audiA3 = new car("A3","1.6","12000",kamilPorc,audi);
        carHistory audia3a = new carHistory("2005","185000",audiA3,audi,kamilPorc);
        carsRepository.save(audiA3);
        carHistoryRespository.save(audia3a);


        car BMWX1 = new car("X1 E84","2.0","22000",MateuszMiklas,BMW);
        carHistory BMW1X = new carHistory("2010","185000",BMWX1,BMW,MateuszMiklas);
        carsRepository.save(BMWX1);
        carHistoryRespository.save(BMW1X);


        car audiA6 = new car("A6 C5","2.4","12500",kamilPorc,audi);
        carHistory audia6a = new carHistory("2002","230000",audiA6,audi,kamilPorc);
        carsRepository.save(audiA6);
        carHistoryRespository.save(audia6a);


        car HondaJazz = new car("Jazz III","1.2","18000",rafalKozlowski,honda);
        carHistory JazzHonda = new carHistory("2012","91000",HondaJazz,honda,rafalKozlowski);
        carsRepository.save(HondaJazz);
        carHistoryRespository.save(JazzHonda);


        car BMWX3 = new car("X3 F25","2.0","44500",MateuszMiklas,BMW);
        carHistory X3BMW = new carHistory("2011","192000",BMWX3,BMW,MateuszMiklas);
        carsRepository.save(BMWX3);
        carHistoryRespository.save(X3BMW);


        car fordMondeo = new car ("Mondeo MK5","2.0","49999",TomaszKowalski,ford);
        carHistory Mondeoford = new carHistory("2015","125000",fordMondeo,ford,TomaszKowalski);
        carsRepository.save(fordMondeo);
        carHistoryRespository.save(Mondeoford);


        car peugeot508 = new car ("508","2.2","41999",LukaszPrawda,peugeot);
        carHistory peugeot5 = new carHistory("2014","168000",peugeot508,peugeot,LukaszPrawda);
        carsRepository.save(peugeot508);
        carHistoryRespository.save(peugeot5);


        car HondaCivic = new car ("Civic IX","1.6","42500",rafalKozlowski,honda);
        carHistory CivicHonda = new carHistory("2014","55000",HondaCivic,honda,rafalKozlowski);
        carsRepository.save(HondaCivic);
        carHistoryRespository.save(CivicHonda);


        car peugeot2008 = new car ("2008","2.0","168000",LukaszPrawda,peugeot);
        carHistory peugeot2 = new carHistory("2015","49750",peugeot2008,peugeot,LukaszPrawda);
        carsRepository.save(peugeot2008);
        carHistoryRespository.save(peugeot2);


        car Fordfocus = new car ("Focus MK3","1.5","52500",TomaszKowalski,ford);
        carHistory focusford = new carHistory("2015","115000",Fordfocus,ford,TomaszKowalski);
        carsRepository.save(Fordfocus);
        carHistoryRespository.save(focusford);


    }
}
