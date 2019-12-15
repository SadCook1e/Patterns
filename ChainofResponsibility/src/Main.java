public class Main {
    public  static void  main(String[] args){
        Logger log0 = new SMSLogger(Level.ERROR);
        Logger log1 = new FileLogger(Level.DEBUG);
        Logger log2 = new EmailLogger(Level.INFO);

        log0.SetNext(log1);
        log1.SetNext(log2);

        log0.writeMessage("Все хорошо", Level.INFO);
        System.out.println("=========================================================");
        log0.writeMessage("Есть ошибки", Level.DEBUG);
        System.out.println("=========================================================");
        log0.writeMessage("Сервер упал", Level.ERROR);
    }
}
