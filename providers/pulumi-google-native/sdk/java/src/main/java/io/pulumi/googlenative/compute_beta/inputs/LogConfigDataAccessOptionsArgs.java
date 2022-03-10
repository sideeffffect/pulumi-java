// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.LogConfigDataAccessOptionsLogMode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigDataAccessOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigDataAccessOptionsArgs Empty = new LogConfigDataAccessOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="logMode")
      private final @Nullable Input<LogConfigDataAccessOptionsLogMode> logMode;

    public Input<LogConfigDataAccessOptionsLogMode> getLogMode() {
        return this.logMode == null ? Input.empty() : this.logMode;
    }

    public LogConfigDataAccessOptionsArgs(@Nullable Input<LogConfigDataAccessOptionsLogMode> logMode) {
        this.logMode = logMode;
    }

    private LogConfigDataAccessOptionsArgs() {
        this.logMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigDataAccessOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LogConfigDataAccessOptionsLogMode> logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigDataAccessOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder logMode(@Nullable Input<LogConfigDataAccessOptionsLogMode> logMode) {
            this.logMode = logMode;
            return this;
        }

        public Builder logMode(@Nullable LogConfigDataAccessOptionsLogMode logMode) {
            this.logMode = Input.ofNullable(logMode);
            return this;
        }
        public LogConfigDataAccessOptionsArgs build() {
            return new LogConfigDataAccessOptionsArgs(logMode);
        }
    }
}
