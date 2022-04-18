// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VM inventory details.
 * 
 */
public final class OSPolicyAssignmentInstanceFilterInventoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyAssignmentInstanceFilterInventoryResponse Empty = new OSPolicyAssignmentInstanceFilterInventoryResponse();

    /**
     * The OS short name
     * 
     */
    @Import(name="osShortName", required=true)
      private final String osShortName;

    public String osShortName() {
        return this.osShortName;
    }

    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    @Import(name="osVersion", required=true)
      private final String osVersion;

    public String osVersion() {
        return this.osVersion;
    }

    public OSPolicyAssignmentInstanceFilterInventoryResponse(
        String osShortName,
        String osVersion) {
        this.osShortName = Objects.requireNonNull(osShortName, "expected parameter 'osShortName' to be non-null");
        this.osVersion = Objects.requireNonNull(osVersion, "expected parameter 'osVersion' to be non-null");
    }

    private OSPolicyAssignmentInstanceFilterInventoryResponse() {
        this.osShortName = null;
        this.osVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentInstanceFilterInventoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osShortName;
        private String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentInstanceFilterInventoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }        public OSPolicyAssignmentInstanceFilterInventoryResponse build() {
            return new OSPolicyAssignmentInstanceFilterInventoryResponse(osShortName, osVersion);
        }
    }
}
