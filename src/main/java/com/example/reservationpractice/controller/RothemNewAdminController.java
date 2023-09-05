package com.space.haramspring.rothemnew.controller;

import com.space.haramspring.core.common.response.SpaceResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/rothem/admin/v1")
public class RothemNewAdminController {

    @PostMapping("/rooms")
    public ResponseEntity<SpaceResponse> createRoom() {
        log.debug("/rooms - createRoom()");
        return null;
    }

    @PutMapping("/rooms/{roomSeq}")
    public ResponseEntity<SpaceResponse> updateRoom(@PathVariable Long roomSeq) {
        log.debug("/rooms - updateRoom()");
        return null;
    }

    @DeleteMapping("/rooms/{roomSeq}")
    public ResponseEntity<SpaceResponse> deleteRoom(@PathVariable Long roomSeq) {
        log.debug("/rooms - deleteRoom()");
        return null;
    }

    @GetMapping("/rooms/{roomSeq}")
    public ResponseEntity<SpaceResponse> getRoom(@PathVariable Long roomSeq) {
        log.debug("/rooms - getRoom()");
        return null;
    }

    @GetMapping("/rooms")
    public ResponseEntity<SpaceResponse> getRooms() {
        log.debug("/rooms - getRooms()");
        return null;
    }


    @PostMapping("/times")
    public ResponseEntity<SpaceResponse> createTime() {
        log.debug("/times - createTime()");
        return null;
    }

    @PutMapping("/times/{timeSeq}")
    public ResponseEntity<SpaceResponse> updateTime(@PathVariable Long timeSeq) {
        log.debug("/times - updateTime()");
        return null;
    }

    @DeleteMapping("/times/{timeSeq}")
    public ResponseEntity<SpaceResponse> deleteTime(@PathVariable Long timeSeq) {
        log.debug("/times - deleteTime()");
        return null;
    }

    @GetMapping("/times/{timeSeq}")
    public ResponseEntity<SpaceResponse> getTime(@PathVariable Long timeSeq) {
        log.debug("/times - getTime()");
        return null;
    }

    @GetMapping("/times")
    public ResponseEntity<SpaceResponse> getTimes() {
        log.debug("/times - getTimes()");
        return null;
    }

    @PostMapping("/times/un-available")
    public ResponseEntity<SpaceResponse> setTimesStatus() {
        log.debug("/times/un-available - setTimesStatus()");
        return null;
    }


    @PostMapping("/policies")
    public ResponseEntity<SpaceResponse> createPolicy() {
        log.debug("/policies - createPolicy()");
        return null;
    }

    @PutMapping("/policies/{policySeq}")
    public ResponseEntity<SpaceResponse> updatePolicy(@PathVariable Long policySeq) {
        log.debug("/policies - updatePolicy()");
        return null;
    }

    @DeleteMapping("/policies/{policySeq}")
    public ResponseEntity<SpaceResponse> deletePolicy(@PathVariable Long policySeq) {
        log.debug("/policies - deletePolicy()");
        return null;
    }

    @GetMapping("/policies")
    public ResponseEntity<SpaceResponse> getPolicies() {
        log.debug("/policies - getPolicies()");
        return null;
    }


    @PostMapping("/notices")
    public ResponseEntity<SpaceResponse> createNotice() {
        log.debug("/notices - createNotice()");
        return null;
    }

    @PutMapping("/notices/{noticeSeq}")
    public ResponseEntity<SpaceResponse> updateNotice(@PathVariable Long noticeSeq) {
        log.debug("/notices - updateNotice()");
        return null;
    }

    @DeleteMapping("/notices/{noticeSeq}")
    public ResponseEntity<SpaceResponse> deleteNotice(@PathVariable Long noticeSeq) {
        log.debug("/notices - deleteNotice()");
        return null;
    }

    @GetMapping("/notices/{noticeSeq}")
    public ResponseEntity<SpaceResponse> getNotice(@PathVariable Long noticeSeq) {
        log.debug("/notices - getNotice()");
        return null;
    }

    @GetMapping("/notices")
    public ResponseEntity<SpaceResponse> getNotices() {
        log.debug("/notices - getNotices()");
        return null;
    }
}
