package ru.team.up.dto;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

import java.util.Set;

/**
 * Класс для передачи данных события
 */

@Data
@Builder
public class EventDto {
    /**
     * Первичный ключ
     */
    private Long id;

    /**
     * Название мероприятия
     */
    private String eventName;

    /**
     * Описание мероприятий
     */
    private String descriptionEvent;

    /**
     * Место проведения мероприятия
     */
    private String placeEvent;

    /**
     * Время проведения мероприятия
     */
    private LocalDateTime timeEvent;


    /**
     * Приватность мероприятия
     */
    private Boolean eventPrivacy;

    /**
     * Количество участников
     */
    private Long eventNumberOfParticipant;

    /**
     * Тип мероприятия
     */
    private EventTypeDto eventType;

    /**
     * Создатель мероприятия
     */
    private Long authorId;

    /**
     * С какими интересами связанно мероприятие
     */
    private Set<InterestsDto> eventInterests;

    /**
     * Статус мероприятия (модерация, доступно и т.д.)
     */
    private StatusDto status;
}
