// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.NfsAccessRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of rules describing access policies applied to NFSv3 clients of the cache.
 * 
 */
public final class NfsAccessPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final NfsAccessPolicyResponse Empty = new NfsAccessPolicyResponse();

    /**
     * The set of rules describing client accesses allowed under this policy.
     * 
     */
    @InputImport(name="accessRules", required=true)
      private final List<NfsAccessRuleResponse> accessRules;

    public List<NfsAccessRuleResponse> getAccessRules() {
        return this.accessRules;
    }

    /**
     * Name identifying this policy. Access Policy names are not case sensitive.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public NfsAccessPolicyResponse(
        List<NfsAccessRuleResponse> accessRules,
        String name) {
        this.accessRules = Objects.requireNonNull(accessRules, "expected parameter 'accessRules' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private NfsAccessPolicyResponse() {
        this.accessRules = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NfsAccessRuleResponse> accessRules;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsAccessPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRules = defaults.accessRules;
    	      this.name = defaults.name;
        }

        public Builder accessRules(List<NfsAccessRuleResponse> accessRules) {
            this.accessRules = Objects.requireNonNull(accessRules);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public NfsAccessPolicyResponse build() {
            return new NfsAccessPolicyResponse(accessRules, name);
        }
    }
}
