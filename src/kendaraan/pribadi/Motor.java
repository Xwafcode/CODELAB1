package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    public Motor(String name, String model, String warna, int tahun) {
        this.setName(name);
        this.setModel(model);
        this.setWarna(warna);
        this.setTahun(tahun);
    }
    
    public Motor() {
        
    }

    @Override
    public void Start() {
        System.out.println("Motor " + this.getName() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
