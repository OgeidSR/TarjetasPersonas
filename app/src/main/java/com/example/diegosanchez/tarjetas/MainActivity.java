package com.example.diegosanchez.tarjetas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=(ListView)findViewById(R.id.lista);
        OrigenDeDatosDeTarjeta datos=new OrigenDeDatosDeTarjeta();
        TarjetaAdapter adapter= new TarjetaAdapter();
        adapter.datos=datos.getDatos();
        adapter.contexto=this;
        adapter.Imagen=datos.getImagenes();
        lista.setAdapter(adapter);

    }

//Clase de la tarjeta
    class Tarjeta
    {

        private int edad;
        private String nombre;
        private String descripcion;
        private int img;

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public void setImg(int img) {
            this.img = img;
        }


        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public int getImg() {
            return img;
        }

        public Tarjeta(int edad, String nombre, String descripcion, int img)
        {
            this.edad = edad;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.img = img;
        }

        public Tarjeta()
        {

        }
    };
//Origen de los Datos
    class OrigenDeDatosDeTarjeta
    {
        public OrigenDeDatosDeTarjeta()
        {
        }

        public ArrayList <String> getImagenes (){
         ArrayList <String> Imagen = new ArrayList<>();
            Imagen.add("http://www.hdfondos.eu/pictures/2014/0314/1/woody-toy-story-3-wallpaper-442135.jpg");
            Imagen.add("https://i.ytimg.com/vi/DflGh1NVOIM/maxresdefault.jpg");
            Imagen.add("https://i.pinimg.com/originals/9f/b6/3f/9fb63fe150ced209cbd409f0efe30dd0.jpg");
            Imagen.add("https://i.pinimg.com/originals/97/f0/e6/97f0e655e52966384adbab7d4b594056.jpg");
            Imagen.add("http://simplywallpaper.net/pictures/2010/07/16/wp2_hamm_ts3_1600x1200.jpg");
            Imagen.add("https://i.pinimg.com/originals/8d/c5/b4/8dc5b45f47252a8b68e3d5802fa3298b.jpg");
            Imagen.add("http://thegamingfamily.wikia.com/wiki/File:Slinky_Dog_Toy_Story_3.jpg");
            Imagen.add("https://i.pinimg.com/originals/71/d4/1b/71d41b3137b52d5fecdd9e52f97055ad.jpg");
            Imagen.add("http://1.bp.blogspot.com/_fEiSMBIs9xU/TI4wHPVoDwI/AAAAAAAAAKs/GGIeQq2jTpk/s1600/wp2_bullseye_ts3_1024x768.jpg");
            Imagen.add("http://moziru.com/images/toy-story-clipart-teddy-bear-17.jpg");
            return Imagen;
        }


        public ArrayList <Tarjeta> getDatos()
        {
            ArrayList<Tarjeta> datos=new ArrayList<Tarjeta>();

            Tarjeta uno = new Tarjeta();
            uno.setNombre("Miguel");
            uno.setDescripcion("Oro para mi");
            uno.setEdad(24);
            uno.setImg(1);
            datos.add(uno);

            Tarjeta dos = new Tarjeta();
            dos.setNombre("Tulio");
            dos.setDescripcion("Quiero ver un 7!");
            dos.setEdad(26);
            dos.setImg(2);
            datos.add(dos);

            Tarjeta tres = new Tarjeta();
            tres.setNombre("Kuzco");
            tres.setDescripcion("¿Te digo algo curioso? No tengo manos!");
            tres.setEdad(20);
            tres.setImg(3);
            datos.add(tres);

            Tarjeta cuatro = new Tarjeta();
            cuatro.setNombre("Kronk");
            cuatro.setDescripcion("Arme el rompecabezas");
            cuatro.setEdad(26);
            cuatro.setImg(4);
            datos.add(cuatro);

            Tarjeta cinco = new Tarjeta();
            cinco.setNombre("Pacha");
            cinco.setDescripcion("Pero nos dimos la mano!");
            cinco.setEdad(40);
            cinco.setImg(5);
            datos.add(cinco);

            Tarjeta seis = new Tarjeta();
            seis.setNombre("Hades");
            seis.setDescripcion("Muchachos, el olimpo esta por alla...");
            seis.setEdad(1000000);
            seis.setImg(6);
            datos.add(seis);

            Tarjeta siete = new Tarjeta();
            siete.setNombre("Stich");
            siete.setDescripcion("Bvocho pega duro, bvocho pega mas");
            siete.setEdad(2);
            siete.setImg(7);
            datos.add(siete);

            Tarjeta ocho = new Tarjeta();
            ocho.setNombre("Woody");
            ocho.setDescripcion("Deja de jugar al hombre del espacio, me pone nervioso...");
            ocho.setEdad(19);
            ocho.setImg(8);
            datos.add(ocho);

            Tarjeta nueve = new Tarjeta();
            nueve.setNombre("Buzz");
            nueve.setDescripcion("Fiu, necesito una de esas");
            nueve.setEdad(19);
            nueve.setImg(9);
            datos.add(nueve);

            Tarjeta diez = new Tarjeta();
            diez.setNombre("Mate");
            diez.setDescripcion("Como Tomate, pero sin el TO");
            diez.setEdad(50);
            diez.setImg(10);
            datos.add(diez);

            return datos;
        }

    }
//Vinculo de Origen con Vista

       class TarjetaAdapter extends BaseAdapter
       {
           public ArrayList<String> Imagen;
            public ArrayList<Tarjeta> datos;
           Context contexto;

           @Override
           public int getCount() {
               return datos.size();
           }

           @Override
           public Object getItem(int i) {
               return datos.get(i);
           }

           @Override
           public long getItemId(int i) {
               return i;
           }

           @Override
           public View getView(int i, View view, ViewGroup viewGroup) {
               LayoutInflater vinculo=LayoutInflater.from(contexto);
               View v=vinculo.inflate(R.layout.tarjeta,null);
               //Pedi Nombre
               TextView nomtv=(TextView)v.findViewById(R.id.nomtv);
               nomtv.setText(datos.get(i).nombre);
               //Pedi Edad
               TextView edadtv=(TextView)v.findViewById(R.id.edadtv);
               edadtv.setText(""+datos.get(i).edad);
               //Pedi Descripcion
               TextView destv=(TextView)v.findViewById(R.id.destv);
               destv.setText(datos.get(i).descripcion);
               ImageView fotoiv = (ImageView)v.findViewById(R.id.fotoiv);
               Picasso.with(contexto).load(Imagen.get(i)).into(fotoiv);


               return v;
           }
       }


    }





