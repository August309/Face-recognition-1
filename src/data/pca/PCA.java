package data.pca;

import java.io.Serializable;
import org.ejml.alg.dense.decomposition.DecompositionFactory;
import org.ejml.alg.dense.decomposition.SingularValueDecomposition;
import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;
import org.ejml.ops.SingularOps;

/**
 * Klasa wykonujaca analize skladowych glownych (PCA) na wejsciowej macierzy
 *
 * @author Michal
 */
public class PCA implements Serializable{
    private static final long serialVersionUID = 10L;
    private DenseMatrix64F components;
    private DenseMatrix64F data = new DenseMatrix64F(1, 1);
    private double mean[];
    private int componentsCount;

    /**
     * Utworzenie obiektu dla danych wejsciowych, przyjmowana liczba skladowych
     * glownych okreslana jest na liczbe wejsciowych wierszy (liczba obrazow)
     *
     * @param input
     */
    PCA(double[][] input) {
        this(input, input.length);
    }

    /**
     * Utworzenie obiektu dla danych wejsciowych oraz dla okreslonej liczby
     * skladowych glownych
     *
     * @param input
     * @param components
     */
    PCA(double[][] input, int c) {

        data = new DenseMatrix64F(input);

        System.out.println("cols= " + data.getNumCols());
        System.out.println("rows=" + data.getNumRows());

        componentsCount = c;
        mean = new double[input[0].length];

        int colLen = input[0].length;

        for (int row = 0; row < input.length; ++row) {
            for (int col = 0; col < colLen; ++col) {
                mean[col] += input[row][col];
            }
        }

        for (int i = 0; i < colLen; ++i) {
            mean[i] /= input.length;
        }

        for (int row = 0; row < input.length; ++row) {
            for (int col = 0; col < colLen; ++col) {
                data.set(row, col, data.get(row, col) - mean[col]);
            }
        }

        SingularValueDecomposition<DenseMatrix64F> svd =
                DecompositionFactory.svd(data.numRows, data.numCols, false, true, false);

        if (!svd.decompose(data)) {
            throw new RuntimeException("LOOOOOOOL");
        }


        components = svd.getV(true);
        DenseMatrix64F W = svd.getW(null);
        SingularOps.descendingOrder(null, false, W, components, true);
        components.reshape(componentsCount, mean.length, true);
    }

    public double[] projection(double[] input) {

        DenseMatrix64F mean2 = DenseMatrix64F.wrap(data.getNumCols(), 1, mean);

        DenseMatrix64F inputMatrix = new DenseMatrix64F(data.getNumCols(), 1, true, input);
        DenseMatrix64F projection = new DenseMatrix64F(componentsCount, 1);

        CommonOps.sub(inputMatrix, mean2, inputMatrix);
        CommonOps.mult(components, inputMatrix, projection);

        return projection.data;
    }
}
