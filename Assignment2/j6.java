class Que6{
    public static void main(String args[]){
       int perimeter=36;
       int side1=10;
       int side2=9;

       int side3=(perimeter-side1-side2);
       int s=perimeter/2;
       double area=Math.sqrt(s*(s-side1)(s-side2)(s-side3));
       
        System.out.println("Area of triangle="+area); 
    }
}