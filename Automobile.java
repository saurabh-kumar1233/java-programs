classAutomobile
{
    privateStringdrive() 
    {
        return"Driving vehicle";
    }}
    classCarextendsAutomobile
    {
        protectedStringdrive()
         {
            return"Driving car";
        
        }}
         publicclassElectricCarextendsCar
         {
            @OverridepublicfinalStringdrive()

            {
                return"Driving electric car";
            }
         publicstaticvoidmain(String[]wheels) 
         {
            finalCarcar=newElectricCar();
            System.out.print(car.drive());
        
        }}