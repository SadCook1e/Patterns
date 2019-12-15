public class CardReader implements USB {

    public MemoryCard card;
    public CardReader(MemoryCard card) {
        this.card = card;
    }

    @Override
    public void connect() {
        card.insert();
        card.copyData();
    }
}
