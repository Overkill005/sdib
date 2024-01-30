interface agenda1 {
  void task1(); //public by default
}

interface agenda2 {
  void task2();
}

class interfaceConcept implements agenda1, agenda2 {

  public void task1() { //so need to use public here
    System.out.println("Task1 done");
  }

  public void task2() {
    System.out.println("Task2 done");
  }

  public static void main(String[] args) {
    interfaceConcept i = new interfaceConcept();
    i.task1();
    i.task2();
  }
}
