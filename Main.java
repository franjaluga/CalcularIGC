public class Main {
    public static void main(String[] args) {

        int year = Integer.parseInt(args[0]);
        int base= Integer.parseInt(args[1]);

        calcularIgc( year , base );

    }

    public static int calcularIgc(int year, int base){
        int igc = 0;

        if(year == 2011){
            System.out.println("AT2012");
            igc = Funciones.calcularIGCAt2012(base);
        }else if(year == 2012){
            System.out.println("AT2013");
            igc = Funciones.calcularIGCAt2013(base);
        }else if(year == 2013){
            System.out.println("AT2014");
            igc = Funciones.calcularIGCAt2014(base);
        }else if(year == 2014){
            System.out.println("AT2015");
            igc = Funciones.calcularIGCAt2015(base);
        }else if(year == 2015){
            System.out.println("AT2016");
            igc = Funciones.calcularIGCAt2016(base);
        }else if(year == 2016){
            System.out.println("AT2017");
            igc = Funciones.calcularIGCAt2017(base);
        }else if(year == 2017){
            System.out.println("AT2018");
            igc = Funciones.calcularIGCAt2018(base);
        }else if(year == 2018){
            System.out.println("AT2019");
            igc = Funciones.calcularIGCAt2019(base);
        }else if(year == 2019){
            System.out.println("AT2020");
            igc = Funciones.calcularIGCAt2020(base);
        }else if(year == 2020){
            System.out.println("AT2021");
            igc = Funciones.calcularIGCAt2021(base);
        }else if(year == 2021){
            System.out.println("AT2022");
            igc = Funciones.calcularIGCAt2022(base);
        }else{
            System.out.println("error de año");
        }
        return igc;
    }


}