package tw.gaas.yugioh.model.resp

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import lombok.Data
import org.springframework.validation.annotation.Validated
import tw.gaas.yugioh.model.dto.Game
import java.util.*

/**
 * 取得指定的對局
 */
@Validated
@Data
class GetSpecifiedGameResp {
    /**
     * Get game
     * @return game
     */
    @get:Schema(description = "對局")
    @JsonProperty("id")
    var game: Game? = null
}
