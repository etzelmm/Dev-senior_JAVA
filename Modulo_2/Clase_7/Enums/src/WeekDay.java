public enum WeekDay {
    MONDAY (1,"Lunes"),
    TUESDAY (2, "Martes"),
    WEDNEDAY (3, "Miercoles"),
    THURSDAY (4, "Jueves"),
    FRIDAY (5, "Viernes"), 
    SATURDAY (6, "Sadabo"),
    SUNDAY (7, "Domingo"),
    MYDAY;

    private Integer num;
    private String dia;

    WeekDay() {

    }
    WeekDay (Integer num, String dia) {
        this.dia = dia;
        this.num = num;
    }

    public String getDia() {
        return dia;
    }

    /**
     * Retorna el num del objeto dia
     * @return numero
     */
    public Integer getNum() {
        return num;
    }

    /* 
    @Override
    public String toString() {
        return String.format("dia: %s es el %d de la semana", getDia(), getNum());
    }
        */
}
