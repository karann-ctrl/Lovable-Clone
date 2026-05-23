package com.karan.project.lovable_clone.dto.member;

import com.karan.project.lovable_clone.Enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
