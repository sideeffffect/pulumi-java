// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of NetWorkRuleSet - IpRules resource.
 * 
 */
public final class NWRuleSetIpRulesResponse extends io.pulumi.resources.InvokeArgs {

    public static final NWRuleSetIpRulesResponse Empty = new NWRuleSetIpRulesResponse();

    /**
     * The IP Filter Action
     * 
     */
    @InputImport(name="action")
      private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * IP Mask
     * 
     */
    @InputImport(name="ipMask")
      private final @Nullable String ipMask;

    public Optional<String> getIpMask() {
        return this.ipMask == null ? Optional.empty() : Optional.ofNullable(this.ipMask);
    }

    public NWRuleSetIpRulesResponse(
        @Nullable String action,
        @Nullable String ipMask) {
        this.action = action == null ? "Allow" : action;
        this.ipMask = ipMask;
    }

    private NWRuleSetIpRulesResponse() {
        this.action = null;
        this.ipMask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetIpRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetIpRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder ipMask(@Nullable String ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public NWRuleSetIpRulesResponse build() {
            return new NWRuleSetIpRulesResponse(action, ipMask);
        }
    }
}
