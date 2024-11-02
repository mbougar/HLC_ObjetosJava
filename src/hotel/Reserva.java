package hotel;

public class Reserva {
    Cliente cliente;
    Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        habitacion.disponible = false;
    }
}
