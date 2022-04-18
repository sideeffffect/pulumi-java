// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.enums.LogConfigDataAccessOptionsLogMode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigDataAccessOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogConfigDataAccessOptionsArgs Empty = new LogConfigDataAccessOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logMode")
      private final @Nullable Output<LogConfigDataAccessOptionsLogMode> logMode;

    public Output<LogConfigDataAccessOptionsLogMode> logMode() {
        return this.logMode == null ? Codegen.empty() : this.logMode;
    }

    public LogConfigDataAccessOptionsArgs(@Nullable Output<LogConfigDataAccessOptionsLogMode> logMode) {
        this.logMode = logMode;
    }

    private LogConfigDataAccessOptionsArgs() {
        this.logMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigDataAccessOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LogConfigDataAccessOptionsLogMode> logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigDataAccessOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder logMode(@Nullable Output<LogConfigDataAccessOptionsLogMode> logMode) {
            this.logMode = logMode;
            return this;
        }
        public Builder logMode(@Nullable LogConfigDataAccessOptionsLogMode logMode) {
            this.logMode = Codegen.ofNullable(logMode);
            return this;
        }        public LogConfigDataAccessOptionsArgs build() {
            return new LogConfigDataAccessOptionsArgs(logMode);
        }
    }
}
