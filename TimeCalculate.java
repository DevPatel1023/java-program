class Time{
    int hour;
    int minute;
    int secound;
    
    Time(int hour,int minute,int secound){
        this.hour=hour;
        this.minute=minute;
        this.secound=secound;
    }
    
    void Timesum(Time T1,Time T2){
       
        hour=T1.hour+T2.hour;
        minute=T1.minute+T2.minute;
        secound=T1.secound+T2.secound;
        
        if(minute>=60){
            hour+=minute/60;
            minute%=60;
        }   
        if(secound>60){
            minute+=secound/60;
            secound%=60;
        }
        System.out.println("Hour:"+hour+" \n"+"Minute:"+minute+" \n"+"Secound:"+secound);
    }
    
}

class TimeCalculate{
    public static void main(String args[]){
        Time t1=new Time(10,30,0);
        Time t2=new Time(3,45,15);
        
        t1.Timesum(t1,t2);
    }
    
}
