// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.IPAMPoolProvisionedCidrArgs;
import com.pulumi.awsnative.ec2.inputs.IPAMPoolTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IPAMPoolArgs extends ResourceArgs {

    public static final IPAMPoolArgs Empty = new IPAMPoolArgs();

    /**
     * The address family of the address space in this pool. Either IPv4 or IPv6.
     * 
     */
    @Import(name="addressFamily", required=true)
    private Output<String> addressFamily;

    /**
     * @return The address family of the address space in this pool. Either IPv4 or IPv6.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }

    /**
     * The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
     * 
     */
    @Import(name="allocationDefaultNetmaskLength")
    private @Nullable Output<Integer> allocationDefaultNetmaskLength;

    /**
     * @return The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
     * 
     */
    public Optional<Output<Integer>> allocationDefaultNetmaskLength() {
        return Optional.ofNullable(this.allocationDefaultNetmaskLength);
    }

    /**
     * The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    @Import(name="allocationMaxNetmaskLength")
    private @Nullable Output<Integer> allocationMaxNetmaskLength;

    /**
     * @return The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    public Optional<Output<Integer>> allocationMaxNetmaskLength() {
        return Optional.ofNullable(this.allocationMaxNetmaskLength);
    }

    /**
     * The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    @Import(name="allocationMinNetmaskLength")
    private @Nullable Output<Integer> allocationMinNetmaskLength;

    /**
     * @return The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    public Optional<Output<Integer>> allocationMinNetmaskLength() {
        return Optional.ofNullable(this.allocationMinNetmaskLength);
    }

    /**
     * When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    @Import(name="allocationResourceTags")
    private @Nullable Output<List<IPAMPoolTagArgs>> allocationResourceTags;

    /**
     * @return When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    public Optional<Output<List<IPAMPoolTagArgs>>> allocationResourceTags() {
        return Optional.ofNullable(this.allocationResourceTags);
    }

    /**
     * Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    @Import(name="autoImport")
    private @Nullable Output<Boolean> autoImport;

    /**
     * @return Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    public Optional<Output<Boolean>> autoImport() {
        return Optional.ofNullable(this.autoImport);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Id of the scope this pool is a part of.
     * 
     */
    @Import(name="ipamScopeId", required=true)
    private Output<String> ipamScopeId;

    /**
     * @return The Id of the scope this pool is a part of.
     * 
     */
    public Output<String> ipamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * The region of this pool. If not set, this will default to &#34;None&#34; which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
     * 
     */
    @Import(name="locale")
    private @Nullable Output<String> locale;

    /**
     * @return The region of this pool. If not set, this will default to &#34;None&#34; which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
     * 
     */
    public Optional<Output<String>> locale() {
        return Optional.ofNullable(this.locale);
    }

    /**
     * A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    @Import(name="provisionedCidrs")
    private @Nullable Output<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs;

    /**
     * @return A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    public Optional<Output<List<IPAMPoolProvisionedCidrArgs>>> provisionedCidrs() {
        return Optional.ofNullable(this.provisionedCidrs);
    }

    /**
     * Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
     * 
     */
    @Import(name="publiclyAdvertisable")
    private @Nullable Output<Boolean> publiclyAdvertisable;

    /**
     * @return Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
     * 
     */
    public Optional<Output<Boolean>> publiclyAdvertisable() {
        return Optional.ofNullable(this.publiclyAdvertisable);
    }

    /**
     * The Id of this pool&#39;s source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
     * 
     */
    @Import(name="sourceIpamPoolId")
    private @Nullable Output<String> sourceIpamPoolId;

    /**
     * @return The Id of this pool&#39;s source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
     * 
     */
    public Optional<Output<String>> sourceIpamPoolId() {
        return Optional.ofNullable(this.sourceIpamPoolId);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<IPAMPoolTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<IPAMPoolTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IPAMPoolArgs() {}

    private IPAMPoolArgs(IPAMPoolArgs $) {
        this.addressFamily = $.addressFamily;
        this.allocationDefaultNetmaskLength = $.allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = $.allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = $.allocationMinNetmaskLength;
        this.allocationResourceTags = $.allocationResourceTags;
        this.autoImport = $.autoImport;
        this.description = $.description;
        this.ipamScopeId = $.ipamScopeId;
        this.locale = $.locale;
        this.provisionedCidrs = $.provisionedCidrs;
        this.publiclyAdvertisable = $.publiclyAdvertisable;
        this.sourceIpamPoolId = $.sourceIpamPoolId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAMPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAMPoolArgs $;

        public Builder() {
            $ = new IPAMPoolArgs();
        }

        public Builder(IPAMPoolArgs defaults) {
            $ = new IPAMPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressFamily The address family of the address space in this pool. Either IPv4 or IPv6.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(Output<String> addressFamily) {
            $.addressFamily = addressFamily;
            return this;
        }

        /**
         * @param addressFamily The address family of the address space in this pool. Either IPv4 or IPv6.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(String addressFamily) {
            return addressFamily(Output.of(addressFamily));
        }

        /**
         * @param allocationDefaultNetmaskLength The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
         * 
         * @return builder
         * 
         */
        public Builder allocationDefaultNetmaskLength(@Nullable Output<Integer> allocationDefaultNetmaskLength) {
            $.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }

        /**
         * @param allocationDefaultNetmaskLength The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
         * 
         * @return builder
         * 
         */
        public Builder allocationDefaultNetmaskLength(Integer allocationDefaultNetmaskLength) {
            return allocationDefaultNetmaskLength(Output.of(allocationDefaultNetmaskLength));
        }

        /**
         * @param allocationMaxNetmaskLength The maximum allowed netmask length for allocations made from this pool.
         * 
         * @return builder
         * 
         */
        public Builder allocationMaxNetmaskLength(@Nullable Output<Integer> allocationMaxNetmaskLength) {
            $.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }

        /**
         * @param allocationMaxNetmaskLength The maximum allowed netmask length for allocations made from this pool.
         * 
         * @return builder
         * 
         */
        public Builder allocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
            return allocationMaxNetmaskLength(Output.of(allocationMaxNetmaskLength));
        }

        /**
         * @param allocationMinNetmaskLength The minimum allowed netmask length for allocations made from this pool.
         * 
         * @return builder
         * 
         */
        public Builder allocationMinNetmaskLength(@Nullable Output<Integer> allocationMinNetmaskLength) {
            $.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }

        /**
         * @param allocationMinNetmaskLength The minimum allowed netmask length for allocations made from this pool.
         * 
         * @return builder
         * 
         */
        public Builder allocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
            return allocationMinNetmaskLength(Output.of(allocationMinNetmaskLength));
        }

        /**
         * @param allocationResourceTags When specified, an allocation will not be allowed unless a resource has a matching set of tags.
         * 
         * @return builder
         * 
         */
        public Builder allocationResourceTags(@Nullable Output<List<IPAMPoolTagArgs>> allocationResourceTags) {
            $.allocationResourceTags = allocationResourceTags;
            return this;
        }

        /**
         * @param allocationResourceTags When specified, an allocation will not be allowed unless a resource has a matching set of tags.
         * 
         * @return builder
         * 
         */
        public Builder allocationResourceTags(List<IPAMPoolTagArgs> allocationResourceTags) {
            return allocationResourceTags(Output.of(allocationResourceTags));
        }

        /**
         * @param allocationResourceTags When specified, an allocation will not be allowed unless a resource has a matching set of tags.
         * 
         * @return builder
         * 
         */
        public Builder allocationResourceTags(IPAMPoolTagArgs... allocationResourceTags) {
            return allocationResourceTags(List.of(allocationResourceTags));
        }

        /**
         * @param autoImport Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
         * 
         * @return builder
         * 
         */
        public Builder autoImport(@Nullable Output<Boolean> autoImport) {
            $.autoImport = autoImport;
            return this;
        }

        /**
         * @param autoImport Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
         * 
         * @return builder
         * 
         */
        public Builder autoImport(Boolean autoImport) {
            return autoImport(Output.of(autoImport));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipamScopeId The Id of the scope this pool is a part of.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeId(Output<String> ipamScopeId) {
            $.ipamScopeId = ipamScopeId;
            return this;
        }

        /**
         * @param ipamScopeId The Id of the scope this pool is a part of.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeId(String ipamScopeId) {
            return ipamScopeId(Output.of(ipamScopeId));
        }

        /**
         * @param locale The region of this pool. If not set, this will default to &#34;None&#34; which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
         * 
         * @return builder
         * 
         */
        public Builder locale(@Nullable Output<String> locale) {
            $.locale = locale;
            return this;
        }

        /**
         * @param locale The region of this pool. If not set, this will default to &#34;None&#34; which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
         * 
         * @return builder
         * 
         */
        public Builder locale(String locale) {
            return locale(Output.of(locale));
        }

        /**
         * @param provisionedCidrs A list of cidrs representing the address space available for allocation in this pool.
         * 
         * @return builder
         * 
         */
        public Builder provisionedCidrs(@Nullable Output<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs) {
            $.provisionedCidrs = provisionedCidrs;
            return this;
        }

        /**
         * @param provisionedCidrs A list of cidrs representing the address space available for allocation in this pool.
         * 
         * @return builder
         * 
         */
        public Builder provisionedCidrs(List<IPAMPoolProvisionedCidrArgs> provisionedCidrs) {
            return provisionedCidrs(Output.of(provisionedCidrs));
        }

        /**
         * @param provisionedCidrs A list of cidrs representing the address space available for allocation in this pool.
         * 
         * @return builder
         * 
         */
        public Builder provisionedCidrs(IPAMPoolProvisionedCidrArgs... provisionedCidrs) {
            return provisionedCidrs(List.of(provisionedCidrs));
        }

        /**
         * @param publiclyAdvertisable Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAdvertisable(@Nullable Output<Boolean> publiclyAdvertisable) {
            $.publiclyAdvertisable = publiclyAdvertisable;
            return this;
        }

        /**
         * @param publiclyAdvertisable Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAdvertisable(Boolean publiclyAdvertisable) {
            return publiclyAdvertisable(Output.of(publiclyAdvertisable));
        }

        /**
         * @param sourceIpamPoolId The Id of this pool&#39;s source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpamPoolId(@Nullable Output<String> sourceIpamPoolId) {
            $.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }

        /**
         * @param sourceIpamPoolId The Id of this pool&#39;s source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpamPoolId(String sourceIpamPoolId) {
            return sourceIpamPoolId(Output.of(sourceIpamPoolId));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<IPAMPoolTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<IPAMPoolTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(IPAMPoolTagArgs... tags) {
            return tags(List.of(tags));
        }

        public IPAMPoolArgs build() {
            $.addressFamily = Objects.requireNonNull($.addressFamily, "expected parameter 'addressFamily' to be non-null");
            $.ipamScopeId = Objects.requireNonNull($.ipamScopeId, "expected parameter 'ipamScopeId' to be non-null");
            return $;
        }
    }

}
