// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An address space to be inserted into this pool. All allocations must be made from this address space.
 * 
 */
public final class IPAMPoolProvisionedCidr extends com.pulumi.resources.InvokeArgs {

    public static final IPAMPoolProvisionedCidr Empty = new IPAMPoolProvisionedCidr();

    @Import(name="cidr", required=true)
    private String cidr;

    public String cidr() {
        return this.cidr;
    }

    private IPAMPoolProvisionedCidr() {}

    private IPAMPoolProvisionedCidr(IPAMPoolProvisionedCidr $) {
        this.cidr = $.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAMPoolProvisionedCidr defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAMPoolProvisionedCidr $;

        public Builder() {
            $ = new IPAMPoolProvisionedCidr();
        }

        public Builder(IPAMPoolProvisionedCidr defaults) {
            $ = new IPAMPoolProvisionedCidr(Objects.requireNonNull(defaults));
        }

        public Builder cidr(String cidr) {
            $.cidr = cidr;
            return this;
        }

        public IPAMPoolProvisionedCidr build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            return $;
        }
    }

}
