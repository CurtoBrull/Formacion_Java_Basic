package com.company.Interfaces;

import com.company.CocheHibridoPOO;
import com.company.CochePOO;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public CochePOO crearCocheDemo() {

        System.out.println("Creando coche Sport Hibrido");
        return new CocheHibridoPOO();
    }

    @Override
    public void destruirCoche(CochePOO cochePOO) {
        System.out.println("Destruyendo coche Sport delicadamente");
    }
}
