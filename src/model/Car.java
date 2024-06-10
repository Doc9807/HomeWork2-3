package model;

public class Car extends Transport {
    public Car(String modelName) {
        super(modelName, 4);
    }
    // Тут специально убрано "int wheelsCount" потому что я согласен с логикой лектора, машина всегда имеет 4 колеса,
    // ну как минимум в 90% случаев.

    private void checkEngine() {
        System.out.println("Проверяем двигатель\n");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
