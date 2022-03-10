// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataMaskingEntityResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataMaskingEntityResponse Empty = new DataMaskingEntityResponse();

    /**
     * Data masking mode.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The name of an entity to mask (e.g. a name of a header or a query parameter).
     * 
     */
    @InputImport(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public DataMaskingEntityResponse(
        @Nullable String mode,
        @Nullable String value) {
        this.mode = mode;
        this.value = value;
    }

    private DataMaskingEntityResponse() {
        this.mode = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataMaskingEntityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DataMaskingEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.value = defaults.value;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public DataMaskingEntityResponse build() {
            return new DataMaskingEntityResponse(mode, value);
        }
    }
}
