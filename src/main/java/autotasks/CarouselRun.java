package autotasks;

import java.util.LinkedList;


public class CarouselRun {

    private int amountOfNotZeroElements; //could be atomicInt
    private LinkedList<Integer> carusel;

    public int getAmountOfNotZeroElements() {
        return amountOfNotZeroElements;
    }

    public void setAmountOfNotZeroElements(int amountOfNotZeroElements) {
        this.amountOfNotZeroElements = amountOfNotZeroElements;
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
        //  Возвращает текущее значение текущего элемента, затем уменьшает текущий элемент на единицу и переключается на следующий элемент в порядке добавления.
        //  Пропускает нулевые элементы. Когда больше нет элементов для уменьшения, возвращает -1
       //throw new UnsupportedOperationException();
        carusel.get(0);
        return  -1;

    }

    public boolean isFinished() {
        // Когда больше нету елементов для уменьшения true, иначе false

        if (amountOfNotZeroElements > 0){
            return false;
        } else {
            return true;
        }
       // throw new UnsupportedOperationException();
    }

}
