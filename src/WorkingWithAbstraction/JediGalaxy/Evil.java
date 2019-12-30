package JediGalaxy;

public class Evil {
    private int[][] matrix;
    private int rowOfEvilCoordinate;
    private int columnEvilCoordinate;

    public Evil(int rowOfEvilCoordinate, int columnEvilCoordinate, int[][] matrix) {
        this.matrix = matrix;
        this.rowOfEvilCoordinate = rowOfEvilCoordinate;
        this.columnEvilCoordinate = columnEvilCoordinate;
    }

    public void destroyed() {
        int rowCoordinate = this.rowOfEvilCoordinate;
        int columnCoordinate = this.columnEvilCoordinate;

        while (rowCoordinate >= 0 && columnCoordinate >= 0) {
            if (rowCoordinate < this.matrix.length - 1 && columnCoordinate < matrix[0].length) {
                this.matrix[rowCoordinate][columnCoordinate] = 0;
            }

            rowCoordinate--;
            columnCoordinate--;
        }
    }
}
