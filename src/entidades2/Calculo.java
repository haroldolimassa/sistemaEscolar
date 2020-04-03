package entidades2;
public class Calculo {
public String materia;
public double unidade1;
public double unidade2;
public double unidade3;
public double unidade4;
public double media;
public double finalGrade() {
return unidade1 + unidade2 + unidade3 + unidade4;

}
public double mediaCL() {
return media;
}

public double missingPoints() {
if (finalGrade() < mediaCL()) {
return mediaCL() - finalGrade();
}
else {
return 0.0;
}
}
}