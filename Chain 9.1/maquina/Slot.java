package maquina;

public interface Slot {
	String getNomeSlot();
	void processar(Moeda moeda);
	void setSlot(Slot slot);
}
