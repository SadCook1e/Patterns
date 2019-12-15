public class HDD {
    void copyFromDVD(DVD dvd) {
        if (dvd.hasData()) {
            System.out.println("Данные загружаются с диска");
        }
        else {
            System.out.println("Нет данных для копирования");
        }
    }
}
