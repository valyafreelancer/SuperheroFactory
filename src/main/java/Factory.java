import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Factory {

    enum Label {MARVEL, DC};
    private String name;
    private int Strong;
    private Label label;



}
