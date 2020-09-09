package com.belajar.gunungindonesia;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    public static List<Gunung> getGunungList(){
        List<Gunung> GunungList = new ArrayList<>();

        Gunung gunungRinjani = new Gunung();
        gunungRinjani.setNamaGunung("Gunung Rinjani");
        gunungRinjani.setImageUrl("https://pbs.twimg.com/media/D_paLVfUcAAfCwT.jpg");
        gunungRinjani.setTinggiGunung("ketinggian : 3.726 mdpl");

        Gunung gunungBromo = new Gunung();
        gunungBromo.setNamaGunung("Gunung Bromo");
        gunungBromo.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/7/7d/Mount_Bromo_at_sunrise%2C_showing_its_volcanoes_and_Mount_Semeru_%28background%29.jpg");

        Gunung gunungSemeru = new Gunung();
        gunungSemeru.setNamaGunung("Gunung Semeru");
        gunungSemeru.setImageUrl("https://cdn.idntimes.com/content-images/community/2020/05/img-20200520-082833-ec847baab16f93b97f9f44452c138e76_600x400.jpg");

        Gunung gunungIjen = new Gunung();
        gunungIjen.setNamaGunung("Gunung Ijen");
        gunungIjen.setImageUrl("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1532428701/gzhwkhoua9y2cwk3xvcq.jpg");

        Gunung gunungKelimutu = new Gunung();
        gunungKelimutu.setNamaGunung("Gunung Kelimutu");
        gunungKelimutu.setImageUrl("https://static.republika.co.id/uploads/images/inpicture_slide/danau-kelimutu-_120705203526-594.jpg");

        Gunung gunungPuncakJaya = new Gunung();
        gunungPuncakJaya.setNamaGunung("Puncak Jaya");
        gunungPuncakJaya.setImageUrl("https://wisato.id/wp-content/uploads/2019/01/Wisata-Puncak-jaya.jpeg");

        Gunung gunungGede = new Gunung();
        gunungGede.setNamaGunung("Gunung Gede");
        gunungGede.setImageUrl("https://cianjurkab.go.id/wp-content/uploads/2018/12/gununggede-952x637.jpg");

        Gunung gunungTambora = new Gunung();
        gunungTambora.setNamaGunung("Gunung Tambora");
        gunungTambora.setImageUrl("https://www.superadventure.co.id/uploads/news/2018/05/31/94ad56950ce1.jpg");

        Gunung gunungPrau = new Gunung();
        gunungPrau.setNamaGunung("Gunung Prau");
        gunungPrau.setImageUrl("https://www.superadventure.co.id/uploads/news/2019/02/25/3f66feaaa9f7.jpg");

        Gunung gunungKerinci = new Gunung();
        gunungKerinci.setNamaGunung("Gunung Kerinci");
        gunungKerinci.setImageUrl("https://phinemo.com/wp-content/uploads/2017/07/Makhluk-kaki-terbalik-Gunung-Kerinci.jpg");

        GunungList.add(gunungRinjani);
        GunungList.add(gunungBromo);
        GunungList.add(gunungSemeru);
        GunungList.add(gunungIjen);
        GunungList.add(gunungKelimutu);
        GunungList.add(gunungPuncakJaya);
        GunungList.add(gunungGede);
        GunungList.add(gunungTambora);
        GunungList.add(gunungPrau);
        GunungList.add(gunungKerinci);


        return GunungList;

    }
}
