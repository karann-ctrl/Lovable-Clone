package com.karan.project.lovable_clone.entity;

import com.karan.project.lovable_clone.Enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession chatSession;

    String content;
    String toolCalls; // JSON array of tools called

    MessageRole role;

    Integer tokensUsed;
    Instant createdAt;
}
