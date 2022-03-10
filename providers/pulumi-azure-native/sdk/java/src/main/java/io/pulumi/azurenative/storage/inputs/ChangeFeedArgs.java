// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The blob service properties for change feed events.
 * 
 */
public final class ChangeFeedArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChangeFeedArgs Empty = new ChangeFeedArgs();

    /**
     * Indicates whether change feed event logging is enabled for the Blob service.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Indicates the duration of changeFeed retention in days. Minimum value is 1 day and maximum value is 146000 days (400 years). A null value indicates an infinite retention of the change feed.
     * 
     */
    @InputImport(name="retentionInDays")
      private final @Nullable Input<Integer> retentionInDays;

    public Input<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Input.empty() : this.retentionInDays;
    }

    public ChangeFeedArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> retentionInDays) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
    }

    private ChangeFeedArgs() {
        this.enabled = Input.empty();
        this.retentionInDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChangeFeedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> retentionInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(ChangeFeedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
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
        public ChangeFeedArgs build() {
            return new ChangeFeedArgs(enabled, retentionInDays);
        }
    }
}
