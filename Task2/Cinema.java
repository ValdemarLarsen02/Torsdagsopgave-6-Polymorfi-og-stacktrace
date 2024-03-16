package Task2;

public class Cinema {
    String[][] seats;

    // Række 0 & sæde 0 er til direktøren og derfor som standard X
    public Cinema(int rows, int columns) { // Rettede 'seats' til 'columns' for at undgå navnekonflikt
        this.seats = new String[rows][columns]; // Initialiser array før brug
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = "O"; // Starter med at gøre alle sædder ledige
            }
        }
        this.seats[0][0] = "X"; // sætter de markeret sædder 
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) { // Ændret fra 'x' til 'X'
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // Ændret til korrekt datatype ""
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
