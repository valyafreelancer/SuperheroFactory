import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Superheroes {

    enum Label {MARVEL, DC};
    private String name;
    private int Strong;
    private Label label;


    private void batman() {
        Superheroes superhero1 = new Superheroes();
        superhero1.setName("Batman");
        superhero1.setStrong(8);
        superhero1.setLabel(Label.DC);
        System.out.println(superhero1 + "High intelligence, martial arts");



    }

}
