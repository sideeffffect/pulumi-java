// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An address space to be inserted into this pool. All allocations must be made from this address space.
 * 
 */
public final class IPAMPoolProvisionedCidr extends io.pulumi.resources.InvokeArgs {

    public static final IPAMPoolProvisionedCidr Empty = new IPAMPoolProvisionedCidr();

    @InputImport(name="cidr", required=true)
      private final String cidr;

    public String getCidr() {
        return this.cidr;
    }

    public IPAMPoolProvisionedCidr(String cidr) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
    }

    private IPAMPoolProvisionedCidr() {
        this.cidr = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMPoolProvisionedCidr defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMPoolProvisionedCidr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public IPAMPoolProvisionedCidr build() {
            return new IPAMPoolProvisionedCidr(cidr);
        }
    }
}
