class DuplikatException extends Exception{
    DuplikatException(String boktittel){
        super(boktittel+" er allerede på hylla.");
    }
}
