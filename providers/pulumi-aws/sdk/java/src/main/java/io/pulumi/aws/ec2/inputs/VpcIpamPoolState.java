// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamPoolState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolState Empty = new VpcIpamPoolState();

    /**
     * The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * 
     */
    @InputImport(name="addressFamily")
      private final @Nullable Input<String> addressFamily;

    public Input<String> getAddressFamily() {
        return this.addressFamily == null ? Input.empty() : this.addressFamily;
    }

    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     * 
     */
    @InputImport(name="allocationDefaultNetmaskLength")
      private final @Nullable Input<Integer> allocationDefaultNetmaskLength;

    public Input<Integer> getAllocationDefaultNetmaskLength() {
        return this.allocationDefaultNetmaskLength == null ? Input.empty() : this.allocationDefaultNetmaskLength;
    }

    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    @InputImport(name="allocationMaxNetmaskLength")
      private final @Nullable Input<Integer> allocationMaxNetmaskLength;

    public Input<Integer> getAllocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength == null ? Input.empty() : this.allocationMaxNetmaskLength;
    }

    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    @InputImport(name="allocationMinNetmaskLength")
      private final @Nullable Input<Integer> allocationMinNetmaskLength;

    public Input<Integer> getAllocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength == null ? Input.empty() : this.allocationMinNetmaskLength;
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     * 
     */
    @InputImport(name="allocationResourceTags")
      private final @Nullable Input<Map<String,String>> allocationResourceTags;

    public Input<Map<String,String>> getAllocationResourceTags() {
        return this.allocationResourceTags == null ? Input.empty() : this.allocationResourceTags;
    }

    /**
     * Amazon Resource Name (ARN) of IPAM
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     * 
     */
    @InputImport(name="autoImport")
      private final @Nullable Input<Boolean> autoImport;

    public Input<Boolean> getAutoImport() {
        return this.autoImport == null ? Input.empty() : this.autoImport;
    }

    /**
     * Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     * 
     */
    @InputImport(name="awsService")
      private final @Nullable Input<String> awsService;

    public Input<String> getAwsService() {
        return this.awsService == null ? Input.empty() : this.awsService;
    }

    /**
     * A description for the IPAM pool.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     * 
     */
    @InputImport(name="ipamScopeId")
      private final @Nullable Input<String> ipamScopeId;

    public Input<String> getIpamScopeId() {
        return this.ipamScopeId == null ? Input.empty() : this.ipamScopeId;
    }

    @InputImport(name="ipamScopeType")
      private final @Nullable Input<String> ipamScopeType;

    public Input<String> getIpamScopeType() {
        return this.ipamScopeType == null ? Input.empty() : this.ipamScopeType;
    }

    /**
     * The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
     * 
     */
    @InputImport(name="locale")
      private final @Nullable Input<String> locale;

    public Input<String> getLocale() {
        return this.locale == null ? Input.empty() : this.locale;
    }

    @InputImport(name="poolDepth")
      private final @Nullable Input<Integer> poolDepth;

    public Input<Integer> getPoolDepth() {
        return this.poolDepth == null ? Input.empty() : this.poolDepth;
    }

    /**
     * Defines whether or not IPv6 pool space is publicly advertisable over the internet. This option is not available for IPv4 pool space.
     * 
     */
    @InputImport(name="publiclyAdvertisable")
      private final @Nullable Input<Boolean> publiclyAdvertisable;

    public Input<Boolean> getPubliclyAdvertisable() {
        return this.publiclyAdvertisable == null ? Input.empty() : this.publiclyAdvertisable;
    }

    /**
     * The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     * 
     */
    @InputImport(name="sourceIpamPoolId")
      private final @Nullable Input<String> sourceIpamPoolId;

    public Input<String> getSourceIpamPoolId() {
        return this.sourceIpamPoolId == null ? Input.empty() : this.sourceIpamPoolId;
    }

    /**
     * The ID of the IPAM
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public VpcIpamPoolState(
        @Nullable Input<String> addressFamily,
        @Nullable Input<Integer> allocationDefaultNetmaskLength,
        @Nullable Input<Integer> allocationMaxNetmaskLength,
        @Nullable Input<Integer> allocationMinNetmaskLength,
        @Nullable Input<Map<String,String>> allocationResourceTags,
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoImport,
        @Nullable Input<String> awsService,
        @Nullable Input<String> description,
        @Nullable Input<String> ipamScopeId,
        @Nullable Input<String> ipamScopeType,
        @Nullable Input<String> locale,
        @Nullable Input<Integer> poolDepth,
        @Nullable Input<Boolean> publiclyAdvertisable,
        @Nullable Input<String> sourceIpamPoolId,
        @Nullable Input<String> state,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.addressFamily = addressFamily;
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.arn = arn;
        this.autoImport = autoImport;
        this.awsService = awsService;
        this.description = description;
        this.ipamScopeId = ipamScopeId;
        this.ipamScopeType = ipamScopeType;
        this.locale = locale;
        this.poolDepth = poolDepth;
        this.publiclyAdvertisable = publiclyAdvertisable;
        this.sourceIpamPoolId = sourceIpamPoolId;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcIpamPoolState() {
        this.addressFamily = Input.empty();
        this.allocationDefaultNetmaskLength = Input.empty();
        this.allocationMaxNetmaskLength = Input.empty();
        this.allocationMinNetmaskLength = Input.empty();
        this.allocationResourceTags = Input.empty();
        this.arn = Input.empty();
        this.autoImport = Input.empty();
        this.awsService = Input.empty();
        this.description = Input.empty();
        this.ipamScopeId = Input.empty();
        this.ipamScopeType = Input.empty();
        this.locale = Input.empty();
        this.poolDepth = Input.empty();
        this.publiclyAdvertisable = Input.empty();
        this.sourceIpamPoolId = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressFamily;
        private @Nullable Input<Integer> allocationDefaultNetmaskLength;
        private @Nullable Input<Integer> allocationMaxNetmaskLength;
        private @Nullable Input<Integer> allocationMinNetmaskLength;
        private @Nullable Input<Map<String,String>> allocationResourceTags;
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoImport;
        private @Nullable Input<String> awsService;
        private @Nullable Input<String> description;
        private @Nullable Input<String> ipamScopeId;
        private @Nullable Input<String> ipamScopeType;
        private @Nullable Input<String> locale;
        private @Nullable Input<Integer> poolDepth;
        private @Nullable Input<Boolean> publiclyAdvertisable;
        private @Nullable Input<String> sourceIpamPoolId;
        private @Nullable Input<String> state;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.arn = defaults.arn;
    	      this.autoImport = defaults.autoImport;
    	      this.awsService = defaults.awsService;
    	      this.description = defaults.description;
    	      this.ipamScopeId = defaults.ipamScopeId;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.locale = defaults.locale;
    	      this.poolDepth = defaults.poolDepth;
    	      this.publiclyAdvertisable = defaults.publiclyAdvertisable;
    	      this.sourceIpamPoolId = defaults.sourceIpamPoolId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder addressFamily(@Nullable Input<String> addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        public Builder addressFamily(@Nullable String addressFamily) {
            this.addressFamily = Input.ofNullable(addressFamily);
            return this;
        }

        public Builder allocationDefaultNetmaskLength(@Nullable Input<Integer> allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }

        public Builder allocationDefaultNetmaskLength(@Nullable Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = Input.ofNullable(allocationDefaultNetmaskLength);
            return this;
        }

        public Builder allocationMaxNetmaskLength(@Nullable Input<Integer> allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }

        public Builder allocationMaxNetmaskLength(@Nullable Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = Input.ofNullable(allocationMaxNetmaskLength);
            return this;
        }

        public Builder allocationMinNetmaskLength(@Nullable Input<Integer> allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }

        public Builder allocationMinNetmaskLength(@Nullable Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = Input.ofNullable(allocationMinNetmaskLength);
            return this;
        }

        public Builder allocationResourceTags(@Nullable Input<Map<String,String>> allocationResourceTags) {
            this.allocationResourceTags = allocationResourceTags;
            return this;
        }

        public Builder allocationResourceTags(@Nullable Map<String,String> allocationResourceTags) {
            this.allocationResourceTags = Input.ofNullable(allocationResourceTags);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder autoImport(@Nullable Input<Boolean> autoImport) {
            this.autoImport = autoImport;
            return this;
        }

        public Builder autoImport(@Nullable Boolean autoImport) {
            this.autoImport = Input.ofNullable(autoImport);
            return this;
        }

        public Builder awsService(@Nullable Input<String> awsService) {
            this.awsService = awsService;
            return this;
        }

        public Builder awsService(@Nullable String awsService) {
            this.awsService = Input.ofNullable(awsService);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder ipamScopeId(@Nullable Input<String> ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }

        public Builder ipamScopeId(@Nullable String ipamScopeId) {
            this.ipamScopeId = Input.ofNullable(ipamScopeId);
            return this;
        }

        public Builder ipamScopeType(@Nullable Input<String> ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }

        public Builder ipamScopeType(@Nullable String ipamScopeType) {
            this.ipamScopeType = Input.ofNullable(ipamScopeType);
            return this;
        }

        public Builder locale(@Nullable Input<String> locale) {
            this.locale = locale;
            return this;
        }

        public Builder locale(@Nullable String locale) {
            this.locale = Input.ofNullable(locale);
            return this;
        }

        public Builder poolDepth(@Nullable Input<Integer> poolDepth) {
            this.poolDepth = poolDepth;
            return this;
        }

        public Builder poolDepth(@Nullable Integer poolDepth) {
            this.poolDepth = Input.ofNullable(poolDepth);
            return this;
        }

        public Builder publiclyAdvertisable(@Nullable Input<Boolean> publiclyAdvertisable) {
            this.publiclyAdvertisable = publiclyAdvertisable;
            return this;
        }

        public Builder publiclyAdvertisable(@Nullable Boolean publiclyAdvertisable) {
            this.publiclyAdvertisable = Input.ofNullable(publiclyAdvertisable);
            return this;
        }

        public Builder sourceIpamPoolId(@Nullable Input<String> sourceIpamPoolId) {
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }

        public Builder sourceIpamPoolId(@Nullable String sourceIpamPoolId) {
            this.sourceIpamPoolId = Input.ofNullable(sourceIpamPoolId);
            return this;
        }

        public Builder state(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public VpcIpamPoolState build() {
            return new VpcIpamPoolState(addressFamily, allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, arn, autoImport, awsService, description, ipamScopeId, ipamScopeType, locale, poolDepth, publiclyAdvertisable, sourceIpamPoolId, state, tags, tagsAll);
        }
    }
}
