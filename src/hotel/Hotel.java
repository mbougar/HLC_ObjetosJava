package hotel;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    ArrayList<Reserva> reservas = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void reservarHabitacion(Cliente cliente, Habitacion habitacion) {
        if (habitacion.disponible) {
            Reserva reserva = new Reserva(cliente, habitacion);
            reservas.add(reserva);
            System.out.println("Reserva realizada para " + cliente.nombre);
        } else {
            System.out.println("La habitación " + habitacion.numero + " no está disponible.");
        }
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.habitacion.disponible = true;
        reservas.remove(reserva);
        System.out.println("Reserva cancelada.");
    }

    public void mostrarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Reserva: Cliente " + reserva.cliente.nombre + " - Habitación " + reserva.habitacion.numero);
        }
    }
}
