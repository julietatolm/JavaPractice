package lesson_11_16_comporator_lambda;

@FunctionalInterface
public interface PlayerSumator< T > {

    public Player sum( Player p1, T i2 );
}
