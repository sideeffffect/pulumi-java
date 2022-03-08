// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyRuleSecureTagResponse {
    /**
     * Name of the secure tag, created with TagManager's TagValue API.
     * 
     */
    private final String name;
    /**
     * State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"name","state"})
    private FirewallPolicyRuleSecureTagResponse(
        String name,
        String state) {
        this.name = name;
        this.state = state;
    }

    /**
     * Name of the secure tag, created with TagManager's TagValue API.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleSecureTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleSecureTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public FirewallPolicyRuleSecureTagResponse build() {
            return new FirewallPolicyRuleSecureTagResponse(name, state);
        }
    }
}
