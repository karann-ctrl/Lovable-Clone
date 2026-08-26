package com.karan.project.lovable_clone.dto.member;

import com.karan.project.lovable_clone.Enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
