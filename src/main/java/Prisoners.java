import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prisoners")
public class Prisoners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "alias")
    private String alias;

    @Column(name = "cell_number")
    private int cell_number;

    @Column(name = "execution_date")
    private Date execution_date;

    @Column(name = "final_meal")
    private int final_meal;

    @Column(name = "name")
    private String name;

    public Prisoners() {
    }

    //public Set<LastMeal> getMeals{
    // return meal;}

//    public void getMeals(Set<LastMeal> meals) {
//        this.meal = meals;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getCell_number() {
        return cell_number;
    }

    public void setCell_number(int cell_number) {
        this.cell_number = cell_number;
    }

    public Date getExecution_date() {
        return execution_date;
    }

    public void setExecution_date(Date execution_date) {
        this.execution_date = execution_date;
    }

    public int getFinal_meal() {
        return final_meal;
    }

    public void setFinal_meal(int final_meal) {
        this.final_meal = final_meal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

