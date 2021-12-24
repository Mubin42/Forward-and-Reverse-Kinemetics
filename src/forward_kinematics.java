public class forward_kinematics {
    public static void main(String[] args) {
        double th1 = 48, th2 = 56, th3 = 68;// put your  Theta like (A10),(B10),(C*10)

        double l1 = 24, l2 = 18, l3 = 0, d2 = 30;
        double thx = 180 - 90 - th2, thy = th3 - thx;

        double d3 = l1 * (Math.sin(Math.toRadians(th2)));
        System.out.println("d3= " +  d3);
        double d4 = l1 * (Math.cos(Math.toRadians(th2)));
        System.out.println("d4= " +  d4);

        double d5 = l2 * (Math.sin(Math.toRadians(thy)));
        System.out.println("d5= " +  d5);
        double d6 = l2 * (Math.cos(Math.toRadians(thy)));
        System.out.println("d6= " +  d6);
        double z = d2 + d3 - d6;
        System.out.println("z= " +  z);
        double d1 = d4 + d5;
        System.out.println("d1= " +  d1);

        double x = (d1 + l3) * (Math.cos(Math.toRadians(th1)));
        double y = (d1 + l3) * (Math.sin(Math.toRadians(th1)));

        System.out.printf("(x,y,z)=(%.4f,%.4f,%.4f)\n", x, y, z);
    }

}