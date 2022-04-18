// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common settings field for backup management
 * 
 */
public final class SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingsArgs Empty = new SettingsArgs();

    /**
     * Workload compression flag. This has been added so that 'isSqlCompression'
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    @Import(name="isCompression")
      private final @Nullable Output<Boolean> isCompression;

    public Output<Boolean> isCompression() {
        return this.isCompression == null ? Codegen.empty() : this.isCompression;
    }

    /**
     * SQL compression flag
     * 
     */
    @Import(name="issqlcompression")
      private final @Nullable Output<Boolean> issqlcompression;

    public Output<Boolean> issqlcompression() {
        return this.issqlcompression == null ? Codegen.empty() : this.issqlcompression;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    public SettingsArgs(
        @Nullable Output<Boolean> isCompression,
        @Nullable Output<Boolean> issqlcompression,
        @Nullable Output<String> timeZone) {
        this.isCompression = isCompression;
        this.issqlcompression = issqlcompression;
        this.timeZone = timeZone;
    }

    private SettingsArgs() {
        this.isCompression = Codegen.empty();
        this.issqlcompression = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isCompression;
        private @Nullable Output<Boolean> issqlcompression;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCompression = defaults.isCompression;
    	      this.issqlcompression = defaults.issqlcompression;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder isCompression(@Nullable Output<Boolean> isCompression) {
            this.isCompression = isCompression;
            return this;
        }
        public Builder isCompression(@Nullable Boolean isCompression) {
            this.isCompression = Codegen.ofNullable(isCompression);
            return this;
        }
        public Builder issqlcompression(@Nullable Output<Boolean> issqlcompression) {
            this.issqlcompression = issqlcompression;
            return this;
        }
        public Builder issqlcompression(@Nullable Boolean issqlcompression) {
            this.issqlcompression = Codegen.ofNullable(issqlcompression);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }        public SettingsArgs build() {
            return new SettingsArgs(isCompression, issqlcompression, timeZone);
        }
    }
}
