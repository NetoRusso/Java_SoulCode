package Aula060207;

public enum Prioridade {
    BAIXA(1),
    MEDIA(2),
    ALTA(3);

    private int nivel;

    Prioridade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
