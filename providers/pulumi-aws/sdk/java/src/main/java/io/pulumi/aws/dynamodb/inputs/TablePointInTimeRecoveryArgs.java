// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class TablePointInTimeRecoveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TablePointInTimeRecoveryArgs Empty = new TablePointInTimeRecoveryArgs();

    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public TablePointInTimeRecoveryArgs(Input<Boolean> enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private TablePointInTimeRecoveryArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TablePointInTimeRecoveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(TablePointInTimeRecoveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }
        public TablePointInTimeRecoveryArgs build() {
            return new TablePointInTimeRecoveryArgs(enabled);
        }
    }
}
