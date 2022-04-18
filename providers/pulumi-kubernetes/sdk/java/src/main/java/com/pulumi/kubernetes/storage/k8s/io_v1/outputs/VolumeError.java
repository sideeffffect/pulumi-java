// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeError {
    /**
     * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    private final @Nullable String message;
    /**
     * Time the error was encountered.
     * 
     */
    private final @Nullable String time;

    @CustomType.Constructor
    private VolumeError(
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("time") @Nullable String time) {
        this.message = message;
        this.time = time;
    }

    /**
     * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Time the error was encountered.
     * 
    */
    public Optional<String> time() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String time;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder time(@Nullable String time) {
            this.time = time;
            return this;
        }        public VolumeError build() {
            return new VolumeError(message, time);
        }
    }
}
