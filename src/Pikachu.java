public class Pikachu extends Pokemon implements IElectrico {

  public Pikachu() {}

  @Override
  public void atacarImpacTrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque impactrueno");
  }

  @Override
  public void atacarPunioTrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque puño trueno");
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Pikachu y este es mi ataque placaje");
  }

  @Override
  protected void atacarAraniazo() {
    System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
  }
}
