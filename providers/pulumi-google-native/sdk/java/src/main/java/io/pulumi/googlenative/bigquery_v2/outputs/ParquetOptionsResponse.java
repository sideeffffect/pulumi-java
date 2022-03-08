// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ParquetOptionsResponse {
    /**
     * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.
     * 
     */
    private final Boolean enableListInference;
    /**
     * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
     * 
     */
    private final Boolean enumAsString;

    @OutputCustomType.Constructor({"enableListInference","enumAsString"})
    private ParquetOptionsResponse(
        Boolean enableListInference,
        Boolean enumAsString) {
        this.enableListInference = enableListInference;
        this.enumAsString = enumAsString;
    }

    /**
     * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.
     * 
    */
    public Boolean getEnableListInference() {
        return this.enableListInference;
    }
    /**
     * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
     * 
    */
    public Boolean getEnumAsString() {
        return this.enumAsString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableListInference;
        private Boolean enumAsString;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableListInference = defaults.enableListInference;
    	      this.enumAsString = defaults.enumAsString;
        }

        public Builder setEnableListInference(Boolean enableListInference) {
            this.enableListInference = Objects.requireNonNull(enableListInference);
            return this;
        }

        public Builder setEnumAsString(Boolean enumAsString) {
            this.enumAsString = Objects.requireNonNull(enumAsString);
            return this;
        }
        public ParquetOptionsResponse build() {
            return new ParquetOptionsResponse(enableListInference, enumAsString);
        }
    }
}
