package edu.oregonstate.mist.positions

import com.fasterxml.jackson.annotation.JsonProperty
import edu.oregonstate.mist.api.Configuration
import io.dropwizard.db.DataSourceFactory

import javax.validation.Valid
import javax.validation.constraints.NotNull

class PositionsConfiguration extends Configuration {
    @JsonProperty("database")
    DataSourceFactory database = new DataSourceFactory()

    @NotNull
    @JsonProperty
    @Valid
    Boolean useTestDAO
}
