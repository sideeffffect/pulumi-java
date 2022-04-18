// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.Action;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP rule with specific IP or IP range in CIDR format.
 * 
 */
public final class IPRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPRuleArgs Empty = new IPRuleArgs();

    /**
     * The action of IP ACL rule.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Either<String,Action>> action;

    public Output<Either<String,Action>> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    @Import(name="iPAddressOrRange", required=true)
      private final Output<String> iPAddressOrRange;

    public Output<String> iPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    public IPRuleArgs(
        @Nullable Output<Either<String,Action>> action,
        Output<String> iPAddressOrRange) {
        this.action = action == null ? Output.ofLeft("Allow") : action;
        this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange, "expected parameter 'iPAddressOrRange' to be non-null");
    }

    private IPRuleArgs() {
        this.action = Codegen.empty();
        this.iPAddressOrRange = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Action>> action;
        private Output<String> iPAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IPRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
        }

        public Builder action(@Nullable Output<Either<String,Action>> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable Either<String,Action> action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder iPAddressOrRange(Output<String> iPAddressOrRange) {
            this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange);
            return this;
        }
        public Builder iPAddressOrRange(String iPAddressOrRange) {
            this.iPAddressOrRange = Output.of(Objects.requireNonNull(iPAddressOrRange));
            return this;
        }        public IPRuleArgs build() {
            return new IPRuleArgs(action, iPAddressOrRange);
        }
    }
}
