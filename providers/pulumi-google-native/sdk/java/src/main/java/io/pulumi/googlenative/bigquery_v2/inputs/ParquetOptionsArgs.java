// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParquetOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParquetOptionsArgs Empty = new ParquetOptionsArgs();

    /**
     * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.
     * 
     */
    @InputImport(name="enableListInference")
      private final @Nullable Input<Boolean> enableListInference;

    public Input<Boolean> getEnableListInference() {
        return this.enableListInference == null ? Input.empty() : this.enableListInference;
    }

    /**
     * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
     * 
     */
    @InputImport(name="enumAsString")
      private final @Nullable Input<Boolean> enumAsString;

    public Input<Boolean> getEnumAsString() {
        return this.enumAsString == null ? Input.empty() : this.enumAsString;
    }

    public ParquetOptionsArgs(
        @Nullable Input<Boolean> enableListInference,
        @Nullable Input<Boolean> enumAsString) {
        this.enableListInference = enableListInference;
        this.enumAsString = enumAsString;
    }

    private ParquetOptionsArgs() {
        this.enableListInference = Input.empty();
        this.enumAsString = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableListInference;
        private @Nullable Input<Boolean> enumAsString;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableListInference = defaults.enableListInference;
    	      this.enumAsString = defaults.enumAsString;
        }

        public Builder enableListInference(@Nullable Input<Boolean> enableListInference) {
            this.enableListInference = enableListInference;
            return this;
        }

        public Builder enableListInference(@Nullable Boolean enableListInference) {
            this.enableListInference = Input.ofNullable(enableListInference);
            return this;
        }

        public Builder enumAsString(@Nullable Input<Boolean> enumAsString) {
            this.enumAsString = enumAsString;
            return this;
        }

        public Builder enumAsString(@Nullable Boolean enumAsString) {
            this.enumAsString = Input.ofNullable(enumAsString);
            return this;
        }
        public ParquetOptionsArgs build() {
            return new ParquetOptionsArgs(enableListInference, enumAsString);
        }
    }
}
