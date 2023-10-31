package fabiomarras.u5w1d2.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int numeroOrdine;
    private StatusOrder statusOrder;
    private int numeroCoperti;
    private LocalDate data;
    private List<Menù> ordine;
    private double totalPrice;
}
