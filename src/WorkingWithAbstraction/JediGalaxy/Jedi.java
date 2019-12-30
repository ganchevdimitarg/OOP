package JediGalaxy;

public class Jedi {
    private int[][] matrix;
    private int rowOfJediCoordinate;
    private int columnOfJediCoordinate;

    public Jedi(int rowOfJediCoordinate, int colomnOfJediCoordinate, int[][] matrix) {
        this.matrix = matrix;
        this.rowOfJediCoordinate = rowOfJediCoordinate;
        this.columnOfJediCoordinate = colomnOfJediCoordinate;
    }

    public int sum(){
        int sum = 0;
        int columnCoordinate = this.columnOfJediCoordinate;
        int rowCoordinate = this.rowOfJediCoordinate;

        while (rowCoordinate >= 0 && columnCoordinate < this.matrix[0].length) {
            if (rowCoordinate < this.matrix.length &&
                    columnCoordinate >= 0 &&
                    columnCoordinate < this.matrix[0].length) {
                int n = this.matrix[rowCoordinate][columnCoordinate];
                sum += n;
            }
            columnCoordinate++;
            rowCoordinate--;
        }

        return sum;
    }
}
