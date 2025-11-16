
package entities;

import java.time.LocalDate;

public class Mascota {
    
    private Long id; 
    private boolean eliminado; 
    private String nombre; 
    private String especie; 
    private String raza; 
    private LocalDate fechaNacimiento; 
    private String duenio; 
    private Microchip microchip;
    
    public Mascota() {} 
    
    public Mascota(Long id, String nombre, String especie, String raza, LocalDate fechaNacimiento, String duenio, Microchip microchip, boolean eliminado) { 
        
        this.id = id; 
        this.nombre = nombre; 
        this.especie = especie; 
        this.raza = raza; 
        this.fechaNacimiento = fechaNacimiento;
        this.duenio = duenio; 
        this.microchip = microchip; 
        this.eliminado = eliminado; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("La especie no puede estar vacía");
            }
         this.especie = especie.trim();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.isBlank()) {
            throw new IllegalArgumentException("La raza no puede estar vacía");
            }
        this.raza = raza.trim();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento != null && fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura");
            }
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        if (duenio == null || duenio.isBlank()) {
            throw new IllegalArgumentException("La mascota debe tener un duenio");
            }
        this.duenio = duenio.trim();
    }

    public Microchip getMicrochip() {
        return microchip;
    }

    public void setMicrochip(Microchip microchip) {
        this.microchip = microchip;
    }

    @Override
    public String toString() {
        return "Mascota{" + "Id = " + id + ", Eliminado = " + eliminado + ", Nombre = " + nombre + ", Especie = " + especie + ", Raza = " + raza + ", Fecha Nacimiento = " + fechaNacimiento + ", Duenio = " + duenio + ", Microchip = " + microchip + '}';
    }
    
    
}
