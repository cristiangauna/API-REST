package com.informatorio.actividadfinal.dto;

public class EventoDTO {
    private Long eventoId;
    private Long suscriptorId;
    
    public Long getEventId() {
        return eventoId;
    }
    public void setEventId(Long eventId) {
        this.eventoId = eventId;
    }
    public Long getSuscriptorId() {
        return suscriptorId;
    }
    public void setSuscriptorId(Long suscriptorId) {
        this.suscriptorId = suscriptorId;
    }
}