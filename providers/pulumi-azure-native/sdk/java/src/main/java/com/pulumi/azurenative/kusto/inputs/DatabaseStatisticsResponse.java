// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A class that contains database statistics information.
 * 
 */
public final class DatabaseStatisticsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabaseStatisticsResponse Empty = new DatabaseStatisticsResponse();

    /**
     * The database size - the total size of compressed data and index in bytes.
     * 
     */
    @Import(name="size")
    private @Nullable Double size;

    public Optional<Double> size() {
        return Optional.ofNullable(this.size);
    }

    private DatabaseStatisticsResponse() {}

    private DatabaseStatisticsResponse(DatabaseStatisticsResponse $) {
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseStatisticsResponse $;

        public Builder() {
            $ = new DatabaseStatisticsResponse();
        }

        public Builder(DatabaseStatisticsResponse defaults) {
            $ = new DatabaseStatisticsResponse(Objects.requireNonNull(defaults));
        }

        public Builder size(@Nullable Double size) {
            $.size = size;
            return this;
        }

        public DatabaseStatisticsResponse build() {
            return $;
        }
    }

}
