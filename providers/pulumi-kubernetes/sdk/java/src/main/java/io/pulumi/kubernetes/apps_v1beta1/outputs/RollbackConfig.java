// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RollbackConfig {
    /**
     * The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    private final @Nullable Integer revision;

    @OutputCustomType.Constructor
    private RollbackConfig(@OutputCustomType.Parameter("revision") @Nullable Integer revision) {
        this.revision = revision;
    }

    /**
     * The revision to rollback to. If set to 0, rollback to the last revision.
     * 
    */
    public Optional<Integer> getRevision() {
        return Optional.ofNullable(this.revision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollbackConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(RollbackConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
        }

        public Builder revision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }
        public RollbackConfig build() {
            return new RollbackConfig(revision);
        }
    }
}
