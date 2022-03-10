// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Skip error file.
 * 
 */
public final class SkipErrorFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkipErrorFileResponse Empty = new SkipErrorFileResponse();

    /**
     * Skip if source/sink file changed by other concurrent write. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="dataInconsistency")
      private final @Nullable Object dataInconsistency;

    public Optional<Object> getDataInconsistency() {
        return this.dataInconsistency == null ? Optional.empty() : Optional.ofNullable(this.dataInconsistency);
    }

    /**
     * Skip if file is deleted by other client during copy. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="fileMissing")
      private final @Nullable Object fileMissing;

    public Optional<Object> getFileMissing() {
        return this.fileMissing == null ? Optional.empty() : Optional.ofNullable(this.fileMissing);
    }

    public SkipErrorFileResponse(
        @Nullable Object dataInconsistency,
        @Nullable Object fileMissing) {
        this.dataInconsistency = dataInconsistency;
        this.fileMissing = fileMissing;
    }

    private SkipErrorFileResponse() {
        this.dataInconsistency = null;
        this.fileMissing = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkipErrorFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object dataInconsistency;
        private @Nullable Object fileMissing;

        public Builder() {
    	      // Empty
        }

        public Builder(SkipErrorFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataInconsistency = defaults.dataInconsistency;
    	      this.fileMissing = defaults.fileMissing;
        }

        public Builder dataInconsistency(@Nullable Object dataInconsistency) {
            this.dataInconsistency = dataInconsistency;
            return this;
        }

        public Builder fileMissing(@Nullable Object fileMissing) {
            this.fileMissing = fileMissing;
            return this;
        }
        public SkipErrorFileResponse build() {
            return new SkipErrorFileResponse(dataInconsistency, fileMissing);
        }
    }
}
