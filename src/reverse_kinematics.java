public class reverse_kinematics {
    public static void main(String[] args) {
        double x = 4, y = 8, z = 4; /// put your A,B,C value here
        double l1 = 24, l2 = 18, l3 = 0, d2 = 30;

        double d1 = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))) - l3;

        double th1 = Math.acos(x / (d1 + l3));

        double d6 = Math.sqrt((Math.pow(d1, 2)) + (Math.pow((z - d2), 2)));

        double th7 = Math.acos(d1 / d6);

        double th3 = Math.acos(((Math.pow(l1, 2)) + (Math.pow(l2, 2)) - (Math.pow(d6, 2))) / (2 * l1 * l2));

        double th6 = Math.asin((l2 * (Math.sin(th3))) / d6);

        double th2 = th6 + th7;

        System.out.printf("(waist,elbow,shoulder)=(%.4f,%.4f,%.4f)\n", Math.toDegrees(th1), Math.toDegrees(th3), Math.toDegrees(th2));
    }

}