class IkkeMerPlassException extends Exception{
    IkkeMerPlassException(String boktittel){
        super("Finnes ikke plass å sette inn "+boktittel);
    }
}
