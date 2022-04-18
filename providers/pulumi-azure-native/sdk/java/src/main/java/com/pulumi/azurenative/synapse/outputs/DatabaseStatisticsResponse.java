// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseStatisticsResponse {
    /**
     * The database size - the total size of compressed data and index in bytes.
     * 
     */
    private final @Nullable Double size;

    @CustomType.Constructor
    private DatabaseStatisticsResponse(@CustomType.Parameter("size") @Nullable Double size) {
        this.size = size;
    }

    /**
     * The database size - the total size of compressed data and index in bytes.
     * 
    */
    public Optional<Double> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double size;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
        }

        public Builder size(@Nullable Double size) {
            this.size = size;
            return this;
        }        public DatabaseStatisticsResponse build() {
            return new DatabaseStatisticsResponse(size);
        }
    }
}
