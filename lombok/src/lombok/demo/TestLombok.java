package lombok.demo;


import lombok.*;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
//@RequiredArgsConstructor(staticName = "of")
@Builder
public class TestLombok {
   @NonNull private String name;
    private Integer age;
}
