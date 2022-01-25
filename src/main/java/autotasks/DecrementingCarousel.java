package autotasks;

public class DecrementingCarousel {

//    private boolean flag;

    private int currentElementIndexForAdd;// do not need for LinkedList
    private CarouselRun carouselRun;
    private boolean isRunning;
    private int capacity;


    public DecrementingCarousel(int capacity) {
        this.isRunning = false;
        this.capacity = capacity;
        this.carouselRun = new CarouselRun();
        // init array

    }

    public boolean addElement(int element) {
        if (isRunning) {
            //throw new UnsupportedOperationException();
            return false;
        }

        if (element > 0 && capacity > 0) {
            carouselRun.setAmountOfNotZeroElements(carouselRun.getAmountOfNotZeroElements() + 1);
            carouselRun.getCarusel().add(element);
            capacity = capacity - 1;
            return true;
        } else {
            return false;
        }
        // Добавляет элемент. Если элемент отрицателен или равен нулю, не добавляет его.
        // Если контейнер заполнен, не добавляет элемент. Если метод run был вызван для создания CarouselRun, не добавляет элемент.
        // Если элемент добавлен успешно, возвращает true. В противном случае – false.
        //throw new UnsupportedOperationException();
    }

    public CarouselRun run() {
        //     Возвращает CarouselRun для перебора элементов.
        //     Если метод run уже был вызван ранее, он должен вернуть null: DecrementingCarousel может генерировать только один объект CarouselRun.

        if (isRunning) {
            return null;
        } else {
            isRunning = true;
            return carouselRun;
        }
        //throw new UnsupportedOperationException();
    }
}
