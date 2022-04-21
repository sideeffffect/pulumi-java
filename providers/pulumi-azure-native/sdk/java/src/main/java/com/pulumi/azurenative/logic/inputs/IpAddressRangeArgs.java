// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ip address range.
 * 
 */
public final class IpAddressRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpAddressRangeArgs Empty = new IpAddressRangeArgs();

    /**
     * The IP address range.
     * 
     */
    @Import(name="addressRange")
    private @Nullable Output<String> addressRange;

    public Optional<Output<String>> addressRange() {
        return Optional.ofNullable(this.addressRange);
    }

    private IpAddressRangeArgs() {}

    private IpAddressRangeArgs(IpAddressRangeArgs $) {
        this.addressRange = $.addressRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpAddressRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpAddressRangeArgs $;

        public Builder() {
            $ = new IpAddressRangeArgs();
        }

        public Builder(IpAddressRangeArgs defaults) {
            $ = new IpAddressRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder addressRange(@Nullable Output<String> addressRange) {
            $.addressRange = addressRange;
            return this;
        }

        public Builder addressRange(String addressRange) {
            return addressRange(Output.of(addressRange));
        }

        public IpAddressRangeArgs build() {
            return $;
        }
    }

}
