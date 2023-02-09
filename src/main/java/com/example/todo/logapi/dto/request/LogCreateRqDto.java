package com.example.todo.logapi.dto.request;


import com.example.todo.logapi.entity.LogEntity;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class LogCreateRqDto {

    private String projectId;
    private String logTitle;
    private String logContent;
    private String todoId;
    private String userId;

    public LogEntity toEntity(){
        return LogEntity.builder()
                .userId(this.userId)
                .title(this.logTitle)
                .contents(this.logContent)
                .todoId(this.todoId)
                .build();
    }
}
