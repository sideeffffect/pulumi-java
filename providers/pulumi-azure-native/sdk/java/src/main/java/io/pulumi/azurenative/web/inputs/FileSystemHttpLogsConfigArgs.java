// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Http logs to file system configuration.
 * 
 */
public final class FileSystemHttpLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemHttpLogsConfigArgs Empty = new FileSystemHttpLogsConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     * 
     */
    @InputImport(name="retentionInDays")
      private final @Nullable Input<Integer> retentionInDays;

    public Input<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Input.empty() : this.retentionInDays;
    }

    /**
     * Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     * 
     */
    @InputImport(name="retentionInMb")
      private final @Nullable Input<Integer> retentionInMb;

    public Input<Integer> getRetentionInMb() {
        return this.retentionInMb == null ? Input.empty() : this.retentionInMb;
    }

    public FileSystemHttpLogsConfigArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> retentionInDays,
        @Nullable Input<Integer> retentionInMb) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
        this.retentionInMb = retentionInMb;
    }

    private FileSystemHttpLogsConfigArgs() {
        this.enabled = Input.empty();
        this.retentionInDays = Input.empty();
        this.retentionInMb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemHttpLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> retentionInDays;
        private @Nullable Input<Integer> retentionInMb;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemHttpLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.retentionInMb = defaults.retentionInMb;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder retentionInDays(@Nullable Input<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Input.ofNullable(retentionInDays);
            return this;
        }

        public Builder retentionInMb(@Nullable Input<Integer> retentionInMb) {
            this.retentionInMb = retentionInMb;
            return this;
        }

        public Builder retentionInMb(@Nullable Integer retentionInMb) {
            this.retentionInMb = Input.ofNullable(retentionInMb);
            return this;
        }
        public FileSystemHttpLogsConfigArgs build() {
            return new FileSystemHttpLogsConfigArgs(enabled, retentionInDays, retentionInMb);
        }
    }
}
