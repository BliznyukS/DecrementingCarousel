package autotasks;

import java.util.LinkedList;


public class CarouselRun {

    private int amountOfNotZeroElements; //could be atomicInt
    private LinkedList<Integer> carusel;
    private int decrementPosition;

    public int getAmountOfNotZeroElements() {
        return amountOfNotZeroElements;
    }

    public void setAmountOfNotZeroElements(int amountOfNotZeroElements) {
        this.amountOfNotZeroElements = amountOfNotZeroElements;
        this.decrementPosition = 0;
    }

    public LinkedList<Integer> getCarusel() {
        return carusel;
    }

    public void setCarusel(LinkedList<Integer> carusel) {
        this.carusel = carusel;
    }


    public CarouselRun() {
        this.carusel = new LinkedList();
    }

    public int next() {

        if (carusel.isEmpty() || amountOfNotZeroElements == 0) {
            return -1;
        }
//        decrementPosition = 0

        //  Возвращает текущее значение текущего элемента,
        int currentValue = carusel.get(this.decrementPosition);


        //  затем уменьшает текущий элемент на единицу
        int newValue = currentValue - 1;
        carusel.set(decrementPosition, newValue);

        // проверить нужно ли уменьшать amountOfNotZeroElements
        if (newValue == 0) {
            this.amountOfNotZeroElements--;
        }


        //  и переключается на следующий элемент в порядке добавления.
        //  Пропускает нулевые элементы. Когда больше нет элементов для уменьшения, возвращает -1


        this.decrementPosition = calculateNewDecrementPosition(this.decrementPosition);

        return currentValue;
    }

    private int calculateNewDecrementPosition(int currentDecrementPosition) {

        if (amountOfNotZeroElements == 0) {
            return 0;
        }

        // currentDecrementPosition = this.decrementPosition;
        int newDecrementPosition = 0;   // ПЕРЕПИСАТЬ ТЕРНАРНЫМ ОПЕРАТОРОМ

        if ((carusel.size() - 1) == currentDecrementPosition) {
            newDecrementPosition = 0;
        } else {
            newDecrementPosition = currentDecrementPosition + 1;
        }

        if (carusel.get(newDecrementPosition) == 0) {
            newDecrementPosition = calculateNewDecrementPosition(newDecrementPosition);
        }

        return newDecrementPosition;
    }

    public boolean isFinished() {
        // Когда больше нету елементов для уменьшения true, иначе false

        if (amountOfNotZeroElements > 0) {
            return false;
        } else {
            return true;
        }


        // throw new UnsupportedOperationException();
    }

}
