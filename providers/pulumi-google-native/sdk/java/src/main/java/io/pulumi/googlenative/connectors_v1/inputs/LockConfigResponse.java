// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Determines whether or no a connection is locked. If locked, a reason must be specified.
 * 
 */
public final class LockConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LockConfigResponse Empty = new LockConfigResponse();

    /**
     * Indicates whether or not the connection is locked.
     * 
     */
    @InputImport(name="locked", required=true)
      private final Boolean locked;

    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * Describes why a connection is locked.
     * 
     */
    @InputImport(name="reason", required=true)
      private final String reason;

    public String getReason() {
        return this.reason;
    }

    public LockConfigResponse(
        Boolean locked,
        String reason) {
        this.locked = Objects.requireNonNull(locked, "expected parameter 'locked' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
    }

    private LockConfigResponse() {
        this.locked = null;
        this.reason = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LockConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean locked;
        private String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(LockConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.reason = defaults.reason;
        }

        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public LockConfigResponse build() {
            return new LockConfigResponse(locked, reason);
        }
    }
}
