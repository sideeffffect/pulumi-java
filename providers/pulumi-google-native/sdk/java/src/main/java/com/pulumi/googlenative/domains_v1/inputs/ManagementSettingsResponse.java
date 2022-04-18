// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines renewal, billing, and transfer settings for a `Registration`.
 * 
 */
public final class ManagementSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementSettingsResponse Empty = new ManagementSettingsResponse();

    /**
     * The renewal method for this `Registration`.
     * 
     */
    @Import(name="renewalMethod", required=true)
      private final String renewalMethod;

    public String renewalMethod() {
        return this.renewalMethod;
    }

    /**
     * Controls whether the domain can be transferred to another registrar.
     * 
     */
    @Import(name="transferLockState", required=true)
      private final String transferLockState;

    public String transferLockState() {
        return this.transferLockState;
    }

    public ManagementSettingsResponse(
        String renewalMethod,
        String transferLockState) {
        this.renewalMethod = Objects.requireNonNull(renewalMethod, "expected parameter 'renewalMethod' to be non-null");
        this.transferLockState = Objects.requireNonNull(transferLockState, "expected parameter 'transferLockState' to be non-null");
    }

    private ManagementSettingsResponse() {
        this.renewalMethod = null;
        this.transferLockState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String renewalMethod;
        private String transferLockState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.renewalMethod = defaults.renewalMethod;
    	      this.transferLockState = defaults.transferLockState;
        }

        public Builder renewalMethod(String renewalMethod) {
            this.renewalMethod = Objects.requireNonNull(renewalMethod);
            return this;
        }
        public Builder transferLockState(String transferLockState) {
            this.transferLockState = Objects.requireNonNull(transferLockState);
            return this;
        }        public ManagementSettingsResponse build() {
            return new ManagementSettingsResponse(renewalMethod, transferLockState);
        }
    }
}
