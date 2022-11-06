public class Kugelvolumen {
    public static void main(String[] args) {
        // V = 4/3 * Pi * r³

        double piWert = Math.PI;
        double faktor = (4.0/3.0);

        double[] zufallsZahl = new double[6];
        zufallsZahl[0] = (Math.random() * 10.0);
        zufallsZahl[1] = (Math.random() * 10.0);
        zufallsZahl[2] = (Math.random() * 10.0);
        zufallsZahl[3] = (Math.random() * 10.0);
        zufallsZahl[4] = (Math.random() * 10.0);
        zufallsZahl[5] = (Math.random() * 10.0);

        for (int i = 0; i < zufallsZahl.length; i++){
            double volumen = faktor * piWert * Math.pow(zufallsZahl[i], 3);
            System.out.print("Volumen der Kugel " + (i+1) );
            System.out.println(" mit dem Radius r=" + zufallsZahl[i] + " betraegt " + volumen +" VE.");
        }
    }
}
