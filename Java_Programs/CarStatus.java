//wap to create a class Car having fields modelno, color, make and methods start,stop .\
 class Car
 {

     String carModel;
     String carColor;
     int carPrice;

      public void carStart()
      {
        System.out.println("Car is Started");
      }
       public void carStop()
      {
               System.out.println("Car is Stop");
      }
 }
 class CarStatus
 {

    public static void main(String abc[])
    {
      Car c1 = new Car();
      c1.carModel="Renault";
      c1.carColor="White";
      c1.carPrice=800000;
       System.out.println("Car Model= "+ c1.carModel);
        System.out.println("Car Color= "+ c1.carColor);
         System.out.println("Car Price= "+ c1.carPrice);
         c1.carStart();
         c1.carStop();
 }
}