public class Main {

    public  static void  main(String[] args){

        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Decorate this text"))));
        printer.print();
    }
}