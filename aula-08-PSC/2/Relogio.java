public class Relogio {
    private int hora;
    private int minuto;

    public Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void ticTac() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public String mostra() {
        return String.format("%02d:%02d", hora, minuto);
    }
}
