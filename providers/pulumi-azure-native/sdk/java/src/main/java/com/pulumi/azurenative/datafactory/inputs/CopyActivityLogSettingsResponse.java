// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for copy activity log.
 * 
 */
public final class CopyActivityLogSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CopyActivityLogSettingsResponse Empty = new CopyActivityLogSettingsResponse();

    /**
     * Specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableReliableLogging")
      private final @Nullable Object enableReliableLogging;

    public Optional<Object> enableReliableLogging() {
        return this.enableReliableLogging == null ? Optional.empty() : Optional.ofNullable(this.enableReliableLogging);
    }

    /**
     * Gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Object logLevel;

    public Optional<Object> logLevel() {
        return this.logLevel == null ? Optional.empty() : Optional.ofNullable(this.logLevel);
    }

    public CopyActivityLogSettingsResponse(
        @Nullable Object enableReliableLogging,
        @Nullable Object logLevel) {
        this.enableReliableLogging = enableReliableLogging;
        this.logLevel = logLevel;
    }

    private CopyActivityLogSettingsResponse() {
        this.enableReliableLogging = null;
        this.logLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyActivityLogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object enableReliableLogging;
        private @Nullable Object logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyActivityLogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableReliableLogging = defaults.enableReliableLogging;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder enableReliableLogging(@Nullable Object enableReliableLogging) {
            this.enableReliableLogging = enableReliableLogging;
            return this;
        }
        public Builder logLevel(@Nullable Object logLevel) {
            this.logLevel = logLevel;
            return this;
        }        public CopyActivityLogSettingsResponse build() {
            return new CopyActivityLogSettingsResponse(enableReliableLogging, logLevel);
        }
    }
}
