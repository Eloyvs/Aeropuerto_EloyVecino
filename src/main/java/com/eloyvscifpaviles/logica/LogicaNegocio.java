/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

import com.eloyvscifpaviles.dto.Aeropuerto;
import com.eloyvscifpaviles.dto.Companya;
import com.eloyvscifpaviles.dto.VueloBase;
import com.eloyvscifpaviles.dto.VueloDiario;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eloyv
 */
public class LogicaNegocio {

    // <editor-fold desc="Lógica de aeropuertos">
    //Lista que va a contener todos los aeropuertos
    public static List<Aeropuerto> lstAeropuertos = new ArrayList<Aeropuerto>();
    
    public static Aeropuerto aeropuertoGestion = new Aeropuerto();

    //carga todos los aeropuertos para lanzar el método al iniciar el programa
    public static void inicializarAeropuertos() {
        lstAeropuertos = leerAeropuertos();
        lstCompanyas = leerCompanyas();
        lstVuelosBase = leerVuelosBase();
        lstVuelosDiario = leerVuelosDiario();
        aeropuertoGestion = getAeropuertoBase();

    }

    //Validar que exista un aeropuerto
    public static ValidationResult addAeropuerto(Aeropuerto aero) {
        ValidationResult retValue = new ValidationResult(true, "");
        Aeropuerto aux = getAeropuertoByCodigoIATA(aero.getCodigoIATA());
        if (aux == null) {
            lstAeropuertos.add(aero);
        } else {
            retValue = new ValidationResult(false, "El código IATA el aeropuerto ya existe. No se añadirá a la lista");
        }

        return retValue;
    }

    //Buscar Aeropuerto por su código identificativo
    public static Aeropuerto getAeropuertoByCodigoIATA(String codigoIATA) {
        Aeropuerto valorSalida = null;

        for (Aeropuerto a : lstAeropuertos) {

            if (a.getCodigoIATA().equals(codigoIATA)) {
                valorSalida = a;
                return valorSalida;
            }
        }
        return valorSalida;
    }

    //Buscar Aeropuerto por su nombre
    public static Aeropuerto getAeropuertoByNombre(String nombre) {
        Aeropuerto valorSalida = null;

        for (Aeropuerto a : lstAeropuertos) {

            if (a.getNombre().equalsIgnoreCase(nombre)) {
                valorSalida = a;
                return valorSalida;
            }
        }
        return valorSalida;
    }

    //Nos da el aeropuerto Base que en este caso es el de Oviedo
    public static Aeropuerto getAeropuertoBase() {
        return getAeropuertoByCodigoIATA("OVD");
    }

    //lee los datos del csv para cargarlo en la lista de aeropuertos
    public static List<Aeropuerto> leerAeropuertos() {
        String ruta = "./src/main/resources/Aeropuertos.csv";
        List<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();

        try {

            aeropuertos = new CsvToBeanBuilder(new FileReader(ruta)).
                    withType(Aeropuerto.class).build().parse();
            return aeropuertos;
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, "Error al leer el archivo CSV", ex);
        }
        return null;
    }

    //</editor-fold>
    // <editor-fold desc="Lógica de compañías">
    //Lista que va a contener todas las compañías
    private static List<Companya> lstCompanyas = new ArrayList<Companya>();

    //Añadir compañía a la lista
    public static void addCompanyaAerea(Companya newComp) {
        lstCompanyas.add(newComp);
    }

    //Eliminar una compañía de la lista dado un código
    public static void deleteCompanyaByCodigo(String codigo) {
        Companya delComp = getCompanyaByCodigo(codigo);
        lstCompanyas.remove(delComp);

    }

    //Buscar compañía por su código identificativo
    public static Companya getCompanyaByCodigo(String codigo) {
        Optional<Companya> optValorSalida = lstCompanyas.stream()
                .filter(value -> value.getCodigo().equals(codigo))
                .findFirst();
        if (optValorSalida.isPresent()) {
            return optValorSalida.get();
        } else {
            return new Companya();
        }
    }

    //Buscar una compañía aérea utilizando su prefijo
    public static Companya getCompanyaByPrefijo(int prefijo) {
        Companya valorSalida = null;
        for (Companya c : lstCompanyas) {

            if (c.getPrefijo() == prefijo) {
                valorSalida = c;
                return valorSalida;
            }
        }
        return valorSalida;

    }

    //Recuperar todas las compañías de un municipio dado
    public static List<Companya> getCompanyasByMunicipio(String municipio) {
        return lstCompanyas.stream()
                .filter(value -> value.getMunicipio().equals(municipio))
                .toList();
    }

    //Añadir una compañía a la lista de compañías (La creada al inicio de la lógica de compañías)
    public static ValidationResult addCompanya(Companya newComp) {
        ValidationResult retValue = new ValidationResult(true, "");
        Companya aux = getCompanyaByCodigo(newComp.getCodigo());
        if (aux == null) {
            lstCompanyas.add(newComp);
        } else {
            retValue = new ValidationResult(false, "El código de la compañía ya existe. No se añadirá a la lista");
        }
        return retValue;
    }

    //Actualizar los datos de una compañía dada un código (Se le pasa una compañía que tendrá los nuevos datos)
    public static void updateCompanyaByCodigo(String codigo, Companya newComp) {
        Companya oldComp = getCompanyaByCodigo(codigo);
        if (oldComp != null) {
            oldComp.setDireccion(newComp.getDireccion());
            oldComp.setMunicipio(newComp.getMunicipio());
            oldComp.setNombre(newComp.getNombre());
            oldComp.setPrefijo(newComp.getPrefijo());
            oldComp.setTlfAeropuerto(newComp.getTlfAeropuerto());
            oldComp.setTlfPasajero(newComp.getTlfPasajero());
        }

    }

    public static List<Companya> leerCompanyas() {
        String ruta = "./src/main/resources/Companyas.csv";
        List<Companya> companyas = new ArrayList<Companya>();
        try {
            companyas = new CsvToBeanBuilder(new FileReader(ruta)).
                    withType(Companya.class).build().parse();
            return companyas;
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, "Error al leer el archivo CSV", ex);
        }

        return null;
    }

    public static void guardarCompanyaCSV(Companya comp) {
        try {
            String ruta = "./src/main/resources/companyas.csv";

            List<Companya> lstCompanias = new CsvToBeanBuilder<Companya>(new FileReader(ruta))
                    .withType(Companya.class)
                    .build()
                    .parse();

            if (comp != null) {
                lstCompanias.add(comp);

                try (Writer writer = new FileWriter(ruta)) {
                    StatefulBeanToCsv<Companya> beanToCsv = new StatefulBeanToCsvBuilder<Companya>(writer).build();
                    beanToCsv.write(lstCompanias);
                }
            } else {
                System.out.println("La compañía aérea proporcionada es nula.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualizarCompanyaCSV() {

        String ruta = "./src/main/resources/companyas.csv";

        try (Writer writer = new FileWriter(ruta)) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(lstCompanyas);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    //</editor-fold>
    // <editor-fold desc="Lógica de vuelos base">
    //Lista que va a contener todos los vuelos base
    private static List<VueloBase> lstVuelosBase = new ArrayList<VueloBase>();

    //Añadir un vuelo base a la lista de vuelos base (La creada al inicio de la lógica de vuelos base)
    public static void addVueloBase(VueloBase v) {
        lstVuelosBase.add(v);
    }

    //Buscar vuelo base por su código identificativo
    public static VueloBase getVueloBaseByCodigo(String codigo) {
        VueloBase vueloBaseSalida = null;
        for (VueloBase vb : lstVuelosBase) {
            if (vb.getCodigoVuelo().equals(codigo)) {
                return vb;
            }
        }
        return vueloBaseSalida;
    }

    //Conseguir lista de vuelos base en un día de la semana concreto
    public static List<VueloBase> getVuelosBaseByFecha(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
        String diaSemanaCad = "";
        switch (diaSemana) {
            case Calendar.SUNDAY:
                diaSemanaCad = "D";
                break;
            case Calendar.MONDAY:
                diaSemanaCad = "L";
                break;
            case Calendar.TUESDAY:
                diaSemanaCad = "M";
                break;
            case Calendar.WEDNESDAY:
                diaSemanaCad = "X";
                break;
            case Calendar.THURSDAY:
                diaSemanaCad = "J";
                break;
            case Calendar.FRIDAY:
                diaSemanaCad = "V";
                break;
            case Calendar.SATURDAY:
                diaSemanaCad = "S";
                break;
            default:
                diaSemanaCad = "";
                break;
        }

        return getVuelosBaseByDiaSemana(diaSemanaCad);
    }

    public static List<VueloBase> getVuelosBaseByDiaSemana(String diaSemana) {

        List<VueloBase> lstVuelosByDiaSemana = lstVuelosBase.stream()
                .filter(v -> v.getDias().contains(diaSemana))
                .toList();

        return lstVuelosByDiaSemana;
    }

    //Devuelve los vuelos base que tienen un aeropuerto destino concreto
    public static VueloBase getVueloBaseByAeropuertoDestino(String codigoIATA) {
        VueloBase valorSalida = null;

        for (VueloBase a : lstVuelosBase) {

            if (a.getCodAeroDestino().equals(codigoIATA)) {
                valorSalida = a;
                return valorSalida;
            }
        }
        return new VueloBase();
    }

    //Devuelve los vuelos base que tienen un aeropuerto origen concreto
    public static List<VueloBase> getVueloBaseByAeropuertoOrigen(String codigoIATA) {
        List<VueloBase> lstVuelosByAeropuertoOrigen = lstVuelosBase.stream()
                .filter(v -> v.getCodAeroOrigen().equals(codigoIATA))
                .toList();
        return lstVuelosByAeropuertoOrigen;
    }

    public static void deleteVueloBaseByCodigo(String codigo) {
        VueloBase delVuelo = getVueloBaseByCodigo(codigo);
        if (delVuelo != null) {
            lstVuelosBase.remove(delVuelo);
        }
    }

    //Actualizar los datos de un vuelo base con un código IATA dado (se le pasa un objeto VueloBase que contendrá los nuevos datos)
    public static void updateVueloBaseByCodigo(String codigo, VueloBase newVuelo) {
        VueloBase oldVuelo = getVueloBaseByCodigo(codigo);
        if (oldVuelo != null) {
            oldVuelo.setCodAeroOrigen(newVuelo.getCodAeroOrigen());
            oldVuelo.setCodAeroDestino(newVuelo.getCodAeroDestino());
            oldVuelo.setDias(newVuelo.getDias());
            oldVuelo.setHoraLlegada(newVuelo.getHoraLlegada());
            oldVuelo.setHoraSalida(newVuelo.getHoraSalida());
            oldVuelo.setNumPlazas(newVuelo.getNumPlazas());
        }
    }

    public static List<VueloBase> leerVuelosBase() {
        String ruta = "./src/main/resources/VuelosBase.csv";

        List<VueloBase> vuelosBase = new ArrayList<VueloBase>();
        try {
            vuelosBase = new CsvToBeanBuilder(new FileReader(ruta)).
                    withType(VueloBase.class).build().parse();
            return vuelosBase;

        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, "Error al leer el archivo CSV", ex);
        }
        return null;
    }

    public static void guardarVueloBaseCSV(VueloBase vueloB) {
        try {
            String ruta = "./src/main/resources/VuelosBase.csv";

            List<VueloBase> lstVuelosB = new CsvToBeanBuilder<VueloBase>(new FileReader(ruta))
                    .withType(VueloBase.class)
                    .build()
                    .parse();

            if (vueloB != null) {
                lstVuelosB.add(vueloB);

                try (Writer writer = new FileWriter(ruta)) {
                    StatefulBeanToCsv<VueloBase> beanToCsv = new StatefulBeanToCsvBuilder<VueloBase>(writer).build();
                    beanToCsv.write(lstVuelosB);
                }
            } else {
                System.out.println("El vuelo base proporcionado es nulo.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualizarVueloBaseCSV() {

        String ruta = "./src/main/resources/VuelosBase.csv";

        try (Writer writer = new FileWriter(ruta)) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(lstVuelosBase);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    //</editor-fold>
    // <editor-fold desc="Lógica de vuelos diarios">
    //Lista que va a contener todos los vuelos diarios
    private static List<VueloDiario> lstVuelosDiario = new ArrayList<VueloDiario>();
    
    public static VueloDiario getVueloDiarioByCodigo(String codigo) {
        VueloDiario vueloDiarioSalida = null;
        for (VueloDiario vd : lstVuelosDiario) {
            if (vd.getCodigoVuelo().equals(codigo)) {
                return vd;
            }
        }
        return vueloDiarioSalida;
    }    
    
  /*  public static VueloDiario getVuelosDiarioByCompanya(String companya) {
        List<VueloDiario>;
        for (VueloDiario vd : lstVuelosDiario) {
            if (vd.ge) {
                return vd;
            }
        }
        return vueloDiarioSalida;
    } */
    public static VueloDiario getVueloDiarioByCodigoYFecha(String codigo, Date fecha) {
        VueloDiario vueloDiarioSalida = null;
        for (VueloDiario vd : lstVuelosDiario) {
            if (vd.getCodigoVuelo().equals(codigo) && vd.getFechaVuelo().toString().equalsIgnoreCase(fecha.toString())) {
                return vd;
            }
        }
        return vueloDiarioSalida;
    }
    
    public static void deleteVueloDiarioByCodigoYFecha(String codigo, Date fecha) {
        VueloDiario delVuelo = getVueloDiarioByCodigoYFecha(codigo, fecha);
        if (delVuelo != null) {
            lstVuelosDiario.remove(delVuelo);
        }
    }
    
    public static void deleteVueloDiarioByVuelo(VueloDiario vuelo) {
        
        if (vuelo != null) {
            for(VueloDiario v :lstVuelosDiario){
                if (v.getCodigoVuelo().equals(vuelo.getCodigoVuelo()) 
                        && v.getFechaVuelo().toString().equalsIgnoreCase(vuelo.getFechaVuelo().toString())) {
                lstVuelosDiario.remove(v);
            }
            }
        }
    }
    
    public static void deleteVueloDiarioByCodigo(String codigo) {
        VueloDiario delVuelo = getVueloDiarioByCodigo(codigo);
        if (delVuelo != null) {
            lstVuelosDiario.remove(delVuelo);
        }
    }
    
    public static void updateVueloDiarioByVueloYHoras(VueloDiario vuelo, Date horaSalida, Date horaLLegada){
        if (vuelo != null) {
            for(VueloDiario v :lstVuelosDiario){
                if (v.getCodigoVuelo().equals(vuelo.getCodigoVuelo()) 
                        && v.getFechaVuelo().toString().equalsIgnoreCase(vuelo.getFechaVuelo().toString())) {
                    v.setHoraSalida(horaSalida);
                    v.setHoraLlegada(horaLLegada);
            }
            }
        }
    }
    
    public static List<VueloDiario> recogerVuelosDiariosSalidaAeropuerto(){
        List<VueloDiario> vuelosAeropuerto = new ArrayList<>();
        VueloBase comprobar;
        for(VueloDiario vd : lstVuelosDiario){
            comprobar = getVueloBaseByCodigo(vd.getCodigoVuelo());
            if(comprobar.getCodAeroOrigen().equalsIgnoreCase(aeropuertoGestion.getCodigoIATA())){
                vuelosAeropuerto.add(vd);
            }
        }
        
        Collections.sort(vuelosAeropuerto, new Comparator<VueloDiario>() {
        @Override
        public int compare(VueloDiario vuelo1, VueloDiario vuelo2) {
            return vuelo1.getHoraSalida().compareTo(vuelo2.getHoraSalida());
    }
        });
                return vuelosAeropuerto;
                }
    
    public static List<VueloDiario> recogerVuelosDiariosLlegadaAeropuerto(){
        List<VueloDiario> vuelosAeropuerto = new ArrayList<>();
        VueloBase comprobar;
        for(VueloDiario vd : lstVuelosDiario){
            comprobar = getVueloBaseByCodigo(vd.getCodigoVuelo());
            if(comprobar.getCodAeroDestino().equalsIgnoreCase(aeropuertoGestion.getCodigoIATA())){
                vuelosAeropuerto.add(vd);
            }
        }
        
        Collections.sort(vuelosAeropuerto, new Comparator<VueloDiario>() {
        @Override
        public int compare(VueloDiario vuelo1, VueloDiario vuelo2) {
            return vuelo1.getHoraSalida().compareTo(vuelo2.getHoraSalida());
    }
        });
                return vuelosAeropuerto;
                }

    public static List<VueloDiario> leerVuelosDiario() {
        String ruta = "./src/main/resources/VuelosDiario.csv";

        List<VueloDiario> vuelosDiarios = new ArrayList<VueloDiario>();
        try {
            vuelosDiarios = new CsvToBeanBuilder(new FileReader(ruta)).
                    withType(VueloDiario.class).build().parse();
            return vuelosDiarios;

        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, "Error al leer el archivo CSV", ex);
        }
        return null;
    }
    
    public static void actualizarVueloDiarioCSV() {

        String ruta = "./src/main/resources/VuelosDiario.csv";

        try (Writer writer = new FileWriter(ruta)) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(lstVuelosDiario);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
    
    public static void guardarVueloDiarioCSV(VueloDiario vueloD) {
        try {
            String ruta = "./src/main/resources/VuelosDiario.csv";

            List<VueloDiario> lstVuelosD = new CsvToBeanBuilder<VueloDiario>(new FileReader(ruta))
                    .withType(VueloDiario.class)
                    .build()
                    .parse();

            if (vueloD != null) {
                lstVuelosD.add(vueloD);

                try (Writer writer = new FileWriter(ruta)) {
                    StatefulBeanToCsv<VueloDiario> beanToCsv = new StatefulBeanToCsvBuilder<VueloDiario>(writer).build();
                    beanToCsv.write(lstVuelosD);
                }
            } else {
                System.out.println("El vuelo diario proporcionado es nulo.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //</editor-fold>

    // <editor-fold desc="Programa principal">
    public static void inicializarPrograma() {
        inicializarAeropuertos();
    }
    //</editor-fold>

    // <editor-fold desc="Métodos de fechas">
    public static Date getFechaByHora(int horas, int minutos) {
        Calendar cal = Calendar.getInstance();
        cal.set(1970, 1, 1, horas, minutos);
        Date fecha = cal.getTime();

        return fecha;
    }

    public static String getHoraFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(fecha);
    }
    //</editor-fold>
}
