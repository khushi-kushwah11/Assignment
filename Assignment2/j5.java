class Que5{
    public static void main(String args[]){
        int Cost_of_fence=1600;
        int length=20;
        int Rate_of_fencing=25;
        int perimeter;
        perimeter=Cost_of_fence / Rate_of_fencing;
        System.out.println("Cost of fence=1600 rs.\n Length of park=20m\n Rate of fence=25 rs per m^2");
        System.out.println("Perimeter of park="+perimeter);
        int breadth=(perimeter/2)-length;
        System.out.println("Breadth of park="+breadth);
        int area=length * breadth;
        System.out.println("Area of park="+area);
    }
}