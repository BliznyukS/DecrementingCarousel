package autotasks;

public class DecrementingCarousel {
    public DecrementingCarousel(int capacity) {

    }

    public boolean addElement(int element){
        // Добавляет элемент. Если элемент отрицателен или равен нулю, не добавляет его.
        // Если контейнер заполнен, не добавляет элемент. Если метод run был вызван для создания CarouselRun, не добавляет элемент.
        // Если элемент добавлен успешно, возвращает true. В противном случае – false.
        throw new UnsupportedOperationException();
    }

    public CarouselRun run(){
        //     Возвращает CarouselRun для перебора элементов.
        //     Если метод run уже был вызван ранее, он должен вернуть null: DecrementingCarousel может генерировать только один объект CarouselRun.
       throw new UnsupportedOperationException();
    }
}
