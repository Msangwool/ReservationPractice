package com.space.haramspring.rothemnew.controller;

import com.space.haramspring.core.common.response.SpaceResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/rothem/v1")
public class RothemUserController {

    @GetMapping("/homes")
    public ResponseEntity<SpaceResponse> getMainInfo() {
        log.debug("/homes - getMainInfo()");
        return null;
    }

    @PostMapping("/reservations")
    public ResponseEntity<SpaceResponse> createReservation() {
        log.debug("/reservations - createReservation()");
        return null;
    }

    @GetMapping("/reservations/{id}")
    public ResponseEntity<SpaceResponse> getReservationInfo(@PathVariable("id") Long reservationsSeq) {
        log.debug("/reservations - getReservationInfo()");
        return null;
    }

    @GetMapping("/notices/{id}")
    public ResponseEntity<SpaceResponse> getNoticeInfo(@PathVariable("id") Long noticeSeq) {
        log.debug("/notices - getNoticeInfo()");
        return null;
    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<SpaceResponse> getRoomInfo(@PathVariable("id") Long roomSeq) {
        log.debug("/rooms - getRoomInfo()");
        return null;
    }
}
