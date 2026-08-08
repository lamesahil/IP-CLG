class BreakContinueDemo{
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i==13){
                System.out.println("Skipping 13");
                break;
            } else if(i==7){
                System.out.println("Skipping 7");
                continue;
            }
            System.out.println("Floor No. " + i);
        }
    }
}
