class Parkeringshus{
    private Parkeringsplass[] etasje1 = new Parkeringsplass[10];
    private int etasje1NextPlass = 0;
    private Parkeringsplass[] etasje2 = new Parkeringsplass[10];
    private int etasje2NextPlass = 0;
    
    public void parkPåEtasje1(Object object){
        if (object instanceof Bil){
            Parkeringsplass<Bil> parkeringsplass = new Parkeringsplass<>();
            parkeringsplass.parkVehicle( (Bil) object);
            etasje1[etasje1NextPlass] = parkeringsplass;
            etasje1NextPlass++;
        } else if(object instanceof Motorsykkel){
            Parkeringsplass<Motorsykkel> parkeringsplass = new Parkeringsplass<>();
            parkeringsplass.parkVehicle( (Motorsykkel) object);
            etasje1[etasje1NextPlass] = parkeringsplass;
            etasje1NextPlass++;
        } else {
            throw new RuntimeException("That's not a car or motorcycle!!!");
        }
    }

    public void parkPåEtasje2(Object object){
        if (object instanceof Bil){
            Parkeringsplass<Bil> parkeringsplass = new Parkeringsplass<>();
            parkeringsplass.parkVehicle( (Bil) object);
            etasje2[etasje2NextPlass] = parkeringsplass;
            etasje2NextPlass++;
        } else if(object instanceof Motorsykkel){
            Parkeringsplass<Motorsykkel> parkeringsplass = new Parkeringsplass<>();
            parkeringsplass.parkVehicle( (Motorsykkel) object);
            etasje2[etasje2NextPlass] = parkeringsplass;
            etasje2NextPlass++;
        } else {
            throw new RuntimeException("That's not a car or motorcycle!!!");
        }
    }

    public void emtpyPHus(){
        for (Parkeringsplass parkPlass: etasje1){
            if (parkPlass != null){
                System.out.println(parkPlass.driveOff());
            }
        }

        for (Parkeringsplass parkPlass: etasje2){
            if (parkPlass != null){
                System.out.println(parkPlass.driveOff());
            }
        }
    }
}
