// declare your enum here

enum Currency {
    USD,
    EUR,
    GBP,
    RUB,
    UAH,
    KZT,
    CAD,
    JPY,
    CNY
}
enum Zodiac {
    ARIES,
    TAURUS,
    GEMINI,
    CANCER,
    LEO,
    VIRGO,
    LIBRA,
    SCORPIO,
    SAGITTARIUS,
    CAPRICORN,
    AQUARIUS,
    PISCES
}
public class Main  {
    public static  void main(String[] args) {
        Zodiac capricorn = Zodiac.CAPRICORN;
        Zodiac leo = Zodiac.LEO;

        System.out.println(capricorn.name());
        Zodiac taurus = Zodiac.valueOf("TAURUS");
        Zodiac virgo = Zodiac.valueOf("virgo");
        System.out.println(leo.equals(Zodiac.TAURUS));
        System.out.println(Zodiac.AQUARIUS.ordinal());
    }
}