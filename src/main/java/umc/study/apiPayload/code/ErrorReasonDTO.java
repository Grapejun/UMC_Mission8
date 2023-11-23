package umc.study.apiPayload.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorReasonDTO {

    private HttpStatus httpStatus;


    private String code;
    private String message;
    private boolean isSuccess;
}
